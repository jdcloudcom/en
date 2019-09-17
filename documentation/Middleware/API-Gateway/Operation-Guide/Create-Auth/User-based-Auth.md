# Based on User Authorization

API Gateway supports types based on user authorization. With this authorization method, you can enter user pin to authorize all valid JD Cloud Access Keys created by this user and its sub-users,
Operation is simple without authorizing a single Access Key for several times.

#### Entry:
Middleware>API Gateway>Access Authorization>Create Authorization

### Operation Steps:
#### (1) You need to get the JD Cloud user Pin to be authorized by yourself.

#### (2) Click **Create Authorization** in the access authorization module.

  ![访问授权](../../../../../image/Internet-Middleware/API-Gateway/User-based-Auth1.png)
  

#### (3) Select **Based on User Authorization** as the authorization type and enter JD Cloud user Pin to be authorized in the user identifier part, with one Pin completed once.

  ![访问授权](../../../../../image/Internet-Middleware/API-Gateway/User-based-Auth2.png)

#### (4) Select a group from optional API groups and associate it to complete the entire authorization association process.
  
#### (5) Next, the user can access API group with SDK.
