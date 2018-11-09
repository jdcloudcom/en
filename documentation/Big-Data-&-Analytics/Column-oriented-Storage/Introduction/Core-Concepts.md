# Core Concepts
See the following for the concepts and their interpretations used in the Anti-DDoS Pro Help Documentation.

- **DoS (Denial of Service)**: namely denial of service attack. The attack takes advantage of the functional defects of the network service of the target system or directly consumes its system resources, with the aim to make the target customer's system unavailable and unable to provide normal service.

- **DDoS (Distributed Denial of Service attack)**: namely distributed denial of service attack. It refers to combine multiple computers to change into “zombie hosts” by the use of hacker technology, and jointly launch DDoS attacks on one or more targets to deny power of service attack in multiple times, making it impossible for the victims to provide network services.

- **CNAME**: CNAME record. It means to implement resolution from one domain name to another domain name, CNAME can make multiple machine names point to another CNAME so as to implement fast change of IP address.

- **Black hole**: black hole means that JD Cloud Anti-DDoS Pro will block Internet access of the server when the traffic of the attack suffered by the server exceeds the protection cap of the Anti-DDoS Pro package purchased by the user.


# Core Concepts
See the following for the concepts and their interpretations used in the Column-oriented Storage Help Documentation.

- **Row Key**: row key is the same as nosql database, row key is the primary key used to represent a single row of records, data of HBase is globally ordered according to lexicographic order of RowKey, and all queries only can depend on this order dimension. There are only three methods to access rows in HBASE table.
 
Row key can be an arbitrary character string (the maximum length is 64KB, and the length usually is 10-1000bytes in actual application), and inside HBASE, row key is saved as a byte array. In storage, data is ordered and stored according to lexicographic order (byte order) of Row key. When designing a key, the character shall be fully ordered and stored, putting together rows that are often read together. (Position relativeness)
- **Columns**: Family column family column cluster: HBASE represents each column in the table, all of them belong to certain column family. Column family is part of schema of table (but column is not), which must be defined before use of the table. Column name use the column family as the prefix. For example, courses: history, courses: math belongs to the courses column family.
- **Cell**: Unit uniquely identified by {row key, columnFamily, version}. Data in cell has no class, and all of them are stored in bytecode format.
keyword: no class, bytecode
- **TimeStamp**: one storage unit identified through rowkey and columns in time stamp HBASE is called cell. Each cell saves multiple versions of the same data. The version is indexed through time stamp. The class of time stamp is 64-bit integer-class. The value to the time stamp can be granted by HBASE (automatic when data is written in), the time stamp is accurate to millisecond of the current system time at this moment. The value to the time stamp can be granted by the customer. If the application wants to avoid data version conflict, it must generate its own unique time stamp. In each cell, data in different versions is sorted in reverse chronological order, namely, the latest data is ranked on the top.

