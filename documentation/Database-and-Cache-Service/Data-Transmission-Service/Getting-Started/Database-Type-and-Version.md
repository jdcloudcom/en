# Supported Database Type and Version

Database type and version for migration, supported by data transmission DTS, are as follows.

| Database Type | Source Database Connection Method | Target Database          | Supported Version                                                     | Migration Type                             |
| ---------- | ---------------- | ------------------- | ------------------------------------------------------------ | ------------------------------------ |
| MySQL      | Public IP / Directed Connection / Intranet     | JCS for MySQL    | 5.5 → 5.5 and Above <br />5.6 → 5.6 and Above <br />5.7 → 5.7 and Above <br />8.0 → 8.0 |  Structure Migration<br />Full Migration<br />Incremental Migration |
| Percona    | Public IP / Directed Connection / Intranet    | JCS for Percona    | 5.7 → 5.7                                                    | Structure Migration<br />Full Migration<br />Incremental Migration |
| MariaDB    | Public IP / Directed Connection / Intranet   | JCS for MariaDB    | 10.2 → 10.2                                                  | Structure Migration<br />Full Migration<br />Incremental Migration |
| SQL Server | Public IP / Directed Connection / Intranet    | JCS for SQL Server | SQL Server Enterprise Version: <br />2008R2 → 2008R2 and Above<br />2012 → 2012 and Above <br />2014 → 2014 and Above <br />2016 → 2016 and Above<br />2017 → 2017 | Structure Migration<br />Full Migration<br />Incremental Migration |
| PostgreSQL | EIP/Direct Connection/Intranet | JCS for PostgreSQL | 9.4, 9.6, <br/>10.5, 10.6, 10.7, 10.8, 10.9, <br/>11.2, 11.3 and 11.4<br />The target end shall be the same version or higher | Structure Migration<br />Full Migration<br />Incremental Migration |
| MongoDB    | Public IP| JCS for MongoDB | 3.2 → 3.2 and Above<br />3.4 → 3.4 and Above<br />3.6 → 3.6 | Full Migration<br />Incremental Migration               |
