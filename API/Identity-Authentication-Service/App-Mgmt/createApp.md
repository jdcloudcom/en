## Description
Create Application

## Restriction
Support creation of at most 20 applications per account

## Request Method
POST

## Request Address
https://ias.jdcloud-api.com/v1/regions/{regionId}/app

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |For region code, please refer to common declaration of OpenAPI|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**clientName**|String|True| |Application Name|
|**redirectUris**|String|True| |There are at most 4 callback addresses, with urls separated with the comma “,”. The length of each url is not greater than 1000, and the character “#” is not supported by the url.|
|**grantTypes**|String|True| |OAuth types supported:<br/>authorization_code: OAuth2 authorization code mode<br/>implicit: OAuth2 implicit authorization mode<br/>refresh_token: start and refresh tokens<br/><br/>Support values below:<br/>(1)authorization_code<br/>(2)authorization_code, refresh_token<br/>(3)authorization_code, implicit<br/>(4)authorization_code, implicit, refresh_token<br/>(5)implicit<br/><br/>Note: If refresh_token is specified by grantTypes, the token refreshed can be used by the application; if refresh_token is not specified, the application cannot use the token refreshed; and at any time, the application shall be able to call the “Update Application” interface to change the grantTypes setting.|
|**tokenEndpointAuthMethod**|String|True| |Client verification mode:<br/>none: No client password is set (not recommended)<br/>client_secret_post: The password must be set for the client and such password shall be provided to the requesting body on OAuth2 Token Endpoint<br/>client_secret_basic: The client must set the password, and the password shall be provided to the requesting header on OAuth2 Token Endpoint<br/><br/>The following values are supported:<br/>(1)none<br/>(2)client_secret_post<br/>(3)client_secret_basic|
|**secret**|String|False| |The application password supports 8-255 printable ASCII characters. The parameter policy with sufficient complexity is recommended for use<br/><br/>Note: When TokenEndpointAuthMethod is not equal to none, secret is the required parameter; otherwise, if secret is specified, TokenEndpointAuthMethod cannot be equal to none<br/>As JD Cloud will irreversibly encrypt secret, you cannot view this password via JD Cloud, but you can reset the password by updating the application at any time.secret|
|**accessTokenValiditySeconds**|Integer|True| |The token accessing validity period is ranging from 600 seconds to 6x3600=21,600 seconds, i.e. 10 minutes to 6 hours.|
|**refreshTokenValiditySeconds**|Integer|False| |Refresh token validity period, with the value ranging from 30x24x3600=2,592,000 seconds to 365x24x3600=31,536,000 seconds, i.e. 30 days to 365 days<br/><br/>Note: When GrantTypes comprises refresh_token, refreshTokenValiditySeconds is the required parameter.|
|**multiTenant**|Boolean|False|false|Is it the multi-tenant application<br/>false: The application only supports the tenant access of the application created currently, while other tenant of JD Cloud cannot access such application<br/>true: This application only supports access by other tenants of JD Cloud rather than the tenant of the application created currently.|
|**userType**|String|True| |Supported account types which are accessible to applications are as follows:<br/>(1) root: Primary account access is supported, while the sub-user access is not supported<br/>(2) sub: The sub-user account cannot be accessed with a primary account<br/><br/>Note: The combination of multiTenant and userType specify the application user group and the typical application scenarios are as follows:<br/>(1)The application is opened to sub-users under the current tenant; (2) The application is opened to primary accounts of other tenants of JD Cloud.|
|**scope**|String|False| |The supported value of OAuth scope is as follows:<br/>(1) openid: Carry out identity verification with the OpenID Connect protocol.<br/>Specify scope as openid and request scope in Authorization Endpoint, and then JD Cloud will return the user’s OpenID tokens; if such value is not specified at the time of creation, the applicable is unable to request the OpenID tokens; and such setting can be changed whenever by the application by calling “Update Application”.|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result|Returned Results|

### Result
|Name|Type|Description|
|---|---|---|
|**account**|String|Create Application Account User Name|
|**clientId**|String|Application ID, to be Assigned by JD Cloud|
|**clientName**|String|clientName|
|**redirectUris**|String|redirectUris|
|**grantTypes**|String|grantTypes|
|**tokenEndpointAuthMethod**|String|tokenEndpointAuthMethod|
|**accessTokenValiditySeconds**|Integer|accessTokenValiditySeconds|
|**refreshTokenValiditySeconds**|Integer|refreshTokenValiditySeconds|
|**multiTenant**|Boolean|multiTenant|
|**userType**|String|userType|
|**scope**|String|scope|
|**secretUpdateTime**|Integer|Update Time Stamp of secret|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
