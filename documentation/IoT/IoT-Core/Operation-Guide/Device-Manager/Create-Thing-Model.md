# Create Thing Model

After the thing type is completed, the page will be automatically redirected to the Thing Type Edition Page. You can also enter the Edition Page after clicking the **Thing Type List Edition** button and click **Function Definition** to enter the Thing Model Creation Page.

![创建物模型](../../../../../image/IoT/IoT-Core/Device-Manager/Create-Thing-Model/Create-Thing-Model.png)

- Thing Model name: Support Chinese characters, English letters, numbers, line-through and underline within 30 characters, starting and ending with Chinese Characters, English letters and numbers.
- Thing Model description: Description for the Thing Model, without input character type restriction and with length restriction of 0-200 characters, not required.
- Thing model version: Please follow semantic version specification. The format of version number is: primary version number.secondary version number.amendment number, for example V1.0.0, v1.0.0 or 1.0.0.
- Model list: Model definition under the Thing Model. When connection proxy device is respectively selected as the thing type and the node type, the connection proxy model (standard model) will be created by default.

## Create Model

Click the **Add** button on the model list and fill in model name and model identification on the model creation popup box and click **OK** for model description.

![新增模型](../../../../../image/IoT/IoT-Core/Device-Manager/Create-Thing-Model/Create-Model.png)

- Model name: Support Chinese characters, English letters, numbers, line-through and underline within 30 characters, starting and ending with Chinese Characters, English letters and numbers.
- Model identification: It is the unique model identification, supporting English letters, numbers, line-through and underline within 30 characters, starting and ending with English letters and numbers.
- Description: Instruction for Thing Model. There is no input character type restriction and the length is restricted to be 0-200 characters. Not required.

### Function List
After the Thing Model is created, click the function list to define function information for the Thing Model. You can customize attribute, incident and service.

#### 1. Attribute

Click **Attribute->Add Attribute** to pop up the attribute addition popup.

![功能定义-属性](../../../../../image/IoT/IoT-Core/Device-Manager/Create-Thing-Model/Add-Properties.png)

##### Settings of attribute parameters are as follows:

| Parameter                  | Description                 |
| :------------------- | :------------------- |
|Function Name | Define the name of attribute, support Chinese, English letters, numbers, line-through and underline within 30 characters, starting and ending with Chinese, English and numbers. | 
|Identifier  | Define the unique identifier of attribute, support Chinese, English letters, numbers, line-through and underline within 30 characters, starting and ending with Chinese, English and numbers, and do not support repetition and modification. | 
|Read/Write Permission | Define the readability/writability of attribute. Support Read Only / Write Only / Read/Write.  | 
|Value Type | Define the data type of attribute. The following types are supported: <br><br>   - **String** <br>length: The maximum allowable length of string to be imported is (to enter a positive integer with value of 1 - 1024) and null is not allowed. <br>![String](../../../../../image/IoT/IoT-Core/Device-Manager/Create-Thing-Model/String.png)<br>  - **Boolean** <br>  - **Enum**<br>![Enum](../../../../../image/IoT/IoT-Core/Device-Manager/Create-Thing-Model/Enum.png) <br>**Note: Add at least one Enum**<br>Enum (key): Support Chinese, English letters, numbers, line-through and underline within 30 characters, with Chinese, English and numbers placed at the beginning and ending, or numbers from 0 to 63 (including 0 and 63). <br>Value: Support Chinese, English letters, numbers, line-through and underline within 30 characters, starting and ending with Chinese, English and numbers. <br>- **Date** <br>- **Array** <br>![Array](../../../../../image/IoT/IoT-Core/Device-Manager/Create-Thing-Model/Array.png)<br>Maximum length of array (length): The maximum allowable length of array (to enter a positive integer with value of 1 - 128). <br>Value Type: Refer to the value type of attribute. <br>- **Binary**<br>![Binary](../../../../../image/IoT/IoT-Core/Device-Manager/Create-Thing-Model/Binary.png)<br>Length: The maximum length of binary converted by base64 (to enter a positive integer with value of 1 - 1024). The binary shall be converted into a base64 string at the time of transmission. <br>- **Struct** <br>!Struct](../../../../../image/IoT/IoT-Core/Device-Manager/Create-Thing-Model/Struct.png)<br>json Object (members)<br>1. Identifier: Support English letters, numbers, line-through and underline within 30 characters, starting and ending with English and numbers. Refer to the value type of attribute. <br>2. Value Type: Only support string, single-precision float, double-precision float, signed int and unsigned int with its data format same as the value type of attribute<br> - **Single-precision Float (Float)** <br>![Single-precision](../../../../../image/IoT/IoT-Core/Device-Manager/Create-Thing-Model/Float.png)<br>Need to define the minimum, maximum, step length, unit and unit description.   <br>   - **Double-precision Float (Double)** <br>Need to define the minimum, maximum, step length, unit and unit description.    <br> - **Unsigned Int (Unit8/Unit32/Unit64)** <br>Need to define the minimum, maximum, step length, unit and unit description. <br>- **Signed Int (Int8/Int32/Int64)** <br>Need to define the minimum, maximum, step length, unit and unit description. <br> <br> **Note**: The minimum/maximum and step length shall be defined within the standard scope of the data type.  <br> Maximum (max): The maximum allowable of the data value; 	 <br> Minimum (min): The minimum allowable of the data value; 	 <br> Step Length (step): The minimum granularity of data value changes; <br> Unit: The unit of the data value, optional; <br> Unit Name: The unit name of the data value, its length is limited within 0-200 characters Not required <br> |
|Description | To describe the function of attribute. There is no input character type restriction and the length is restricted to be 0-200 characters. Not required | 

