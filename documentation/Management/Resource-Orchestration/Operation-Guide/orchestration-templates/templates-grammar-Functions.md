# Basic Syntax Clarification of Orchestration Template

## Functions

JDRO provides multiple built-in functions supporting your stack management. These functions can be used for Resources and Outputs in the template.

[Fn::Base64](templates-grammar-Functions#Base64)

[Fn::FindInMap](templates-grammar-Functions#FindInMap)

[Fn::GetAtt](templates-grammar-Functions#GetAtt)

[Fn::Join](templates-grammar-Functions#Join)

[Fn::Select](templates-grammar-Functions#Select)

[Fn::Split](templates-grammar-Functions#Split)

[Fn::Sub](templates-grammar-Functions#Sub)

[Ref](templates-grammar-Functions#Ref)

[Fn::And](templates-grammar-Functions#And)

[Fn::Equals](templates-grammar-Functions#Equals)

[Fn::If](templates-grammar-Functions#If)

[Fn::Not](templates-grammar-Functions#Not)

[Fn::Or](templates-grammar-Functions#Or)

---
<div id="base64"></div>
## Fn::Base64
The intrinsic function Fn::Base64 will return the Base64 encoding results of the inputted character string.

### Statement
```
{ "Fn::Base64" : valueToEncode }
```

### Parameter

**valueToEncode**: Switch to the character string of Base64.

### Return Value
Base64 is used for representing the original character string.

### Examples
```
{ "Fn::Base64" : "hello world" }
```

---

<div id="findinmap"></div>
## Fn::FindInMap
The intrinsic function Fn::FindInMap will return the value corresponding to the key in the two-layer mapping of Mappings statement.

### Statement
```
{ "Fn::FindInMap" : [ "MapName", "TopLevelKey", "SecondLevelKey"] }
```

### Parameter

**MapName**: The logic name declared to be mapped in the Mappings part, including key pair and value.

**TopLevelKey**: Name of top-level key pair. Its value is a Key-Value pair list.

**SecondLevelKey**: The name of a second-level key pair, being set to be a key pair assigned to the TopLevelKey list.

### Return Value
It is the value assigned to SecondLevelKey.

### Examples
```
{
  ...
  "Mappings" : {
    "RegionMap" : {
      "cn-north-1" : { "32" : "img-wcewkxc5c1", "64" : "img-wcewkxc5c2" },
      "cn-west-1" : { "32" : "img-wcewkxc5c1", "64" : "img-wcewkxc5c2" },
      "cn-west-2" : { "32" : "img-wcewkxc5c1", "64" : "img-wcewkxc5c2" },
      "cn-south-1" : { "32" : "img-wcewkxc5c1", "64" : "img-wcewkxc5c2" }
    }
  },

  "Resources" : {
     "MyInstance" : {
        "Type" : "JDCLOUD::VM::Instance",
        "Properties" : {
           "ImageId" : { "Fn::FindInMap" : [ "RegionMap", { "Ref" : "JDCLOUD::Region" }, "32"]},
           "InstanceType" : "g.n2.medium"
        }
     }
 }
}
```

---

<div id="getatt"></div>
## Fn::GetAtt
The intrinsic function Fn::GetAtt will return the attribute value of a resource in the template.

### Statement
```
{ "Fn::GetAtt" : [ "logicalNameOfResource", "attributeName" ] }
```

### Parameter
**logicalNameOfResource**: Logic ID of a resource.

**attributeName**: Specific attribute name of a resource whose value is desired. For details of available attributes of the resource type, please refer to the referring page of the resource.

### Return Value
Attribute Value.

## Examples
```
{
    "Fn::GetAtt" : [ "MyInstance" , "PrivateIpAddress" ]
}
```

---

<div id="join"></div>
## Fn::Join
The intrinsic function Fn::Join is able to connect a group of values which are separated with a specific delimiter.

### Statement
```
{ "Fn::Join" : [ "delimiter", [ "string1", "string2", ... ]] }
```

### Parameter
**delimiter**: Delimiter. All values can be directly connected by setting the delimiter to be null.

**[ "string1", "string2", ... ]**: Example of list of connected values.

### Return Value
Connected character strings.

### Examples
```
{
    "Fn::Join" : [ ",", [ "a", "b", "c" ] ]
}
```
Return: "a,b,c".

---

<div id="select"></div>
## Fn::Select
The intrinsic function Fn::Select will return a single data element in the data element list via the index.

### Statement
```
{"Fn::Select" : [ "index", [ "value1", "value2", ... ] ]}
```

### Parameter
index: Index of data element to be retrieved. A value between 0 to N-1 (N refers to the number of elements in the array)

### Return Value
Selected data element.

### Examples
```
{ "Fn::Select" : [ "1", [ "apples", "grapes", "oranges", "mangoes" ] ] }
```
Return: "grapes".

---

<div id="split"></div>
## Fn::Split
The intrinsic function Fn::Split will slice the character strings via a specified delimiter, and return list composed of all slices.

### Statement
```
{"Fn::Split" : [ "delim",  "original_string" ]}
```

### Parameter
**delim**: Delimiter, such as ‘,’, ’;’, ’\n’, and ’\t’.

**original_string**: Character string to be sliced.

### Return Value
Return the list composed of all character strings sliced.


### Examples
```
{"Fn::Split": [";", "foo; bar; achoo"]}
```
Return: ["foo", " bar", "achoo "].

---

<div id="sub"></div>
## Fn::Sub
The intrinsic function Fn::Sub will substitute the variable of the entered character string with an assigned value.

### Statement
```
{ "Fn::Sub" : [ "", { Var1Name: Var1Value, Var2Name: Var2Value } ] }
```

### Parameter

**String**: A character string with variables to be substituted with relevant values in the running process. Compile variables in form of ${MyVarName}. The variables may be variables of the template parameter name, the resource logic ID, the attribute or the Key-Value mapping. If you only specify the template parameter name, the resource logic ID and the properties, then do not specify the Key-Value mapping.

If you specify the template parameter name or the resource logic ID (such as ${InstanceTypeParameter}), then the value returned is the same as the value returned when you use the Ref intrinsic function. If you specify the attribute (such as ${MyInstance.PublicIp), then the value returned is the same as the value returned when you use the Fn::GetAtt intrinsic function.


**VarName**: Name of the variables contained in the String parameter.

**VarValue**: The value to replace the associated variable name with when running.


### Return Value
Return the original character string and replace the values of all variables.

### Examples

### Fn With Mapping::Sub
```
{ "Fn::Sub": [ "www.${Domain}", { "Domain": {"Ref" : "RootDomainName" }} ]}
```

### Fn Without Mapping::Sub

```
{ "Fn::Sub": "${JDCLOUD::Region}:${JDCLOUD::StackName}:vpc/${vpc}" }
```

---

<div id="ref"></div>
## Ref
The intrinsic function Ref returns the value of the specified parameter or resource.

If the specified parameter is a resource logical ID, then return the value of the resource. Otherwise the system will consider the specified parameter as a parameter and will attempt to return the value of the parameter.

### Statement
```
{
    "Ref" : "LogicalID"
}
```

### Parameter
**LogicalID**: The logical ID of the resource or parameter to be referenced.

### Return Value
Resource value or parameter value.

* It returns the parameter value when you specify the logical name of the parameter.

* When you specify the logical name of the resource, it returns a value that you typically use to reference the resource, such as the physical ID.

### Examples
```
{
        "JDCLOUDTemplateFormatVersion": "2018-10-01",
        "Parameters": {
            "AddressPrefix": {
                "ConstraintDescription": "Need give an exact CIDR.",
                "Default": "10.0.0.0/16",
                "Description": "Need give an exact CIDR",
                "Type": "String"
            },
            "SubnetName": {
                "ConstraintDescription": "No overwritten Info.",
                "Default": "MySubnet",
                "Description": "My Subnet Name",
                "MaxLength": "32",
                "MinLength": "1",
                "Type": "String"
            },
            "VPCName": {
                "ConstraintDescription": "No overwritten Info.",
                "Default": "MyVPC",
                "Description": "My VPC Name",
                "MaxLength": "32",
                "MinLength": "1",
                "Type": "String"
            }
        },
        "Resources": {
            "MySubnet": {
                "Properties": {
                    "AddressPrefix": {
                        "Ref": "AddressPrefix"
                    },
                    "SubnetName": {
                        "Ref": "SubnetName"
                    },
                    "VpcId": {
                        "Ref": "MyVPC"
                    }
                },
                "Type": "JDCLOUD::VPC::Subnet"
            },
            "MyVPC": {
                "Properties": {
                    "VpcName": {
                        "Ref": "VPCName"
                    }
                },
                "Type": "JDCLOUD::VPC::VPC"
            }
        }
    }
```

---

<div id="and"></div>
## Fn::And
It represents the AND operational character and contains at least two conditions. If all specified conditions are computed as true, then return true; if any condition is computed as false, then return false.

### Statement
```
{"Fn::And": ["condition", {...}]}
```

### Parameter

**condition**: A condition computed as true or false.

### Return Value
true or false.

### Examples
```
{
  "JDCLOUDTemplateFormatVersion" : "2018-10-01",
  "Parameters":{
    "EnvType":{
      "Default":"pre",
      "Type":"String"
    }
  },
  "Conditions": {
    "TestEqualsCond": {"Fn::Equals": ["prod", {"Ref": "EnvType"}]},
    "TestAndCond": {"Fn::And": ["TestEqualsCond", {"Fn::Equals": ["pre", {"Ref": "EnvType"}]}]}
  }
}
```


---


<div id="equals"></div>
## Fn::Equals
Compare if the two values are equal. If the two values are equal, then return true; if not, then return false.

### Statement
```
{"Fn::Equals": ["value_1", "value_2"]}
```

### Parameter
**value**: Values of any type to be compared.

### Return Value
true or false.

### Examples
```
{
  "JDCLOUDTemplateFormatVersion" : "2018-10-01",
  "Parameters":{
    "EnvType":{
      "Default":"pre",
      "Type":"String"
    }
  },
  "Conditions": {
    "TestEqualsCond": {"Fn::Equals": ["prod", {"Ref": "EnvType"}]}
  }
}
```


---

<div id="if"></div>
## Fn::If
If the specified condition is computed as true, then return one value; if the specified condition is computed as false, then return the other value. The Fn::If intrinsic function is supported in the template Resources and Outputs attribute value.


### Statement
```
{"Fn::If": ["condition_name", "value_if_true", "value_if_false"]}
```

### Parameter

**condition_name**: The corresponding condition name in the Conditions. Reference conditions by the condition names.

**value_if_true**: When the specified condition is computed as true, return this value.

**value_if_false**: When the specified condition is computed as false, return this value.

### Return Value

### Examples
```
{
    "JDCLOUDTemplateFormatVersion": "2018-10-01",
    "Parameters":{
        "EnvType":{
          "Default":"pre",
          "Type":"String"
        }
      },
    "Conditions": {
        "IsPre": {"Fn::Equals": ["pre", {"Ref": "EnvType"}]}
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
                },
                "ImageId":{
                    "Fn::If":[
                        "IsPre",
                        "PreImageID",
                        "notPreImageID"
                    ]
                }
            }
        }
    }
}
```

<div id="not"></div>
## Fn::Not
It represents the NOT operational character. For the conditions computed as false, return true; for the conditions computed as true, return false.

### Statement
```
{"Fn::Not": "condition"}
```

### Parameter
**condition**: A condition computed as true or false.

### Return Value
true or false.

### Examples
```
{
  "JDCLOUDTemplateFormatVersion" : "2018-10-01",
  "Parameters":{
    "EnvType":{
      "Default":"pre",
      "Type":"String"
    }
  },
  "Conditions": {
    "TestNotCond": {"Fn::Not": {"Fn::Equals": ["pre", {"Ref": "EnvType"}]}}
  }
}
```

---

<div id="or"></div>
## Fn::Or
It represents the OR operational character and contains at least two conditions. If any specified condition is computed as true, then return true; if all conditions are computed as false, then return false.

### Statement
```
{"Fn::Or": ["condition", {...}]}
```

### Parameter
**condition**: A condition computed as true or false.


### Return Value
true or false.

### Examples
```
{
  "JDCLOUDTemplateFormatVersion" : "2018-10-01",
  "Parameters":{
    "EnvType":{
      "Default":"pre",
      "Type":"String"
    }
  },
  "Conditions": {
    "TestEqualsCond": {"Fn::Equals": ["prod", {"Ref": "EnvType"}]},
    "TestOrCond": {"Fn::And": ["TestEqualsCond", {"Fn::Equals": ["pre", {"Ref": "EnvType"}]}]}
  }
}
```


---



