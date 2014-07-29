include "Java.Grm"


% Main translation rule 
function main
    replace [program] 
	P [program]
    by
	P [java2eol]
end function


%% Something to call the rules
%%class
function java2eol
    replace [program]
	P [program]
    by
	P [transformForIn]
	  [transformTypeDeclaration]
	  [transformOps]
	  [transformBooleanOps]
end function


%% change for loop syntax
%% from  for( type var: listOfVar)
%% to for( var in listOfVar)
rule transformForIn
	replace [declaration_or_statement]
	'for '( 
	_ [repeat modifier] _ [type_specifier] Id [id] _ [opt generic_parameter] _ [repeat dimension]
	': Expr [expression] ')
	    Stmt [statement]
	construct NewDecls [repeat declaration_or_statement]
	_ [statementBlockToDecls Stmt]
	  [statementOneDeclToDecls Stmt]         
	by
	'for '( Id 'in Expr '){
	NewDecls
end rule


%%transform Headers
%%rule transformHeaders
%%	replace [declaration_or_statement]
%%	'jet package= pkg [stringlit] 'class= cls [stringlit] 'imports= imp [stringlit]
%%	by
%%	'import imp


%% Type declaration
%% from type varName = ...
%% to var varName = ...
rule transformTypeDeclaration
	replace [declaration_or_statement]
	_ [repeat modifier] _ [type_specifier] Id [id] 
	by 
	'var  Id
end rule


%% Transform All Operators
function transformOps
    replace [program]
	P [program]
    by
	P [transformNotEqualsOperator] 
	  [transformEqualsOperator] 
	  [transformDecrementOperator] 
	  [transformIncrementOperator]
end function


%% Not equals operator
%% from !=
%% to <>
rule transformNotEqualsOperator
	replace [equality_op]
	'!=
	by
	'<>
end rule


%% Equals operator
%% from ==
%% to =
rule transformEqualsOperator
	replace [equality_op]
	'==
	by
	'=
end rule


%% Decrement operator
%% from var --
%% to var = var-1
rule transformDecrementOperator
	replace [declaration_or_statement]
	Id [reference] '--
	by
	Id = Id '- 1
end rule

%% Increment operator
%% from var ++
%% to var = var+1
rule transformIncrementOperator
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
rule transformBooleanAnd
	replace [and_inclusive_or_expression]
	'&& CE [inclusive_or_expression]
    by
	'and CE
end rule


%% Boolean operator Or
%% from ||
%% to or
rule transformBooleanOr
	replace [or_conditional_and_expression]
	'|'| CE [conditional_and_expression]
    by
	'or CE
end rule


%% Boolean operator Not
%% from !
%% to not
rule transformBooleanNot
	replace [unary_op]
	'!
    by
	'not
end rule


