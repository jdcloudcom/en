# getLargeScreenData


## Description
Query data based on region, industry, firstIndex, secondIndex, startTime and endTime

## Request Method
GET

## Request Address
https://datastar.cn-south-1.jdcloud-api.com/v1/regions/{regionId}/largeScreen/getData

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**region**|String|True| |The query region, such as a certain province or city (selectable regions shall be subject to the final authorization)|
|**industry**|String|True| |The query industry, such as a certain fruit or crop (selectable industries shall be subject to the final authorization)|
|**firstIndex**|String|True| |Primary analysis indicator corresponding to data (selectable firstIndex shall be subject to the final authorization)|
|**secondIndex**|String|False| |Secondary analysis indicator corresponding to data, and if nothing is filled in, all the secondIndex under the firstIndex corresponding to data will be queried by default (selectable secondIndex shall be subject to the final authorization)|
|**startDate**|String|True| |The query start time, with the format as follow: yyyy-MM-dd|
|**endDate**|String|True| |The query end time, with the format as follows: yyyy-MM-dd|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID, it is different at each time|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**data**|RegionIndustryDataList|Query Result|
|**message**|String|Description Information|
|**status**|Boolean|true is success, false is failure|
### RegionIndustryDataList
|Name|Type|Description|
|---|---|---|
|**dataList**|RegionIndustryData[]| |
### RegionIndustryData
|Name|Type|Description|
|---|---|---|
|**region**|String|Region|
|**industry**|String|Industry|
|**firstIndex**|String|Primary Indicator|
|**secondIndex**|String|Secondary indicator|
|**dateTime**|String|Date|
|**dateType**|String|Date Type (Month, Day)|
|**indexValue**|String|the indicator Value|
|**valueUnit**|String|Value Unit|
|**attrType**|String|Attribute Type|
|**attrValue**|String|Attribute Value|
|**attrValueExt**|String|Expansion Content to the attribute Value |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
