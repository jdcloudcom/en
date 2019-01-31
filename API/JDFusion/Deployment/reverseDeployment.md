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
|**description**|String|False| |Description|
|**name**|String|False| |Template Name|
|**readOnly**|Integer|False| |Whether it is read-only  0: No 1: Yes|
|**resources**|ReverseDeploymentResourcesInfo|False| | |
|**version**|String|False| |Version|
### ReverseDeploymentResourcesInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**diskAttachmentIds**|Object|False| | |
|**diskIds**|Object|False| | |
|**eipAssociateIds**|Object|False| | |
|**eipIds**|Object|False| | |
|**httpListenerIds**|Object|False| | |
|**keypairIds**|Object|False| | |
|**netInterfaceAttachmentIds**|Object|False| | |
|**networkInterfaceIds**|Object|False| | |
|**securityGroupIds**|Object|False| | |
|**slbIds**|Object|False| | |
|**subnetIds**|Object|False| | |
|**vmIds**|Object|False| | |
|**vpcIds**|Object|False| | |
|**vserverGroupIds**|Object|False| | |

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
|**201**|CREATED|
