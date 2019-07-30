## MySQL Log
### Introduction
Now, the MySQL log type for access of Log Service is the **Audit Log**. As for the retrieval span of log audit by MySQL, 7 days are supported at most.

### Field Description
Log Field | Log Description | Log Type
-- | -- | --
customTimeStr | Log Record Time | string
user_name | Access User Name | string
user_ip | User Client IP Address | string
resourceId | MySQL Instance same id | string
operation | Request Type | string
db | Name of Database Requested for Access | string
g_id | MySQL Cluster gid | string
sql | Specific SQL Requested | string
