# batchSubmitQualityDetectionJobs


## Description
Submit Quality Control Jobs in Batches

## Request Method
POST

## Request Address
https://vod.jdcloud-api.com/v1/qualityDetectionJobs:batchSubmit


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**bulkItems**|SubmitQualityDetectionJobRequestObject[]|False| | |

### SubmitQualityDetectionJobRequestObject
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**mediaId**|String|False| |Media Source ID|
|**templateIds**|Long[]|False| |List of Quality Control Template ID|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**500**|Internal server error|
|**503**|Service unavailable|

## Request Example
POST
```
https://vod.jdcloud-api.com/v1/qualityDetectionJobs:batchSubmit

```
```
{
    "bulkItems": [
        {
            "mediaId": "343a6194-85ea-49bd-8b43-df1c654f5d79", 
            "templateIds": [
                10001, 
                10002
            ]
        }
    ]
}
```

## Return Example
```
{
    "code": 200, 
    "requestId": "d2e394ff-f7ff-42b5-8544-8866f999507e"
}
```
