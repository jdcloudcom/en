# Fault Questions

## Resource Stack Creation Failed

The possible reasons of the failure of creating resource stack are as follows:

### **Rename Resource Stack**
The user cannot create resource stacks with the same name.

### **Format Error of Resource Stack Name**
Resource stack names cannot use non-alphamerical or non-number characters; and it cannot begin with numbers.

### **Resource Creation Failed**
If a resource creation failed, the creation of resource stack will fail as well.

### **Exceed the number limit for resource stacks available to be created**
Now, the Resource Orchestration service restricts that each user can create at most 50 resource stacks. For the related restrictions, please see the document [Restrictions](../Introduction/Restrictions.md).


### **Resource Stack Deletion Failed**
To solve the situation, please try the method below:

* For the resources with no sub-resources or not being used by other resources, they are allowed to be deleted. For example, there must be no subnet under vpc, and no Virtual Machine or Load Balancer device under the subnet.
* You may try to delete it again.


### **Resources cannot work stably during the resource stack creation, update, or deletion operations**
During the creation, update, or deletion of a resource stack, it is possible that the service is interrupted and unresponsive.


