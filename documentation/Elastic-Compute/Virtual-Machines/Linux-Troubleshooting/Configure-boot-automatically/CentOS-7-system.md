# CentOS 7 System

**Write Service Script under systemd**

Red Hat Enterprise Linux 7 (RHEL 7) has migrated service management tools from SysVinit and Upstart to systemd, and the corresponding service scripts need to be changed. In the previous version, all startup scripts are placed in /etc/rc.d/init.d/ directory. These scripts are bash scripts that allow system administrators to control the state of these services. Typically, these scripts include start, stop and restart methods and the system can automatically call to these methods. However, in RHEL 7, this method has been completely abandoned, and a configuration file called unit is used to manage the service.

**Unit File under Systemd**

Unit file is dedicated to control resources under systemd. The resources include service, socket, device, mount point, automount point, a swap file or partition...

All unit files should be configured with [Unit] or [Install] segment. Since the general information is described in [Unit] and [Install], each unit should have a segment of specified type, for example, [Service] corresponds to the background service type unit.

The types of unit are as follows:

**service**

**socket** : This kind of unit encapsulates a socket in the system and Internet. At the moment, systemd supports AF\_INET,AF\_INET6,AF\_UNIXsocket for streaming, datagram and continuous packet. Traditional FIFOs transfer modes are also supported. Each socket unit has a corresponding service unit. The corresponding service is started when the first "connection" enters the socket or FIFO (for example: nscd.socket starts nscd.service when there is a new connection).

**device** : This kind of unit encapsulates a device that exists in the Linux device tree. Every device marked with udev rule will appear as a device unit in systemd. The udev attribute setting can be used as a configuration source for configuring device unit dependencies.

**mount** : This kind of unit encapsulates a mount point in the system hierarchy.

**automount** : This kind of unit encapsulates an automount point in the system hierarchy. Each automount unit corresponds to a mounted mount unit (it needs to be mounted as early as the automount directory can be accessed).

**target** : This kind of unit logically groups other units. They don't actually do anything, just refer to other units. This allows the unified control of unit. (For example: multi-user.target is equivalent to run level 5 in the system that traditionally uses SysV); bluetooth.target calls Bluetooth-related service only if a Bluetooth adapter is available, such as: bluetooth daemon, obex daemon, etc.)

**snapshot** : Similar to targetunit, the snapshot itself does not do anything, the only purpose is to refer to other units.

**Know the Unit File of Service**

Extension: .service

Path:

