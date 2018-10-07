# Storage Space
The storage space of MySQL/Percona/MariaDB services includes following sections:
1. ***Data Space***: Space occupied by data. For example, each empty table will occupy 1M, and with increasing data insertion, the occupied space will be increased.
2. ***System File Space***: Including shared table space, error log files, etc.; MySQL/Percona/MariaDB services uses InnoDB engine by default. When the installation is initialized, it will generate a shared table space for storing the redo log and undo log of database as well as the data dictionary.
3. ***Log File Space***: This is the space generated during the running of the database. The more updated transactions, the larger the space is occupied.

In order to ensure the normal use of the MySQL/Percona/MariaDB service of users and avoid triggering the service data protection mechanism, JD Cloud recommends to reserve enough space in the storage space to prevent a lack of storage space and avoid RDS instance becoming read-only.
