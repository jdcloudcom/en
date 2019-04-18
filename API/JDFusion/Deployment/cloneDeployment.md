# cloneDeployment


## Description
Clone Deployment Information

## Request Method
PUT

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/deployments/{id}:clone

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|True| |Deployment ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**deployment**|Deployment|True| |Create deployment|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|

### Deployment
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| |Name|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**deployment**|DeploymentInfo| |
### DeploymentInfo
|Name|Type|Description|
|---|---|---|
|**info**|DeploymentBaseInfo| |
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
### DeploymentBaseInfo
|Name|Type|Description|
|---|---|---|
|**cloudId**|String|ID of Cloud|
|**version**|String|Version|
|**readOnly**|Integer|Whether it is read-only  0: No 1: Yes|
|**id**|String|ID|
|**name**|String|Name|
|**description**|String|Description|
|**userId**|String|User ID|
|**createdTime**|String|Creation Time|
|**updatedTime**|String|Update Time|
|**lastOperation**|String|Last Operation|

## Return Code
|Return Code|Description|
|---|---|
|**201**|CREATED|
|**404**|not found|
