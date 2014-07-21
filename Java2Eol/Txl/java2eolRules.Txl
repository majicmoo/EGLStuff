%% Something to call the rules


%% change for loop syntax
%% from " for( type var: listOfVar)
%% to for( var in listOfVar)
rule transformForIn
	replace [declaration_or_statement]
	'for '( [type_specifier] Id [id] _ [opt generic_parameter] _ [repeat dimension]
	': Expr [expression] '){
	by
	'for ( Id in Expr){
end rule


%% removeGetters
%% from var.getVar()
%% to var.Var
rule removeGetters
	replace 


%% removeHeaders
rule removeHeaders
	replace


%% Type declaration
%% from type varName = ...
%% to var varName = ...
rule changeTypeDeclaration
	replace [declaration_or_statement]
	_ [repeat modifier] _ [type_specifier] Id [id] 
	by 
	'var  Id
end rule


%% Not equals operator
%% from !=
%% to <>
transformNotEqualsOperator
	replace [equality_op]
	'!=
	by
	'<>
end rule

	
%% Equals operator
%% from ==
%% to =
transformEqualsOperator
	replace [equality_op]
	'==
	by
	'=
end rule


%% Decrement operator
%% from var --
%% to var = var-1
transformDecrementOperator
	replace [declaration_or_statement]
	Id [reference] '--
	by
	Id = Id '- 1
end rule


%% Increment operator
%% from var ++
%% to var = var+1
transformIncrementOperator
	replace [declaration_or_statement]
	Id [reference] '++ 
	by
	Id = Id '+ 1
end rule


%% Transform All Boolean Operation
function transformBooleanOps
    replace [program]
	P [program]
    by
	P [transformBooleanOr] [transformBooleanAnd] [transformBooleanNot]
end function


%% Boolean operator And
%% from &&
%% to and
transformBooleanAnd
	replace [and_inclusive_or_expression]
	'&& CE [inclusive_or_expression]
    by
	'and CE
end rule


%% Boolean operator Or
%% from ||
%% to or
transformBooleanOr
	replace [or_conditional_and_expression]
	'|| CE [conditional_and_expression]
    by
	'or CE
end rule


%% Boolean operator Not
%% from !
%% to not
transformBooleanNot
	replace [unary_op]
	'!
    by
	'not
end rule