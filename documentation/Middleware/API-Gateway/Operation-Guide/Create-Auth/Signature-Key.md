# Signature Key Pair

JD Cloud API Gateway supports the authorization types of signature key pairs, API Gateway applies a special signature algorithm for the authorization type and thus has high security, and after such authorization, the user can use SDK to call API.

#### Entry:

Middleware>API Gateway> API Calling>Signature Key Pair


## Operation Steps:
### (1) The API caller creates and provides the signature key pair 

- Click the left menu to enter the signature key pair list page.
- On the signature key pair page, click **Create Key Pair** and fill in the name (required) and description (unrequired).

  ![访问授权](../../../../../image/Internet-Middleware/API-Gateway/Auth-sigkey-1.png)
  
- After the key pair is successfully created, the system will automatically generate the key pair ID and API Key.
- The API caller needs to tell the signature key pair ID to the API provider, who will then authorize access.

### (2) 	 The API provider authorizes APIs to the API caller in groups for their use

- Enter the "Access Authorization" list page of the "open API" part and click **Create Authorization**.

  ![访问授权](../../../../../image/Internet-Middleware/API-Gateway/Auth-sigkey-2.png)
  
- Select "API Gateway Signature" of the authorization type in the "basic information" part. "Owned API Gateway Signature Key Pair" or "Platform User API Gateway Signature Key Pair" can be selected for the user identifier part, and the user needs to select the signature key pair created by the current user from the corresponding key pair list or enter the signature key pair IDs of other users to search and select key pairs.
- After selecting the API Gateway signature key pair, select the corresponding group that can be associated in the "associate group" part for association, and click **OK**. At this point, the authorization between the API Gateway signature key pair and API group has been completed.

  Note: The API groups can only be exhibited in the associated list only when by releasing API groups in the environment and setting the access authorization method as "Enable Access Authorization".

  ![访问授权](../../../../../image/Internet-Middleware/API-Gateway/Auth-sigkey-3.png)
  
- Next, the user can achieve the API access in the API group with the method of SDK.
