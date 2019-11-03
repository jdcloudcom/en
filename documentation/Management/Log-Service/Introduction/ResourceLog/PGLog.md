## PostgreSQL Log
### Introduction
Now, slow search logs and error logs are adopted as the logs accessing Log Service.

### Field Description
#### Slow Search Log
| SN | Field Name | Field Description | Field Type |
| --- | --- | --- | --- | 
| 1 | start_time  | Slow Search Start Time | string |
| 2 | client_ip | User Client IP Address | string |
| 3 | user_name | Access User Name | string |
| 4 | database_name | Name of Database Requested for Access | string |
| 5 | duration | Execution Period | string |
| 6 | statement | Slow Search sql | string |

#### Error Logs
| SN | Field Name | Field Description | Field Type |
| --- | --- | --- | --- | 
| 1 | start_time  | Slow Search Start Time | string |
| 2 | client_ip | User Client IP Address | string |
| 3 | user_name | Access User Name | string |
| 4 | database_name | Name of Database Requested for Access | string |
| 5 | error_severity | Log Error Level | string |
| 6 | detail | Specific Error Log Information | string |
