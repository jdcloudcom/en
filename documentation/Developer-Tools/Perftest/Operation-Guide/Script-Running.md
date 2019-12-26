# Run script
## Execute Script
Access: "Test Script" →"Execute" 
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/17.png)
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/18.png)

Parameter Description:
- Test name: script name
- Test script: Test corresponding jmx file
- Creator: script creator
- Creation time: script creation time
- User number: concurrent user number (concurrent threads)
- Duration (unit: minute): Circularly execute scripts in a designated time (execute as per specified duration or number of script)
- Preset QPS (times/second): Set the expected concurrent pressure requests per second
- Ramp-up (unit: second): duration for starting up all threads by JMeter
- Monitoring: Set the tested target monitoring or not
- Region/IP: Select a target machine to be monitored according to information such as instance name, id and IP address. You can select several information items, but can only test the Virtual Machines under your own account
Note: Under QPS concurrent pressure, the system will adjust concurrent pressure strength and match the specified QPS target value as much as possible. However, affected by the test scripting and response capacity of tested target, it is unable to reach the specified target value during the actual test.
In addition, if the designated test duration is too short, the system may end the whole test because the running time is due during the attempt to getting close to the QPS target value.
It is shown in the figure
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/19.png)
## Running Parameter
### JMETER script structure (including running parameter)
- Add User Defined Variables
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/20.png)
- Add user variables
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/21.png)
- Cite the defined "Running Variable" in scripts
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/22.png)
### Variable for page editing and running
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/23.png)
Description:
- Access: "My Script" → or "Execute" or "Timing Task Management"→" Create Timing Task"
- When scripts are executed, user-defined variables in scripts will be resolved, edited and modified. Dynamically designate variable value for this execution
## List Operation Description
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/24.png)
- Update script: Edit current script and replace existing script with new script uploaded
- Execute: Execute current script
- Execution history: For specific contents, please view "Execution History Operation Description"
- Download script: Download uploaded script contents
- Delete: Delete the script
- Create timing: Create script execution timing task
## Execution History Operation Description
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/25.png)
- View details: View detailed information of specific execution records
- Delete: Delete this execution record
- Replicate link: Replicate this execution record to a browser to view or use it as the document description
