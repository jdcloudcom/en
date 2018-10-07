# Storage Engine
Considering performance and security, MySQL/Percona/MariaDB services shall be employed with the InnoDB storage engine in default, and it is recommend to use the InnoDB engine to get better performance and reliability of the database.

The MyISAM engine table only supports the table-level locks and does not support services, and the reading and writing will conflict with each other; the long-time query or writing on the table will obstruct other operations, resulting in a stack of connections, and data may loss after crash. Therefore, JD Cloud does not recommend to use the MyISAM engine.
