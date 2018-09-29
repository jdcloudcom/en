# Media Processing API


## Introduction
Media Processing API


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**countImageStyle**|GET|Total Number of Image Styles|
|**createImageStyle**|POST|Add Image Style|
|**createThumbnailTask**|POST|Create a screenshot task, return the task ID when the creation is successful. This API is used to capture the screen at a specified time.|
|**deleteImageStyle**|DELETE|Delete Image Style|
|**getImageStyle**|GET|Image Style Details|
|**getNotification**|GET|Acquire Screenshot Notification|
|**getThumbnailTask**|GET|Acquire the screenshot task based on the task ID.|
|**listImageStyle**|GET|Image Style List|
|**listThumbnailTask**|GET|Query the screenshot task and return the task list that meets the query criteria.|
|**setNotification**|PUT|Set the media processing notification. Endpoint will be verified when setting the Notification, and SubscriptionConfirmation(x\-jdcloud\-message\-type head) will be sent to the endpoint, which requests base64 encoding for the Message content that are then to be returned to the system (body) for verification.|
|**updateImageStyle**|PUT|Modify Image Style|
