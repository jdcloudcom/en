# Availability Group


## Introduction
Availability Group APIs


### Version
v1


## API
|Interface Name|Request Method|Function Description|
|---|---|---|
|**abandonInstances**|POST|Remove instance from availability group|
|**createAg**|POST|Create an availability group|
|**deleteAg**|DELETE|Delete Availability Group based on id and please make sure that all VM Instances of AG are deleted|
|**describeAg**|GET|Search Availability Group details based in id|
|**describeAgs**|GET|Search one or more availability groups with filter conditions|
|**describeQuotas**|GET|Search (ag) quota|
|**setInstanceTemplate**|POST|Modify instance template of availability group|
|**updateAg**|PATCH|Modify information of an availability group|
