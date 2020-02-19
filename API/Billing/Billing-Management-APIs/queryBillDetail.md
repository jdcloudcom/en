# queryBillDetail


## Description
Search detailed data of bill

## Request Method
POST

## Request Address
https://billing.jdcloud-api.com/v1/regions/{regionId}/billDetail:list

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Start Time of Bill|
|**endTime**|String|True| |End Time of Bill|
|**appCode**|String|False| |Product Line Code|
|**serviceCode**|String|False| |Product Code|
|**billingType**|Integer|False| |Billing Type: 1. Pay By Configuration 2. Pay By Consumption 3. Monthly Package 4. Pay by Times|
|**resourceIds**|String[]|False| |Resource sheet id list, supporting upload of 500 at most|
|**tags**|Map[]|False| |Tag|
|**pageIndex**|Integer|False| |pageIndex paging, starting from 1|
|**pageSize**|Integer|False| |pageSize Search data entries per page, supporting 1000 entries at most|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**pagination**|Pagination| |
|**result**|BillSummary[]| |
### BillSummary
|Name|Type|Description|
|---|---|---|
|**pin**|String|User pin|
|**appCode**|String|appCode|
|**appCodeName**|String|Product Line Code Name|
|**serviceCode**|String|serviceCode|
|**serviceCodeName**|String|Product Code Name|
|**billingType**|Integer|Billing Type|
|**billingTypeName**|String|Billing Type Description|
|**resourceId**|String|Resources id|
|**resourceName**|String|Resource Name|
|**region**|String|Zone|
|**actionTypeName**|String|Cost Type|
|**formula**|String|Specification|
|**startTime**|String|Start Time of Billing|
|**endTime**|String|End Time of Billing|
|**billTime**|String|Bill Generating Time|
|**totalFee**|Number|Total Amount of Bill|
|**discountFee**|Number|Discount Amount|
|**realTotalFee**|Number|Discount Price Amount after Discount|
|**cashCouponPayFee**|Number|Coupon Payment Amount|
|**balancePayFee**|Number|Balance Payment Amount|
|**cashPayFee**|Number|Cash Payment Amount|
|**arrearFee**|Number|Overdue Amount|
|**tagDetails**|ResourceTagVo[]|Tag Details|
### ResourceTagVo
|Name|Type|Description|
|---|---|---|
|**tagKey**|String|Tag Key|
|**tagValue**|String|Tag Value|
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
