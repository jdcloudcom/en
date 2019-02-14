# Common Parameters

## Common Request Header

| Header Field Name | Field Type | Required or Not | Description                                                         |
| ---------- | -------- | -------- | ------------------------------------------------------------ |
| accessKey  | string   | Required | User Requested accessKey                                          |
| signature  | string   | Required | The character string can be obtained by applying **hmac-sha1** encryption to signSource via secretKey. For signature generation rules, please refer to the “Calling Method-Signature Algorithm” section |
| dateTime   | string   | Required | The UTC time issued by this http request is in the format of ISO-8601:2004, for example: 2018-08-14T03:37:00Z |
