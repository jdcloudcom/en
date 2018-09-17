# getThumbnailTask


## 描述
Acquire the screenshot task based on the task ID.

## 请求方式
GET

## 请求地址
https://mps.jdcloud-api.com/v1/regions/{regionId}/thumbnail/{taskId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||region id|
|**taskId**|String|True||task id|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**thumbnailTask**|[ThumbnailTask](##ThumbnailTask)||
### <a name="ThumbnailTask">ThumbnailTask</a>
|名称|类型|描述|
|---|---|---|
|**createdTime**|String|Task creation time, format (GMT): yyyy-MM-dd’T’HH:mm:ss.SSS’Z’  (readonly)|
|**errorCode**|Integer|Error Code (readonly)|
|**lastUpdatedTime**|String|Task creation time, format (GMT): yyyy-MM-dd’T’HH:mm:ss.SSS’Z’  (readonly)|
|**rule**|[ThumbnailTaskRule](##ThumbnailTaskRule)||
|**source**|[ThumbnailTaskSource](##ThumbnailTaskSource)||
|**status**|String|Status (SUCCESS, ERROR, PENDDING, RUNNING) (readonly)|
|**target**|[ThumbnailTaskTarget](##ThumbnailTaskTarget)||
|**taskID**|String|Task ID (readonly)|
### <a name="ThumbnailTaskRule">ThumbnailTaskRule</a>
|名称|类型|描述|
|---|---|---|
|**count**|Integer|Number of screenshots, unavailable when mode=single. default:1|
|**endTimeInSecond**|Integer|End time of generated screenshot, unavailable when mode=single/average, and it shall not be less than startTimeInSecond. default: -1 (representing video duration)|
|**keyFrame**|Boolean|Whether to enable keyframe screenshots. default: true|
|**mode**|String|Screenshot mode, single screenshot: single, multiple screenshots: multi, average: average, default: single|
|**startTimeInSecond**|Integer|Start time of generated screenshot, unavailable when mode=average. default:0|
### <a name="ThumbnailTaskSource">ThumbnailTaskSource</a>
|名称|类型|描述|
|---|---|---|
|**bucket**|String|Enter the bucket of Video Information|
|**key**|String|Enter the Key of Video Information|
### <a name="ThumbnailTaskTarget">ThumbnailTaskTarget</a>
|名称|类型|描述|
|---|---|---|
|**destBucket**|String|Enter the bucket that saves target file|
|**destKeyPrefix**|String|Prefix of Key of Target Screenshot, 'Prefix-taskID-%04d(num).(format)', default: sourceKey|
|**format**|String|Format of Target Screenshot default: jpg|
|**heightInPixel**|Integer|The height of the target screenshot shall be output according to the actual resolution if the actual resolution of the video is less than the target resolution. default:  0 means the height of source video. Others [8, 4096]|
|**keys**|String[]|Set of Key of Target Screenshot (readonly)|
|**widthInPixel**|Integer|The width of the target screenshot shall be output according to the actual resolution if the actual resolution of the video is less than the target resolution. default: 0 means the height of source video. Others [8, 4096]|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
