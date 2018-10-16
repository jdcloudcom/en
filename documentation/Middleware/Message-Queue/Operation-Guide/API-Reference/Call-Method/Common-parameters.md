# Common Parameters

## Common Request Header

| Header Field Name | Field Type | Required or Not | Description                                                         |
| ---------- | -------- | -------- | ------------------------------------------------------------ |
| accessKey  | string   | Required | User Requested accessKey                                          |
| signature  | string   | Required | String obtained by using secretKey to encrypt signSource with **hmac-sha1**, and the rule for generation of signSource is as follows |
| dateTime   | string   | Required | The UTC time issued by this http request is in the format of ISO-8601:2004, for example: 2018-08-14T03:37Z |
