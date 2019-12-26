# Timing Task
## Build timing task on page
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/32.png)
Function Description:
After scripts are created and tested, you can create a timing task in the "Timing Task Management" menu and manage the timing task
Parameter Description:
- Timing task name: Specify name of this timing task, with specific meaning preferably
- Test name: Fuzzy search  Filter matched user number of timing task from the established test scripts
- Start time: start time of total time range for timing
- End time: end time of total time range for timing
- Running rule: cron expression (now, the second-level timing task is not supported, only 5 bits are supported and execution is made in 0s by default)
- User number: concurrent user number (concurrent threads)
- Duration (unit: minute): Execute scripts in a circular manner in specified time
- Notification email: Receivers’ emails for notice of regular execution and notice of high-failure alarm, separated with commas
- Ramp-up (unit: second): duration for starting up all threads by jmeter
- Monitor: Used as tested service monitoring
- Test machine IP: You need to enter tested service IP
- Running parameter: Please view the description on the "Run Script" page
## My Timing Task
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/33.png)
Operation Rule Description
- Timing status: create, in progress, end, cancelled and deleted
- After the timing task is created, the initial status is "New"
- If you need to enforce the timing task, please click the **Start** button and then the timing task is in the status of "In Progress"
- To suspend timing, please click the **Cancel** button to pend the timing task
- To recover the timing task, please click the **Recover** button to recover the timing task
- If the timing task is completed, the system will be automatically set as the "ended" status
- If the timing task is deleted, execution of subsequent task will be ended and deletion records cannot be found in the timing task list
- View parameter: View timing task parameter setting
- Execution history: Timing task execution history list
