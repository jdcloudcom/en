# Create a new folder

Object Storage Service of JD Cloud has no concept of folder, and all elements are stored as objects. The folder in the Object Storage Service console essentially is to create an object with size of 0 and ending with "/" for categorization action of similar files; at the same time, by default, the console will display objects that end in "/" as folders. The object can also be uploaded and downloaded. In the Object Storage Service console, users can use object storage folder using the same basic action as that of the windows folder.

Note: For any object ending in "/", whether or not such object contains data, it is displayed as a folder in the console, and the user can only download the object through API or SDK.

The specific action steps for creating new folders are as follows:

1. Enter Object Storage Service console and then space management; click any Bucket in the space list and click Object management; enter Object management page and click to create a new folder.
![新建文件夹](../../../../../image/Object-Storage-Service/OSS-043.png)

2. In the new folder dialog box that pops up, enter the folder name according to the naming rules for the notification copywriting, and click OK to complete the creation:
![完成创建](../../../../../image/Object-Storage-Service/OSS-044.png)
