# createPolicy


## Description
Create policies

## Request Method
POST

## Request Address
https://iam.jdcloud-api.com/v1/policy


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**createPolicyInfo**|CreatePolicyInfo|True| |Policy Information|

### CreatePolicyInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |The policy name supports 4 to 64-digit letters, numbers as well as - and _, and it must begin with a letter|
|**description**|String|False| |Description, 0~256 Characters|
|**content**|String|True| |The policy document consists of 6,144 characters at most|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**policy**|Policy|Policy Information|
### Policy
|Name|Type|Description|
|---|---|---|
|**policyId**|String|Policy id|
|**name**|String|Policy Name|
|**jrn**|String|JD Cloud Resource Identifier (jrn)|
|**description**|String|Description|
|**policyType**|String|Policy Type: 0 - System Policy, 1 - User Policy|
|**version**|String|Policy Version Number|
|**defaultEdition**|Integer|Default Version of Policy Document|
|**createTime**|String|Policy Creation Time|
|**updateTime**|String|Policy Update Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
