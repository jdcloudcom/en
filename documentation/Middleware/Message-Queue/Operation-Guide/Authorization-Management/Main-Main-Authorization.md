# Primary-primary Account Authorization

Authorization function of Message Queue primary-primary account is implemented through Message Queue Console.

1. Access to Message Queue Console, find the Topic that needs to be authorized, and click **Authorization** under **More** for operation.

   ![主主授权1](../../../../../image/Internet-Middleware/Message-Queue/主主授权1.png)
   
2. Pop up authorization page, and enter the account ID of the authorized primary account (users can search a group of 12 digits from the basic information in the account management) and the authorization type as required for authorization.

   ![主主授权2](../../../../../image/Internet-Middleware/Message-Queue/主主授权2.png)
   
Authorization type of primary-primary authorization is as follows:: 

| Authorization Type | Resource Scope         | Description                                                         |
| -------- | ---------------- | ------------------------------------------------------------ |
| Release     | Selected Single Resource | Authorized persons can release messages to Topic                                  |
| Subscription     | Selected Single Resource | Authorized persons can create, delete, manage subscription and consume messages to Topic          |
| Release Subscription | Selected Single Resource | Authorized persons can release message, create, delete, manage subscription and consume messages to Topic |

3. Click **View Authorization Information** under **More** for operations, view Topic authorization conditions for a certain resource, and authorization can be canceled.

 ![主主授权3](../../../../../image/Internet-Middleware/Message-Queue/主主授权3.png)