#### 2. Incident

Click **Incident->Add Incident** to pop up the Add Attribute.

![功能定义-事件](../../../../../image/IoT/IoT-Core/Device-Manager/Create-Thing-Model/Add-Event.png)

##### Settings of incident parameters are as follows:

| Parameter                 | Description                 |
| :------------------- | :------------------- |
|Incident Name  | Define the name of incident, support Chinese, English letters, numbers, line-through and underline within 30 characters, starting and ending with Chinese, English and numbers. | 
|Identifier Mark  | Define the unique identifier of event, support Chinese, English letters, numbers, line-through and underline within 30 characters, starting and ending with Chinese, English and numbers, and do not support repetition and modification. | 
|Output Parameter | An incident can be defined with 64 output parameters at most. Parameters can be deleted and added. <br>Click **Add Parameter** to add output parameter of incident in the pop-up dialog box<br>1. Function Name: Support Chinese, English letters, numbers, line-through and underline within 30 characters, starting and ending with Chinese, English and numbers. <br>  2. Identifier Mark: Define the unique identifier of attribute, support Chinese, English letters, numbers, line-through and underline within 30 characters, starting and ending with Chinese, English and numbers, and do not support modification. <br> 3. Read/Write Permission: Support Read Only / Write Only / Read/Write. <br> 4. Value Type: The value type of parameter, refer to the data type specified in attribute definition. <br>  5. Data Definition: The value definition of parameter, refer to the attribute value definition specified in attribute definition.|| 
|Description | To describe incident function. There is no input character type restriction and the length is restricted to be 0-200 characters. Not required. |

#### 3. Service

Click **Service->Add Service** to pop up the Add Attribute.

![功能定义-服务](../../../../../image/IoT/IoT-Core/Device-Manager/Create-Thing-Model/Add-Service.png)

##### Settings of service parameters are as follows:

| Parameter                  | Description                 |
| :------------------- | :------------------- |
|Function Name  | Define the name of service, support Chinese, English letters, numbers, line-through and underline within 30 characters, starting and ending with Chinese, English and numbers. | 
|Identifier Mark  | Define the unique identifier of service, support Chinese, English letters, numbers, line-through and underline within 30 characters, starting and ending with Chinese, English and numbers, and do not support repetition and modification. | 
|Input Parameter | When the service is defined and called, input parameters need to be provided and a method can be defined with 64 input parameters at most. Parameters can be deleted and added. <br>Click **Add Parameter** to add input parameter of service in the pop-up Dialogue Box<br> 1. Function Name: Support Chinese, English letters, numbers, line-through and underline within 30 characters, starting and ending with Chinese, English and numbers. <br>  2. Identifier Mark: Define the unique identifier of attribute, support Chinese, English letters, numbers, line-through and underline within 30 characters, starting and ending with Chinese, English and numbers, and do not support modification. <br> 3. Read/Write Permission: Support Read Only / Write Only / Read/Write. <br> 4. Value Type: The value type of parameter, refer to the data type specified in attribute definition. <br>  5. Data Definition: The value definition of parameter, refer to the attribute value definition specified in attribute definition.|
|Output Parameter | After the service is defined and called, one method for the output data from the service can be defined with 64 output parameters at most. Parameters can be deleted and added. <br>Click **Add Parameter** to add output parameter of the service in the pop-up dialogue box<br>  1. Function Name: Support Chinese, English letters, numbers, line-through and underline within 30 characters, starting and ending with Chinese, English and numbers. <br>  2. Identifier Mark: Define the unique identifier of attribute, support Chinese, English letters, numbers, line-through and underline within 30 characters, starting and ending with Chinese, English and numbers, and do not support modification. <br> 3. Read/Write Permission: Support Read Only / Write Only / Read/Write. <br> 4. Value Type: The value type of parameter, refer to the data type specified in attribute definition. <br>  5. Data Definition: The value definition of parameter, refer to the attribute value definition specified in attribute definition.|
|Description | To describe service function. There is no input character type restriction and the length is restricted to be 0-200 characters. Not required. |

### JSON Data

The formats of Json data corresponding to the Function Definition can be viewed in **JSON Data** which provides json formatting and copy-by-one-click functions.

![JSON数据](../../../../../image/IoT/IoT-Core/Device-Manager/Create-Thing-Model/Model-Json-Edit.png)


## Thing Model Release

Upon completion of addition to Function List, you can click **Save** to release the Thing Model. Note: Model shall be defined with at least one item among attribute, incident and method. Click **Release** button to pop up Release Function popup, fill in the description of version changes, and click the button to release.

![发布物模型](../../../../../image/IoT/IoT-Core/Device-Manager/Create-Thing-Model/Publish-Model.png)

### Thing Model Version Switch Over

After the Thing Model is successfully released, it cannot be edited any longer. However, you can update its version via **Add New Thing Model Version**, release the new version after the modification and view the definition of different Thing Model versions via **Switch Version**.

![切换物模型版本](../../../../../image/IoT/IoT-Core/Device-Manager/Create-Thing-Model/Check-Version.png)

### Previous Version

Click the **Previous Version** to view the previous update records of Thing Model versions.

![物模型版本更新历史记录](../../../../../image/IoT/IoT-Core/Device-Manager/Create-Thing-Model/Publish-History.png)





