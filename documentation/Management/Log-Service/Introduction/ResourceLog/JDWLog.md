## JDW Data Warehouse Log
### Introduction
Now, the log type accessed to Log Service is the audit log.

### Field Description
#### Audit Log
| No. | Field Name | Field Description | Field Type |
| --- | --- | --- | --- | 
| 1 | start_time  | Production Start Time of Audit Log | string |
| 2 | client_ip | User Client ip Address | string |
| 3 | user_name | Name of Access User | string |
| 4 | database_name | Name of Database Requested to Be Accessed | string |
| 5 | thread_id | Thread ID | string |
| 6 | statement | Audit sql | string |
