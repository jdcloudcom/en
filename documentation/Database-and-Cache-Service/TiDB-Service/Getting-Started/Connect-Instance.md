# Connect Instance 
Can be connected through a MySQL connector or using an API connection if you bought the instance of TiDB Service. The database connector provides the client with a way to connect to the database server while APIs provide the underlying interfaces that use the MySQL protocol and resources. Both connectors and APIs can be used to connect to servers and execute sql statements in different languages and environments, including odbc, java(jdbc), Perl, Python, PHP, Ruby, and C. 

## Connect TiDB through JD Cloud VM
TiDB can be connected by entering the command line mode after installing the MySQL client of JD Cloud VM. 
1. Command Format: mysql -h domain name -P port -u username -p password.
2. Domain Name: The domain name of the instance to be accessed, which  are displayed on the details page of the instance.
3. Port Number: The port number is displayed on the details page of the instance.
4. Username: Currently only root is supported for instance username. 
5. Password: Password corresponding to username root.

## Connect TiDB with MySQL connector  
The following connectors are officially available and TiDB is compatible with all of these:
- MySQL Connector/C： Client library of C language is the substitution of libmysqlclient
- MySQL Connector/C++: Client library of C++ language
- MySQL Connector/J: Client library for Java language, based on standard JDBC interface
- MySQL Connector/Net: client library for .Net language, which is used by MySQL for Visual Studio, and supports version 2012, 2013, 2015 and 2017 of Microsoft Visual Studio
- MySQL Connector/ODBC: Standard ODBC interface, which supports Windows, Unix and OS X
- MySQL Connector/Python: Client package for Python language, which is consistent with Python DB API version 2.0


## Connect TiDB by Using MySQL API
If you want to use C language program to directly connect TiDB, you can directly connect the libmysqlclient library and use MySQL's C API, which is the most important connection mode of C language and is widely used by various client-sides and APIs, including Connector/C.

More API:
- MySQL PHP API
- MySQL Perl API
- MySQL Python API
- MySQL Ruby APIs
- MySQL Tcl API
- MySQL Eiffel Wrapper
- Mysql Go API