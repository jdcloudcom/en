# APIs of CFS


## Introduction
APIs of CFS (Cloud-File-Service) contain relevant interfaces of file services.


### Version
v1.0.1


## API
|Interface Name|Request Method|Function Description|
|---|---|---|
|**createFileSystem**|POST|- Create a new file system and assign this file system an Id<br>|
|**createMountTarget**|POST|- Create an attached target for a file system. Through this attached target, you can attach a file system to VM instances. <br>- Create a new attached target and assign this attached target an Id<br>|
|**deleteFileSystem**|DELETE|-   Delete a file system. Once deleted, this file system will not exist and any contents in the deleted file system cannot be accessed. <br>|
|**deleteMountTarget**|DELETE|-   Relevant network interfaces will be deleted while the attached target is deleted. <br>|
|**describeFileSystem**|GET|Search file system details|
|**describeFileSystems**|GET|-   Search file system list. <br>-   Logic and (AND) are among multiple filter conditions of filters and logic and (OR) are multiple values inside each condition<br>|
|**describeMountTarget**|GET|Search attached target details|
|**describeMountTargets**|GET|-   Search attached target list. <br>|
|**modifyFileSystemAttribute**|PATCH|Modify file system attributes (name or description must be designated)|
