# Basic Syntax Clarification of Orchestration Template
## Conditions

Calculate according to the entered parameter values specified at the time of creating or updating resource stacks. In each condition, other conditions, parameter values and mappings are cited.

Conditions can be used when you need to use the template used for creating resources again in different environments (such as test environment and production environment). In the template, you can add EnvironmentType to enter parameter and prod or test is accepted as its input. For the production environment, you are allowed to contain the VM Instances with specific functions. However, for the test environment, you need to use lesser functions to save funds. For use conditions, you may define which resources shall be created for each environment type and how to configure them.

### Syntax

Each condition consists of a condition name and the condition itself. The condition name refers to the character string type. The conditions are defined by Fn::And, Fn::Or, Fn::Not or Fn::Equals. Other conditions can be quoted in this condition, with two conditions separated by a comma. The conditions are not allowed to use the same name.

```
"Conditions" : {
  "Logical ID" : {Intrinsic function}
}

```

### Examples

The following examples indicate how to associate Conditions and Resources. In this example, the setting will determine whether to associate elastic ip for the vm instance according to the EnvType parameter value.

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
