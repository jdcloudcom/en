# queryMyCustomerList


## Description
Search customer information

## Request Method
POST

## Request Address
https://partner.jdcloud-api.com/v1/regions/{regionId}/customerManage/queryMyCustomerList

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| | |

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**customerPin**|String|False| |Customer pin (Customer Account)|
|**aliasName**|String|False| |Customer Nickname|
|**startRelTime**|String|False| |Association start time (in the format of yyyy-MM-dd HH:mm:ss)|
|**endRelTime**|String|False| |Association end time (in the format of yyyy-MM-dd HH:mm:ss)|
|**pageIndex**|Integer|False| |Current Page Number|
|**pageSize**|Integer|False| |Current Number of Entries|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**pagination**|Pagination| |
|**result**|Customer[]| |
### Customer
|Name|Type|Description|
|---|---|---|
|**id**|Integer|ID|
|**pin**|String|Customer pin|
|**distributorId**|String|Channel ID|
|**distributorPin**|String|Channel PIN|
|**distributorName**|String|Channel Name|
|**distributorLevel**|String|Channel Level|
|**relTime**|String|Association Time|
|**source**|Integer|Source (0channel itself,1JD Cloud customer)|
|**aliasName**|String|Customer Nickname|
|**contracter**|String|Contact of Customer|
|**tel**|String|Customer Phone Number|
|**email**|String|Customer Email|
|**remark**|String|Customer Description|
|**createTime**|String|Creation Time|
|**createUser**|String|Creator|
|**updateTime**|String|Modification Time|
|**updateUser**|String|Modifier|
|**accountTypeName**|String|Account Type|
|**realName**|String|Real-name Identification Name|
|**name**|String|Name|
|**yn**|Integer|Deleted or not, 0not deleted,1deleted|
### Pagination
|Name|Type|Description|
|---|---|---|
|**currPageNo**|Integer|Current Page|
|**numberPages**|Integer|Number of Pages|
|**numberRecords**|Integer|Number of Records per Page|
|**pageSize**|Integer|Page Size|
|**startIndex**|Integer|Beginning Page|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
