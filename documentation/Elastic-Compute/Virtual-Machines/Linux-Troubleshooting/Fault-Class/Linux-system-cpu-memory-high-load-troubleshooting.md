# Troubleshooting for High Occupation of Linux System CPU and Memory



Note: The configuration and instructions in this article have been tested on the CentOS 6.5 64-bit operating system. For other types and versions of the operating system, configuration may vary. Please refer to the official documentation for the details about relevant operating systems.



**You can view the usage of its CPU, memory and other resources from the process latitude through top.**

Instructions:

*top*

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9Fcpu%EF%BC%8C%E5%86%85%E5%AD%98%E9%AB%98%E8%B4%9F%E8%BD%BD%E6%8E%92%E6%9F%A501.png)

Echo Description:

The third line on the default interface shows the overall usage of the current CPU resources, and the resource occupation of each process is displayed below.

You can enter p and P directly on the interface to arrange the monitoring results in reverse order of CPU use rate, and then locate the processes in the system that occupy a more CPU. Finally, according to the system log and the related log of the program itself, further check and analyze the corresponding processes to determine the reason why it occupy too much CPU.

**Use top to directly kill the processes that occupy too much CPU.**

As aforesaid, you can use the top command to view the system loading and locate processes that intensively occupy CPU resources. The abnormal intensive processes can be quickly terminated directly in the top run interface. Descriptions as follows:

1. To terminate a process, simply press the k key.

2. Enter PID of the process you want to terminate (the first column of the top output).

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9Fcpu%EF%BC%8C%E5%86%85%E5%AD%98%E9%AB%98%E8%B4%9F%E8%BD%BD%E6%8E%92%E6%9F%A502.png)

**CPU Use Rate is Low But Load is High**

Problem Description:

There is no business program running on the Linux system. Observe through the top, as shown in the following figure, the CPU is vacant, but the load average is very high.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9Fcpu%EF%BC%8C%E5%86%85%E5%AD%98%E9%AB%98%E8%B4%9F%E8%BD%BD%E6%8E%92%E6%9F%A503.png)

Solution:

load average is an evaluation of the CPU load. The higher the value is, the longer the task queue is, indicating more tasks are to be executed. This may be caused by some zombie process. You can check if there is any D state process by the ps -axjf command. The D state refers to an uninterruptible sleep state. Processes in this state cannot be killed and cannot exit on their own. It can only be solved by restoring the resources it depends on or rebooting the system.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9Fcpu%EF%BC%8C%E5%86%85%E5%AD%98%E9%AB%98%E8%B4%9F%E8%BD%BD%E6%8E%92%E6%9F%A504.png)

If your problem still can not solved, please submit open ticket to us.
