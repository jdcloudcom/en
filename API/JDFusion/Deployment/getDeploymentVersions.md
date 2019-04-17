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
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**versions**|DeploymentApplyInfo[]| |
### DeploymentApplyInfo
|Name|Type|Description|
|---|---|---|
|**applyTime**|String|Application Time|
|**comment**|String|Description Information|
|**content**|DeploymentResourcesInfo| |
|**id**|String|ID|
|**version**|String|Version|
### DeploymentResourcesInfo
|Name|Type|Description|
|---|---|---|
|**diskAttachment**|Object| |
|**disks**|Object| |
|**eipAssociate**|Object| |
|**eips**|Object| |
|**httpListeners**|Object| |
|**keypairs**|Object| |
|**netInterfaceAttachment**|Object| |
|**networkInterfaces**|Object| |
|**securityGroups**|Object| |
|**slbs**|Object| |
|**subnets**|Object| |
|**variables**|Object| |
|**vms**|Object| |
|**vpcs**|Object| |
|**vserverGroups**|Object| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
|**404**|not found|
