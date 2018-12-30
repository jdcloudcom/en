## Retrieval Syntax and Rules  

Syntax | Semantics
---|---
A and B | "And" logic, return the intersection of A and B
Comparison operator >| greater than, numeric type  
Comparison operator >= | greater than or equal to, numeric type
Comparison operator < | less than, numeric type 
Comparison operator <= | less than or equal to, numeric type 
Comparison operator = | equal to, can be numeric type and character string, supports to enter multiple values  
Comparison operator ! = | Not equal to, can be numeric type and character string, supports to enter multiple values   
bewteen  | The left and right borders of query range are in () separated by commas, the values can only be numeric, the range shall be closed interval, and the left value is greater than the right value  
“A"  | Character String 
like  |Contains, the values can only be character string 

**For example:**  
1. A = 1 and B = 2 , search for logs with keyword A value of 1 and B value of 2
2. A > 1 and B > 2 , search for logs with keyword A value greater than 1 and B value greater than 2
3. A = (1,2), search for logs with value of 1 or 2
4. A like "foo", search for logs with the value of the keyword containing "foo"
5. A between (1,100), means logs with A greater than or equal to 1 and A less than or equal to 100

**Note:**
1. "and"，"not"，"in"，"not in","between"，"like" as reserved characters
2. Keywords can only contain English characters, numbers and '_', can only begin with characters, and cannot be reserved characters
3. Value can only be character string and numeric
4. For the same keyword, there can be only one "=","!=",">=",">","<","<=","between" condition. For example, A = 1 and A = 2 is a syntax error.
