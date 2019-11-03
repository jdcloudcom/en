# View the monitoring graph

 Search monitoring data in the specified dimension, support viewing the original reported monitoring data, and viewing the monitoring data in the aggregation dimension. The page layout is as follows:  
 
 ![查询监控图](../../../../../image/Cloud-Monitor/CustomMetric/chart-view.png)  


### Search Condition Region  

**Retrieval Method**  
"Create Custom" means the user-defined search monitoring indicators and dimensions; "Select Saved Retrieval" means search based on saved retrieval conditions  
**Region**  
Regions reported by monitoring indicators, such as: cn-north-1 and cn-east-2.  

**Namespace**   
Monitoring Indicators report to the specified namespace. The namespace of identifier (system) in the name belongs to the namespace authorized and reported by the product line.  

```
Note:
1) The method to enable the Custom Metric Monitoring data of the product line is as follows:
JCS for Kubernetes (system): enable "Cluster Monitoring" when JCS for Kubernetes is required to be created.
Log Service (system): created a monitoring task as required under the log subject.
2) Non-system namespace supports the left-front matching search, such as: if the namespace is Ns01, the namespace can be searched out by entering N, Ns, Ns0, and Ns01 only; otherwise, the namespace cannot be searched out. 
```

**Monitoring Indicator**  
Monitoring reported, such as: CPU_Usage and error_count.
```
Note:
  When the reported indicators are many, you can use the search filter function. Indicator name supports the left-front matching search, such as: if the indicator name is Ercount, the namespace can be searched out by entering E, Er, Erc, Erco, Ercou, Ercoun or Ercount; otherwise, the namespace cannot be searched out.
```



**Aggregation Method**   
The aggregation method among multiple dimension values when the multiple dimensions are aggregated into one. Intuitively, it can be understood as the statistical method of merge application among multiple reported data lines when they are merged into one. The following four options are provided: avg, sum, max, and min. There are two scenarios.  
Assuming that the monitoring indicator countError is reported, its reported dimensions are as follows:  
①env=sc, modules=management, service=monitor  
②env=yf,modules=management,service=monitor  
③env=cs,service=monitor  
④env=sc, modules=management, service=logs  
⑤env=yf,modules=management,service=logs  
⑥env=cs,service=logs   
- De-dimension search monitoring data: if only env=sc is specified, other dimensions are not specified. Then all env=sc monitoring data will be aggregated into 1 data, namely, when the data of ① and ④ at the same time are merged, the statistical methods are avg, sum, max and min.

- Select multiple values under a dimension, and aggregation: if env=sc and env=yf are specified, the aggregation option shall be selected simultaneously. Then, all monitoring data of env =sc and env= yf will be filtered and aggregated into 1 datum, namely, when the data of ①, ②, ④ and ⑤ at the same time are merged, the statistical methods are avg, sum, max and min.  

**Dimension**  
The search dimension of specified monitoring indicator values. When searching based on the reported full dimension, then the monitoring graph shall display the reported original sequence; if searching based on the specified dimension, then the monitoring data sequence meeting the requirements shall be aggregated; if multiple values are specified for a dimension, and aggregation is selected, then the multiple dimension values shall be included without distinction and aggregated into 1 data.
```
Note: Specify the search dimension of monitoring data, and the relationship among multiple dimensions is and; the same dimension supports specifying multiple dimension values, and whether to aggregate them can be specified.
```

**Save Retrieval**  
Support saving the configured search conditions as quick retrieval. For subsequent search, the saved quick retrieval is provided for selecting.


### Monitoring View  

**Time Option**  
Support 1 hour, 6 hours, 1 day, 3 days, 7 days and 14 days quick search. The customized time can be specified as a range of approximate 30 days.  

**Period**  
Select different search period to monitor the granularity presented by the data. Select different monitoring period. The built-in granularity presented in Cloud Monitor is as follows: 

Monitoring Period | Granularity Presented
---|---
1 Hour | 1 Minute
6 Hours | 5 Minutes
12 Hours|10 Minutes
1 Day|20 Minutes
3 Days|2 Hours
7 Days|2 Hours
30 Days|3 Hours

**Aggregation Method**  
Within a specified time period, the data at multiple time points is aggregated into 1 data point, for example, the monitoring data is reported in 1 minute to 1 data point. Search data selection for 6 hours is to sum up 5 data points into 1 data within 5 minutes. The statistical method is adopted for these 5 data points. Provide: avg, sum, max, min, and last. Select avg by default, and view by switching the aggregation method.

**Monitoring Graph Operations**  
① Move the mouse on the timeline in monitoring graph; you can view the monitoring data of the corresponding queried object when the summary tooltip pops up.  
② If the count of monitoring line is large, you can close the monitoring data of other queried objects by clicking the identification line below the graph; click again to display the entire monitoring data.

