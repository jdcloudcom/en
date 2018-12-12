# Operation Instructions

**Environment Preparation**

​	Before you call the open API of JD Cloud, please apply for the key of accesskey and secretKey (AK/SK for short) in the AccessKey management page under the user center account management of JD Cloud. Please properly keep your AK/SK information. If lost, your cloud resources may be operated by illegal users with this information, and you may suffer data and property loss.

​	The KMS Key Management Service is provided in the form of openAPI externally. In case of accessing different Regions, different domain names are required. Different Endpoints are required for Intranet access and Internet access to the same Region; the Internet refers to the domain name used for KMS service access via the Internet and such access will consume some traffic; and the Intranet Endpoint refers to the domain name used for internal access by JD Cloud VPC.

The Endpoint corresponding to each Region is as shown in the table below:

| Region      | Public Network Endpoint                   | Intranet EndPoint                            |
| --------- | ------------------------------ | --------------------------------------- |
| cn-north-1 | kms.cn-north-1.jdcloud-api.com | kms.internal.cn-north-1.jdcloud-api.com |
| cn-east-2 | kms.cn-east-2.jdcloud-api.com  | kms.internal.cn-east-2.jdcloud-api.com  |
| cn-east-1 | kms.cn-east-1.jdcloud-api.com  | kms.internal.cn-east-1.jdcloud-api.com  |
| cn-south-1 | kms.cn-south-1.jdcloud-api.com | kms.internal.cn-south-1.jdcloud-api.com |

**Use of openAPI of JD Cloud**

Addresses of openAPI of JD Cloud are as shown in the table below:

| Development Language | Github Address                                        |
| -------- | ------------------------------------------------- |
| Golang   | https://github.com/jdcloud-api/jdcloud-sdk-go     |
| Java     | https://github.com/jdcloud-api/jdcloud-sdk-java   |
| .net     | https://github.com/jdcloud-api/jdcloud-sdk-net    |
| python   | https://github.com/jdcloud-api/jdcloud-sdk-python |
| php      | https://github.com/jdcloud-api/jdcloud-sdk-php    |
| nodejs   | https://github.com/jdcloud-api/jdcloud-sdk-nodejs |


**Code Example**

```
package main

import (
    "encoding/base64"
    "fmt"
    core "github.com/jdcloud-api/jdcloud-sdk-go/core"
    kms "github.com/jdcloud-api/jdcloud-sdk-go/services/kms/apis"
    client "github.com/jdcloud-api/jdcloud-sdk-go/services/kms/client"
    models "github.com/jdcloud-api/jdcloud-sdk-go/services/kms/models"
    "time"
)

func main() {
    /** Set Credentials Object **/
    accessKey := "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"
    secretKey := "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"
    credentials := core.NewCredentials(accessKey, secretKey)

    /** Set Config Object **/
    config := core.NewConfig()
    config.SetEndpoint("apigw-test.openapi.jdcloud.com")
    config.SetScheme("http")

    /** Set Client Object **/
    client := client.NewKmsClient(credentials)
    client.SetConfig(config)

    /** Make base64 coding to data to be encrypted **/
    data := base64.StdEncoding.EncodeToString("Hello World.")

    /** Set key ID for encryption **/
    keyId = "aabbccddeeffgghh"

    /** Create encryption request **/
    reqEnc := kms.NewEncryptRequest(keyId)
    reqEnc.SetPlaintext(reqEnc)

    /** Send encryption request **/
    if resp, err := client.Encrypt(reqEnc); err != nil {
        /** TODO: error **/
    } else {
        /** we get resp.Result.CiphertextBlob **/
        fmt.Println("Cipher: ", resp.Result.CiphertextBlob)
    }
}

```
