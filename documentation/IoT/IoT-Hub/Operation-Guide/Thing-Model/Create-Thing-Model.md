# Add Thing Model

Add Thing Model, i.e., define features (including attribute, event and service). This document introduces how to define Thing Model in the Console.

**Operation Steps**

1. Log in [IoT Hub Console](https://iot-console.jdcloud.com/hub)
2. Select **Manage** -> **Product on the left navigation bar**
3. Click **Product Name** in the product list to enter the product details
4. Click Thing Model Function -> **Add Function** Button
5. Define functional information suitable to the product in the dialog box popped up. You can customize product attribute, service and event.

![Create-Ting-Model](../../../../../image/IoT/IoT-Hub/Ting-Model-Creation.png)


6. Click **OK** after parameters are set to complete addition of a single function.
7. You can also upload the Thing Model edited by you by the **Import Thing Model** button, to import Thing Model in batch. Click to get [Thing Model Template](https://pubilc-tm-template.s3.cn-north-1.jdcloud-oss.com/TM-Sample.json).


## Attribute parameter setting is as follows:

| Parameter                  | Description                 |
| :------------------- | :------------------- |
|Attribute Name  | Define attribute name, support English letters, numbers, underline "_" and line-through "-", must begin and end with English letters and numbers, and contain 1-30 characters. Required! Unique for a product. Cannot be modified. |
|Attribute Description | Used to describe attribute function. No restriction to input character type, length is limited to 0-50 characters Optional! |
|Read and Write Attribute | Define read and write attribute of the automatically value itself and can automatically generate a biological shadow. It is a compulsory option.	Value: read_only/read_write  |
|Data Type | Define data type of the attribute, which is compulsory, and only the following types are supported now. <br><br>   - **character string** : length: The maximum length (input value is an integer from 1 - 256) of the character string allowed to be transmitted, cannot be null or 0 and can be changed; <br>  - **bool value** : value: True / False, value name: Define corresponding value name for identification and exhibition. Cannot be null, support Chinese, English letters and numbers. Length is 1-10 characters It can be changed; <br>   - **enum**: value: Define enumeration value within the range: 0-99. The total number is not less than 2 (supported value type: string); when "0" is inputted, one 1 value is supported. Other numbers, beginning with 0 is not supported. It cannot be repeated. It can be changed. Value name: Define corresponding value name for identification and exhibition. Cannot be null, support Chinese, English letters and numbers. Length is 1-10 characters It can be changed. <br> - **Single precision float**, please define value range, step and unit symbol. There are 7 significant digitals.  <br>   - **double precision float**, please define value range, step and unit symbol. There are 14 significant digitals.   <br> - **integer (int32)**, please define value range, step and unit symbol. There is no decimal. <br> <br> **Note**: The max/min value and the step length range shall be in the standard range of this data type. <br> max: Refer to the maximum allowable value and the value can be changed;	 <br> min: Refer to the minimum allowable value and the value can be changed;	 <br> step: Refer to the minimum change granularity of the value and the value can be changed; <br> Unit: Refer to corresponding value unit, with 0-10 characters in length. It can be changed and is optional; <br>unitname: Unit name corresponding to the value, with 0-10 characters in length. It can be changed and is optional. <br> |
|Step| Step customer scenario is as follows: <br> 1. Judge if precision of data reported by a device is normal or not according to the step value and further generate alarm or failure event. <br>  2. For read and write attribute, when the attribute is updated, the update value completed by a user shall be subjected to precision check. The unqualified one cannot be updated.  |
|Unit| Unit corresponding to the value, with 0-10 characters in length. It can be changed and is optional; |
|Unit Name| Unit name corresponding to the value, with 0-10 characters in length. It can be changed and is optional. |


## Service parameter setting is as follows:

| Parameter                  | Description                 |
| :------------------- | :------------------- |
|Service Name  | Define service name, support English letters, numbers, underline "_" and line-through "-", must begin and end with English letters and numbers, and contain 1-30 characters. Required! Unique for a product. Cannot be modified. |
|Service Description | Used to describe service function. No restriction to input character type, length is limited to 0-50 characters Optional! |
|Input Parameter | When this service is defined and called, input parameter must be provided. Parameters can be added and deleted. <br> Click **Add Parameter**, and then add service input parameter in the popped-up dialog box <br> 1. Parameter name: define parameter name. Contain 1-30 characters, support English letters, numbers, underline "_" and line-through "-", must begin and end with English letters and numbers. It cannot be modified. Unique for the service. It is used when remote application calls the service. <br>  2. Parameter Description: Definition of parameter description, 0-50 characters, can be changed. <br>  3. Data Type: Data type of parameter refers to the data type in attribute definition. <br>  4. Data Definition: Value definition of parameter refers to the attribute value definition in attribute definition.|
|Output Parameter | Data outputted by the service after the service is defined and called. Parameters can be added and deleted. <br> Click **Add Parameter**, and then input service output parameter in the popped-up dialog box <br> 1. Parameter name: define parameter name. Contain 1-30 characters, support English letters, numbers, underline "_" and line-through "-", must begin and end with English letters and numbers. It cannot be modified. Unique for the service. It is used when remote application calls the service. <br>  2. Parameter Description: Definition of parameter description, 0-50 characters, can be changed. <br>  3. Data Type: Data type of parameter refers to the data type in attribute definition. <br>  4. Data Definition: Value definition of parameter refers to the attribute value definition in attribute definition.|

## Event parameter setting is as follows:

| Parameter                  | Description                 |
| :------------------- | :------------------- |
|Event Name  | Event name supports English letters, numbers, underline "_" and line-through "-", must begin and end with English letters and numbers, and contains 1-30 characters. Required! Unique for a product. Cannot be modified. |
|Event Type | Define event type. Fixed Type: <br> 1. Alarm: Alarm information. <br> 2. Fault: Fault information.|
|Event Description | It is used to describe event functions. No restriction to input character type, length is limited to 0-50 characters Optional! |
|Output Parameter | One event supports defining 20 output parameters at most. Parameters can be added and deleted. <br> Click **Add Parameter**, and then input service output parameter in the popped-up dialog box <br> 1. Parameter name: define parameter name. Contain 1-30 characters, support English letters, numbers, underline "_" and line-through "-", must begin and end with English letters and numbers. It cannot be modified. Unique under the event <br>  2. Parameter Description: Definition of parameter description, 0-50 characters, can be changed. <br>  3. Data Type: Data type of parameter refers to the data type in attribute definition. <br>  4. Data Definition: Value definition of parameter refers to the attribute value definition in attribute definition.|

