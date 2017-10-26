/**
 * Copyright (c) 2009-2011, The HATS Consortium. All rights reserved.
 * This file is licensed under the terms of the Modified BSD License.
 */
package abs.frontend.analyser;

public enum ErrorMessage {
    ACESSOR_INCOMPARABLE_TYPE("Accessor functions with incomparable types, %s and %s."),
    CYCLIC_INHERITANCE("Cyclic inheritance chain for interface: %s."),
    UNKOWN_INTERFACE("Unknown interface: %s."),
    UNKOWN_DATATYPE("Unknown datatype: %s."),
    UNKOWN_DATACONSTRUCTOR("Unknown datatype constructor: %s."),
    UNKOWN_INTERFACE_OR_DATATYPE("Unknown interface or datatype: %s."),
    DUPLICATE_BEHAVIOR_DECL("Duplicate class or function declaration: %s."),
    VARIABLE_ALREADY_DECLARED("Variable %s is already declared."),
    EXPECTED_TYPE("Expected type %s, but found type %s instead."),
    NO_SUBTYPE("Type %s must be a subtype of type %s."),
    CANNOT_ASSIGN("Cannot assign %s to type %s."),
    VAR_INIT_REQUIRED("A variable must be initialized if it is not of a reference type."),
    FIELD_INIT_REQUIRED("A field must be initialized if it is not of a reference type."),
    EXPECTED_FUT_TYPE("Expected a future type, but found type %s instead."),
    EXPECTED_ADDABLE_TYPE("Expected numeric or string type for operator '+', but found type %s instead."),
    NAME_NOT_RESOLVABLE("Name %s cannot be resolved."),
    VAR_USE_BEFORE_DEFINITION("Variable %s cannot be used before it was defined."),
    FIELD_USE_BEFORE_DEFINITION("Field %s cannot be used before it was defined."),
    TYPE_NOT_RESOLVABLE("Type %s cannot be resolved."),
    CONSTRUCTOR_NOT_RESOLVABLE("Data constructor %s cannot be resolved."),
    FUNCTION_NOT_RESOLVABLE("Function %s cannot be resolved."),
    MODULE_NOT_RESOLVABLE("Module %s cannot be resolved."),
    BRANCH_INCOMPARABLE_TYPE("Case branches with incomparable types, %s and %s."),
    CASE_NO_DATATYPE("Cases are only possible on data types, but found type %s."),
    IF_NO_DATATYPE("If expressions are only possible on data types, but found type %s."),
    IF_DIFFERENT_TYPE("If expression with incompatible result types, %s and %s."),
    COMPARISON_INCOMPARABLE_TYPE("Comparison expression with incomparable types, %s and %s."),
    ADD_INCOMPARABLE_TYPE("Add expression with incomparable types, %s and %s."),
    WRONG_NUMBER_OF_ARGS("Wrong number of arguments. Expected %s, but found %s."),
    WRONG_NUMBER_OF_TYPE_ARGS("Wrong number of type arguments for parametric type %s. Expected %s, but found %s."),
    TYPE_MISMATCH("Type %s does not match declared type %s."),
    LIST_LITERAL_TYPE_MISMATCH("All elements must have the same type %s, type %s does not match."),
    DUPLICATE_CONSTRUCTOR("Constructor %s is already defined%s."),
    DUPLICATE_DATATYPE_PARAMETER("Type parameter %s is used more than once."),
    EXISTING_DATATYPE_PARAMETER("Using existing type %s as type parameter name."),
    DUPLICATE_CLASS_NAME("Class %s is already defined%s."),
    DUPLICATE_INTERFACE_NAME("Interface %s is already defined%s."),
    DUPLICATE_FUN_NAME("Function %s is already defined%s."),
    DUPLICATE_METHOD_NAME("Method %s is already defined."),
    DUPLICATE_PARAM_NAME("Parameter %s is already defined."),
    DUPLICATE_TYPE_DECL("Type (interface, datatype or exception) %s is already defined%s."),
    DUPLICATE_FIELD_NAME("Field %s is already defined."),
    DUPLICATE_MODULE_NAME("Module %s is already defined."),
    ONLY_INTERFACE_EXTEND("Interfaces can only extend other interfaces, but %s is not an interface."),
    NO_METHOD_OVERRIDE("Method %s overrides an existing method of interface %s."),
    NO_METHOD_IMPL("Method %s does not exist in any implemented interface."),
    METHOD_NOT_IMPLEMENTED("Method %s, declared in interface %s is not implemented by class %s."),
    METHOD_IMPL_WRONG_NUM_PARAMS("Method %s does not have the same number of parameters as defined in interface %s. Expected %s, but found %s."),
    METHOD_IMPL_WRONG_PARAM_TYPE("Parameter %s of method %s has a different type as defined in interface %s. Expected %s, but found %s."),
    METHOD_IMPL_WRONG_RETURN_TYPE("Method %s has not the same return type as defined in interface %s. Expected %s, but found %s."),
    WRONG_RETURN_STMT_TYPE("Cannot return a value of type %s from %s (expected %s)"),
    METHOD_IMPL_MISSING_RETURN_STMT("Method %s has a non-Unit return type but no return statement."),
    MAIN_BLOCK_RETURN_STMT("The main block cannot contain a return statement."),
    RUN_METHOD_WRONG_NUM_PARAMS("Method run does not have the expected number of parameters.  Expected 0, but found %s."),
    RUN_METHOD_WRONG_RETURN_TYPE("Method run does not have the expected return type.  Expected ABS.StdLib.Unit, but found %s."),
    NULL_NOT_HERE("Can't use constant 'null' here."),
    CANNOT_IMPL_INTERFACE("Interface %s has a method %s that overloads a method from another implemented interface."),
    TARGET_NO_INTERFACE_TYPE("Target expression is not typable to an interface."),
    NO_METHOD_DECL("Method %s could not be found."),
    NO_CLASS_DECL("Class %s could not be found."),
    NO_FIELD_DECL("Field %s could not be found."),
    NO_DELTA_DECL("Delta %s could not be found."),
    RETURN_STMT_MUST_BE_LAST("Return statements can only appear as last statement of a method."),
    NAME_NOT_EXPORTED_BY_MODULE("Imported name %s is not exported by module %s."),
    ONLY_UNQUALIFIED_NAMES_ALLOWED("Qualified names (%s) are not allowed in `import from' statements."),
    ONLY_QUALIFIED_NAMES_ALLOWED("Trying to import unqualified name %s, needs `from <Modulename>'."),
    CIRCULAR_MODULE_DEPENDENCY_IMPORT("The imported module %s has a circular dependency to the importing module"),
    CIRCULAR_MODULE_DEPENDENCY_EXPORT("Circular module dependency in module %s."),
    CIRCULAR_TYPESYN("Circular type synonym %s."),
    LOCATION_TYPE_MULTIPLE("Multiple location type annotations defined."),
    LOCATION_TYPE_CANNOT_ASSIGN("Cannot assign location type %s to location type %s."),
    LOCATION_TYPE_SYNC_CALL_ON_NON_NEAR("Synchronous call on non-near reference."),
    LOCATION_TYPE_DIFFERENT_TYPE_INSTANTIATIONS("Type parameter %s in data constructor %s is instantiated with different location types %s and %s."),
    LOCATION_TYPE_CALL_ON_BOTTOM("Call on Bottom location type."),
    CLASSKIND_PLAIN("Cannot instantiate class %s with cog as it is annotated with class kind Plain."),
    CLASSKIND_COG("Cannot instantiate class %s without cog as it is annotated with class kind COG."),
    ASSIGN_TO_FINAL("Assignment to %s %s, which is annotated with [Final]."),
    NOT_ALLOWED_IN_INIT_CODE("%s are not allowed in class initialization code."),
    NOT_ALLOWED_IN_RECOVER_CODE("%s are not allowed in class recovery code."),
    NOT_ALLOWED_IN_FINALLY_CODE("%s are not allowed in 'finally' block."),
    ATOMIC_METHOD_CONTAINS_ILLEGAL_CODE("Cannot use %s in atomic method %s."),
    ATOMIC_METHOD_WRONG_OVERRIDE("Method %s has not the same atomicity annotation from the method %s defined in interface %s."),
    WRONG_CONSTRUCTOR("Data type %s has no constructor with name %s."),
    WRONG_DEPLOYMENT_COMPONENT("Wrong type %s in deployment component annotation."),
    DEPLOYMENT_COMPONENT_NOT_COG("Deployment component cannot be created inside a cog."),
    DEPLOYMENT_COMPONENT_IGNORED("Deployment component annotations are not allowed for local objects."),
    EXPECTED_DC("Expected a Deployment component, but received %s."),
    WRONG_HTTPNAME("Wrong type %s in HTTPName annotation, should be a string."),
    WRONG_HTTPCALLABLE("Parameter %s: type %s not supported for calling from HTTP."),
    DUPLICATE_HTTPNAME("Warning: Duplicate HTTP name %s in datatype declaration."),

