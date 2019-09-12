# Customized Data

When creating an instance of Distributed Cloud Physical Server, you can configure the instance by specifying customized data. When the Distributed Cloud Physical Server is started for the first time, the user can transmit the executable script to the instance in the specified data format, and implement the text. If you purchase multiple Distributed Cloud Physical Server instances at a time, customized data will execute the text when all instances are first started.

### Format Requirement

1. The instance customized data needs to be imported after the Base64 encoding, and the data before encoding cannot exceed 16 KB (no greater than 21848 Byte after encoding).<br/>
2. If the instance is created through the Console, the data may not be encoded by Base64; select the corresponding tooltip and the system will complete the encoding. If it is created through the API, you must complete the encoding yourself.<br/>
3. Linux system supports bash and python both. Before encoding, be sure to use #!/bin/bash and #!/usr/bin/env python in the first line.<br/>
4. Please encode under the Linux environment to avoid incompatible formats and keep the original data no greater than 16KB;<br/><br/>
5. Supported images: CentOS 7.5 64-bit, CentOS 7.2 64-bit, CentOS 7.1 64-bit, CentOS 6.6 64-bit, Ubuntu 18.04 64-bit, Ubuntu 16.04 64-bit and Ubuntu 14.04 64-bit.<br/>

### Operation Steps
Enter the creation page of Distributed Cloud Physical Server, select **Advanced Configuration** section, with customized data in the disable status by default, and select **Enable **. Details are as shown in the figure below:<br/>

Note:<br/>
1. It is only limited to command execution through text passing when the Distributed Cloud Physical Server is first started or the system is reinstalled.<br/>
2. If the customized data does not execute as expected, go to the specified directory to view the execution log for causes. Log path of Linux system: /root/launch-script.log; the customized script executed can also be viewed. See the path: /root/launch-script for details.

![创建自定义数据](../../Image/user-data.png)
