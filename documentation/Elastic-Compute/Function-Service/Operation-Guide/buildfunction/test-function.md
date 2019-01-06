# Test Function

The test data is transferred to entrance function entrance as event parameters. Upon configuration, it can be saved locally for next test and will be deleted if cache is cleared.

* A maximum of 10 test events can be configured to each function.

* Each test event content does not exceed 64KB.

 

## Create Test Event

 1. The user logs in Function Service, go to the "Function List" page.
 
 2. Select the function to be tested in Function List, click the function name to enter the function details.

 3. On the function details, select the function version or alias, click "Please Select Test Event" drop-down list, select "Configure Test Event", and pop up "Configure Test Event" window.
 ![测试函数1](https://github.com/jdcloudcom/cn/blob/functionservice/image/Elastic-Compute/functionservice/test1.PNG)
 4. Fill in the test information in the "Configure Test Event" window. See Table 1 for the configuration details of test event information, parameter with * is a compulsory item.
 5. Click "Save" to create test event.

Table 1 Test Event Configuration

| Parameter         | Description                                                         |
| ------------ | ------------------------------------------------------------ |
|* Configure test event | Create a new test event or edit the existing test event (by default: create a new test event)  |
|* Event template      | Selection a blank template or the existing template to create a test event (the existing template will load corresponding test events. See Table 2 for instructions of test event templates) |
|* Event name     | It can only contain letters, digits, underline and line-through, and cannot begin with digits and line-through; it shall be case sensitive, and the length does not exceed 24 characters               |
| Test event     | Enter test event: the test event is defined as JSON format. Please save the test event in JSON format.  |

Table 2 Test Event Template Description

| Template Name                   | Description                                      |
| -------------------------- | ----------------------------------------- |
| Blank Template                   | Template Event no: {"key":’value"}, modify as needed |
| API Gateway-event-template | Simulate API gateway events, trigger the function to execute             |


 
 


 

## Test Function

After the test event has been successfully created, function tests can be performed through the console to verify the expected function of the function.

 1. Select the function version to be tested on function details, select the test event and click "Test".

 2. The function running results can be directly viewed on function details.

Description: if it is required to view the complete function execution log, please refer to [Function Log](../function-log.md).

 

## Modify Test Event

 1. On the function details, click "Please Select Test Event" drop-down list, select "Configure Test Event", and pop up "Configure Test Event" window.

 2. Modify test information at "Configure Test Event" window, select the saved test events that need to be modified in "Edit Existing Test Event" to modify the test event code.

 3. Click "Save" to complete modification.

 

## Delete Test Event

For the template which is created by the user and is not used anymore, please select such template and click "Delete" to delete such template.
