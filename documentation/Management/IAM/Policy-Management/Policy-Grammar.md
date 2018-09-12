The authorization policy is a JSON document that defines one or more permissions. This document describes the basic elements, syntactic structures, and examples of the IAM Policy.

# Basic elements of Policy
IAM Policy contains the following basic elements: content (policy content), permission (permitted operation type), resource (resource available for actions), ids (IDs of specified resources), type (type of specified resources), and version (policy version)

 - content

The content of the Policy contains one or more sets of authorization details. Each set of authorization details specifies authorized resources and actions (permission).

 - permission

Support 3 types of resource actions, namely reading (R refers to Read), modification (M refers to Modify), and deletion (D refers to Delete). For example, viewing the virtual machine details is a read action, and backing up or rebooting the virtual machine is a modify action, and deleting the image is a delete operation.
When multiple action types need to be authorized, they may be separated by a vertical line "|”. For example, when only read-only actions are authorized, the permission is "R"; when the administrator permissions are authorized, the permission is "R|M|D”.
Note: If a subaccount is authorized with modify permission (M) and delete permission (D), the subaccount also has read permission (R) by default.

 - resource

Authorized resources are specified by the resource type (type) and resource ID (ids).

 - type

Specify the type of the resource to be authorized. Schedule-1 lists the type values for all resources currently supported by IAM.

|Resource type|type value|
|---|:--:|
Virtual machine|server
|image
Cloud disk|volume
Public network IP|floatingIP
Load balancer|
Cloud database (MySql)|database
Cloud cache|cache
VPC|vpc
Subnet|vpc
Security group|vpc
Route table|vpc
Network ACL|vpc
Basic Anti-DDoS|baseanti
Application security gateway|sgw
Endpoint security|hips
Situation awareness|ids

 - ids

Specify one or more authorized resources IDs。ids support wildcard *, which are used for authorized objects as a type of resource rather than a scenario that specifies a resource ID.

 - version

The version of the Policy currently only allows a value of 2.

# Policy’s syntactic structure
Policy’s syntactic structure is shown below.

![Syntactic Structure](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Strategy%20Management/policy%E8%AF%AD%E6%B3%95%E7%BB%93%E6%9E%84.png)

The syntax of the Policy shall conform to the JSON format. If the authorization policy you create does not conform to the JSON syntax, it will not be saved successfully. Many online JSON format checking tools can be used to check the format error of a policy.

# Policy’s syntax description:

	<policy> =
		{
		          <content>,
		          <version>
		}
		
		The description of Content can contain one or more sets of Permission and Resource pairs:
		
		<content> = 
		"content":[
		          {
		                    <permission>,
		                    <resource>
		          },
		          {
		                    <permission>,
		                    <resource>
		          }
		]
		
		Permission is (taking administrator permissions as an example):
		
		<permission> = 
		"permission" : "R|M|D"
		
		The type and IDs of the resource need to be specified in Resource:
		
		<resource> =
		"resource":[
		          {
		                    <ids>,
		                    <type>
		          }
		]
		
		IDs specify one or more resources (taking the specifying of the resource ID as an example):
		
		<ids> = 
		"ids":[
		          "resource-id1",
		          "resource-id2"
		]
		
		Type specifies the type of the resource (refer to Schedule-1 for "resource-type"):
		
		<type>  = 
		"type":"resource-type"
		
		The fixed value of the Version element in Policy is 2:
		
		<version> = 
		"version":"2"


# Policy example
The following policy describes the following authorization scenarios:

Read and modify permissions of a specified VPC

Administrator permissions for three MySql cloud database instances

Read-only permission of two virtual machine instances

Administrator permissions of all image resources:

		{
		          "content":[{
		                    "permission":"M",
		                    "resource":[{
		                              "ids":["vpc-3dodmrqvz0"],
		                              "type":"vpc"
		                    }]
		          },
		          {
		                    "permission":"M|D",
		                    "resource":[{
		                              "ids":["mysql-hgrgehgage",
		                                       "mysql-grigg0k7w8",
		                                       "mysql-x53es4bxer"],
		                              "type":"database"
		                    }]
		          }, 
		          {
		                    "permission":"R",
		                    "resource":[{
		                              "ids":["i-p26ionqsok",
		                                       "i-37dotxi75d"],
		                              "type":"server"
		                    }]
		          },
		          {
		                    "permission":"M|D",
		                    "resource":[{
		                              "ids":["*"],
		                              "type":"image"
		                    }]
		          }],
		          "version":"2"
		}
