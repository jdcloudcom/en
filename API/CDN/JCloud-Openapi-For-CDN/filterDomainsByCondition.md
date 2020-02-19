# filterDomainsByCondition


## Description
Condition Search Domain

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/domain:filter


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainGroupIds**|String[]|False| |Domain Group id|
|**domainType**|String|False| |Business type|
|**deleted**|Boolean|False| |Contain the deleted or not|
|**tagFilters**|[TagFilter[]](#tagfilter)|False| | |

### <div id="TagFilter">TagFilter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**key**|String|False| | |
|**values**|String[]|False| | |

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**data**|String[]| |
|**count**|Integer| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
