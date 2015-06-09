lexer grammar jQueryLexer;

// LEXER

// §3.9 Keywords

ABSTRACT      : 'abstract';
ASSERT        : 'assert';
BOOLEAN       : 'boolean';
BREAK         : 'break';
BYTE          : 'byte';
CASE          : 'case';
CATCH         : 'catch';
CHAR          : 'char';
CLASS         : 'class';
CONST         : 'const';
CONTINUE      : 'continue';
DEFAULT       : 'default';
DO            : 'do';
DOUBLE        : 'double';
ELSE          : 'else';
ENUM          : 'enum';
EXTENDS       : 'extends';
FINAL         : 'final';
FINALLY       : 'finally';
FLOAT         : 'float';
FOR           : 'for';
IF            : 'if';
GOTO          : 'goto';
IMPLEMENTS    : 'implements';
IMPORT        : 'import';
INSTANCEOF    : 'instanceof';
INT           : 'int';
INTERFACE     : 'interface';
LONG          : 'long';
NATIVE        : 'native';
NEW           : 'new';
PACKAGE       : 'package';
PRIVATE       : 'private';
PROTECTED     : 'protected';
PUBLIC        : 'public';
RETURN        : 'return';
SHORT         : 'short';
STATIC        : 'static';
STRICTFP      : 'strictfp';
SUPER         : 'super';
SWITCH        : 'switch';
SYNCHRONIZED  : 'synchronized';
THIS          : 'this';
THROW         : 'throw';
THROWS        : 'throws';
TRANSIENT     : 'transient';
TRY           : 'try';
VOID          : 'void';
VOLATILE      : 'volatile';
WHILE         : 'while';

JQBEGIN
:
	'/*@JQ' -> pushMode ( JQ )
;

mode JQ;

JQEND
:
	'@JQ*/' -> popMode
;

DOLLAR
:
	'$'
;

LETTER
:
	[a-z, A-Z]
;

DIGIT
:
	[0-9]
;

NUMBER
:
	(
		DIGIT
	)+
;

VAR
:
	'"'LETTER
	(
		LETTER
		| DIGIT
	)*'"'
;

STRING
:
	(
		LETTER
		| DIGIT
	)+
;

END
:
	';'
;

OPENP
:
	'('
;

CLOSEP
:
	')'
;

OPENB
:
	'['
;

CLOSEB
:
	']'
;

OPENC
:
	'{'
;

CLOSEC
:
	'}'
;

IN
:
	'in'
;

OUT
:
	'out'
;

QUOTES
:
	'\"'
;

CONTAINS_SUB_STRING
:
	'*='
;

CONTAINS_WORD
:
	'~='
;

CONTAINS_PREFIX
:
	'|='
;

EQUALS
:
	'='
;

NOT_EQUALS
:
	'!='
;

STARTS_WITH
:
	'^='
;

ENDS_WITH
:
	'$='
;

BASIC_FILTER
:
	':eq' OPENP CLOSEP
	| ':not' OPENP CLOSEP
	| ':first'
	| ':last'
	| ':root'
	| ':gt' OPENP CLOSEP
	| ':lt' OPENP CLOSEP
;

CONTENT_FILTER
:
	':contains' OPENP CLOSEP
	| ':empty'
	| ':has' OPENP CLOSEP
	| ':parent'
;

HIERARCHY_SELECTOR
:
	'>'
	| '~'
;

CHILD_FILTER
:
	':first-child'
	| ':last-child'
	| ':nth-child' OPENP CLOSEP
	| ':nth-last-child' OPENP CLOSEP
	| ':only-child'
;

EVENT
:
	('click'
	|'dclick'
	|'mouseenter'
	|'mouseleave'
	|'mouseup'
	|'hover'
	|'focus'
	|'blur'
	) OPENP CLOSEP
;

ADDFUNCS
:
	('append'
	|'prepend'
	|'after'
	|'before'
	) OPENP ( ('"' STRING '"') | VAR  ) CLOSEP
;



OPERATION
:
	STRING OPENP CLOSEP
;

WS
:
	[ \t\n\r]+ -> skip
;

BLOCKCOMMENT
:
	'/*' .*? '*/'
;
