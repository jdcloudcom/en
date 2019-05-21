# Coding problems of JCS for MySQL character set
The character set is the common problem while using databases. Actually, many of you do not understand use of this part, then unreadable codes may appear during use. Today, we will talk about relevant problems of character set in details, to calmly cope with unreadable codes.

## View character set
Firstly, we need to log in the RDS instance to view how the character set is set up. After the database instance is remotely connected, you need to select your desirable library through commands below:

```
use <Library Name>
```
After executing the commands above, you are in one library, then you need to execute the following commands:

```
show variables like '%character%'
```
Specific conditions of the character set are as follows

|variable_name|value|
|---|---|
|character\_set_client|	utf8|
|character\_set_connection|	utf8|
|character\_set_database	|utf8|
|character\_set_filesystem|	binary|
|character\_set_results	|utf8|
|character\_set_server|	utf8|
|character\_set_system	|utf8|

## Character Set Analysis
### character\_set_client
This parameter can be set by the client, and please refer to the following explanation for specific setting method.

### character\_set_connection
This parameter can be set by the client, and please refer to the following explanation for specific setting method.

### character\_set_database
This parameter value is related to the character set designated while creating a library. For how to designate the character set while creating a library, please refer to [Create Library](../Operation-Guide/Database-Management/Create-Database.md)

### character\_set_filesystem
Do not worry about this parameter

### character\_set_results
This parameter can be set by the client, and please refer to the following explanation for specific setting method.

### character\_set_server
The parameter is the server setting and its value can be modified via the parameter set, with reference of [Modify Parameter](../Operation-Guide/Parameter-Group/Modify-Parameter.md); note: be sure to reboot instance after modifying this parameter, to keep the default value `character_set_database` and `character_set_server` synchronized.

### character\_set_system
Do not worry about this parameter

## Set character sets by the client
As mentioned above, the three parameters, `character_set_client`, `character_set_connection ` and `character_set_results` are session-level, which can be set via the client. After the JD Cloud Onboarding RDS instances are connected, please execute the following SQL instructions:

```
set names <Character Set Code>;
```
When the instructions are successfully executed, the three parameter values will be set to corresponding character set codes;

Note: Because the parameter value are session-level, the original character set will become invalid after the database instance is reconnected. In this case, please set by executing the `set names` command again.

## How to avoid mess codes
To avoid unreadable codes while using the database, please be sure to keep the four parameter values consistent, i.e. `character_set_client`, `character_set_connection `, `character_set_results` and `character_set_database`. If not, unreadable codes may appear.

## Best Practices
### How to save emoji expressions
If you need to save the emoji expression in RDS instances, please be sure to save `character_set_client`, `character_set_connection `, `character_set_results` and `character_set_database`, each of the four parameter sets is ***utf8mb4***.

c++ example codes of character set via the client are as shown below and are for reference only
```
string sql = "set names utf8mb4";
mysql_query(connection, sql.c_str());
```
