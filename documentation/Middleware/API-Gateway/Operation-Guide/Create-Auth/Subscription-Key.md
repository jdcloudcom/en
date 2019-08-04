# Subscription Key

API Gateway supports the authorization type of subscription keys. The user can achieve the authorized access of API by passing subscription keys in Header, in addition to accessing API by selecting and using SDK.
Carrying out authorized access with subscription keys has a low cost and is convenient and rapid, and at the same time can guarantee security to a certain extent. Thus, it is quite suitable for the user expecting rapid API calling.

#### Entry:
Middleware>API Gateway> API Calling >subscription key


## Operation Steps:
### (1) The API caller creates and provides the subscription key 

- Click the left menu to enter the subscription key list page.
- On the subscription key page, click **Create Key** and fill in the name (required) and description (Optional).

  ![访问授权](../../../../../image/Internet-Middleware/API-Gateway/Auth-subkey-1.png)
  
- After the key is successfully created, the system will automatically generate the subscription ID and subscription Key.
- The API caller needs to tell the subscription key ID to the API provider, who will then authorize access.

### (2) 	 The API provider authorizes APIs to the API caller in groups for their use

- Enter the "Access Authorization" list page of the "open API" part and click **Create Authorization**.


  ![访问授权](../../../../../image/Internet-Middleware/API-Gateway/Auth-subkey-2.png)
  
- Select the "subscription key" of the authorization type in the "basic information" part. The user can select the subscription key created by the current user from the subscription key list or enter the subscription ID of other users to search and select keys.
- After selecting the subscription key, select the corresponding group that can be associated in the "associate group" part for association, and click **OK**. At this point, the authorization between the subscription key and API group has been completed.

  Note: The API groups can be exhibited only in the associated list only when by releasing API groups in the environment and setting the access authorization method as "Enable Access Authorization".

  ![访问授权](../../../../../image/Internet-Middleware/API-Gateway/Auth-subkey-3.png)
  
- Next, the user can achieve the API access in the API group with two methods.
  1. Pass jdcloud-apim-subscription-key in header.
  2. Carry out calling with SDK.
