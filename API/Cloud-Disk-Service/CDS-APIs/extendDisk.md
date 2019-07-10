# extendDisk

## Description

Expand Cloud Disk to specified size

Cloud Disk must be in available status

## HTTP Request

POST <https://disk.jcloudcs.com/v1/regions/{regionId}/disks/{diskId}:extend>

## Request parameter

### Path Parameter

| Param | Type | Required | Desc |
|---|---|---|---|
| regionId | string | Yes | Region ID |
| diskId | string | Yes | Cloud Disk D |

### Request Body

```json
{
    "diskSizeGB": int,
    "iops": int
}
```

- Detail

| Param | Type | Required | Desc |
|---|---|---|---|
| diskSizeGB | int | Yes | Size of expanded Cloud Disk, unit: GiB |
| iops       | int | No  | Modified iops value, only valid to the ssd.io1 type cloud disk. |

## Successful Response

```json
{
    "requestId": string
}
```

- Error Code

| Code | Status | Message |
|---|---|---|
| 400 | INVALID_ARGUMENT | Parameter diskSizeGB missing |
| 400 | INVALID_ARGUMENT | Malformed disk id 'xxx' |
| 400 | INVALID_ARGUMENT | Invalid region 'xxx' |
| 400 | INVALID_ARGUMENT | Invalid diskSizeGB 'xxx' |
| 400 | INVALID_ARGUMENT | Invalid iops number for ssd.io1 |
| 400 | FAILED_PRECONDITION | Invalid disk status 'xxx' |
| 404 | NOT_FOUND | Disk 'xxx' not found |
| 500 | INTERNAL | Internal server error |
| 500 | UNKNOWN | Unknown server error |
| 503 | SERVICE UNAVAILABLE | Service unavailable |
