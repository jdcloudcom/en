# Connection Instance

Data Warehouse JDW provides service based on the open-source Data Warehouse Greenplum, is fully compatible with PostgreSQL message protocols, and can directly use tools such as libpq, JDBC, ODBC, psycopg2 and pgadmin III that support PostgreSQL message protocols.

JDW supports installation packages of JDBC, ODBC and libpq downloaded from Greenplum official website, which is easy for users to install and use. For details, see [Greenplum Official Document](http://gpdb.docs.pivotal.io/4380/client_tool_guides/drivers/unix/unix_connect.html).

psql is a common JDW connection tool that provides a rich set of commands with its binary files locating in BIN directory after installation of JDW.

Here’s how to connect Data Warehouse JDW by using psql:

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

- For more information on how to use the psql of JDW, see the document "[psql](http://gpdb.docs.pivotal.io/4340/client_tool_guides/client/unix/psql.html)".
- The data repository JDW also supports the psql command of PostgreSQL. See [PostgreSQL 8.3.23 Documentation — psql](https://www.postgresql.org/docs/8.3/static/app-psql.html) for details.

