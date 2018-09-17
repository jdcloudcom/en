# createThumbnailTask


## 描述
Create a screenshot task, return the task ID when the creation is successful. This API is used to capture the screen at a specified time.

## 请求方式
POST

## 请求地址
https://mps.jdcloud-api.com/v1/regions/{regionId}/thumbnail

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||region id|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**createdTime**|String|False||Task creation time, format (GMT): yyyy-MM-dd’T’HH:mm:ss.SSS’Z’  (readonly)|
|**errorCode**|Integer|False||Error Code (readonly)|
|**lastUpdatedTime**|String|False||Task creation time, format (GMT): yyyy-MM-dd’T’HH:mm:ss.SSS’Z’  (readonly)|
|**rule**|[ThumbnailTaskRule](##ThumbnailTaskRule)|False|||
|**source**|[ThumbnailTaskSource](##ThumbnailTaskSource)|True|||
|**status**|String|False||Status (SUCCESS, ERROR, PENDDING, RUNNING) (readonly)|
|**target**|[ThumbnailTaskTarget](##ThumbnailTaskTarget)|True|||
|**taskID**|String|False||Task ID (readonly)|

### <a name="ThumbnailTaskRule">ThumbnailTaskRule</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**count**|Integer|False||Number of screenshots, unavailable when mode=single. default:1|
|**endTimeInSecond**|Integer|False||End time of generated screenshot, unavailable when mode=single/average, and it shall not be less than startTimeInSecond. default: -1 (representing video duration)|
|**keyFrame**|Boolean|False||Whether to enable keyframe screenshots. default: true|
|**mode**|String|False||Screenshot mode, single screenshot: single, multiple screenshots: multi, average: average, default: single|
|**startTimeInSecond**|Integer|False||Start time of generated screenshot, unavailable when mode=average. default:0|
### <a name="ThumbnailTaskSource">ThumbnailTaskSource</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**bucket**|String|True||Enter the bucket of Video Information|
|**key**|String|True||Enter the Key of Video Information|
### <a name="ThumbnailTaskTarget">ThumbnailTaskTarget</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**destBucket**|String|True||Enter the bucket that saves target file|
|**destKeyPrefix**|String|False||Prefix of Key of Target Screenshot, 'Prefix-taskID-%04d(num).(format)', default: sourceKey|
|**format**|String|False||Format of Target Screenshot default: jpg|
|**heightInPixel**|Integer|False||The height of the target screenshot shall be output according to the actual resolution if the actual resolution of the video is less than the target resolution. default:  0 means the height of source video. Others [8, 4096]|
|**keys**|String[]|False||Set of Key of Target Screenshot (readonly)|
|**widthInPixel**|Integer|False||The width of the target screenshot shall be output according to the actual resolution if the actual resolution of the video is less than the target resolution. default: 0 means the height of source video. Others [8, 4096]|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**thumbnailTaskID**|[ThumbnailTaskID](##ThumbnailTaskID)||
### <a name="ThumbnailTaskID">ThumbnailTaskID</a>
|名称|类型|描述|
|---|---|---|
|**taskID**|String||

## 返回码
|返回码|描述|
|---|---|
|**200**|Successful|
