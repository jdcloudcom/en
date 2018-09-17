# Media Processing API


## 简介
Media Processing Related Interface


### 版本
v1


## API
|接口名称|请求方式|功能描述|
|---|---|---|
|**createThumbnailTask**|POST|Create a screenshot task, return the task ID when the creation is successful. This API is used to capture the screen at a specified time.|
|**getNotification**|GET|Acquire Screenshot Notification|
|**getThumbnailTask**|GET|Acquire the screenshot task based on the task ID.|
|**listThumbnailTask**|GET|Query the screenshot task and return the task list that meets the query criteria.|
|**setNotification**|PUT|Set the media processing notification. Endpoint will be verified when setting the Notification, and SubscriptionConfirmation(x\-jdcloud\-message\-type head) will be sent to the endpoint, which requests base64 encoding for the Message content that are then to be returned to the system (body) for verification.|
