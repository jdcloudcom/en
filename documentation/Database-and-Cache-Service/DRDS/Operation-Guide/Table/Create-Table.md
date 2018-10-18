# Create Table

**Two steps are needed to create table (in the reverse order of deleting table):**

1) Login console and create the routing information of the table in **Table Management**

2) Login DRDS to execute “CREATE TABLE” statement

**Note: the above two operation order must strictly follow the sequence that login the console and perform creation first and then login DRDS to execute "CREATE TABLE" statement**

**1. Enter **Table Management** page**

Select **Database Management**->**Table Management** page, click **Create Table****

![Table List] (../../../../../image/DRDS/table-list.png)

**2. Create Routing Information of the Table**

**Table name:** table name, the rule of name is prompted on the console

**Type:** supports two types of "split" and "no split"

- Split: the table will be corresponding to multiple tables of multiple JCS for MySQL instances

- No split: do not split the table, it is corresponding to 1 table of the JCS for MySQL instance

**Split field:** split the data according to which field

**Note: As data will be split into tables of several databases, if the Unique Index and the split fields are inconsistent with each other, the Unique restriction will not come into force.**

**Field type:** select int or string, more types will be able to be selected later

![Create Table] (../../../../../image/DRDS/create-table.png)

**3. Login DRDS to execute "CREATE TABLE" statement**

Link into DRDS with client tool to execute "CREATE TABLE” statement to create database. DRDS will create actual table on multiple JCS for MySQL instances at backend according to the created routing information of the table
