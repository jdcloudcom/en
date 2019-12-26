# Parameter Description

Method Name: genShorturlFromCloud

| Parameter Name      | Description                   | Example                                                         |
| ----------- | ---------------------- | ------------------------------------------------------------ |
| domain      | Generate host of short URL       | w.3.cn/xxxxxxxx                                              |
| length      | Short code length               | w.3.cn/xxxxxxxx short code length is 8                                  |
| realUrl     | Authentic original long link         | http://www.baidu.com?type=abc123, the total length of the long link need to exceed 20 characters |
| expiredDays | The expiration time is positively related to the length | 8 digits by default, the longest period of validity is 100 days, you can enter a value <=100                    |

##### Introductions to length and maximum period of validity

Currently, short codes with different digits have different restrictions of the maximum period of validity

| Length | Maximum period of validity  Unit (day) |
| ---- | ---------------------- |
| 8    | 100                    |
| 9    | 365                    |
|      |                        |

The maximum period of validity means the longest period of validity that can be set by the current short code length. The enter value must be less than or equal to the maximum period of validity. For example for an 8-digit short code, the period of validity ranges from 0-100 with 9 digits among 0-365

##### Particular interpretation of the period of validity with 0:

Entering **0** will automatically obtain the maximum period of validity and automatically renew as long as there is access within the period of validity. For example: for an 8-digit short code with a period of validity of 100 days and a parameter thereof is **0**, if the generated short URL has access on the 50th day, it will automatically renew the period of validity to 100 days, and then the total period thereof will be 100 days again. In case of any further access, it will continue this process.

