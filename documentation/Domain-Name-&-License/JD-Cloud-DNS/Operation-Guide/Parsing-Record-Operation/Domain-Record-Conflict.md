## **Record Conflict Rule:**

   　| A    | AAAA | MX | TXT  | CAA  | SRV  | NS   | CNAME  |  JNAME  | URL Skip  
   :------- | :-------- | :-------- | :-------- | :-------- | :-------- | :-------- | :-------- | :-------- | --------: |--------: 
   A       | －    | －   | －    | －    | －    | －    | Conflict    | Conflict    | Conflict  | Conflict 
   AAAA    | －    | －   | －    | －    | －    | －    | Conflict    | Conflict    | Conflict  | Conflict  
   MX      | －    | －   | －    | －    | －    | －    | Conflict    | Conflict    |  －   | Conflict   
   TXT     | －    | －   | －    | －    | －    | －    | Conflict    | Conflict    |  －   | Conflict 
   CAA     | －    | －   | －    | －    | －    | －    | Conflict    | Conflict    |  －   | Conflict
   SRV     | －    | －   | －    | －    | －    | －    | Conflict    | Conflict    |  －   | Conflict  
   NS      |Conflict   | Conflict | Conflict  | Conflict  | Conflict  | Conflict  | -       | Conflict    |  Conflict | Conflict
   CNAME   |Conflict   | Conflict | Conflict  | Conflict  | Conflict  | Conflict  | Conflict    | Configuration Weight|  Conflict | Conflict  
   JNAME   |Conflict   | Conflict | Conflict  | Conflict  | Conflict  | Conflict  | Conflict    | Conflict    |  Conflict | Conflict   
   URL Redirection |Conflict   | Conflict | Conflict  | Conflict  | Conflict  | Conflict  | Conflict    | Conflict    |  Conflict | Conflict
   
   － means no conflict
 
  Conflict: Indicate that two recording values cannot coexist.

