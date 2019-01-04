# Policy Element

IAM is the policy of the latest version, defining JSON documents of one or more permissions and required to follow the JSON syntax specification.

Policy is composed of the following policy elements:

- Version
- Effect
- Action
- Resource
- Principal
- Condition

## Version

It is the required field, describing the policy syntax version. The value of the version v3 is "3".

## Principal

It is the optional field, referring to the entity users or services that can play roles in the JD Cloud.

## Statement

It is a required field, describing Json information of one or more permissions. The element comprises permission or permission sets of several other elements such as action, resource, condition and effect. One policy has only one statement element.

### Effect

It is the required field, comprising two conditions, i.e. allow and deny.

> The functions of Deny is continuously under update, coming soon

### Action

It is the required field. In order to unify the access of JD Cloud Console and SDK, we have detailed each action on the console at Open API level, and the action is divided into two major types:

- Operations that cannot designate resources: such as IAM sub-user list (iam:descirbeSubusers), group list (iam:describeGroups), sub-user creation (iam:createSubuser) and other interfaces, which these interfaces are not allowed to conduct operations of designating resources by definition. When you create customized policies in IAM, these interfaces do not support operations for designated resources. In general, list interface, creation interface and report interface all do not support action of authorization to designated resources.
- Operations that can designate resources: such as IAM sub-user description (iam:describeSubuser), IAM sub-user editing (iam:modifySubuser) and other interfaces, and these interfaces support operations to designated resources by definition. When you create customized policies in IAM, these interfaces allow you to conduct authorization and operation to designated resources. In general, interfaces such as detail, edit, delete, disassociate and associate all support action and authorization for designated resources.

### Resource

It is the required field. The JD Cloud Resource Name (JRN) is used for unique identification of a JD Cloud resource, with which we can definitely designate a resource in the global environment of JDCLOUD.

### Condition

It is the optional field, describing restrictions for effectiveness of policies. The conditions consist of condition operational character, condition key and condition value.

> The functions of Condition is continuously under update, coming soon

## Policy Sample

The sample is described as follows: It is allowed that the sub-account under the primary account 876393467912 can view and create sub-users and groups of IAM when the secondary IP address is "203.0.113.0/24",

```
{
      "Version": "3",
      "Statement":
        [
        {
          "Effect": "Allow",
          "Action": ["iam:describe*","iam:create*"],
          "Resource": ["jrn:iam:*:*:subuser/*","jrn:iam:*:*:group/*"],
          "Condition":
             {
                "IpAddress":
                 {
                 "Jdcloud:SourceIp":"203.0.113.0/24"
                  }
              }
         }]
}
```
