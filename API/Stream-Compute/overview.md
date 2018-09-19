# JD Cloud Stream Compute APIs


## Introduction
Provide Related APIs for Stream Compute Operation.


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**addOrUpdateJob**|POST|Add or Update Job|
|**addOrUpdateStorage**|POST|Create or Update Storage|
|**createNamespace**|POST|Create Namespace|
|**deleteJob**|DELETE|Delete Job|
|**deleteNamespace**|DELETE|Delete Namespace; if there are other subordinate resources associated with it, it is not allowed to delete it|
|**deleteStorage**|DELETE|Delete the Assigned Input|
|**describeJob**|GET|Query the Details of Assigned Job|
|**describeStorage**|GET|Query the Assigned Input|
|**getJobList**|GET|Query All the Jobs Under the Assigned Applications|
|**getStorageList**|GET|Create or Update Storage|
|**queryNamespaceDetail**|GET|Query the Details of A Certain Application|
|**queryNamespaces**|GET|Query the Application List Under the Tenant|
|**startJob**|GET|Running Job|
|**stopJob**|GET|Stop Job Running|
|**updateNamespace**|PUT|Update Namespace|
