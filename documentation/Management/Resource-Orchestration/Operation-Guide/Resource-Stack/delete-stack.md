# Delete Resource Stack


## Operation Steps:

1. Select the resource stack to be deleted and click **Delete**, the confirmation page for deleting the resource stack pops up with the notification: “Confirm to delete the resource stack?”. It is shown in the figure below.

![](https://raw.githubusercontent.com/jdcloudcom/cn/edit/image/Resource-Orchestration/delete%20stack001.png)

2. Click **OK** to complete the deletion operation and enter the resource stack list page. The status of the deleted resource stack is displayed as “Deleting".

![](https://raw.githubusercontent.com/jdcloudcom/cn/edit/image/Resource-Orchestration/delete%20stack002.png)


## Precautions

- Deleting a resource stack deletes the resources under the resource stack at the same time. If you want to keep some resources in the stack, you should define the deletion policy on your own in the template.
  
  For related content, see the Basic Syntax Description of Orchestration Template-Resources-DeletionPolicy
  
  
  Deletion Policy

  In the template, set the DeletionPolicy attribute to declare to retain a resource when the resource stack is deleted. The optional values are Delete and Retain.

  For example, set to retain vm instance when the resource stack is deleted. It can be declared according to the following code snippet:
     
     ```
      "Resources" : {
        "MyInstance" : {
          "Type" : "JDCLOUD::VM::Instance",
          "Properties" : {
            "ImageId" : "img-wcewkxc5c1"
          },
          "DeletionPolicy" : "Retain"
        }
      }
      
     ```
