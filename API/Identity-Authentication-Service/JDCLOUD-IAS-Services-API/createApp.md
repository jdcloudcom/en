# createApp


## Description
Create App

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
|**accessTokenValiditySeconds**|Integer|False| |The token accessing validity period is ranging from 600 seconds to 6x3600=21,600 seconds, i.e. 10 minutes to 6 hours.|
|**clientName**|String|False| |Application Name|
|**clientUri**|String|False| |Application introduction address, url does not support #|
|**contacts**|String|False| |Application Contact Information|
|**extension**|String|False| |Application Extension Information|
|**grantTypes**|String|False| |Supported OAuth types: <br> - authorization_code: OAuth2 authorization code mode <br> - implicit：OAuth2 implicit authorization mode <br> - refresh_token: enable Refresh Token, support the following values: <br> (1) authorization_code <br> (2) authorization_code, refresh_token <br> (3) authorization_code, implicit <br> (4) authorization_code, implicit, refresh_token<br> (5) implicit<br> Note: if grantTypes has designated refresh_token, application is allowed to use Refresh Token; if refresh_token has not been designated when creating application, the application cannot use Refresh Token; application can change grantTypes setting by calling "Update Application" interface at any time.|
|**jwks**|String|False| |JWKS|
|**jwksUri**|String|False| |JWKS address, url does not support # <br/> Transmit either jwksUri or jwks|
|**logoUri**|String|False| |Application logo address, url does not support #|
|**multiTenant**|Boolean|False| |Whether it is a multi-tenant application <br/> "false": the application only supports tenant access to the currently created application, other tenants of JD Cloud are forbidden to access <br/>        "true": the application supports access from other JD Cloud tenants but the tenant currently creating the application|
|**policyUri**|String|False| |Application privacy policy address, url does not support #|
|**redirectUris**|String|False| |There are at most 4 callback addresses, with urls separated with the comma “,”. The length of each url is not greater than 1000, and the character “#” is not supported by the url.|
|**refreshTokenValiditySeconds**|Integer|False| |Refresh token validity period, with the value ranging from 30x24x3600=2,592,000 seconds to 365x24x3600=31,536,000 seconds, i.e. 30 days to 365 days<br/><br/>Note: When GrantTypes comprises refresh_token, refreshTokenValiditySeconds is the required parameter.|
|**scope**|String|False| |OAuth scope, supported values: <br/> (1) openid: use OpenID Connect protocol for identity verification<br/> designated scope is openid, and request the scope at Authorization Endpoint, JD Cloud will return users' OpenID tokens; if the value is not designated when creating application, application cannot request OpenID token; application can call "Update Application" to change the setting at any time|
|**secret**|String|False| |The application password supports 8-255 printable ASCII characters. The parameter policy with sufficient complexity is recommended for use<br/><br/>Note: When TokenEndpointAuthMethod is not equal to none, secret is the required parameter; otherwise, if secret is specified, TokenEndpointAuthMethod cannot be equal to none<br/>As JD Cloud will irreversibly encrypt secret, you cannot view this password via JD Cloud, but you can reset the password by updating the application at any time.secret|
|**tokenEndpointAuthMethod**|String|False| |Client Verification Mode: <br/> none: does not set client password (not recommend) <br/> client_secret_post: password shall be set at client, and the password should be provided with requested body in OAuth2 Token Endpoint <br/> client_secret_basic: password shall be set at client, and the password should be provided with requested head in OAuth2 Token Endpoint <br/><br/> support the following values: <br/> (1) none <br/> (2) client_secret_post<br/> (3) client_secret_basic|
|**tosUri**|String|False| |Application service protocol address, url does not support #|
|**userType**|String|False| |Account types available for accessing application support the following values: <br/> (1) root: support primary account access, sub-user cannot access <br/> (2) sub: sub-user account, it cannot use primary account to access <br/><br/> note: the combination of multiTenant and userType designates the applied users group, typical application scenarios such as: <br/> (1) application is available to sub-users under current tenant (2) application is available to primary accounts of other tenants of JD Cloud|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result|Return Result of Created App|

### Result
|Name|Type|Description|
|---|---|---|
|**accessTokenValiditySeconds**|Integer|Parameter values of accessTokenValiditySeconds|
|**account**|String|Create Application Account User Name|
|**clientId**|String|Application ID, which is a 16-bits digital ID assigned by JD Cloud|
|**clientName**|String|clientName Parameter Value|
|**clientUri**|String|clientUri Parameter Value|
|**contacts**|String|contacts Parameter Value|
|**createTime**|Long|createTime Parameter Value|
|**extension**|String|extension Parameter Value|
|**grantTypes**|String|grantTypes Parameter Value|
|**jwks**|String|jwks Parameter Value|
|**jwksUri**|String|jwksUri Parameter Value|
|**logoUri**|String|logoUri Parameter Value|
|**multiTenant**|Boolean|multiTenant Parameter Value|
|**policyUri**|String|policyUri Parameter Value|
|**redirectUris**|String|redirectUris Parameter Value|
|**refreshTokenValiditySeconds**|Integer|refreshTokenValiditySeconds Parameter Value|
|**responseTypes**|String|When grantTypes is authorization_code, then responseTypes is code; when grantTypes is implicit, responseTypes is tokenen|
|**scope**|String|scope Parameter Value|
|**secretUpdateTime**|Long|secretUpdateTime Parameter Value|
|**tokenEndpointAuthMethod**|String|ttokenEndpointAuthMethod Parameter Value|
|**tosUri**|String|tosUri Parameter Value|
|**updateTime**|Long|updateTime Parameter Value|
|**userType**|String|userType Parameter Value|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
