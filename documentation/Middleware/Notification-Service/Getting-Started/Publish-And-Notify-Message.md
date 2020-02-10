# Message Release and Message Push

After a Message Topic is created in the Console, the users can release messages through the Console or by calling SDK. The Console is mainly used for debugging and verifying resource availability. It is recommended to use SDK to send messages in the production link.

## Preconditions

- Topics and subscription have been created with the status of in service.

- User's AK and SK have been created

  

## Method 1: Release message and message notice via the Console

1. Find the topic where the message is released from the topic list and click **Release Message** from the operation bar.

2. Fill in the message topic (optional) and select the message format

   - Original text: All terminal nodes send the same message contents. [Because signature ID and template ID are required for sending SMS, it is not suggested to send messages via the original text for the topic with SMS terminal node. If so, the terminal nodes of other types will also receive signature ID and template ID rather than contents in an SMS template]
   - Json: Message contents of different terminal nodes can be selected via customization. [Suit for all terminal node types such as SMS terminal node. For templates, please refer to [Messages Release](../Operation-Guide/Message-Management/Publish-Message.md)]

3. Fill in message attribute. Set some message attributes for messages to help the subscribers filter policies and messages or classify different messages.

   - The limit for message attribute count is 10. All message attribute components are covered by the message size restriction, maximum 256KB.
   - The message attribute name can contain the following characters: A-Z, a-z, 0-9, underline (_), hyphen (-) and dot (.).
   - Description:
     - 1. The maximum length is 256 characters
     - 2. It must be unique among all attributes of the message
     - 3. It cannot start or end with a dot
     - 4. There can be no consecutive periods in a sequence
   - Message attribute data type: Supported types include: String, String.Array, Number and Binary.
   - Message attribute value: Fill in corresponding contents according to the notification. If the attribute type is "String.Array", please place the array in the square brackets "[]". In this array, the character string value shall be placed in the double quotation marks.

4. Select **Release Message** to release messages to the topic.

5. Receive message: After a terminal is subscribed, the released topic information will be received. The subscribers can view the information by logging in the subscription terminal.




## Method 2: Release and receive messages through SDK

For SDK, it is recommended that you use AWS SNS SDK. JD Cloud Queue Service supports the AWS SNS SDK APIs. When using SDK, you need to configure 4 parameters: Accesskey, Secretkey, Endpoint and Region. In which, AK&SK has been created already by you on the [AccessKey Management Page](https://uc.jdcloud.com/account/accesskey). You can obtain Endpoint and Region by clicking "Access Point Address" in the Console. Endopint is the address of a HTTP/S, and Region is the English code of the selected region, as shown in the following figure.



Taking Go SDK for example, other methods and development language are as shown in [Other Chapters](../SDK-Rerference/SDK-Overview.md).

1. Install AWS SDK for Go

```
go get github.com/aws/aws-sdk-go

```

2. Initialize, and fill in the AK&SK, access point and Region information.


```Go

var ses *session.Session
 regionId := Config().Region
 accessKey := Config().AccountConfig.AccessKey
 secretKey := Config().AccountConfig.SecretKey
 endPoint := Config().JnsServerConfig.JnsServer

ses, _ = session.NewSession(&aws.Config{
   Region: aws.String(regionId),
   Credentials: credentials.NewStaticCredentials(accessKey, secretKey, ""),
   Endpoint: aws.String(endPoint),
   //DisableSSL: aws.Bool(true),
  })

 _, err := ses.Config.Credentials.Get()
 if err != nil {
  log.Fatal ("Credential Creation Failed")
 }
 client := sns.New(ses)
                  
   
```

