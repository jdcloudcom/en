# Video-on-Demand


## Introduction
Related VOD APIs


### Version
v1


## API
|Interface Name|Request Method|Function Description|
|---|---|---|
|**batchDeleteVideos**|POST|If the API of deleting video in batches is called, all information related to the appointed video will be deleted at the same time, including transcode task information, transcode streaming data, etc. Meanwhile, relevant file resources in the Cloud Storage will be cleared.|
|**batchSubmitTranscodeJobs**|POST|Submit transcode jobs in batches|
|**batchUpdateVideos**|POST|Modify video information in batches|
|**createCategory**|POST|Add category|
|**createDomain**|POST|Add domain|
|**createImageUploadTask**|POST|Get image uploading address and credential|
|**createTranscodeTemplate**|POST|Create transcode template|
|**createVideoUploadTask**|POST|Get video uploading address and credential|
|**createWatermark**|POST|Add watermarks|
|**deleteCategory**|DELETE|Delete category|
|**deleteDomain**|DELETE|Before deleting a domain, please confirm such domain is out of service.|
|**deleteHeader**|POST|Delete domain access header parameter|
|**deleteNotifyConfigs**|DELETE|Delete callback configuration|
|**deleteTranscodeTemplate**|DELETE|Delete transcode template|
|**deleteVideo**|DELETE|If the API of deleting video is called, all information related to the appointed video will be deleted at the same time, including transcode task information, transcode streaming data, etc. Meanwhile, relevant file resources in the Cloud Storage will be cleared.|
|**deleteVideoStreams**|POST|Delete video transcode flow|
|**deleteWatermark**|DELETE|Delete watermark|
|**disableDomain**|POST|Disable domain|
|**enableDomain**|POST|Enable domain|
|**getCategory**|GET|Search category|
|**getCategoryWithChildren**|GET|Search category and its sub-category. If the appointed category ID is 0, one root category and its sub-category (i.e., level I category) will be returned.|
|**getDomain**|GET|Search domain|
|**getIPRule**|GET|Search configuration of CDN domain IP blacklist rule|
|**getRefererRule**|GET|Search configuration of CDN domain Referer anti-leech rule|
|**getTranscodeTemplate**|GET|Search transcode template|
|**getURLRule**|GET|Search configuration of CDN domain URL authentication rule|
|**getVideo**|GET|Search information of a single video|
|**getVideoPlayInfo**|GET|Get video playing information|
|**getWatermark**|GET|Search watermark|
|**listAllCategories**|GET|Search all categories|
|**listCategories**|GET|Search category list in the paging form and return category list information<br>|
|**listDomains**|GET|Search domain list|
|**listHeaders**|GET|Search domain access header parameter list|
|**listTranscodeTemplates**|GET|Search transcode template list. <br>Search by filtering conditions is allowed and the supported filter fields are as follows:<br>  \- source[eq] precise search by template source<br>  \- templateType[eq] precise search by template type<br>|
|**listVideos**|GET|Search video list information. <br>Search by filtering conditions is allowed and the supported filter fields are as follows:<br>  \- status[eq] precise search by video status<br>  \- categoryId[eq] precise search by category ID<br>  \- videoId[eq] precise search by video ID<br>  \- name[eq] precise search by video name<br>|
|**listWatermarks**|GET|Search watermark list|
|**refreshVideoUploadTask**|GET|Refresh video uploading address and credential|
|**setDefaultDomain**|POST|Set as the default domain|
|**setHeader**|POST|Set domain access header parameter|
|**setIPRule**|POST|Set CDN domain IP blacklist rule|
|**setRefererRule**|POST|Set CDN domain Referer anti-leech rule|
|**setURLRule**|POST|Set CDN domain URL authentication rule|
|**submitTranscodeJob**|POST|Submit transcode job|
|**updateCategory**|PUT|Modify category|
|**updateTranscodeTemplate**|PUT|Modify transcode template|
|**updateVideo**|PUT|Modify video information|
|**updateWatermark**|PUT|Modify watermark|
