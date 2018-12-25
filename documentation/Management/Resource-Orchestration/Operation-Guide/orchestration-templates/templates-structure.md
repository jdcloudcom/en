# Orchestration Template

## Structure Specification of Orchestration Template

　　The template is a text file in JSON format, encoded in UTF8. The template is used to create resource stacks and is the blueprint describing the infrastructure and architecture. The template editor defines the resources and configuration details in the template and describes the dependencies between the resources.

### JSON
The following example shows a template fragment in JSON format.

```
{
  "JDCLOUDTemplateFormatVersion" : "2018-10-01",

  "Description" : "Template description information can be used to describe the template applicable scenarios, architecture description, etc.",

  "Parameters" : {
      // Parameter to be customized by the user when defining and creating the resource stack.
  },

  "Mappings" : {
      // Define mapping information table; mapping information is a multilevel Map structure.
  },

  "Conditions" : {
      // Define the condition using an intrinsic conditional function. These conditions determine when to create the associated resources.
  },

  "Resources" : {
      // Detailed definition of required resources, including dependencies between resources, configuration details, etc.
  },

  "Outputs" : {
      // Used to output useful information such as some attributes. Outputted contents can be obtained via API or the console.
  }
}
```

### Template Part
　　The template comprises several major parts. The Format Version is the essential part. Some parts in the template can be displayed in any order. However, at the time of creating a template, the logic sequence of the following lists may be useful, because some values in a part may be cited from the last part. Each part is briefly summarized in the list.

#### Format Version (Optional)
　　Template version number supported by Resource Orchestration, current version number: 2018-10-01

#### Description (Optional)
　　A text character string describing and specifying details of a template.

#### Parameters (Optional)
　　Parameter to be customized by the template user when defining and creating the resource stack. Transmit to the template at the time of running (creating or updating stacks). You are allowed to cite the defined parameters in the parts of Resources and Outputs in the template. The use of parameters can enhance template flexibility and improve multiplex capacity.

　　For more details, please see [Parameters](templates-grammar-Parameters.md).

#### Mappings (Optional)
　　It can be used to specify the mapping of key pairs of conditional parameter value and the key values, similar to the lookup table. You are allowed to match keys with corresponding values by using the intrinsic function Fn::FindInMap in the parts of Resources and Outputs.

　　For more details, please see [Mappings](templates-grammar-Mappings.md).

#### Conditions (Optional)
　　Conditions use Fn::And,, Fn::Or, Fn::Not, Fn::Equals and other definite conditions. When creating or updating resource stacks, the system will calculate all conditions in the template first and then create resources. Create all resources related to the true condition, and ignore all resources related to the false condition.

　　For more details, please see [Conditions](templates-grammar-Conditions.md).

#### Resources (Optional)
　　Used for specifying resources contained in the resource stacks which are created with the template, including dependencies between resources, configuration details, etc.

　　For more details, please see [Resources](templates-grammar-Resources.md).

#### Outputs (Optional)
　　Used to output useful information such as some attributes. Outputted contents can be obtained via API or the console.

　　For more details, please see [Outputs](templates-grammar-Outputs.md).

