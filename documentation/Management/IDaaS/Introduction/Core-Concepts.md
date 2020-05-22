# Core Concepts

| Concept | Interpretation |
| ---- | ---- |
| Tenant Account| Container containing all of the tenant's services and resources in Identity Pass beta, one account can include many users |
| User| Account entity under an account, whose unique identifier is user name |
| Identity| Entity information on behalf of a user that can be identified by an application program |
| Credentials| Credential that can represent a user's identity, e.g. user name and password, Access Keys/Secret Keys, etc. |
| Authentication | Process where credentials are checked to confirm a user’s identity, e.g. account login or verification of OpenAPI signature |
| Identity Provider| IdP for short, refers to the module offering authentication services |
| Service Provider| SP for short, refers to the module consuming identity information and providing application services for the user represented by the identity |
| Token| Character string containing user identity information, which is generated and issued by IdP after user authentication is completed |
| 3rd Party IdP| If the authentication is conducted in an external system, then this system is a 3rd Party IdP |
| 3rd Party SP| If the application service is delivered in an external system, then this system is a 3rd Party SP |
| Single Sign-On| refers to seamless transmission of an identity token among many relevant and independent SPs, in which users can access many systems with a single sign-on |
| Protocol| The protocol defines interaction rules between SP and IdP. According to the protocol, SP can obtain the token issued by IdP and provide application services for different users |
