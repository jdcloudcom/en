# Trigger CRUD

The Trigger defines the rules by which an event source triggers a function. Addition, deletion, modification and check for triggers can be implemented through the operation of console, API/SDK. This chapter introduces addition, deletion, modification and check for triggers through the console.

Preparatory Work:

* Before creating API Gateway trigger, enable the API Gateway Service and create the group and API in the API Gateway Service. For creating process, please refer to:
   - [Create an API group](/documentation/Middleware/API-Gateway/Operation-Guide/Create-APIGroup/Create-APIGroup.md)
   - [Create API](/documentation/Middleware/API-Gateway/Operation-Guide/Create-API/Create-API.md)
* Before creating OSS trigger, enable the Object Storage Service and create the storage bucket in the Object Storage Service. For creating process, please refer to [Create Storage Space](/documentation/Storage-and-CDN/Object-Storage-Service/Operation-Guide/Manage-Bucket/Create-Bucket-2.md).


 

## Create Trigger:

Creating trigger specifies the method that event source event triggers the function; the event triggers function execution synchronously or asynchronously depending on the event source type, and when the function triggers execution, the event is passed to the function entry as an incoming parameter.

1. The user logs in Function Service, go to the "Function List" page.
2. Select the function to be configured in Function List, click the function name to enter the function details.
3. Select the version or alias of the function to be configured with the trigger on the function details, click "Trigger" tab.
4. On "Trigger" tab, click "Create Trigger", pop up "Create Trigger" popup.
5. Fill in trigger information, begin to create a new trigger; and different trigger methods are corresponded to different trigger configuration information, for details, please refer to [Event Source Service](eventsourceservice/eventsource-service.md).
6. Click "Save" to create a trigger.

 

## Delete Trigger:

The invoke relationship between an event source event and a function can be disassociated through deleting the trigger; after deleting the trigger, the event source triggering method defined by the trigger will no longer trigger the function to run.

1. On "Trigger" page, select the trigger to be deleted, click "Delete", pop up "Delete Trigger" interface.
2. Complete the confirmation based on notification, click "OK" to complete the trigger deletion operation.

 

## Search and Update Trigger:

Search trigger: for the created trigger, the configuration can be searched in the trigger list on the trigger page.

Update trigger: Select the trigger that needs to be updated from the trigger list on the trigger page, click "Edit" to update the trigger configuration. In which: API Gateway triggers are not editable after creation and can only be deleted. To keep your business running, log off the released API before deleting the trigger. See API Gateway for details.
