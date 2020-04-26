## User Data

### Function Description

When creating an instance of Distributed Cloud Physical Server, you can configure the instance by specifying user data. When the Distributed Cloud Physical Server is started for the first time, the user can transmit the executable script to the instance in the specified data format, and implement the text. If you purchase multiple Distributed Cloud Physical Server instances at a time, user data will execute the text when all instances are first started.

### Format Requirements

1. The instance user data needs to be imported after the Base64 encoding, and the data before encoding cannot exceed 16 KB (not greater than 21848 Byte after encoding).<br/>
2. If the instance is created through the Console, the data may not be encoded by Base64; check the corresponding tooltip and the system will complete the encoding. If it is created through the API, you must complete the encoding yourself.<br/>
3. Linux system supports bash and python both. Before encoding, be sure to use #!/bin/bash and #!/usr/bin/env python in the first line.<br/>
4. Please encode under the Linux environment to avoid incompatible formats and keep the original data not greater than 16KB;<br/>
5. Images supported: CentOS 7.5 64-bit, CentOS 7.2 64-bit, CentOS 7.1 64-bit, CentOS 6.6 64-bit, Ubuntu 18.04 64-bit, Ubuntu 16.04 64-bit, Ubuntu 14.04 64-bit.<br/>

### Operation Steps
- Enter the creation page of Distributed Cloud Physical Server, select **Advanced Configuration** section, with user data in the disable status by default, and select **Enable **;<br/>
- Enter the user data in the text box. If the data has been encoded by Base64, please check "the following input has been encoded by Base64". If the data is plaintext that has not been encoded, please leave it unchecked;<br/>
- To ensure the correct execution of the script, please be sure to check whether the declaration format of the data is correct according to the **Format Requirements** above;<br/>
- After the instance is running, log in the instance to view the running result of the user data.<br/>

Note:<br/>
1. It is only limited to command execution through text passing when the Distributed Cloud Physical Server is first started or the system is reinstalled.<br/>
2. If the user data does not execute as expected, go to the specified directory to view the execution log for causes. Log path of Linux system: /root/launch-script.log; also, the customized script executed can also be viewed. See the path: /root/launch-script for details.
