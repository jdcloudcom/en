# Connection Instance

JCS for Greenplum provides service based on Greenplum 5.19, is fully compatible with PostgreSQL 8.3 message protocols, and can directly use tools that support PostgreSQL 8.3 message protocols, such as libpq, JDBC, ODBC, psycopg2, pgadmin III, etc.

The Greenplum official website includes the installation packages of JDBC, ODBC and libpq, which can be easily installed and used by users. For details, see the [Greenplum official document](http://gpdb.docs.pivotal.io/4380/client_tool_guides/drivers/unix/unix_connect.html).

psql is a popular Greenplum tool that provides a rich set of commands, of which the binary file is in the BIN directory after Greenplum is installed.

Here's how to connect Greenplum using psql:

1. How to connect strings

   ```
   psql "host=jdw-xxx-master-0.jvessel-open-hb.jdcloud.com port=5432 user=<username>" 
   ```

2. How to specify parameters

   ```
   psql -h jdw-xxx-master-0.jvessel-open-hb.jdcloud.com -p 5432 -U <username>
   ```

   Parameter Description:

   - -h: Specify the machine address.
   - -p: Specify the port number.
   - -U: Specify the connected user.
   - More options can be viewed with `psql --help`. In psql, you can execute `\? `View more commands supported in psql.

Description:

- For more information on how to use the psql of Greenplum, see the document "\[psql](http://gpdb.docs.pivotal.io/4340/client_tool_guides/client/unix/psql.html)".
- The data repository JDW also supports the psql command of PostgreSQL. See [PostgreSQL 8.3.23 Documentation — psql](https://www.postgresql.org/docs/8.3/static/app-psql.html) for details.

