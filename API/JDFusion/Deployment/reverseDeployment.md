# reverseDeployment


## Description
Reversely generate deployment according to the existing resources

## Request Method
POST

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/deployments:reverse

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**reverse**|ReverseDeploymentInfo|True| |Reversely generate deployment according to the existing resources|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|

### ReverseDeploymentInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| |Template Name|
|**description**|String|False| |Description|
|**version**|String|False| |Version|
|**readOnly**|Integer|False| |Whether it is read-only  0: No 1: Yes|
|**resources**|ReverseDeploymentResourcesInfo|False| | |
### ReverseDeploymentResourcesInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**vmIds**|Object|False| | |
|**eipIds**|Object|False| | |
|**subnetIds**|Object|False| | |
|**networkInterfaceIds**|Object|False| | |
|**slbIds**|Object|False| | |
|**securityGroupIds**|Object|False| | |
|**keypairIds**|Object|False| | |
|**diskIds**|Object|False| | |
|**vpcIds**|Object|False| | |
|**vserverGroupIds**|Object|False| | |
|**httpListenerIds**|Object|False| | |
|**diskAttachmentIds**|Object|False| | |
|**netInterfaceAttachmentIds**|Object|False| | |
|**eipAssociateIds**|Object|False| | |

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
