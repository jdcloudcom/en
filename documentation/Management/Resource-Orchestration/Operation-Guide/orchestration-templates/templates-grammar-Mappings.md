# Basic Syntax Clarification of Orchestration Template
## Mappings

Mappings is a Key-Value mapping table. In the template Resources and Outputs, you can use the Fn::FindInMap intrinsic function to get the Value of the mapping table by specifying Key.

### Syntax

Mapping consists of Key-Value pairs. Wherein the Key and Value can be either the character string type or the numeric type. If you declare multiple mappings, separate them with commas. Names of mappings can’t be the same

```
{
    "Mappings" : {
        "Mapping01" : {
            "Key01" : {
                "Name" : "Value01",
                "Name" : "Value01-1"
            },
            "Key02" : {
                "Name" : "Value02",
                "Name" : "Value02-1"
            },
            "Key03" : {
                "Name" : "Value03",
                "Name" : "Value03-1"
            }
    }
}

```

### Examples

```
{
    "JDCLOUDTemplateFormatVersion": "2018-10-01",
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
    "Resources": {
        "MyInstance": {
            "Type": "JDCLOUD::VM::Instance",
            "Properties": {
                "AZ": { "Fn::FindInMap": [ "AZInfo", { "Ref": "JDCLOUD::Region" }, "az1"]},
            }
        }
    }
}

```

