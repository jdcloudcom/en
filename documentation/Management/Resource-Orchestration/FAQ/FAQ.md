## 1. What is Resource Orchestration

The Resource Orchestration is the service simplifying the cloud computing resource management, operation and maintenance. The user can describe the configuration information and dependency of multiple JD Cloud resources and create resource stacks, automatically complete creation and configuration of any resources via the template so as to realize purposes of central management, automatic operation and maintenance, etc. for resources.

## 2. What is orchestration template

The orchestration template is a standard resource and application delivery mode. The required cloud resources, dependency between resources, resource configuration attribute, and parameters necessary for specific application programs of automation deployment are defined in such template.

## 3. What is an example template

The example template is the official reference text file provided by JD Cloud for standard resource and application delivery, covering several application scenarios and helping the user reduce use cost.

## 4. What is a resource stack

The resource stack is a logic set used for applying central management to a group of cloud resources. Operation such as creation, update, and delete can be made to cloud resources in resource stacks. The resource stack is created based on the template.

## 5. Why did resource stack deletion fail?

A resource stack cannot be deleted when it is operated.
If a resource stack is creating, updating or involved in other operation, it can be deleted only when such operation succeeded or failed.
To solve the situation, please try the method below:

* Some resources can be deleted only when they are null and such deletion can be successfully made only when there are no child resources or the other resources are occupied. For example, the vpc can be deleted only when there is no subnet under such vpc.
* You may try to delete it again.

## 6. Why did resource stack creation fail?

* Rename Resource Stack
* The user cannot create resource stacks with the same name.
* Exceed the number limit for resource stacks available to be created
* Now, the Resource Orchestration service restricts that each user can create at most 50 resource stacks.
* Resource Creation Failed
* If resource creation failed, the creation of resource stack will fail as well. For example, if VPC creation failed due to the repeated VPC name, the resource stack creation will fail as well.


