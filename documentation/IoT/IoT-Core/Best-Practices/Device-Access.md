# Device Access

After logging in the official website IoT management platform, quick device access can be finished with only 4 steps.

## Creation Thing Type

Log in **Device Management Center**->**Thing Type List**, click **Create Thing Type** and carry out the following steps:

Set basic information of thing type, such as name and networking method:

![](../../../../image/IoT/IoT-Core/Best-Practices/Device-Access/物模型创建-01.png)

Click **Create** to produce thing type ID (as shown below) and click **Save** after basic information is confirmed to be ok**

![](../../../../image/IoT/IoT-Core/Best-Practices/Device-Access/物模型创建-02.png)

Then, **define function of thing type**

![](../../../../image/IoT/IoT-Core/Best-Practices/Device-Access/物模型创建-03.png)

Fill in information such as template name and version number, click **Model List** and **+Add** to add models, well set a name and identification and click **OK**

![](../../../../image/IoT/IoT-Core/Best-Practices/Device-Access/物模型创建-04.png)

Attribution addition: Click **+Add Attribute**

![](../../../../image/IoT/IoT-Core/Best-Practices/Device-Access/物模型创建-05.png)

Set relevant information and click **OK** to successfully add attributes:

![](../../../../image/IoT/IoT-Core/Best-Practices/Device-Access/物模型创建-06.png)

Add incident: Click **Incident** to add one incident which contains one date type output parameter

![](../../../../image/IoT/IoT-Core/Best-Practices/Device-Access/物模型创建-07.png)

Set information related to incident output parameters, including function name, identifier, read-write permission,

![](../../../../image/IoT/IoT-Core/Best-Practices/Device-Access/物模型创建-08.png)

then click **Save** and finally click the **Release** button to finish thing type release after a thing type is successfully created.



## Device Registration

Log in **Device Management Center**->**Device List**, click **Device Registration** and carry out the following steps:

Set basic information, with examples created in the last section selected as the thing type:

![](../../../../image/IoT/IoT-Core/Best-Practices/Device-Access/设备注册-01.png)

After confirming that the basic information is correct, click **Create** to finish device creation

![](../../../../image/IoT/IoT-Core/Best-Practices/Device-Access/设备注册-02.png)

## Download Device Certificate

Return to the device list, find the registered device and click **Certificate Download**

![](../../../../image/IoT/IoT-Core/Best-Practices/Device-Access/下载设备证书.png)

## SDK Quick Integration

SDK path structure is as shown in the table below. Each path is a module under which a static database and a dynamic database can be independently compiled in the name of the path and testing programs for testing modules can be produced. All library files produced will be stored in target /lib, but the produced executable files will be stored in target /bin. The top-layer README.md is the basic description for compilation rule.

 

├── doc              		    -- Instruction Document

├── example          	   -- sdk Utilization Example

├── external_libs      	-- External Reliance Library

│  ├── cJSON        	     -- External Reliance Library cJSON

│  ├── CppUTest      	 -- External Reliance Library CppUTest

│  └── mosquito     	  -- External Reliance Library mosquito

├── joylink           		  -- SDK Core Code

│  ├── inc           			-- SDK Header Document

│  └── src           			-- SDK Source Document

├── Makefile        		 -- Makefile

├── Makefile.rule     	-- Makefile Compilation Option Configuration

├── once.sh          		-- Automatic engineering path setting

├── pal              			-- Platform abstract layer

│  ├── inc           		   -- Header file of platform abstract layer

│  └── src           		   -- Source file of platform abstract layer (adaption code under Linux)

├── README.md         -- Compilation Description

├── run_test.sh           -- Run script of executable program

├── scripts                   -- Folder of cross compiling script

│  └── x86.mk             -- Compiling script under x86 system

├── target 

│  ├── bin           		 -- Storage directory of executable program

│  └── lib           		  -- Storage directory of database file

Compilation Environment

Install gcc, make and cmake under linux.

### Install open-ssl database

% sudo apt-get install openssl

% sudo apt-get install libssl-dev

### External Reliance Library moquitto

% cd external_libs/ mosquito

% mkdir build

% cd build

% cmake ..

% make

### Device Information Set

Replace the following macro definitions in the file example/joylink_device_demo.h with registered device information:

SDK_CONFIG_HOST_NAME: host address of IoT Management Platform;

SDK_CONFIG_HOST_PORT: Port number of IoT Management Platform

SDK_CONFIG_DEVICE_ID: Device ID;

SDK_CONFIG_CA_PATH: Device ca Certificate Path;

SDK_CONFIG_CERT_PATH: Device cert Certificate Path;

SDK_CONFIG_KEY_PATH: Device Key Certificate Path;

DEVICE_INFO_THING_MODEL_ID: Thing Model id of Device;

DEVICE_INFO_THING_MODEL_VERSION: Thing Model Version No. of Device;

### Compilation

% ./once

% make distclean

% make

### Operation

    Execute ./run_test.sh under the root directory to run the executable programs

 If the device reports the online information, it means that the device is connected to the IoT Management Platform

![](../../../../image/IoT/IoT-Core/Best-Practices/Device-Access/sdk-运行-00.png)



View current status of device on the IoT Management Platform. If it is displayed as online:

![](../../../../image/IoT/IoT-Core/Best-Practices/Device-Access/sdk-运行-01.png)


Enter the Device Edition Page and click the **Attribute** tab page. Then, you can see the current attribute value of the device, as below:

![](../../../../image/IoT/IoT-Core/Best-Practices/Device-Access/sdk-运行-02.png)

Select the expected value as true and click **Update Expected Value**. The following picture will be displayed if a successful saving reminder is given:

![](../../../../image/IoT/IoT-Core/Best-Practices/Device-Access/sdk-运行-03.png)

Click **Incident List** to review reported example incidents

![](../../../../image/IoT/IoT-Core/Best-Practices/Device-Access/sdk-运行-04.png)

