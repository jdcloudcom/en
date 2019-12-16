# JCLOUD LOGS API


## Introduction
logs API


### Version
v1


## API
|Interface Name|Request Method|Function Description|
|---|---|---|
|**createCollectInfo**|POST|Create collection configuration, supporting generation of collection template based on cloud product template and customized collection configuration.|
|**createLogset**|POST|Create Log Collection. Name cannot be duplicated.|
|**createLogtopic**|POST|Create log subjects in such a way that the name of any created log subject shall not be identical to any existing log subject under the log set.|
|**deleteLogset**|DELETE|Delete log sets. When there are multiple log sets to be deleted, any log set with a log subject will invalidate deletion of all logs sets.|
|**deleteLogtopic**|DELETE|Delete log subjects. Its collection configuration and collection instance configuration will be deleted together.|
|**describeCollectInfo**|GET|Collect basic configuration information.|
|**describeCollectResources**|GET|Search instance list while collecting configuration|
|**describeLogset**|GET|Search log set details.|
|**describeLogsets**|GET|Search log set list. Support fuzzy search by names. The results contain the information that if the log set has the log subject. Log sets saved in log subjects cannot be deleted.|
|**describeLogtopic**|GET|Search basic information of log subject. If collection configuration is configured, the collection configuration UID will be returned|
|**describeLogtopics**|GET|Search log subject list, with fuzzing search by names supported.|
|**updateCollectInfo**|PUT|Update collection configuration. If the uploaded instance list is not null, all previous instances will be replaced rather than being added.|
|**updateCollectResources**|POST|Incrementally update collection instance list. Updated action supports add and remove|
|**updateLogset**|PUT|Update log sets. Log set names cannot be updated.|
|**updateLogtopic**|PUT|Update log subjects. Log subject names cannot be updated.|
