# Action Description Method

The action is composed of the service name and specific action name. For the service name of each product line, please refer to [Service Supporting IAM](https://docs.jdcloud.com/en/iam/support-services)

```
All Actions of All Products
"action":"*"
"action":"*:*"

// All Actions of IAM Products
"action":"iam:*"

// Actions of IAM Products in the Name of createSubuser
"action":"iam:createSubuser"

// Actions of IAM Products with Read-only Permission
"action":"iam:describe*"

// IAM Products with Action List of createSubuser, createGroup and createRole
"action":["iam:createSubuser","cos:createGroup","cos: createGroup"]
```
