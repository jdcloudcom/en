# Customized Data

When creating a Cloud Physical Server instance, you can configure the instance by specifying customized data. When Cloud Physical Server is started for the first time, the user can pass on the executable script to the instance in the specified data format, and implement the text. If you purchase multiple Cloud Physical Server instances at a time, customized data will execute the text when all instances are first started.

### Supporting Scope

Basic Network Instance: cn-north-1 Availability Zone B doesn’t support the function of setting customized data. The remaining optional regional availability zones all support the function.<br/>
Virtual Private Cloud instance: The optional regional availability zones all support the function of customized data.

### Format Requirement

1. The instance customized data needs to be imported after the Base64 encoding, and the data before encoding cannot exceed 16 KB (not greater than 21848Byte after encoding).<br/>
2. The Console supports two upload modes: text mode and file mode. Meanwhile, the file size shall not exceed 16 KB (and shall not exceed 21,848 bytes after being encoded).<br/>
3. If the instance is created via the Console, you can select to carry no Base64 encoding for the data. After a corresponding prompt box is checked, the system will complete encoding. If the instance is created via API, you must complete encoding by yourself.<br/>
4. Linux system supports bash and python both. Before encoding, be sure to use #!/bin/bash and #!/usr/bin/env python in the first line.<br/>
5. Please conduct encoding under the Linux environment, avoid use of incompatible format and keep the original data not greater than 16KB;<br/><br/>
6. Supported image: CentOS 7.5 64-bit, CentOS 7.2 64-bit, CentOS 7.1 64-bit, CentOS 6.6 64-bit, CentOS 7.5 64-bit, TD enhanced edition, Ubuntu 18.04 64-bit, Ubuntu 16.04 64-bit, Ubuntu 14.04 64-bit.<br/>

### Operation Steps
Enter the Create Cloud Physical Server page, select the Advanced Configuration section, default customized data as in closed status, and select the enabling operation.<br/>
2. Enter user data in the text box or select a file upload mode. If the data have been encoded into Base64, please check "The following input has been encoded into Base64". If the data are plaintext and are not encoded, please leave it unchecked;<br/>
3. To ensure that the script is correctly executed, please be sure to refer to the format requirements above and check if the data statement format is correct;<br/>
4. After the instance is run, log in the instance and view running results of user data.<br/>

Note:<br/>
1. It is only limited to command execution through text passing when the Cloud Physical Server is first started or the system is reinstalled.<br/>
2. If the user data are not performed on schedule, you can go to the designated directory, view logs and find the cause. Log path of Linux system: /root/launch-script.log; Log execution path in Windows system: C:\Program Files\Cloudbase Solutions\Cloudbase-Init\log\cloudbase-init.log.



