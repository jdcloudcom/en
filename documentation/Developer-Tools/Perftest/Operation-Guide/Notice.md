# Sending and processing of alarm and email with high failure rate
## Discovery/alarm of valid test during running
### Page Alarm Notification
If the verification point success rate of the script under execution has been less than 90% for 2min constant, such test is deemed as invalid. In such case, users will be notified of "Warning: the success rate is less than 90% for constant 2min. You are suggested to terminate the test" on the interface. Users can manual cancel this test in such case.
The following pages are involved: execution page, execution history page and link page
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/34.png)
### Send Alarm Email
In case of high failure rate, an alarm email will be sent to the script creator. Please click **Details** to view
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/35.png)
Supplementary Description:
- High-failure rate situation triggered when the failure alarm function synchronizes and processes timing tasks
- View access: "My Timing Task"→"Execution History"→"View Details/Copy Link", enter the page to view specific test execution
- Tests of high failure rate will be sent to the receiver specified when the timing task is created via emails.

