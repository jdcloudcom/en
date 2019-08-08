# Access Authorization of API

Access Authorization of API provides two modes of "no authentication" and "authorized access".

"The "no authentication" mode means that it can be authorized by verification when API Gateway receives anonymous request. The "authorized access" mode means the process that the API provider authorizes the application to the API caller, the authorization process can be divided into two parts:
#### (1) The API caller creates and provides the key. Key represents the identity of the requester.
#### (2) The API provider authorizes APIs to the API caller in groups for use.
When the API provider's customer or the provider itself needs to test the calling API, it is required to create a key as the requester identity, and then the API provider authorizes the API group to the API caller in the "Access Authorization" module.
In which, the authorized access mode supports three authorization types, including subscription key, API Gateway signature and JD Cloud user signature.

## The introduction of three authorization types is a follows:

### (1) Subscription Key

JD Cloud API Gateway supports the authorization type of subscription keys. The user can achieve the authorized access of API by passing subscription key (jdcloud-apim-subscription-key) in header, in addition to accessing API by selecting and using SDK. Carrying out authorized access with subscription keys has a low cost and is convenient and rapid, and at the same time can guarantee security to a certain extent. Thus, it is quite suitable for the users who expect rapid API calling.
See [Subscription Key](https://docs.jdcloud.com/en/api-gateway/subscription-key?SOP=JDCloud) for details.

### (2) API Gateway Signature Key

JD Cloud API Gateway supports the authorization type of subscription key. API Gateway adopts a special signature algorithm for the authorization type and thus has high security, and after such authorization, the user can use SDK to call API.
See [Signature Key](https://docs.jdcloud.com/en/api-gateway/signature-key?SOP=JDCloud) for details.

### (3) Access Key of JD Cloud User Signature

JD Cloud API Gateway supports the authorization types of JD Cloud user signatures, the key of the authorization type originates from the Access Key created by the user in account management of JD Cloud, and after such authorization the user can use SDK to call API. API Gateway can check its backend signature.
See [Access Key of JD Cloud User Signature](https://docs.jdcloud.com/en/api-gateway/jd-cloud-user-signature?SOP=JDCloud) for details.
 

 








  
