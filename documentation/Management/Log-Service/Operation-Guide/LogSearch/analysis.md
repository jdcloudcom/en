# Statistical Analysis
With the statistics and analysis function, logs meeting specified conditions can be filtered from a mass of logs for statistical counting or summing and averaging of digital type fields. Meanwhile, 3 display forms such as forms, line charts and pie charts are provided, enabling visual and quick view of analysis results. (Note: Only structured logs support the operation of statistics and analysis. Custom service logs require log pretreatment first.)
## Application Scenario
**Scenario 1: Analyze request distribution conditions**

Layer 7 Application Load Balancer access logs are grouped by request_method to count the occurrences of each request method.

```
select request_method,count(1) group by request_method
```

The results are shown as follows. Within the selected duration, 50 logs are counted for the occurrences of POST method while 9 logs are counted for that of GET method.

| request_method | COUNT(1) |
| -------------- | -------- |
| POST           | 50       |
| GET            | 9        |


**Scenario 2: Obtain the time-consuming SQL execution statement** 

In mysql slow query logs, logs are grouped by the field clienthost to count the occurrences of each clienthost for which query_time is more than 1s.

```
select clienthost,count(1) where query_time > 1 group by clienthost
```

The results are shown as follows. Within the selected duration, there are 16 occurrences of 192.168.0.29 and 4 occurrences of 192.168.0.28 with a query time of more than 1s.

| clienthost   | COUNT(1) |
| ------------ | -------- |
| 192.168.0.29 | 16       |
| 192.168.0.28 | 4        |

## Statistics & Analysis Grammar
The query syntax of aggregate statistics supports basic SQL syntax, which is described as follows:

1. Only the statement select is supported, while statements including update, insert and delete are not supported. The statement select includes three parts that are {selectExpr}, {whereExpr} and {fileds}, and its overall structure is as follows. It is not necessary to specify the field from, and the log type of the log topic is added by default.

   ```
   select {selectExpr} where {whereExpr} goup by {fileds} 
   ```

2. {SelectExpr} must include one or more aggregate functions from max, min, avg, sum and count. For example:

   ```
   select count(1),max(score) group by username                    //Correct
   
   select city group by city										//Error, aggregate function not included
   ```

3. In {whereExpr}, only the keywords and & between are supported, while other keywords such as or, is and not aren't supported.

   ```
   select count(1) where city= 'bj' and age = 18					//Correct
   
   select count(1) where city= 'bj' or age = 18					//Error, the keyword or is not supported	 
   ```

4. Comparison operators including >, >=, <, <=, =, != & in are supported. Both ends of the character value shall be added with single quotes, and comparison operators of >, >=, < and <= are supported for the numeric value only.

   ```
   select count(1),max(score) where age > 5 and city = 'bj' group by username
   ```

5. group by is supported, but the non-aggregate field in {selectExpr} shall be after group by. For example, the field feild does not appear after group by, and therefore the following syntax is incorrect.

   ```
   select feild,count(1) group by pin
   ```

6. The field order by is not supported, which means that the statistical results are not sorted by a certain field.

7. limit is supported, and statistical results only up to 100 entries can be returned.

8. The subquery is not supported.

9. It is necessary to add that, in the automatically generated statement, the back quote (``) is required for each field, which prevents certain fields in the query statement from being SQL keywords. The user shall add the back quote properly when manually adding the data field.

## Fast Analysis
Users can directly input retrieval and analysis grammar for retrieval. Meanwhile, we provide the quick analysis function which can automatically fill in retrieval and analysis grammar and help users which are unfamiliar with SQL operation to get started quickly. In the quick analysis field bar, three short-cut icons are provided, including filter, statistics and group, with respective meanings and functions as below:  
- Filter: Filter the value of the field. After the field is clicked, the value will be automatically filtered to the retrieval and analysis statement column. In the course of statistics and analysis, logs configured as per filter conditions will be screened.  
- Statistics: Some quick statistics and analysis methods are built in. After the field is clicked, the values will be automatically filled to the statistics and analysis bar. Statistical methods provided for digit and non-digital types are as follows：  

| Type           |Supported statistical method |
| -------------- | -------- |
| Digit (int/ integer, double and Float)| Count, Max, Min, Average and Sum|
| Non-digit (string, IP and time/datetime)| Count  |

- Group: Statistical results will be grouped by value. After the chart is clicked, the retrieval bar will fill the field behind GROUP BY. After the retrieval operation is carried out, statistical results will be displayed in lines by values in the table.  
### Operation Guide
Taking the 7-layer access logs of Load Balancer for example, occurrence times of different request methods are analyzed.  

#### Prerequisites 
1. Log subjects [Log Source: Cloud Products] - [Products: Application Load Balancer] - [Log Type: 7-layer Access Log] are created.
2. Application Load Balancer collecting instance configuration has access information.  

#### Operation Steps
1.	Access [Log Service Console](https://logs-console.jdcloud.com/overview) and enter the log set list.
2.	Select the log set of the log subject created, click the log set name or the view button under the operation bar and enter the Log Set Details.
![日志集详情](../../../../../image/LogService/analysis/logset-detail.png) 
3. On the statistics and analysis page, find the [request_method] field on the Quick Analysis Bar, move the statistical icon on the right, click the **Count** option and click to add the field as GROUP BY.
4. After the operation is executed, you can find that the quick generation and analysis statement is filled in the search column. Select the search period and click the **Retrieval** button. Then, you can see the statistics and analysis results.
![统计结果-表格1](../../../../../image/LogService/analysis/stastic-1.png) 
5. By default, the table information is displayed. Click the pie chart. By default, the 1st column of the table is the type column and the last column is the value column. If there are several data columns in the statistics, you can adjust the type column and the numeric value column according to your demands. Via operation examples, examples of pie chart displayed by quick analysis and exhibition can be viewed:
![统计结果-饼图](../../../../../image/LogService/analysis/stastic-2.png)  
6. Select the **Status** field and click the field to add it as the GROUP BY icon.  After switching to the table column, you can view different request methods and return code statuses.
![统计结果-表格1](../../../../../image/LogService/analysis/stastic-3.png) 
7. Switch to the "Line Chart" icon. By default, the 1st column of the table is the type column and the last column is the value column. Click and open the Type Bar and add a status column. You can view the line chart as below:  
![统计结果-折线图](../../../../../image/LogService/analysis/stastic-4.png)  



