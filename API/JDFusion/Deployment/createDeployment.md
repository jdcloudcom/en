# createDeployment


## Description
Create deployment information

## Request Method
POST

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/deployments

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**deployment**|DeploymentInfo|True| |Create deployment|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|

### DeploymentInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**info**|DeploymentBaseInfo|False| | |
|**content**|DeploymentResourcesInfo|False| | |
### DeploymentResourcesInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**vms**|Object|False| | |
|**eips**|Object|False| | |
|**subnets**|Object|False| | |
|**networkInterfaces**|Object|False| | |
|**slbs**|Object|False| | |
|**securityGroups**|Object|False| | |
|**securityGroupRules**|Object|False| | |
|**keypairs**|Object|False| | |
|**disks**|Object|False| | |
|**vpcs**|Object|False| | |
|**vserverGroups**|Object|False| | |
|**httpListeners**|Object|False| | |
|**diskAttachment**|Object|False| | |
|**netInterfaceAttachment**|Object|False| | |
|**eipAssociate**|Object|False| | |
|**rds**|Object|False| | |
|**rdsDatabase**|Object|False| | |
|**rdsAccount**|Object|False| | |
|**rdsAccountGrant**|Object|False| | |
|**bucket**|Object|False| | |
|**variables**|Object|False| | |
### DeploymentBaseInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**cloudId**|String|False| |ID of Cloud|
|**version**|String|False| |Version|
|**readOnly**|Integer|False| |Whether it is read-only  0: No 1: Yes|
|**id**|String|False| |ID|
|**name**|String|False| |Name|
|**description**|String|False| |Description|
|**userId**|String|False| |User ID|
|**createdTime**|String|False| |Creation Time|
|**updatedTime**|String|False| |Update Time|
|**lastOperation**|String|False| |Last Operation|

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
