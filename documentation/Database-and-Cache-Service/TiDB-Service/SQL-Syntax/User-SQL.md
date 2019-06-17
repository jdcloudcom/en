# User Operation

## Create A User
Create a user named tiuser with statement of CREATE USER. The password is 123456
```SQL
CREATE USER 'tiuser'@'localhost' IDENTIFIED BY '123456';
```
## User Authorization
Authorized user "tiuser" can retrieve tables in database samp_db
```SQL
CREATE USER 'tiuser'@'localhost' IDENTIFIED BY '123456';
```

## Search for User Permission
Search the permissions of the user "tiuser".
```SQL
SHOW GRANTS for tiuser@localhost;
```

## Delete Users
Delete User "tiuser"
```SQL
DROP USER 'tiuser'@'localhost';
```
