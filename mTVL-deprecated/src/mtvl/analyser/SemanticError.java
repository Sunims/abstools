/*
 * Copyright (c) 2009-2011, The HATS Consortium. All rights reserved.
 * This file is licensed under the terms of the Modified BSD License.
 */

package mtvl.analyser;

import beaver.Symbol;
import mtvl.ast.ASTNode;
import mtvl.ast.CompilationUnit;
import mtvl.ast.Feature;

public class SemanticError {
    public final ErrorMessage msg;
    public final String[] args;
    public final ASTNode<?> node;
    
    public SemanticError(ASTNode<?> node, ErrorMessage msg, String... args) {
        this.node = node;
        this.msg = msg;
        this.args = args;
    }
    
//     public SemanticError(ASTNode<?> node, ErrorMessage msg, Name... args) {
//         this.node = node;
//         this.msg = msg;
//         
//         this.args = new String[args.length];
//         for (int i=0; i<args.length; i++) {
//             this.args[i] = args[i].getString();
//         }
//     }

    public String getFileName() {
        ASTNode<?> parent = node;
        while (! (parent instanceof CompilationUnit) ) {
            parent = parent.getParent();
            if (parent == null)
                return "<could not find filename>";
        }
        CompilationUnit u = (CompilationUnit) parent;
//        Feature root = u.getFeature();
//        if (root == null)
//          return "<unkown>";
        if (u.getNumFeature() == 0)
          return "<unknown>";
        Feature root = u.getFeature(0);
        String name = root.getName();
        if (name == null)
          return "<unkown>";
        return name;
    }
    
    public int getLine() {
        return Symbol.getLine(node.getStart());
    }
    
    public int getColumn() {
        return Symbol.getColumn(node.getStart());
    }
    
    public String getMsg() {
    	return msg.withArgs(args);
    }
    
    public String getMsgString() {
        return getFileName() + ":" + getLine() + ":" + 
            getColumn() + ": " + 
            msg.withArgs(args);
    }
    
    public String getMsgWithHint(String absCode) {
        return getMsgString()+"\n"+getHint(absCode);
    }

    public String getHint(String absCode) {
        int prevIndex = 0;
        int endIndex = -1;
        endIndex = absCode.indexOf('\n', prevIndex);
        for (int l = 1; l < getLine() && endIndex != -1; l++) {
            prevIndex = endIndex;
            endIndex = absCode.indexOf('\n', prevIndex);
        }
        String line = "";
        if (endIndex == -1)
            line = absCode.substring(prevIndex);
        else
            line = absCode.substring(prevIndex, endIndex);
        StringBuffer lineHint = new StringBuffer();
        for (int c = 0; c < getColumn()-1; c++) {
            lineHint.append('-');
        }
        lineHint.append('^');
        return line+"\n"+lineHint;
    }
}
