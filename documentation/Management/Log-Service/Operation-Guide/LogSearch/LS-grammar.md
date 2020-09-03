## Retrieval Syntax and Rules  

Full text retrieval is fuzzy query now. You can enter a query term to filtrate the log content.

### 1. Query a single word

If only uppercase and lowercase letters, digits or underlines are included, you can query directly. If there is any other character contained, then the query term shall be placed in double quotation marks "", and the query term in double quotation marks can contain any characters. If query term itself contains double quotation marks or invisible characters, please use escaping. Example:

1. 	``error``: the query term is error
2. 	``"error"``: the query term is error
3.	``"test-log"`` : The query term is test-log
4.	``test-log`` : For an illegal query term, please use double quotation marks "" for inclusion
5.	``"\"hello world\""`` : The query term is "hello world"
6. 	``"hello world"``: the query term is hello world

### 2. To include multiple words at a time (a relationship of "and")

Divide a term by using one or more spacing, or adding a "+" in front of words. For example:

1. 	``error warn``: query the log data containing error and warn
2. 	``+error +warn``: query the log data containing error and warn
3. 	``error +warn``: query the log data containing error and warn

### 3. To exclude a word at a time (a relationship of "not")

Use "-" in front of the word. For example:

1. 	``error -test``: query the log data containing error but without containing warn
2. 	``-error -warn``: query the log data without containing error and warn
3. ``error - "hello world"`` : query the log data containing error and not containing hello world

### 4. To query any word of query term (a relationship of "or")

Use "?" in front of every query term. For example:

1. 	``?error ?warn``: query the log data containing error and warn
2.	``? error ? "hello world"``: query the log data containing error or hello world

**Operations as () and [] are not supported now for querying when the syntagmatic relation of words are and & or & not**

### 5. When querying multiple words in a syntagmatic relation of "and" or "not", the relational word of "or" will be ignored. Example:

1. 	``error ?warn``: When querying the log data containing error, if a relational word of and error exists, ?warn will be ignored, and then ``error ?warn``is equal to error
2.	``+error ?warn ``: When querying the log data containing error, if the relational word of and error exists, ?warn will be ignored, and then ``error ?warn`` is equal to error
3.	``error warn ?test`` : When querying the log data containing error and warn, ``error ?warn`` is equal to error warn
4.	``-error ?warn ``: When querying the log data without error contained, if the relational word of not error exists, ?warn will be ignored, and then ``error ?warn `` is equal to -error
5.	``error -test ?warn ``: When querying the log data containing error but without test, ?warn will be ignored, and then ``error ?warn `` is equal to error -test

### 6. Retained Character Description

| Retained Character Description | Special Meaning | Note |
|---|---|---|
| +	|And|Leaving blank is and by default. For example with error contained: query term of +error is equal to error. If you need to query +error, please use "" with query term contained in, that is "+error"|
| -	|Not|The priority is consistent with "and". For example without error contained: query term is -error|
| ？|Or|The priority is the lowest. When there is a relation of "and" or "not" in the statement queried, it shall be ignored. Namely, now only multiple or relation query is supported. The combinatorial queries of "and" + "or" and "not" + "or" are not supported|


## II. Key Value Retrieval Syntax and Rules  

Syntax | Semantics
---|---
Comparison operator >| greater than, numeric type  
Comparison operator >= | greater than or equal to, numeric type
Comparison operator < | less than, numeric type 
Comparison operator <= | less than or equal to, numeric type 
Comparison operator = | equal to, can be numeric type and character string, supports to enter multiple values  
Comparison operator ! = | Not equal to, can be numeric type and character string, supports to enter multiple values   
bewteen  | The left and right borders of query range are in () separated by commas, the values can only be numeric, the range shall be closed interval, and the left value is greater than the right value  
"A"  | Character String 

**For example:**  
1. A = 1 and B = 2, query logs with field A value of 1 and field B value of 2
2. A > 1 and B > 2, query logs with field A value greater than 1 and field B value greater than 2
3. A in ("X","Y"), search for logs with value of X or Y;   A in (1,2), search for logs with value of 1 or 2,
4. A between (1,100), means logs with field A greater than or equal to 1 and field A less than or equal to 100

**Note:**
1. "and"，"not"，"in"，"not in","between" as reserved characters
2. Keywords can only contain English characters, numbers and '_', can only begin with characters, and cannot be reserved characters
3. Value can only be character string and numeric
4. For the same keyword, there can be only one "=","!=",">=",">","<","<=","between" condition. For example, A = 1 and A = 2 is a syntax error.

## III. Retrieval syntax and rules of meta content in Business Application Log

Business Application Log supports retrieval of tag field and uses # to identify retrieval of tag field

1. Basic query example, select the tag content of {"key1":"value1"}, and also include the key-value pair {"key2":"value2"}

`#key1=value1 #key2=value2`

2. Search meta via tag, mix normal search, search key1=value1 and key2=value2; meanwhile, the log content contains error

`#key1=value1 #key2=value2 error`

3. tag search only supports accurate retrieval, with case sensitive



