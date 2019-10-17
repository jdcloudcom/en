# getLargeScreenData


## Description
Search data by region, industry, primary indicator, secondary indicator, start time and other conditions; for indicator with the time type of day, the time interval parameter cannot exceed 31 days; for the time type indicator of month, the time interval parameter cannot exceed 800 days

## Request Method
GET

## Request Address
https://industrydata.cn-south-1.jdcloud-api.com/v1/regions/{regionId}/getData

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**region**|String|True| |Query the zone, such as a certain province or city (selectable zone shall be subject to the final authorization)|
|**industry**|String|True| |Query the industry, such as a certain fruit or crop (selectable industry shall be subject to the final authorization)|
|**startDate**|String|True| |Query the start time, with the format as follow: yyyy-MM-dd|
|**endDate**|String|True| |Time format of search end time is: yyyy-MM-dd|
|**firstIndex**|String|True| |Primary analysis indicator corresponding to data (selectable primary indicator shall be subject to the final authorization)|
|**secondIndex**|String|False| |Secondary analysis indicator corresponding to data, and if nothing is filled in, all the secondary indicators under the primary indicator corresponding to data will be queried by default (selectable secondary indicator shall be subject to the final authorization)|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID, requests are different at each time|

### Result
|Name|Type|Description|
|---|---|---|
|**status**|Boolean|true is success, false is failure|
|**message**|String|Description Information|
|**data**|RegionIndustryDataList|Query Data Result|
### RegionIndustryDataList
|Name|Type|Description|
|---|---|---|
|**dataList**|RegionIndustryData[]|Array Type of Query Result|
### RegionIndustryData
|Name|Type|Description|
|---|---|---|
|**region**|String|Zone|
|**industry**|String|Industry|
|**firstIndex**|String|Primary Indicator|
|**secondIndex**|String|Secondary Indicator|
|**dateTime**|String|Date|
|**dateType**|String|Date Category (Months, Days)|
|**indexValue**|String|Indicator Value|
|**valueUnit**|String|Value Unit|
|**attrType**|String|Attribute Category|
|**attrValue**|String|Attribute Value|
|**attrValueExt**|String|Attribute Value Expansion Content|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
