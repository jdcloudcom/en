# editDeployment


## Description
Modify deployment information

## Request Method
PUT

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/deployments/{id}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|True| |Deployment ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**deployment**|DeploymentInfo|True| |Modify deployment|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|

### DeploymentInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**content**|DeploymentResourcesInfo|False| | |
|**info**|DeploymentBaseInfo|False| | |
### DeploymentResourcesInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**diskAttachment**|Object|False| | |
|**disks**|Object|False| | |
|**eipAssociate**|Object|False| | |
|**eips**|Object|False| | |
|**httpListeners**|Object|False| | |
|**keypairs**|Object|False| | |
|**netInterfaceAttachment**|Object|False| | |
|**networkInterfaces**|Object|False| | |
|**securityGroups**|Object|False| | |
|**slbs**|Object|False| | |
|**subnets**|Object|False| | |
|**variables**|Object|False| | |
|**vms**|Object|False| | |
|**vpcs**|Object|False| | |
|**vserverGroups**|Object|False| | |
### DeploymentBaseInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**cloudId**|String|False| |ID of Cloud|
|**createdTime**|String|False| |Creation Time|
|**description**|String|False| |Description|
|**id**|String|False| |ID|
|**name**|String|False| |Name|
|**readOnly**|Integer|False| |Whether it is read-only  0: No 1: Yes|
|**updatedTime**|String|False| |Update Time|
|**userId**|String|False| |User ID|
|**version**|String|False| |Version|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**deployment**|DeploymentInfo| |
### DeploymentInfo
|Name|Type|Description|
|---|---|---|
|**content**|DeploymentResourcesInfo| |
|**info**|DeploymentBaseInfo| |
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
### DeploymentBaseInfo
|Name|Type|Description|
|---|---|---|
|**cloudId**|String|ID of Cloud|
|**createdTime**|String|Creation Time|
|**description**|String|Description|
|**id**|String|ID|
|**name**|String|Name|
|**readOnly**|Integer|Whether it is read-only  0: No 1: Yes|
|**updatedTime**|String|Update Time|
|**userId**|String|User ID|
|**version**|String|Version|

## Return Code
|Return Code|Description|
|---|---|
|**202**|ACCEPTED|
|**404**|not found|
