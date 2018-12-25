# Basic Syntax Clarification of Orchestration Template

## Parameters
When creating templates, the use of parameters can enhance template flexibility and improve multiplex capacity. When you create a resource stack, you can replace some of the parameter values in the template according to the actual situation.

### Define Parameters in the Template

The following example declares a parameter named InstanceTypeParameter. With this parameter, you can specify an Instance Type Family for the resource stack to use when creating or updating the resource stack.

Please note that the InstanceTypeParameter has a default value of g.n2.medium in this example.


```
"Parameters" : {
  "InstanceTypeParameter" : {
    "Type" : "String",
    "Default" : "g.n2.medium",
    "AllowedValues" : ["g.n2.medium", "g.n2.large", "g.n2.xlarge"],
    "Description" : "Select Instance Type Family, the default is g.n2.medium, the optional values are g.n2.medium, g.n2.large, and g.n2.xlarge"
  }
}
```


### Reference Parameters in the Template

You use the Ref intrinsic function to reference a parameter and use the value of that parameter to preset the resource stack. You reference the parameter in the template Resources and Outputs parts.

In the following example, the InstanceType attribute of the vm instance resource references the InstanceTypeParameter parameter value:

```
"MyInstance" : {
  "Type" : "JDCLOUD::VM::Instance",
  "Properties" : {
    "InstanceType" : { "Ref" : "InstanceTypeParameter" },
    "ImageId" : "img-wcewkxc5c1"
  }
}
```

## General Requirements for Parameters

There are the following requirements when using parameters:

* One JDRO template can contain up to 60 parameters.

* Each parameter must be given a logical name (also known as a logical ID) that must be alphanumeric and must be unique among all logical names within the template.

* Each parameter must be assigned a JDRO supported parameter type. See Type for more information.

* Each parameter must be assigned a value, or the default value shall be defined.

### Syntax

Each parameter consists of the parameter name and parameter attribute.

The parameter name must be alphanumeric and cannot be the same as other parameter name in the same template.

Parameter Attribute List:

|Attribute|Compulsory|Description|
|:--|:--|:--|
|Type|Yes|Parameter Data Type. <br>JDRO currently supports the following parameter types: <br><br>**1）String**<br>character string. Such as: "g.n2.medium”. <br><br>**2）Number**<br>Integer or floating-point number. Such as: 3.14。<br><br>**3）CommaDelimitedList**<br>A set of comma-separated character strings or numbers, whose values can be indexed by the Fn::Select function. Such as: "80, foo, bar"。 <br><br>**4）List\<Number\>**<br>A set of comma-separated integers or floating-point numbers. JDRO verifies the parameter value as numbers; but when you use it elsewhere in the template (for example, by using the Ref intrinsic function), the parameter value will become a list of character strings. For example, the user can specify "80,20" and Ref will generate ["80","20"]. <br><br>**5）Boolean**<br>A boolean value. Such as: true or false. <br><br>**6) JDRO specific parameter type **<br>Special values for JDRO, such as vm image. For more information, see [JDRO Specific Parameter Type](../resource-type.md).|
|Default|No|When creating a resource stack, if the user does not pass in the specified value, the Resource Orchestration Service will check if there is a defined default value in the template. If there is a defined default value, then use the default value, otherwise an error will be reported.|
|NoEcho|No|When calling the query resource stack, whether to output the parameter value. If the value is set as true, then only output the asterisk (******).|
|AllowedValues|No|Include a list of allowed values for the parameter.|
|AllowedPattern|No|A regular expression that checks if the parameters of the character string type entered by the user match. If the user does not enter a character string type, then an error will be reported.|
|MinLength|No|An integer value, the minimum number of characters allowed to be used by the String type.|
|MaxLength|No|An integer value, the maximum number of characters allowed to be used by the String type.|
|MinValue|No|An integer value, the smallest numeric value allowed to be used by the Number type|
|MaxValue|No|An integer value, the greatest numeric value allowed to be used by the Number type|
|Description|No|The character string describing the parameters.|
|ConstraintDescription|No|Describe the character string of the constraint condition when the constraint condition of the parameter is violated.|

#### JDRO Specific Parameter Type
For the convenience of the users, some specific parameter types are defined. If the users set these parameter types in the template, then when creating the resource stack, for the values corresponding to the parameters of the type, use a drop-down list to enclose the resources under the user corresponding regions. The specific parameter types supported are as follows:

| Type                              | Description                                                                                        |
| --------------------------------- | ------------------------------------------------------------------------------------------- |
| JDClOUD:::AvailabilityZone::Name  | List the Availability Zones under the current region                                                                      |
| JDClOUD::VM::PublicImage::Name    | List the available public images under the current region                                                                |
| JDClOUD:::VM::PrivateImage:::Name | List the available private images under the current region                                                                |
| JDClOUD:::VM::SharedImage:::Name  | List the available shared images under the current region                                                                |
| JDClOUD:::VM::Instance::Id        | List the virtual machines under the current region. The format shown in the drop-down list is “Name (ID)”, for example: VM_test(i-nwyuh3eben)        |
| JDClOUD:::VM::Disk::Id            | List the cloud disks under the current region. The format shown in the drop-down list is “Name (ID)”, for example: disk_test(vol-8i4mv87d48)    |
| JDClOUD:::VM::KeyPair::KeyName    | List the key pair names under the current region                                                                    |
| JDClOUD::SecurityGroup::GroupName | List the Security Group names under the current region                                                                  |
| JDClOUD::VPC::VPC::Id             | List the subnets under the current region. The format shown in the drop-down list is “Name (ID)”, for example: Subnet_test(subnet-d6x9i2t4i1) |