    UNDECLARED_VARIABLE("Unknown variable: %s."),
    NOT_A_LEAF("Feature cannot have more than one group of sub-features: %s."),
    OPT_NOT_IN_ALLOF("The %s feature is optional but the cardinality of its parent is not 'allof'."),
    EXPECTED_BOOL("Inferred type Int for %s, expected Bool."),
    EXPECTED_INT("Inferred type Bool for %s, expected Int."),
    UNKNOWN_ATTRIBUTE_TYPE("Unknown attribute type %s."),
    UNEXPECTED_ATTRIBUTE_TYPE("Unexpected attribute type %s, expected %s."),
    DUPLICATE_FEATURE("Feature %s is already defined."),
    DUPLICATE_PRODUCT("Product %s is already defined."),
    DUPLICATE_DELTA("Delta Module %s is already defined."),
    DUPLICATE_DELTA_CLAUSE("Delta clause %s is already defined in product line %s."),
    DUPLICATE_UPDATE("State Update %s is already defined."),
    DUPLICATE_RECONFIGURATION("Reconfiguration to product %s is already defined."),
    DUPLICATE_VARIABLE("Variable %s is already defined."),
    WRONG_DEADLINE_TYPE("Wrong type %s in deadline annotation, should be ABS.StdLib.Duration."),
    WRONG_SIZE_ANNOTATION_TYPE("Wrong type %s in size annotation, should be a number."),
    WRONG_COST_ANNOTATION_TYPE("Wrong type %s in cost annotation, should be a number."),
    AMBIGIOUS_USE("The use of %s is ambigious. It can refer to the following definitions: %s."),
    WRONG_SCHEDULER_ANNOTATION_TYPE("Invalid scheduler expression, should be function invocation of type ABS.Scheduler.Process and first argument of type List<ABS.Scheduler.Process>."),
    WRONG_SCHEDULER_FUN_TYPE("Function invalid as scheduler function, first argument must be of type List<ABS.Scheduler.Process>, return type must be ABS.Scheduler.Process."),
    WRONG_SCHEDULER_FIRST_ARGUMENT("Invalid scheduler first argument, must be `queue'."),
    WRONG_SCHEDULER_FIELD_ARGUMENT("Invalid scheduler argument %s, must be a field name of class %s."),
    SCHEDULER_ON_DC("User-defined schedulers are not supported on deployment components."),
    THIS_STATIC("No context for `this`."),
    ORIGINAL_NOT_IN_DELTA("Calls to original(..) are only permitted in modify-class deltas."),
    ERROR_IN_PRODUCT("Error within product %s: %s."),
    ERROR_IN_PRODUCT_WITH_DELTA("Error within product %s while processing delta %s: %s."),
    ERROR_IN_PRODUCT_LINE_DELTA_ORDER("Error in product line %s. No total order exists for the given partial order of deltas."),
    MISSING_DELTA_CLAUSE("Warning: Deltas missing in product line %s (dead deltas): %s."),
    MISSING_DELTA_CLAUSE_ERROR("Delta %s is referenced in 'after' clause but missing in product line %s."),
    AMBIGUOUS_PRODUCTLINE("The product line %s is potentially ambiguous: Deltas %s and %s both target class %s, but their application order is undefined."),
    DEADLOCK_GENERATION_ERROR("Generated edge: %s."),
    AWAIT_TOO_PURE("Warning: the await expression will never change (try awaiting for a field)."),
    MAIN_BLOCK_NOT_FOUND("Warning: no main block found."),
    MAIN_BLOCK_AMBIGUOUS("Warning: this main block is shadowed by the main block from module %s."),
    DEPRECATED_CONSTRUCTOR("Warning: The constructor %s is deprecated (use exported functions instead)."),
    UNDECLARED_PRODUCT("Product %s is not declared"),
    INVALID_PRODUCT("Product %s does not satisfy the feature model. Constraints failed: %s."),
    MATCHING_NOT_ALLOWED_IN_CATCH("Non-free pattern variable %s (not allowed in catch branches)."),
    DUPLICATE_INTERFACE_IMPLEMENTATION("Class %s already implements interface %s."),
    MISSING_INTERFACE_IMPLEMENTATION("Class %s does not implement interface %s.")
    ;

    private String pattern;

    ErrorMessage(String pattern) {
        this.pattern = pattern;
    }

    public String withArgs(String... args) {
        return String.format(pattern, (Object[]) args);
    }
}
