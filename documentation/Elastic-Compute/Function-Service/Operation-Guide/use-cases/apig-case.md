
# API Gateway Trigger Example
JD Cloud API gateway can map the event (for example: put/post API) to Function, passing event parameter to Function handling function to call your functions.

Scenario: When a request arrives at an API gateway that has set function as the backend service, the API gateway will trigger the execution of the function, and the Function will return the execution result to the API gateway.

This example describes the steps of use of API gateway triggering function service in detail. It introduces how to configure the API gateway trigger; use the API gateway function template, to obtain the function parameter passed by the API gateway through the function, and return the processing result to the API gateway.

## Create API


1．Before you create the trigger, please enable the API gateway service and create an API with the region of cn-north-1.

2．Login API console and create an API group and API

For detailed operation guide, refer to [Use Function as the API backend service](/documentation/Middleware/API-Gateway/Getting-Started/example_function.md).

API creation completed.

## Create Function

Login the function service console, go to the "Overview" page or the "Function List" page, and click "Create Function".

* Function template: API gateway template
* Function name: APIGfunction (You can set your own function name)
* Function entry: Fill in according to the notification, index.handler by default
* Function code: API gateway template selected by default
* Function execution memory: 128MB
* Time-out period: 100 seconds
* Description, environment variable and advanced configuration: no need to fill in
* Trigger: No trigger is configured<br>
Click "Complete" to complete function creation.

## Test Function

Before creating a trigger, you can configure test event to simulate the execution of a function through the console.

The API gateway event source is passed as an entering parameter to the function in the form of event, and you can pass the event to the function to test whether the code is correct.

1. Create test event<br>
Enter the "Function List" page, click "APIGfunction" function and enter the function details, select "Configure Test Event",
    * Configure test event: Create a new test event
    * Event template: API Gateway-event-template
    * Event name: test<br>
    Click "Save" to complete test event creation.<br> 

2. Test function<br>
Select the saved test event "test" in the "Please Select Test Event" drop-down list, and click "Test".<br> 

3. After successful execution, you can view the real-time function execution log in the console.

## Create API gateway trigger


1. Create API via API gateway console.

2. Select "Trigger" tab in the "APIGfunction" function details, and click "Create Trigger".
    * Trigger type: API gateway trigger
    * API group: Select the unreleased API group that has been created to associate the function
    * Version number: Select API version number
    * API: Select API
    
3. After the successful test, release API in the API gateway console.<br>
The above is the simple example of API gateway trigger triggering Function.





