# Object Management

[How to modify the object storage type? ](Object-Management#user-content-1)

[How to modify the Content-Type of an object? ](Object-Management#user-content-2)

[Images uploaded to OSS will be directly downloaded when opening the link on browser, so how can I open the image through browser? ](Object-Management#user-content-3)

[How can I directly download an object from browser instead of preview? ](Object-Management#user-content-4)

[How to (periodically) clear expired objects and expired multipart? ](Object-Management#user-content-5)

------

<div id="user-content-1"></div>

#### How to modify the object storage type?

Standard storage, infrequent access storage, archival storage and reduced redundancy storage are supported by OSS and these storage types can be switched between each other. Users can manually switch storage types of the object via the Console, SDK, and API. The operations are as follows:

1. Log in the Console;
2. In the Bucket List, click **Target Bucket Name** and open the [Object Management] page of this bucket;
3. Select the target object, click **Modify Storage Type** in the operation options behind the object list;
4. Select the storage type you want to modify, and click **OK**.

After the storage type of the object is changed, the storage cost will be calculated as per the unit price of the changed storage type. Modifying the storage type of an object is actually to overwrite the object to a designated storage type. Therefore, if the object to be changed is the type of infrequent access storage or archival storage and the storage is less than the designated number of days, users need to make up the storage costs for the insufficient days. For details, please refer to [Description of Billing Rules](https://docs.jdcloud.com/object-storage-service/billing-rules).

<div id="user-content-2"></div>

#### How to modify the Content-Type of an object?

OSS will match the suffix name of the upload object by default and the Content-Type of the object according to the table of comparisons of object types. If the suffix name of the object isn't in the table of comparisons, it will be set as default `application/octet-stream`.

Users can also designate the Content-Type when uploading the object. After the object is uploaded, users can modify the Content-Type by two ways:

- 1.API/SDK:

Use [Put Object Copy](https://docs.jdcloud.com/object-storage-service/put-object-copy-2) to modify Content-Type;

- 2. Console:

the following steps can be taken:

1. Log in OSS Management Console;
2. Select the target object to be set, select **Manage Metadata** in **Operations** Items, and configure the Content-Type attribute in the popup;
3. Enter the Content-Type and click **OK**.

<div id="user-content-3"></div>

#### Images uploaded to OSS will be directly downloaded when opening the link on browser, so how can I open the image through browser?

Solution:

- Users can designate the Content-Type when uploading objects through API/SDK, for example, designating as: image/png;
- Batch modify the object suffix locally and then upload with a tool;
- After the object is uploaded through the Console, use **Manage Metadata** function of the object to set Content-Type attribute;

<div id="user-content-4"></div>

#### How can I directly download an object from browser instead of preview?

You can set the Content-Disposition parameter value in the customized Headers of the object as attachment with the object's Manage Metadata function on [OSS Console](https://oss-console.jdcloud.com/space). For the Operation Guide of the Console, please refer to [Manage Metadata](https://docs.jdcloud.com/object-storage-service/user-defined-metadata).

You can also enable downloaded objects to pop up in browser by setting the value of the request parameter Content-Disposition in Post Object API as attachment. For the reference document, please refer to [Post Object](https://docs.jdcloud.com/en/object-storage-service/post-object-2).

<div id="user-content-5"></div>

#### How to (periodically) clear expired objects and expired multipart?

You can directly delete an object on OSS Console. For specific operations, please refer to [Delete Object](https://docs.jdcloud.com/object-storage-service/delete-object). You can also [Configure Life Cycle to Periodically Clear Objects](https://docs.jdcloud.com/object-storage-service/delete-object).
