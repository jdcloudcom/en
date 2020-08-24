## Deblock (deleteForbiddenInfo)

**API Description**

This configuration is not supported in the acceleration outside China/on a global scale

### Request address

```reStructuredText
POST /v1/forbiddenInfo:delete
```

### Request parameter

| Parameter name            | Type                   | Required or not | Example             | Description                               |
| ----------------- | ---------------------- | -------- | ---------------- | ---------------------------------- |
| forbiddenType               | String                 | Yes       |               | Block type [url,domain]     |
| forbiddenUrl               | String                 | No       | /a.jpg              | Blocked url     |
| forbiddenDomain               | String                 | Yes       |  www.test.com        | Blocked domain    |
| shareCacheDomainFlag               | String                 | No       | "0"             | It is 0 by default, representing whether the URLs of domains sharing the same cache shall be blocked synchronously, 0: no, 1: yes     |
| token               | String                 | No       |               |     |


### Return parameter

| Name          | Type    | Description                                                     |
| ------------- | ------- | -------------------------------------------------------- |
| requestId | String | Request id, the unique identification of each request |
|result|DelForbiddenResp|Deblock result|

### DelForbiddenResp parameter description

| Name          | Type    | Description                                                     |
| ------------- | ------- | -------------------------------------------------------- |
| tasksId        |String  | Deblocked task id                                              |


**Return example**

```json
{
    "requestId": "dea35b36-9682-492d-8db2-e6b5e9a20aa4",

   "result":{ "taskId": "ddddd3093jfejfldfdf"}
}
```
