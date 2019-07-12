# Slow Log 
JD Cloud Database MySQL/Percona/MariaDB provides Slow Log Statistics, Details of Slow Log, you can use statistical information to optimize your application.

## Operation Steps
1. Login [Cloud Database RD Management Console](https://rds-console.jdcloud.com/database).    
2. Select the target instance and click the target instance to enter the Instance Details.  

### View slow logs
3. Click the Tab page **Performance Optimization**, select the time range and search **Slow Log Statistics** or **Slow Log Details**.
    * The list shows statistics time/start time by default in reverse order

|Search Item|Contents|
|---|---|
|Slow Log Statistics|Make statistical summary of SQL statements with execution time longer than 1 second in MySQL/Percona/MariaDB Cloud Database within 7 days, and give an analysis report of slow query log;|
|Slow Log Details|Record SQL statements with execution time longer than 1 second in MySQL/Percona/MariaDB Cloud Database within 7 days;|

### Download slow logs
3. Click the Tab page **Performance Optimization**, select the time range and search **Slow Log Statistics** or **Slow Log Details**.
4. Click the icon **Download** on the upper right corner of the list page and the search result on the current page can be downloaded to the local directory in the **excel** format.


