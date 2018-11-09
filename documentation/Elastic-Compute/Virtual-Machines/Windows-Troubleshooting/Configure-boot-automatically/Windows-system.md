# Windows System

SC Command
The SC command is a Windows native service control command, by which, standard Windows services can be easily added and deleted:

# Add Service

*sc create ServiceName binpath= "D:\services\xxx.exe"*

# Remove Service

*sc delete ServiceName*

Attention:

● A space shall be reserved after binpath parameters.

● Users shall configure it manually after services are added, such as, setting the startup type as **Automatic**.

● Users can view and manage registered services via services.msc.

**Add Auto-starting Service Example**

(1) Open [cmd] with administrator authorization and execute the following commands to set the wosigncode.exe as a service program.

*sc create myservice binpath= "c:\wosigncode.exe"*

After successful execution, the following figure displays:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F01.png)

(2)  **Run** -> Enter *services.msc*.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F02.png)

(3) Right click "myservice" just added,  and select "Properties" (see the figure below).

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F03.png)

(4) Select "Automatic" for the startup type, click "Start" and then click "OK" to complete the program startup settings.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F04.png)
