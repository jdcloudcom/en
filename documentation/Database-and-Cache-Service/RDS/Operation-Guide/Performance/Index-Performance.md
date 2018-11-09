# Index Performance Statistics & Analysis
Index performance analysis covers the statistics of index usage, such as index size, table scan, least-frequently-used indexes, and index updates, and indicates missing indexes and suggestions.

## 1. Select Database and Performance Indicators
Based on a single database, index performance analysis can be provided for statistics of all databases by default, and users can also select one or several databases for analysis.

![Index Performance 1](../../../image/RDS/Index-Performance-1.png)

## 2. Missing Indexes and Suggestions
It is recommended to obtain missing indexes according to the Microsoft system in combination of the manual judgment of DBA or related developers.

The use of each column is shown as follows: Create index <Index Name> on

See the detailed use and limits of missing index information in [Microsoft Official Document](https://docs.microsoft.com/zh-cn/previous-versions/sql/sql-server-2008/ms345417(v%3dsql.100)).

