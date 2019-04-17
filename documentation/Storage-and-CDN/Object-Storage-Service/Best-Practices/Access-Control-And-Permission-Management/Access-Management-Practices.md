# Access Management Practices
### Access Management Overview

Identity and Access Management (IAM) is a user identity management and resource access control service provided by JD Cloud.
IAM Policy is a user-based authorization policy. By setting IAM Policy, you can centrally manage your users (such as employees, systems, or applications),
and control the permission of users on which resources users can access under your name. For example, you can restrict your users to having read permission to only one Bucket.
The sub-account is subordinate to the primary account, and these accounts cannot have any actual resources. All resources belong to the primary account.

### Access Management Function

- Primary Account Resource Authorization
You can authorize the primary account resources to any other person, including a sub-account or another primary account, without sharing identity credential (AK/SK) related to the primary account.
- Primary Account Security
You can grant the same system administrator permission (JDCloudOSSAdmin) to OSS as the primary account to guarantee the security of the primary account.
- Refined Permission Management
You can grant different access permissions to different personnel for different resources. For example, you can permit some sub-accounts to have the read permission for an OSS bucket while other sub-accounts or other JD Cloud primary accounts
can have the write permission for an object in an OSS bucket, etc.

### Access Management Application Scenarios

#### Enterprise Sub-account Permission Management

Employees at different posts in an enterprise need to have the minimum access permission of the cloud resources of the enterprise.

Scenario: An enterprise has a lot of JD Cloud resources, including VPC instances, CDN instances, OSS bucket, objects, etc. The enterprise has a lot of employees at the same time, including development personnel, test personnel, operation and maintenance personnel, etc.
Some development personnel need the read and write permissions on the cloud resources of the developed machine related to their projects. Test personnel need the read and write permissions on the cloud resources of the test machine of their projects. The operation and maintenance personnel are responsible for the purchase and daily operation of machines.
In case of any change to the employees, responsibilities or projects of the enterprise, the corresponding permissions shall be modified and the minimum permission management shall be carried out.

####  Permission Management between Different Enterprises

Different enterprises need the sharing of cloud resources due to business cooperation.

Scenario: An enterprise needs to share its cloud resources with other enterprises due to business cooperation, or an enterprise with a lot of cloud resources hopes to be dedicated to product research and development, and intends to authorize the operation and maintenance of cloud resources to another operation
enterprise. Upon the termination of the cooperation, the enterprise will recover the corresponding management permission.


Access Management Policy Syntax
The policy comprises several elements, and is used to describe the specific authorization information. Core elements are principal, action, resource,
condition and effect. To know more, please view [IAM Policy-based Permission Control](../../Operation-Guide/Access-Control/Access-Control-Base-On-IAM-Policy.md).

IAM Policy Example

The example description is as follows: The sub-account user1 under the primary account ID 1234567890098 is allowed to have the permission for the read and write object prefixed with test/object under OSS bucketA and bucketB, and the JCQ administrator permission.
```
{
	"Statement": [{
		"Action": [
			"oss:PutObject",
			"oss:GetObject"
		],
		"Effect": "Allow",
		"Resource": [
			"jrn:oss:::bucketA/test/*",
			"jrn:oss:::bucketB/test/*"
		]
	}, {
		"Action": [
			"jcq:*"
		],
		"Effect": "Allow",
		"Resource": [
			"*"
		]
	}],
	"Version": "3"
}
```






