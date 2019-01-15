# Storage Space
The storage space of the JCS for MySQL/Percona/MariaDB services includes following sections:

1. ***Data Space***: Space occupied by data. For example, each empty table will occupy 1M, and with increasing data insertion, the occupied space will be increased.<br>
2. ***System File Space***: Including shared table space, error log files, etc.; JCS for MySQL/Percona/MariaDB services uses InnoDB engine by default. When the installation is initialized, it will generate a shared table space for storing the redo log and undo log of database as well as the data dictionary.<br>
3. ***Log File Space***: The log file space refers to the space used by the binlog file. This is the space generated during the running of database. The more update transactions are, the larger the space usage is.

In order to ensure the normal use of the JCS for MySQL/Percona/MariaDB service of users and avoid triggering the service data protection mechanism, JD Cloud recommends to reserve enough space in the storage space to prevent a lack of storage space and avoid RDS instance becoming read-only.
