# Action Description Method

The action is composed of the service name and specific action name. The action name is the API name of Open API of each product line. For the service name of each product line, please refer to [Service Supporting IAM](https://docs.jdcloud.com/en/iam/support-services)

```
All actions of all products are specified by wildcard
"action":"*"
"action":"*:*"

// All actions of IAM products are specified by service name + wildcard
"action":"iam:*"

// For action createSubuser of IAM product, it is specified as a single action
"action":"iam:createSubuser"

// Actions of IAM products with read-only permission is specified through prefix as wildcard
"action":"iam:describe*"

// For IAM Products with Action List of createSubuser, createGroup and createRole, multiple actions are specified simultaneously
"action":["iam:createSubuser","cos:createGroup","cos: createGroup"]
```
