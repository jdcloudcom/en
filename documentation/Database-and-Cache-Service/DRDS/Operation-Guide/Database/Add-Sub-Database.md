# Add Sub-library
DRDS can be split by value, character string and date and time. 

For tables split by date and time, each sub-table can only store data of a time period and cannot be circulated. When table shardings are used up, users need to expand table shardings by hand. There are two steps to expand the sub-table:
1. Add sub-library through the Console
2. Connect with DRDS Database and execute SQL to expand the corresponding table

For example, if there are 24 database shardings in a DRDS database of a user, the table tab1 is split by year and month and one table sharding is provided per month, then data of 24 months in total can be stored. Where a user needs to store data of more time period, he/she needs to add database shardings by hand and expand tables. Therefore, this document describes how to add a new sub-library on the Console and expand the sub-table through SQL.

## Add sub-library on the Console

**1. Enter [database management] page**

Click the instance name to enter instance page, select **Database Management** page and click **Add Sub-library**

![DB列表](../../../../../image/DRDS/add-sub-db-1.png)

**2. Select the RDS MySQL instance to be added a sub-library**
In the instance list, if the RDS MySQL instance to be added a sub-library is selected, this list will only list the instance that is in the same VPC as the current DRDS and the RDS MySQL version is same as the backend RDS MySQL version of current DRDS. After the selection, enter the count of the sub-library to be added to each instance. For example, entering 8, meaning that 8 sub-libraries will be added to each selected RDS MySQL instance.

After the selection, click **OK** and then DRDS will create the sub-libraries of related count in the selected instance 

**Note: The total count of sub-library created by a single DRDS Database in 1 RDS MySQL cannot exceed 64, namely: the sum of the existing sub-library and the new sub-library must be less than or equal to 64**

For example, if there are 8 sub-libraries created by DRDS Database drds_db1 on the instance drds_mysql_1, then drds_db1 can at most add 56 sub-libraries on the drds_mysql_1

![DB列表](../../../../../image/DRDS/add-sub-db-2.png)

**3. Execute SQL command to expand the sub-table**
After the addition of sub-library, you can connect with DRDS Database and execute SQL to expand the corresponding table

For example, for Table timetb, if sub-tables should be expanded in all new sub-libraries, SQL is
```SQL
alter table timetb add partitions on all dbpartition;
```

For specific SQL syntax and description, you may refer to the document [DRDS DDL SQL syntax](../../SQL-Doc/DRDS-DDL.md) (Part of "Expand Split Table")
