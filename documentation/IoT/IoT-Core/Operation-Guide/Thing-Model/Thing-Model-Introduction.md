# Product Thing Model Introduction

If Thing Model is defined in IoT Core, product functions are defined. Thing Model is the digital manifestation of real world things in the virtual world. Thing Model defines what a kind of things is, what attribute these things have, what purpose they are used for, and what functional services they can provide. After completing features definition, the system will automatically generate Thing Model of the product. Services can be provided by Thing Model description product. Thing Model divides production functions into three classes: attribute, service and event.


| Thing Model Definition                  | Description                 |
| :------------------- | :------------------- |
|Thing Model Information  | Basic Information of Thing Model |
|Thing Information  | Basic information of thing is the fixed field of system. |
|Standard Status  | The standard status of digital thing on the IoT platform. Comprise on-line status and activated status only.|
|Attribute  | Describe the real attribute and status of thing. It is divided into two attributes of read-only attribute and read-write attribute, and supports reading and setting (read-write attribute). |
|Service  | A series of instructions and methods that can be called by the external (Hub/Application). Compared with attribute setting, a service can provide more complex business logics. For example, execute a task. | 
|Event  | It refers to the information reported by the thing itself, including many messages that need to be perceived and processed in time, such as warning information and fault information.| 



## Terminology Interpretation

| Name                  | Definition                 |
| :------------------- | :------------------- |
|Thing  | Things existing in the real world. Speaking more broadly, things existing in the real/virtual world. |
|Thing Model  | It is the digital manifestation of thing in the virtual world. Thing Model defines what a kind of things is, what attribute these things have, what purpose they are used for, and what functional services they can provide. |
|Product  | It refers to a group of device set with same functions. Each product has a unique global ProductKey. Massive devices can be created under each product.|
|Thing Shadow  | Thing Shadow is a Json document, mainly used to store the attribute values currently reported by the thing and the attribute values sent to device under the user’s expectation. Each thing has one and only one Thing Shadow. Thing Shadow corresponds to all the read-write attributes defined in Thing Model |
|Data Type  | At present, the data types that can be defined in Thing Model are: string, bool, float, int32, double, enum | 
|Read-write Attribute  | The definition of facing to the user refers to whether the field value can be read and wrote by the user.| 
|Unique under Thing Model  | It refers to the definition is unique in the Thing Mode, and the same name is not allowed.| 
