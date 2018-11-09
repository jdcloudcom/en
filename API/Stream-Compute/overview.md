# JD Cloud Stream Compute APIs


## Introduction
Provide Stream Compute Operation APIs.


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**addOrUpdateJob**|POST|Add or update iob|
|**addOrUpdateStorage**|POST|Create or update storage|
|**createNamespace**|POST|Create namespace|
|**deleteJob**|DELETE|Delete Job|
|**deleteNamespace**|DELETE|Delete namespace; if there are other subordinate resources associated with it, it is not allowed to delete it|
|**deleteStorage**|DELETE|Delete the assigned input|
|**describeJob**|GET|Query the details of Assigned Job|
|**describeStorage**|GET|Query the assigned input|
|**getJobList**|GET|Query all the jobs under the assigned applications|
|**getStorageList**|GET|Create or update storage|
|**queryNamespaceDetail**|GET|Query the details of a certain application|
|**queryNamespaces**|GET|Query the application list under the tenant|
|**startJob**|GET|Running Job|
|**stopJob**|GET|Stop job running|
|**updateNamespace**|PUT|Update namespace|
