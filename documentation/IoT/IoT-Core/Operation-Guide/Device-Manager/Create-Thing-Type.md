# Creation Thing Type

1. Log in the IoT Management Platform
2. Select **Device Management Center** -> **Thing Type List** on the left navigation bar.**
3. Click **Create Thing Type** on the upper right corner of the page.**

![创建物类型](../../../../../image/IoT/IoT-Core/Device-Manager/Create-Thing-Type/Create-Thing-Type.png)

4. Fill in the basic information of Thing Type, the file information of global Thing Type, add files, etc.

![创建物类型1](../../../../../image/IoT/IoT-Core/Device-Manager/Create-Thing-Type/Create-Thing-Type1.png)

**Basic Information**
- Name: It only supports Chinese characters, English letters, numbers, underline (_), line-through (-), dot (.) and space within 30 characters.
- Node Type: The three node types, namely, direct-connected device, proxy-connected device and indirect-connected device, are supported.

| Node Type | Description|
| ----- | ----- |
|Direct-connected Device | It refers to the devices that can be directly connected to Network. This kind of devices can be directly accessed to Internet through base stations or routers, and are provided with IP addresses but cannot be mounted with Child Devices.|
|Proxy-connected Device| This kind of device is provided with their own IP addresses and can be connected to Internet; besides, provided with modules for management of Child Devices, they can also be proxies for Child Devices and can maintain the topological relation with Child Devices. |
|Indirect-connected Device|Without independent IP addresses, this kind of devices cannot be directly connected to Internet, but need to be connected to ammeter and other proxy devices before accessing to IoT platforms. |

- Verification Method: Support One Key for One Device and One Key for One Model (only support One Key for One Device now).
- Manufacturer Code: Not required.
- Device Type Code: Not required.
- Description: Description of Thing Type (not required).
- Networking Method: Support mobile network (2G/3G/4G), Ethernet and Wi-Fi.
Note: When the node type is an indirect-connected device and does not support network connecting, you can select the following communication protocol to access and connect proxy devices. 
![接入连接代理通讯协议](../../../../../image/IoT/IoT-Core/Device-Manager/Create-Thing-Type/Indirected-Device-Protocol.png)


- Manufacturer Name: Not required.
- Device Type Code: Not required.

**Global Thing Type File** 

For all Thing Types, corresponding information such as device manufacturer, production date and color needs to be filled in.
The files of global Thing Types can be managed via **File Management** -> **File List**. If no global Thing Type is available in the File List, no information will be displayed here.

**File Information**

The information, such as device manufacturer, production date and color, corresponding to the current Thing Type is not required to be filled in.

**Function Definition**

After a Thing Model is successfully created, it will automatically redirect to the Edit Thing Type page on which you can add Function Definition, Thing Model, to the Thing Type. For detail of function definition addition, please see [Create Thing Model](../Device-Manager/Create-Thing-Model.md)

![创建物模型](../../../../../image/IoT/IoT-Core/Device-Manager/Create-Thing-Model/Create-Thing-Model.png)