# Create a VPC and subnet

With this template, you can quickly create a network required to deploy the Virtual Machines, including designing and creating VPC and subnet.

The created resource stacks will output VPC ID, the subnet ID and the subnet CIDR.

----------
## Orchestration Template Specification:

The template comprises several major parts. The Format Version is the essential part. Some parts in the template can be displayed in any order. However, at the time of creating a template, the logic sequence of the following lists may be useful, because some values in a part may be cited from the last part. Each part is briefly summarized in the list.

`Format Version` (required): Template version number supported by JDRO, current version number: 2018-10-01 

` Description` (optional): A text character string describing and specifying details of a template. 

`Parameters` (optional): Parameter to be customized by the template user when defining and creating the resource stack. Transmit to the template at the time of running (creating or updating stacks). You are allowed to cite the defined parameters in the parts of Resources and Outputs in the template. The use of parameters can enhance template flexibility and improve multiplex capacity. 

`Mappings` (optional): Used for mapping key pairs of parameter values with specified conditions and the key values and searching similar contents of tables. You are allowed to match keys with corresponding values by using the intrinsic function Fn::FindInMap in the parts of Resources and Outputs. 

` Conditions` (optional): Definite conditions such as Fn::And, Fn::Or, Fn::Not and Fn::Equals are applicable for Conditions. When creating or updating resource stacks, the system will calculate all conditions in the template first and then create resources. Create all resources related to the true condition, and ignore all resources related to the false condition. 

` Resources` (optional): Used for specifying resources contained in the resource stacks which are created with the template, including dependency between resources, configuration details, etc. 

`Outputs` (optional): Used for outputting the available information such as attribute. Outputted contents can be obtained via API or the console. 


-----------
## Example Template:
```  
{
  "JDCLOUDTemplateFormatVersion": "2018-10-01",
  "Description": "JDRO VPC_SUBNET TEMPLATE",
  "Parameters": {
    "VPCName": {
      "Default": "vpc",
      "Type": "String",
      "MinLength": "1",
      "MaxLength": "32",
      "Description": "Define the VPC Name. It cannot be same as an existing VPC name, otherwise the resource will fail to be created",
      "AllowedPattern": "^[a-zA-Z_][a-zA-Z0-9_-]*$",
      "ConstraintDescription": "Name only supports numbers, capital and lowercase letters, English underline and hyphen ."
    },
    "SubnetName": {
      "Default": "subnet",
      "Type": "String",
      "MinLength": "1",
      "MaxLength": "32",
      "Description": "Define the Subnet Name. It cannot be same as an existing Subnet name, otherwise the resource will fail to be created",
      "AllowedPattern": "^[a-zA-Z_][a-zA-Z0-9_-]*$",
      "ConstraintDescription": "Name only supports numbers, capital and lowercase letters, English underline and hyphen ."
    },
    "AddressPrefix": {
      "Default": "10.0.0.0/16",
      "Type": "String",
      "Description": "Give an CIDR",
      "AllowedValues": [
        "192.168.0.0/16",
        "172.16.0.0/16",
        "10.0.0.0/16"
      ],
      "ConstraintDescription": "Need give an exact CIDR."
    }
  },
  "Mappings": {
    "AZInfo": {
      "cn-north-1": {
        "az1": "cn-north-1a",
        "az2": "cn-north-1b"
      },
      "cn-east-1": {
        "az1": "cn-east-1a"
      },
      "cn-east-2": {
        "az1": "cn-east-2a",
        "az2": "cn-east-2b"
      },
      "cn-south-1": {
        "az1": "cn-south-1a"
      }
    },
    "ImageInfo": {
      "cn-north-1": {
        "image": "img-2qz094wxaz"
      },
      "cn-east-1": {
        "image": "img-nfrxl97pal"
      },
      "cn-east-2": {
        "image": "img-ssazsh60t6"
      },
      "cn-south-1": {
        "image": "img-xkjedl0lgm"
      }
    }
  },
  "Resources": {
    "MyVPC": {
      "Type": "JDCLOUD::VPC::VPC",
      "Properties": {
        "VpcName": {
          "Ref": "VPCName"
        }
      }
    },
    "MySubnet": {
      "Type": "JDCLOUD::VPC::Subnet",
      "Properties": {
        "VpcId": {
          "Ref": "MyVPC"
        },
        "AddressPrefix": {
          "Ref": "AddressPrefix"
        },
        "SubnetName": {
          "Ref": "SubnetName"
        }
      }
    }
  },
  "Outputs": {
    "VPC_ID": {
      "Value": {
        "Ref": "MyVPC"
      }
    },
    "Subnet_ID": {
      "Value": {
        "Ref": "MySubnet"
      }
    },
    "Subnet_AddressPrefix": {
      "Value": {
        "Fn::GetAtt": [
          "MySubnet",
          "AddressPrefix"
        ]
      }
    }
  }
}
```
