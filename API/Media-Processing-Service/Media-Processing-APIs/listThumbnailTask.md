# listThumbnailTask


## Description
Query the screenshot task and return the task list that meets the query criteria.

## Request method
GET

## Request address
https://mps.jdcloud-api.com/v1/regions/{regionId}/thumbnail

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |region id|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**begin**|String|False| |Start Time, Time Format(GMT): yyyy-MM-dd'T'HH:mm:ss.SSS'Z'|
|**end**|String|False| |End Time, Time Format(GMT): yyyy-MM-dd'T'HH:mm:ss.SSS'Z'|
|**limit**|Integer|False|1000|Number of Query Records [1, 1000]|
|**marker**|String|False| |Query Tag|
|**status**|String|False| |Task Status (PENDING, RUNNING, SUCCESS, FAILED)|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**thumbnailQuery**|ThumbnailQuery| |
### ThumbnailQuery
|Name|Type|Description|
|---|---|---|
|**begin**|String|Query start time, format (GMT): yyyy-MM-dd’T’HH:mm:ss.SSS’Z’|
|**end**|String|Query End Time, Time Format (GMT): yyyy-MM-dd’T’HH:mm:ss.SSS’Z’|
|**limit**|Integer|The maximum number of elements in the task list returned by this request, valid value: [1-1000], default: 1000|
|**marker**|String|Marker of this request, starting position of tag query, taskID here|
|**nextMarker**|String|Get the marker value to be passed on the next page (taskID here), only when isTruncated is true (data not all returned), it appears (readonly)|
|**status**|String|Status (SUCCESS, ERROR, PENDDING, RUNNING)|
|**taskList**|ThumbnailTask[]|Returned Task List (readonly)|
|**truncated**|Boolean|Indicate whether the returned data is truncated. true means there is data behind the page, that is, the data is not all returned; false means that this is the last page, that is, the data has all been returned (readonly)|
### ThumbnailTask
|Name|Type|Description|
|---|---|---|
|**createdTime**|String|Task Creation Time, Format (GMT): yyyy-MM-dd’T’HH:mm:ss.SSS’Z’  (readonly)|
|**errorCode**|Integer|Error Code (readonly)|
|**lastUpdatedTime**|String|Task Creation Time, Format (GMT): yyyy-MM-dd’T’HH:mm:ss.SSS’Z’  (readonly)|
|**rule**|ThumbnailTaskRule| |
|**source**|ThumbnailTaskSource| |
|**status**|String|Status (SUCCESS, ERROR, PENDDING, RUNNING) (readonly)|
|**target**|ThumbnailTaskTarget| |
|**taskID**|String|Task ID (readonly)|
### ThumbnailTaskRule
|Name|Type|Description|
|---|---|---|
|**count**|Integer|Number of screenshots, unavailable when mode=single. Default:1|
|**endTimeInSecond**|Integer|End time of generated screenshot, unavailable when mode=single/average, and it shall not be less than startTimeInSecond. Default: -1 (representing video duration)|
|**keyFrame**|Boolean|Whether to enable keyframe screenshots. Default: true|
|**mode**|String|Screenshot mode, single screenshot: single, multiple screenshots: multi, average: average, default: single|
|**startTimeInSecond**|Integer|Start time of generated screenshot, unavailable when mode=average. Default:0|
### ThumbnailTaskSource
|Name|Type|Description|
|---|---|---|
|**bucket**|String|Enter the Bucket of Video Information|
|**key**|String|Enter the Key of Video Information|
### ThumbnailTaskTarget
|Name|Type|Description|
|---|---|---|
|**destBucket**|String|Enter the bucket that saves target file|
|**destKeyPrefix**|String|Prefix of Key of Target Screenshot, 'Prefix-taskID-%04d(num).(format)', default: sourceKey|
|**format**|String|Format of Target Screenshot default: jpg|
|**heightInPixel**|Integer|The height of the target screenshot shall be output according to the actual resolution if the actual resolution of the video is less than the target resolution. Default:  0 means the height of source video. Others [8, 4096]|
|**keys**|String[]|Set of Key of Target Screenshot (readonly)|
|**widthInPixel**|Integer|The width of the target screenshot shall be output according to the actual resolution if the actual resolution of the video is less than the target resolution. Default: 0 means the height of source video. Others [8, 4096]|

## Response code
|Return code|Description|
|---|---|
|**200**|Successful|
