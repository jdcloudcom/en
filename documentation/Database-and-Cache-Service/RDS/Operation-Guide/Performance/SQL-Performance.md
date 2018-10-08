# JCS for SQL Performance Statistics
The analysis on JCS for SQL performance statistics on the JCS for SQL execution in the database covers the statistics of various maintenance, such as slow SQL and huge SQL of the return result set. Meanwhile, users can also define statistical standards based on the actual situation of their own services and systems to meet the needs of various applications and scenarios.

**Note: Since performance statistics are only kept in memory, the system only retains relevant performance information since the last reboot. It is recommended to download historical data from the console or via OpenAPI on a regular basis if needed.**

## 2. 7 Statistical Dimensions Supported
SQL performance statistics support seven statistical dimensions as follows

![SQL Performance1](../../../image/RDS/SQL-Performance-1.png)

## 3. Scope of Custom Statistics
Users can customize the scope of the statistics in each statistical dimension (the default is 0), for example:

![SQL Performance 2](../../../image/RDS/SQL-Performance-2.png)


## 4. Export Statistics
The statistical results can be exported in excel format, convenient for saving or sending to relevant personnel for analysis and optimization.

![JCS for SQL Performance 3](../../../image/RDS/SQL-Performance-3.png)

