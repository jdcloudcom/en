# Common Parameters

## Common Request Header

| Header field name | Field type | Required or not | Description                                                         |
| ---------- | -------- | -------- | ------------------------------------------------------------ |
| accessKey  | string   | Required | User requested accessKey                                          |
| signature  | string   | Required | String obtained by using secretKey to encrypt signSource with **hmac-sha1**, and the rule for generation of signSource is as follows |
| dateTime   | string   | Required | The UTC time issued by this http request is in the format of ISO-8601:2004, for example: 2018-08-14T03:37Z |
