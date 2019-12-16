# Resource-Tag API


## Introduction
Resource Tag APIs


### Version
v1


## API
|Interface Name|Request Method|Function Description|
|---|---|---|
|**describeCostAttrKeys**|GET|Search cost attribute tag key information <br/><br>for use on the Cost Tag Page on the Tag Console<br>|
|**describeKeys**|POST|Get tag key|
|**describeResources**|POST|Get resource and corresponding tag list details, excluding resource name and availability zone. <br/><br>Please be noted that when cdn resources are searched, please be sure to specify regionId in url as cn-all. <br/><br>This API does not support paging function now. <br>|
|**describeResourcesInfo**|POST|Get resource and corresponding tag list details, excluding resource name and availability zone. <br/><br>Please be noted that when cdn resources are searched, please be sure to specify regionId in url as cn-all. <br/><br>|
|**describeTagResourcesInfo**|POST|Get tag information and resource number details<br>|
|**describeTags**|POST|Obtain resource tags. <br/><br>Please be noted that when tags of cdn resources are searched, please be sure to specify regionId in url as cn-all. <br/><br>Please be noted that when the region for search is not specified, please be sure to specify regionId in url as all-region. <br>|
|**describeValues**|POST|Obtain tag value|
|**operateCostAttr**|POST|Tag Key Operation (Setting or Cancellation) Cost Attribute|
|**queryResource**|POST|Search resources by tags. <br/><br>If you intend to search resources in cdn product lines, please be sure to specify regionId in url as cn-all. <br>|
|**queryServiceCode**|GET|Search all product lines accessed to the tag system|
|**resetTagResources**|POST|Resource Tag Replacement in Batches|
|**tagResources**|POST|Associate resource tags. <br/><br>Please be noted that when tags of cdn resources are associated, please be sure to specify regionId in url as cn-all. <br>|
|**unTagResources**|POST|Disassociate resource tags. <br/><br>Please be noted that when tags of cdn resources are disassociated, please be sure to specify regionId in url as cn-all. <br>|
