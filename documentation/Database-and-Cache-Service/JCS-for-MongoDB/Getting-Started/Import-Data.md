# Import Data

With MongoDB's own mongodump and mongorestore commands, you can import data from a self-built MongoDB database into a JCS for MongoDB instance.

## Precautions
Please use the mongodump and mongorestore tools with MongoDB 3.2 version and higher.

## Operation Steps
1. Back up self-built database data with the mongodump command.

	Connect to the self-built database, select the account with the corresponding permissions, and execute mongodump to export the self-built database content. For example, execute the following statement to export all databases, and generate a backup file named dump by default.

	> mongodump --host xxx:27017 --authenticationDatabase  admin -u xxx -p xxx

2. Import the backed up files to the MongoDB by the mongostore command.
	According to the backup file generated in the last step, execute the mongostore command to import all the data into the MongoDB. For example, execute the following statement to import all of the databases.

	> mongorestore --host dds-xxx:3717 --authenticationDatabase  admin -u root -p xxx dump(file path)


## Related Reference 
- [Export Data](Export-Data.md)
