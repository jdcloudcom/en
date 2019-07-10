# describePolicy


## Description
Search policy details

## Request Method
GET

## Request Address
https://iam.jdcloud-api.com/v1/policy/{policyName}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**policyName**|String|True| |Policy Name|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**policy**|PolicyDetail|Policy Information|
### PolicyDetail
|Name|Type|Description|
|---|---|---|
|**policyId**|String|Policy id|
|**name**|String|Policy Name|
|**jrn**|String|JD Cloud Resource Identifier (jrn)|
|**description**|String|Description|
|**policyType**|String|Policy Type|
|**version**|String|Policy Version Number|
|**defaultEdition**|Integer|Default Version of Policy Document|
|**content**|String|Policy Document|
|**createTime**|String|Policy Creation Time|
|**updateTime**|String|Policy Update Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