*/etc/systemd/system/**     ----  for system administrators and users

*/run/systemd/system/**     ----  configuration file when running

*/usr/lib/systemd/system/**   ----  for installer (such as RPM package installation)



The following is an example of a service unit file. When it is  /usr/lib/systemd/system/NetworkManager.service file, it describes the network management services in the system.



*[Unit]*

*Description=Network Manager*

*Wants=network.target*

*Before=network.target network.service*

*[Service]*

*Type=dbus*

*BusName=org.freedesktop.NetworkManager*

*ExecStart=/usr/sbin/NetworkManager --no-daemon*

*# NM doesn't want systemd to kill its children for it*

*KillMode=process*

*[Install]*

*WantedBy=multi-user.target*

*Alias=dbus-org.freedesktop.NetworkManager.service*

*Also=NetworkManager-dispatcher.service*



The entire file is divided into three parts, **[Unit]·[Service]·[Install]**

**[Unit]**: General information recording unit file.

**[Service]**: Information recording Service

**[Install]**: Installation information.



**Unit Mainly Contains the Followings:**

● **Description**: A description of this service.

● **Before, After**: Define the startup sequence, Before=xxx.service, mean the service is started before xxx.service. After=xxx.service, means the service is started after xxx.

● **Requires**: This unit is started, then its "needed" unit  will be started; its "needed" unit is stopped, and it can't live by itself. It is noted that this setting does not control the startup sequence of a unit and its "needed" unit (the startup sequence is additionally controlled), specifically, Systemd does not start Requires and then the unit, but it starts the two in parallel when the unit is activated. This will cause a race against time. If Requires is first started successfully, it is luck. If Requires is started slowly, the unit will fail (Systemd will not automatically retry). Therefore, for the robustness of the system, it is not recommended to use this tag, but the Wants tag is recommended. Multiple Requires can be used.

● **RequiresOverridable**: Much like Requires. However, if the service is manually started by the user, the service behind RequiresOverridable will not report an error even if the startup is unsuccessful. Compared with Requires, it has a certain fault tolerance, but you need to make sure your service has a wait function. In addition, if it is not started up manually by the user but started up with the system, there will still be problems as faced by Requires.

● **Requisite**: A strong version of Requires. If the service required here is not started up successfully, the unit file will fail immediately no matter whether it cannot be detected or not.

● **Wants**: Recommended to use. When this unit is started, its "wanted" unit will also be activated. However, unsuccessful startup has no effect on this unit.

● **Conflicts**: The start of a unit will stop the unit that "conflicts" with it, and vice versa.



**Service Mainly Contains the Followings:**

● **Type: service** has the following types:

----simple by default, this is the simplest type of service. This means that the program started is the main program. If this program exits, everything will exit.

-----forking, the startup method used by the standard Unix Daemon. After starting the program, the fork() function will be called. After the necessary communication channels are set, the parent process will exit, leaving the child process of the daemon.

-----oneshot type of service is to start and complete, no process.

notify, idle type is relatively rare and is not introduced here.

● **ExecStart**: The command to be executed when the service is started. Usually this command is the main body of the service.

------If the type of your service is not oneshot, it can only accept one command, and the parameters are not restricted.

------Multiple commands are separated by semicolons, and multiple lines are spanned by \.

● **ExecStartPre, ExecStartPost: Command called before and after execution of ExecStart**.

● **ExecStop**: Define the command that is executed when the service is stopped, and define the processing that is done before the service exits. If not specified, the service will be terminated immediately without processing when using the systemctl stop xxx command.

● **Restart**: Define when the service will be restarted (startup failed, startup timeout, process terminated). Options: no, on-success, on-failure, on-watchdog, on-abort

● **SuccessExitStatus**: Refer to the return value in ExecStart and define when the startup is successful.

eg：SuccessExitStatus=1 2 8 SIGKILL

**Install Mainly Contains the Followings:**

● **WantedBy**: Under what circumstances, the service is enabled.

eg: WantedBy=multi-user.target (enabled in multi-user environment)

● **Alias**: Alias



Mapping of old commands to systemd commands
service systemctl Description
service name start ----> systemctl start name.service ●Starts a service.
service name stop ----> systemctl stopname.service ●Stops a service.
service name restart ----> systemctl restartname.service ●Restarts a service.
service name condrestart ---->
systemctl try-restart name.service ●Restarts a service only if it is running.
service name reload ----> systemctl reloadname.serviceReloads configuration.
service name status ----> systemctl status name.service
systemctl is-active name.service
●Checks if a service isrunning.
service --status-all ----> systemctl list-units –type service --all
●Displays the status of all services.chkconfig systemctl
chkconfig name on ----> systemctl enablename.service ●Enables a service.
chkconfig name off ----> systemctl disablename.service ●Disables a service.
chkconfig --list name ----> systemctl statusname.service
system ctl is-enabled name.service
●Checks if a service is enabled.
chkconfig --list ----> systemctl list-unit-files –type service
●Lists all services and checks if they are enabled.



**Create Your Own systemd Service**

By clarifying the meanings of the unit file, we can try to write our own service. Compared with the previous writing of the service with SysV, the whole process is relatively simple. The unit file is succinct that is incomparable with previous bloated scripts.

In this example, try to write a service named my-demo.service. The whole service is very simple: write the time when the service starts to a file at startup. The process of creating the entire service can be illustrated with a simple example.

**Step1**: Write your own unit file, the command is my-demo.service, and the whole file is as follows:

[Unit]
Description=My-demo Service

[Service]
Type=oneshot
ExecStart=/bin/bash /root/test.sh
StandardOutput=syslog
StandardError=inherit

[Install]
WantedBy=multi-user.target



**Step2**: Copy the above file to the /usr/lib/systemd/system/* directory in the RHEL 7 system

**Step3**: Write the test.sh file defined by ExecStart=/bin/bash /root/test.sh in the unit file and place it in the defined directory. This file is the execution body of the service. The file contents are as follows:

*#!/bin/bash*

*date >> /tmp/date*

Step4: Register my-demo.service into the system and set the boot to execute the command:

*# systemctl enable my-demo.service*

Output: ln -s'/usr/lib/systemd/system/my-demo.service' '/etc/systemd/system/multi-user.target.wants/my-demo.service'

The output indicates that the registration process is actually linking the service to the /etc/systemd/system/ directory.

The service has been created so far. By rebooting the system, you will find that the /tmp/date file has been generated, and the service is started successfully at boot. Of course, the test.sh file in this example can be replaced with any executable file as the main body of the service, so that a variety of functions can be realized.



**Startup of Installed Services at Boot**

Here is an example of setting up the SSSH startup at boot:

# View Whether the SSHD Service is Started.

*systemctl status sshd*

Please note that if there is already an enabled tag, it means that the service will be started at boot. If it is disabled, it means that it will not be started at boot. You need to execute the following command to set the startup at boot:

*systemctl enable sshd*
