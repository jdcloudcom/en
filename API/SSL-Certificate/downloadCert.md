# downloadCert


## Description
Certificate Download<br>Sensitive operation, <a href="https://docs.jdcloud.com/en/security-operation-protection/operation-protection">MFA Operation Protection can be enabled</a>

## Request Method
POST

## Request Address
https://ssl.jdcloud-api.com/v1/sslCert/:download

## Request Parameter
| Name       | Type   | Required or Not | Default Value | Description                                                |
| ---------- | ------ | -------- | ------ | --------------------------------------------------- |
| **certId** | String | True     |        | Certificate Id, separate multiple Ids with comma                           |
| **serverType** | String | True     |        | Server Type of Certificate Application (Nginx Apache Tomcat IIS Other) |


## Return Parameter
| Name          | Type   | Description         |
| ------------- | ------ | ------------ |
| **result**    | Result |              |
| **requestId** | String | Requested Identifier Id |

### Result
| Name         | Type               | Description |
| ------------ | ------------------ | ---- |
| **certDesc** | DownloadCertDesc[] |      |
### DownloadCertDesc
| Name                 | Type   | Description                                   |
| -------------------- | ------ | -------------------------------------- |
| **certId**           | String | Certificate Id                                 |
| **certName**         | String | Certificate Name                               |
| **keyFile**          | String | Private Key                                   |
| **certFile**         | String | Certificate                                   |
| **digest**           | String | Abstract information of private key file calculated with sha256 algorithm |
| **caCertFile**           | String | Intermediate Certificate                               |
| **serverType**           | String | Server Type of Certificate Application                     |
| **certEncryptePassword** | String | Certificate Encryption Password                           |
| **commonName**           | String | Domain                                   |

## Return Code
| Return Code  | Description                  |
| ------- | --------------------- |
| **200** | OK                    |
| **400** | Invalid parameter     |
| **401** | Authentication failed |
| **404** | Not found             |
| **500** | Internal server error |
| **503** | Service unavailable   |
