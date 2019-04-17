# Basic Syntax Clarification of Orchestration Template

### Resources

The Resources is used to describe the dependencies between attributes and resources of each resource in the resource stack. A Resources can be referenced by other resources and Outputs.

#### Syntax

The Resources consists of resource logic IDs and resource descriptions. See the example code snippet for Resources syntactic structure below:

```
"Resources" : {
    "resource1 LogicID" : {
        "Type" : "Resource Type",
        "Condition": "The Condition for Creating This Resource or Not"，
        "Properties" : {
            Attribute Description
        }
        "DeletionPolicy":"Resource Deletion Policy",
        "DependsOn":[“Resource Dependency List"],
    },
    "resource2 LogicID" : {
        "Type" : "Resource Type",
        "Condition": "The Condition for Creating This Resource or Not"，
        "Properties" : {
            Attribute Description
        }
    }
}
```

#### Resource Logical ID

The logical ID must be alphanumeric (a-z, A-Z, and 0-9) and unique in the template. Use logical names to reference resources in other parts of the template.

#### Type

The resource type indicates the type of resource being declared. For example, JDCLOUD::VM::Instance represents the JD Cloud vm instance. For a list of all resource types supported by JDRO and details, see [Resource Type List](../resource-type.md).

#### Condition
In the template, use the Condition attribute to specify whether the resource needs to be created. The resource will be created only when the condition value specified by Condition is true.

As shown in the following code snippet, set whether to associate elastic ip for the vm instance according to the EnvType parameter value.

```
{
    "JDCLOUDTemplateFormatVersion": "2018-10-01",
    "Parameters": {
        "EnvType": {
            "Description": "Environment type.",
            "Default": "test",
            "Type": "String",
            "AllowedValues": [
                "prod",
                "test"
            ],
            "ConstraintDescription": "must specify prod or test."
        }
    },
    "Mappings": {
        "AZInfo": {
            "cn-north-1": {
                "az1": "cn-north-1a",
                "az2": "cn-north-1b"
            },
            "cn-east-1": {
                "az1": "cn-east-1a",
                "az2": "cn-east-1b"
            },
            "cn-east-2": {
                "az1": "cn-east-2a",
                "az2": "cn-east-2b"
            },
            "cn-south-1": {
                "az1": "cn-south-1a",
                "az2": "cn-south-1b"
            }
        }
    },
    "Conditions": {
        "CreateProdResources": {
            "Fn::Equals": [
                {
                    "Ref": "EnvType"
                },
                "prod"
            ]
        }
    },
    "Resources": {
        "MyInstance": {
            "Type": "JDCLOUD::VM::Instance",
            "Properties": {
                "AZ": {
                    "Fn::FindInMap": [
                        "AZInfo",
                        {
                            "Ref": "JDCLOUD::Region"
                        },
                        "az1"
                    ]
                }
            }
        },
        "MyElasticIp": {
            "Type": "JDCLOUD::VPC::ElasticIp",
            "Condition": "CreateProdResources",
            "Properties": {
                "ElasticIpSpec": {
                    "BandwidthMbps": "1",
                    "Provider": "bgp"
                }
            }
        },
        "MyAssociateElasticIp": {
            "Type": "JDCLOUD::VPC::AssociateElasticIp",
            "Condition": "CreateProdResources",
            "Properties": {
                "InstanceId": {
                    "Ref": "MyInstance"
                },
                "InstanceType": "vm",
                "ElasticIpId": {
                    "Ref": "MyElasticIp"
                }
            }
        }
    },
    "Outputs": {
        "ElasticIpAddress": {
            "Value": {
                "Fn: : GetAtt": [
                    "MyInstance",
                    "ElasticIpAddress"
                ]
            },
            "Condition": "CreateProdResources"
        }
    }
}
```


#### Attributes

Attributes are additional options that are specified for the resource. For example, each JD Cloud vm instance must be assigned with an Image ID.

```
"Resources" : {
  "MyInstance" : {
    "Type" : "JDCLOUD::VM::Instance",
    "Properties" : {
      "ImageId" : "img-wcewkxc5c1"
    }
  }
}
```
If the resource does not need to declare an attribute, the attribute part of the resource can be ignored.

The attribute value can be a text character string, a list of character strings, a boolean value, a reference parameter, or a function return value. If the attribute value is a text character string, the value will be enclosed in double quotation marks (""). If the attribute value is a list of character strings of any type, it will be enclosed in square brackets ([ ]). If the value is an intrinsic function or a reference parameter, it will be enclosed in braces ({ }). The above rules apply when you take the value by combining text, lists, reference parameters and function return values.

For example:
```
"Properties" : {
    "String" : "one-string-value",
    "Number" : 123,
    "LiteralList" : [ "first-value", "second-value" ],
    "Boolean" : true,
    "ReferenceForOneValue" :  { "Ref" : "MyLogicalResourceName" } ,
    "FunctionResultWithFunctionParams" : {
        "Fn::Join" : [ "%", [ "Key=", { "Ref" : "MyParameter" } ] ] }
}
```

#### Deletion Policy

In the template, set the DeletionPolicy attribute to declare to retain a resource when the resource stack is deleted. The optional values are Delete and Retain.

For example, set to retain vm instance when the resource stack is deleted. It can be declared according to the following code snippet:

```
"Resources" : {
  "MyInstance" : {
    "Type" : "JDCLOUD::VM::Instance",
    "Properties" : {
      "ImageId" : "img-wcewkxc5c1"
    },
    "DeletionPolicy" : "Retain"
  }
}
```

#### DependsOn

In the template, set the DependsOn attribute to specify a specific resource to be created immediately after another resource. When you add a DependsOn attribute to a resource, the resource will be created only after the resource specified in the DependsOn attribute.

As shown in the following code snippet, MyInstance will not be created until MyDBInstance is created successfully:

```
{
    "JDCLOUDTemplateFormatVersion": "2018-10-01",
    "Resources": {
        "MyDBInstance": {
            "Type": "JDCLOUD::RDS::DBInstance",
            "Properties": {
            }
        },
        "MyInstance": {
            "Type": "JDCLOUD::VM::Instance",
            "DependsOn": "MyDBInstance"
            "Properties": {
            }
        },
    }
}
```

