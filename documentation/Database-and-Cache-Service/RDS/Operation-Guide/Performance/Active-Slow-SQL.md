# Slow SQL in Execution
Screen the **executing** slow SQL according to the user-defined conditions (i.e. SQL with execution time longer than any time), making the user focusing on optimization of this SQL.


**Note: As the performance statistics are only saved in the memory, the system will keep any performance information concerning the last reboot. If historical data is required, it is suggested to export and download the data on the Console or through OpenAPI periodically.**

## 1. Customized Slow SQL Condition
The slow SQL conditions can be customized, for example screening SQL with execution time greater than or equal to 10 seconds

## 2. Export Statistical Result
Statistical results can be exported in the form of excel files, for convenience of saving and sending to concerned persons for analysis and optimization

![慢SQL](../../../../../image/RDS/Active-Slow-SQL-1.png)
