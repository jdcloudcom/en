# getLargeScreenData


## Description
Query data based on zone, industry, primary indicator, secondary indicator, start time and other conditions

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
|**endDate**|String|True| |Query the end time, with the format as follows: yyyy-MM-dd|
|**firstIndex**|String|True| |Primary analysis indicator corresponding to data (selectable primary indicator shall be subject to the final authorization)|
|**industry**|String|True| |Query the industry, such as a certain fruit or crop (selectable industry shall be subject to the final authorization)|
|**region**|String|True| |Query the zone, such as a certain province or city (selectable zone shall be subject to the final authorization)|
|**secondIndex**|String|False| |Secondary analysis indicator corresponding to data, and if nothing is filled in, all the secondary indicators under the primary indicator corresponding to data will be queried by default (selectable secondary indicator shall be subject to the final authorization)|
|**startDate**|String|True| |Query the start time, with the format as follow: yyyy-MM-dd|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID, requests are different at each time|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**data**|RegionIndustryDataList|Query Data Result|
|**message**|String|Description Information|
|**status**|Boolean|true is success, false is failure|
### RegionIndustryDataList
|Name|Type|Description|
|---|---|---|
|**dataList**|RegionIndustryData[]|Zone|
### RegionIndustryData
|Name|Type|Description|
|---|---|---|
|**attrType**|String|Attribute Category|
|**attrValue**|String|Attribute Value|
|**attrValueExt**|String|Attribute Value Expansion Content|
|**dateTime**|String|Date|
|**dateType**|String|Date Category (Months, Days)|
|**firstIndex**|String|Primary Indicator|
|**indexValue**|String|Indicator Value|
|**industry**|String|Industry|
|**region**|String|Zone|
|**secondIndex**|String|Secondary indicator|
|**valueUnit**|String|Value Unit|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
