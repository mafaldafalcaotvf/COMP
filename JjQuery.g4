grammar JjQuery;

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
	(DIGIT)+
;

VAR
:
	LETTER(LETTER|DIGIT)*
;

STRING
:
	(LETTER|DIGIT)+
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
	|':last-child'
	|':nth-child' OPENP CLOSEP
	|':nth-last-child' OPENP CLOSEP
	|':only-child'
;

OPERATION 
:
	'.' STRING
;


WS
:
[ \t\n\r]+ -> skip
;

BlockComment
:
	'/*' .*? '*/'
;



/****************************/



ops
:
	CONTAINS_SUB_STRING
	| CONTAINS_WORD
	| CONTAINS_WORD
	| CONTAINS_PREFIX
	| EQUALS
	| NOT_EQUALS
	| STARTS_WITH
	| ENDS_WITH
;

filter 
:
	BASIC_FILTER
	| CHILD_FILTER
	| HIERARCHY_SELECTOR
	| CONTENT_FILTER
;

/*start
:
	line EOF
;

line
:
	input line?
	| output line?
	| exp line?
;*/

assign_selection
:
	VAR EQUALS selector
;
selector
:
	DOLLAR OPENP VAR (OPENB ops STRING CLOSEB | filter)? CLOSEP (OPERATION)? END
;


in_out
:
	IN 
	| OUT
;

input
:
	IN STRING END
;

output
:
	OUT STRING END
;

end 
:
	EOF
;

