# Create Account

When creating MongoDB instance, the system has created the root account for you and has the root authority of MongoDB. You can use this account to log into the database and create other accounts.

## Create Account Command

> db.createUser(user, writeConcern)

User document format is as follows
```
{ user: "<name>",
  pwd: "<cleartext password>",
  customData: { <any information> },
  roles: [
    { role: "<role>", db: "<database>" } | "<role>",
    ...
  ]
 }
```

## Example

1. Create the accountAdmin01 account in the products database.

   ```
   use products
   db.createUser( { user: "accountAdmin01",
                    pwd: "changeMe",
                    customData: { employeeId: 12345 },
                    roles: [ { role: "clusterAdmin", db: "admin" },
                             { role: "readAnyDatabase", db: "admin" },
                             "readWrite"] },
                  { w: "majority" , wtimeout: 5000 } )
   ```


2. Create a user with a role

   The following operation creates an account accountUser in the products database and assigns the readWrite and dbAdmin roles to the account.
   ```
   use products
   db.createUser(
      {
        user: "accountUser",
        pwd: "password",
        roles: [ "readWrite", "dbAdmin" ]
      }
   )
   ```
3. Create a user without a role

   The following operation creates an account reportsUser in the admin library, but no role is assigned.
   ```
   use admin
   db.createUser(
      {
        user: "reportsUser",
        pwd: "password",
        roles: [ ]
      }
   )
   ```

4. Create administrator accounts with roles

   The following operation creates an appAdmin account in the admin library and assigns the readWrite role of the config library to the account.
   ```
   use admin
   db.createUser(
      {
        user: "appAdmin",
        pwd: "password",
        roles:
          [
            { role: "readWrite", db: "config" },
            "clusterAdmin"
          ]
      }
   )
   ```

## Common Roles

- Database User Roles: read, readWrite
- Database Administrator Roles: dbAdmin, dbOwner, userAdmin
- Cluster Administrator Roles: clusterAdmin, clusterManager, clusterMonitor, hostManager
- Backup Recovery Roles: backup, restore
- Any Database Roles: readAnyDatabase, readWriteAnyDatabase, userAdminAnyDatabase, dbAdminAnyDatabase
- Super Administrator Roles: root 


For detailed information on MongoDB creation of users, please refer to "[MongoDB Official Document](https://docs.mongodb.com/v3.2/reference/method/db.createUser/#local-database) ".



## Related Reference

- [Reset Password](Reset-Password.md)
