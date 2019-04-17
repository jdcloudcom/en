# Configuration Questions

### **Template Verification Failed**
Please follow the Operation Guide to set up the template. Make sure the template format is valid JSON format file and encoded in UTF-8. JDCLOUDTemplateFormatVersion is spelled correctly, and the value is 2018-10-01. The logical id in the template must be alphanumeric. If an unsupported resource is defined in the template, the verification fails. The template file size; confirm that the template does not exceed 512KB.


### **Dependency Error**
To correct dependency errors, add a DependsOn attribute to the resources that depend on other resources in your template. In some cases, you must explicitly declare dependencies so that the Resource Orchestration service can create or delete resources in the correct order.

### **Invalid Value or Unsupported Attribute**
When you create or update a resource stack, the resource stack orchestration service may fail due to invalid input parameters, unsupported property names, or unsupported attribute values. For input parameters, please verify that the resource exists.


