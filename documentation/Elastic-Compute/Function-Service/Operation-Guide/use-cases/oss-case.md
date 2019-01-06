# OSS Trigger Example

JD Cloud OSS can map the event (for example: Delete object in the Bucket) to Function, passing event parameter to Function handling function to call your functions.

Scenario: The application program can implement direct handling of the files uploaded by users via event trigger function through associating function for its Bucket, and save the results to OSS or other services, which simplifies the process of application development and use.

This example describes how to configure the OSS trigger to implement the uploading of a local file (Take gif as the suffix) to a specified OSS Bucket and then delete it.

 
## Create OSS Bucket

1．   Before you create the trigger, please enable the OSS Object Storage Service and create a Bucket with the region of cn-north-1.<br>
2 ．    Login OSS console, select "Create Space" in the "Space Management" page; configure the "Space Name" (Bucket) as "function-test" and "Access Permission" as "Private Read/Write".<br>
3．   In the Object in the newly created Bucket, select "Create New Folder", which is named as filesource.<br>
4．   Complete creation.<br>

For detailed operation guide, refer to [Creating a Bucket](/documentation/Storage-and-CDN/Object-Storage-Service/Operation-Guide/Manage-Bucket/Create-Bucket-2.md).



 

## Create Function

 Note: The function and OSS Bucket need to be in the same region.
 
 Login the function service console, go to the "Overview" page or the "Function List" page in cn-north-1 region, and click "Create Function".

* Function template: Customized function template
* Function name: OSSfunction (You can set your own function name)
* Function entry: Fill in according to the notification, index.handler by default
* Function code: Encode OSS function code
* Function execution memory: 128MB
* Time-out period: 100 seconds
* Description, environment variable and advanced configuration: no need to fill in
* Trigger: No trigger is configured
Click "Complete" to complete function creation.


## Test Function

Before creating a trigger, you can configure test event to simulate the execution of a function through the console.

The OSS event source is passed as an entering parameter to the function in the form of event, and you can pass the event to the function to test whether the code is correct.

1. Create test event
  
  Enter the "Function List" page, click "OSSfunction" function and enter the function details, select "Configure Test Event",
* Configure test event: Create a new test event
* Event template: OSS-event-template
* Event name: test
Click "Save" to complete test event creation.

2. Test function

Select the saved test event "test" in the "Please Select Test Event" drop-down list, and click "Test".
3. After successful execution, you can view the real-time function execution log in the console.
 

## Create OSS trigger



1. Select "Trigger" tab in the "OSSfunction" function details, and click "Create Trigger".

* Trigger type: OSS trigger
* Bucket: Select the bucket that has been created to associate the function: "function-test"
* Event type: s3:ObjectCreated:Put
* Prefix: null
* Suffix: null

2. Upload any file to "function-test" Bucket, the function is triggered and executed.

The above is the simple example of OSS trigger triggering Function.
