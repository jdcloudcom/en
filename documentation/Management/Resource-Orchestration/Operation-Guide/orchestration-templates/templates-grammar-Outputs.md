# Basic Syntax Clarification of Orchestration Template

## Outputs

In Outputs, define the value that is returned when calling to query resource stack interface. For example, define the output of the vm instance privateIpAddress, and then view the private IP address of the instance when calling to query resource stack interface.

### Syntax

The Outputs part contains the key name Outputs followed by a space and a colon. You can declare up to 60 outputs in one template. For example:

```
"Outputs" : {
  "output1 LogicID" : {
    "Description" : "Output Description",
    "Condition": "The Condition for Outputting the Attribute or Not",
    "Value" : "Output Value Expression"
  },
  "output2 LogicID" : {
    "Description" : "Output Description",
    "Condition": "The Condition for Outputting the Attribute or Not",
    "Value" : "Output Value Expression"
  }
}
```

### Output Logic ID
Current Output Identifier. The logical ID must be alphanumeric (a-z, A-Z, and 0-9) and unique in the template.

### Description (Optional)
String type used to describe the output value.

### Value (Compulsory)
The attribute value returned when calling to query resource stack interface. Output values can include literal values, parameter references, pseudo parameters, mapping values, or intrinsic functions.

### Condition (Optional)
Use the Condition attribute to specify whether the information about a resource and an output resource needs to be created. This resource and output resource information will be created only when the condition value specified by Condition is true.

For example:
```
{
    "Outputs": {
        "ElasticIpAddress": {
            "Value": "ElasticIpAddress value",
            "Condition": "CreateProdResources"
        }
    }
}
```


