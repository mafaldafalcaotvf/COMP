grammar jQueryParser;

options {
    tokenVocab = jQueryLexer;
} 

main
:
	(JAVA | jqBlock)+ EOF
;

jqBlock
:
	JQBEGIN
    (
        input
        | output
    )* JQEND
;


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

assign_selection
:
	VAR EQUALS selector
;
selector 
:
	DOLLAR OPENP VAR (OPENB ops STRING CLOSEB | filter)? CLOSEP (OPERATION)? END
;

input
:
	IN 
;

output
:
	OUT 
;