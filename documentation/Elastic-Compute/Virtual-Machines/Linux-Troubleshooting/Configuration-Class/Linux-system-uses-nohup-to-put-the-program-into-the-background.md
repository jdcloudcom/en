# Linux System Uses nohup to Execute Program in the Background




Sometimes you need to put a command in the background and execute, without affecting the input of the command line, and the user will not affect the execution of the process. At this time, you can use the nohup and "&" functions.



The role of Nohup is as its name suggests. It makes the subsequent commands not respond to the SIGHUP signal. That is, after the remote login executes nohup, the program will be executed normally even after logging out. Normally, the nohup command will be followed with "&" character, indicating that the command will be executed in the background, so that this command can be certainly executed in the background.



Example:

1. The normal execution command is *bash hello.sh*, and the execution result is a small program that outputs one line per second:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9F%E4%BD%BF%E7%94%A8nohup%E5%B0%86%E7%A8%8B%E5%BA%8F%E6%94%BE%E8%87%B3%E5%90%8E%E5%8F%B0%E6%89%A7%E8%A1%8C01.png)

2. Add nohup and & at the head and tail of the command, into nohup bash hello.sh &. It can be seen that nohup outputs a line of information. By pressing the Enter key and jump back to shell command line. The command is now being executed in the background, and nohup redirects the output of the command to the "nohup.out" file in the current directory. Also it is noted that nohup will output PID of the corresponding program, and this PID can be recorded for the use of subsequent kill process.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9F%E4%BD%BF%E7%94%A8nohup%E5%B0%86%E7%A8%8B%E5%BA%8F%E6%94%BE%E8%87%B3%E5%90%8E%E5%8F%B0%E6%89%A7%E8%A1%8C02.png)

3. The output of nohup.out can be continuously viewed through *tail -f nohup.out* to realize the program monitoring.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9F%E4%BD%BF%E7%94%A8nohup%E5%B0%86%E7%A8%8B%E5%BA%8F%E6%94%BE%E8%87%B3%E5%90%8E%E5%8F%B0%E6%89%A7%E8%A1%8C03.png)

4. In the command, the redirecting can also be used to change the output of the program into the wanted file name, such as **nohup bash hello.sh >hello.log &*, then the output of the program will be written to the hello.log file.



5. If the program does not automatically exit, then use the kill command to kill the process. You can use the command *kill -TRM PID_NUMBER* to operate, where PID_NUMBER is the value of the previous nohup output, which is 1231 in this example.



If your problem still can not solved, please submit open ticket to us.
