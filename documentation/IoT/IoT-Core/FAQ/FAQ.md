# FAQ

**Q: When a device reports an incident, reporting incident curve on the Data Overview Page still display the value 0. Why?**

A: The incident reporting curve only displays data of yesterday. Those reported now will be displayed tomorrow.
For example, the incident number is 10 corresponding to the coordinate 8:00 on the x-coordinate on the curve of the current page, it means that the sum of all incidents from (7:00 , 8:00] yester is 10.

**Q: After the Thing Model of connection proxy device type is added, the system is provided with a model "Connection Proxy Model". How can I delete the model which I do not require any more?**

A: This model does not support deletion and modification. If the model does not comply with any requirement, you can add a new one in the model list to add other attributes, methods or incidents.

**Q: After the thing type is created for the connection proxy device, there is a communication protocol file tab. Is it required and how do I complete it?**

A: Yes, it is not required.

**Q: Errors are given when the proxy relationship is added for the connection proxy device. How do I check the error?**

A: There are 2 main reasons for such errors, as below:
a) The connection proxy device is offline. Solution: Put the connection agent device online at first and associate it with the connection proxy device.
b) The added indirectly connected device is associated with other connection proxy devices. Solutions: Release the former association relationship of the indirectly connected device and add associate such device with the desired connection proxy device.

**Q: I can see the device attribute value when I open the attribute tab page of the device, but it is not allowed to fill in the expected value column corresponding to the attribute value. What shall I do?**

A: View permission value of this attribute. If the permission is "r", it means that the attribute value is read-only and it is true that modification is not allowed.
For attributes intending to distributing expected values, it needs to set the attribute value as rw or w while creating a Thing Model.

**Q: How to put the indirectly connected device online?**

A：
a) Find the connection proxy device to which the indirectly connected device is attached and put it online
b) Turn on the topology tab of the connection proxy device, add the proxy relationship and associate such indirectly connected device to the connection proxy device
c) Click the **Topology Distribution** button
d) Check status of indirectly connected device and the status turns to online from uninitialized

**Q: Why the device list is null after the button **Add Device** is clicked when the device group is associated with the device?**

A: When the device group is a sub-group, only the device associated with the parent group can be associated. If the parent group is not associated with any device, the list is null when the sub-group is associated with a device.

**Q: Why the device A is not found after the button **Add Device** is clicked when the device group is associated with the device?**

A: When the device group is a sub-group, only the device associated with the parent group can be associated. If the parent group is not associated with the device A, the device A is unavailable in the list when the sub-group is associated with it. Please associate the device A with the parent group and then the sub-group.

**Q: Is the table name for similar SQL sentence fixed while creating rule engines?**

A: No, it is not fixed. For example, select * from aaa where timestamp > 1592289113. For the table name "aaa", any character string can be filled in. During filtering, only the condition part behind where can be referred.

**Q: Does the report number of device while creating rule engines must be exactly the same to the payload contents reported?**

A: No, it doesn't. Report data may be contents of payload or some parameter values in payload

**Q: If I intend to use kafka (or mysql/JCQ) as the rule engine, how can I apply for the kafka (or mysql/JCQ) address?**

A: Log in the kafka Console (or mysql/JCQ Console) via a JD Cloud account and click the **Create** button.
Note: Regions and Virtual Private Clouds for creating kafka and mysql must be consistent with those of the IoT Management Platform instances. For JCQ, only the region option is required to be kept consistent. For specific steps, please refer to the rule engine of the User Manual.

**Q: What is a file list used for and must it be used?**

A: The file can be interpreted as an additional completion option on the page, which is set for facilitating expansion of fields on the additional thing type (or device) page, but is not always used. If the field information in the Added Thing Type Page (or Device Page) of the system is sufficient, it does not need to apply this function.

**Q: What is the thing type device option in the file used for?**

A: If the thing type is selected on the File Creation Page, a thing type field will be provided which is required to be completed. After the file is added and when a device is creating, if the thing type is selected, one file field will be automatically added on the page; If other thing types are selected, no file field will be added.


