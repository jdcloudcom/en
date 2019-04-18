# getDeploymentVersions


## Description
Search application records

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/deployments/{id}/versions

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|True| |Deployment ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**versions**|DeploymentApplyInfo[]| |
### DeploymentApplyInfo
|Name|Type|Description|
|---|---|---|
|**id**|String|ID|
|**comment**|String|Description Information|
|**applyTime**|String|Application Time|
|**version**|String|Version|
|**content**|DeploymentResourcesInfo| |
### DeploymentResourcesInfo
|Name|Type|Description|
|---|---|---|
|**vms**|Object| |
|**eips**|Object| |
|**subnets**|Object| |
|**networkInterfaces**|Object| |
|**slbs**|Object| |
|**securityGroups**|Object| |
|**securityGroupRules**|Object| |
|**keypairs**|Object| |
|**disks**|Object| |
|**vpcs**|Object| |
|**vserverGroups**|Object| |
|**httpListeners**|Object| |
|**diskAttachment**|Object| |
|**netInterfaceAttachment**|Object| |
|**eipAssociate**|Object| |
|**rds**|Object| |
|**rdsDatabase**|Object| |
|**rdsAccount**|Object| |
|**rdsAccountGrant**|Object| |
|**bucket**|Object| |
|**variables**|Object| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
|**404**|not found|
