# Video Quality Detection


## Introduction
Video quality detection related APIs


### Version
v1


## API
|Interface Name|Request Method|Function Description|
|---|---|---|
|**batchDeleteVqdTasks**|POST|Delete video quality detection tasks in batches. When deleting a task, the data, such as the task performance result, relevant to the task shall be simultaneously deleted. A maximum of 50 entries can be deleted at a time|
|**batchSubmitVqdTasks**|POST|Submit video quality inspection tasks in batches, and at a time, a maximum of 50 input medias can be submitted|
|**createVqdTemplate**|POST|Create video quality detection templates|
|**deleteVqdTask**|DELETE|Delete video quality detection tasks. When deleting a task, the data, such as the task performance result, relevant to the task shall be simultaneously deleted|
|**deleteVqdTemplate**|DELETE|Delete video quality detection templates|
|**getVqdTask**|GET|Obtain details of video quality detection tasks|
|**getVqdTemplate**|GET|Search video quality detection templates|
|**listVqdTasks**|GET|Search of video quality detection task list <br>supports filtering search: <br>  \- createTime,ge the earliest task creation time<br>  \- createTime,le the latest creation time<br>  \- status,in task status<br>|
|**listVqdTemplates**|GET|Search the list of video quality detection templates. <br>Support filtering search:<br>  \- templateId,eq exactly match template ID (not required)<br>|
|**queryCallback**|GET|Search callback configuration|
|**queryVqdTaskResult**|GET|Search the results of video quality detection tasks|
|**setCallback**|POST|Set callback configuration|
|**submitVqdTask**|POST|Submit video quality detection tasks|
|**updateVqdTemplate**|PUT|Modify video quality detection templates|
