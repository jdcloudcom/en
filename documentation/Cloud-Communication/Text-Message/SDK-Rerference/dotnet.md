## : .net Reference  
**I. Environment Preparation**  
Download and install dotnet development environment, [Download Link](https://dotnet.microsoft.com/download)  
Execute the commands below
```
dotnet --version
```
Confirm installation succeeded  
 
Note: dotnet requires 2.0 and above version. For specific requirements, see [JD Cloud Official Website Help Documentation](https://docs.jdcloud.com/en/sdk/dotnet)  
<br><br>
**II. SDK Installation**  
Build a project, execute the following command under the created project directory  
```
dotnet new console -lang "C#"
```  
Install JD Cloud core package  
```
dotnet add package JDCloudSDK.Core --version 0.2.10
```  
For the latest version number of .net core package, see https://www.nuget.org/packages/JDCloudSDK.Core/  

Install SMS package  
```
dotnet add package JDCloudSDK.Sms --version 1.2.0.1
```  
If the vscode tool is used for development, the NuGet Package Manager plug-in can be used. Please search JD Cloud core package (JDCloudSDK.Core) and SMS package (JDCloudSDK.Sms)  
Note: The installed version shall be correspondingly modified by referring to the latest version of the official website  
For the latest version number of .net SMS package, see https://www.nuget.org/packages/JDCloudSDK.Sms/  

<br><br>
**III. Example Code**  

 ```
using System;
 
 
using Newtonsoft.Json;
using System.Collections.Generic;
 
using JDCloudSDK.Core.Auth;
using JDCloudSDK.Core.Http;
using JDCloudSDK.Sms.Apis;
using JDCloudSDK.Sms.Client;
 
namespace JDCloudSDK.ConsoleTest
{
    class Program
    {
        static void Main(string[ ] args)
        {
            //1. Set accessKey and secretKey
            string accessKeyId = "{{accessKeyId}}";
            string secretAccessKey = "{{secretAccessKey}}";
            CredentialsProvider credentialsProvider = new StaticCredentialsProvider(accessKeyId, secretAccessKey);
             
            //2. Create XXXClient
            SmsClient smsClient = new SmsClient.DefaultBuilder()
                     .CredentialsProvider(credentialsProvider)
                     .HttpRequestConfig(new HttpRequestConfig(Protocol.HTTP,10))
                     .Build();
 
            Program p = new Program();
            // Send SMS
            p.testBatchSend(smsClient);
            // Get status report
            // p.testStatusReport(smsClient);
            // Get reply
            // p.testReply(smsClient);
        }
 
        /*
         * Send SMS
         */
        public void testBatchSend(SmsClient smsClient) {
            //3. Set request parameters
            BatchSendRequest request = new BatchSendRequest();
            request.RegionId="cn-north-1";
            // Set template ID View template ID on the page of Application Management - Text Message - SMS Template
            request.TemplateId="{{TemplateId}}";
            // Set signature ID View signature ID on the page of Application Management - Text Message - SMS Signature
            request.SignId="{{SignId}}";
            // Set issued mobile phone number list
            List<string> phoneList = new List<string>(){
                "13800138000"
                // ,
                // "phone number"
            };
            request.PhoneList = phoneList;
            // Set template parameter, optional, if the template includes a variable, please fill in the corresponding parameter, otherwise the variable information will not be replaced
            List<string> param = new List<string>(){
                "123456"
            };
            request.Params = param;
             
            //4. Execute requests
            var response = smsClient.BatchSend(request).Result;
            Console.WriteLine(JsonConvert.SerializeObject(response));
            Console.ReadLine();
        }
 
        /*
         * Get status report
         */
        public void testStatusReport(SmsClient smsClient) {
            //3. Set request parameters
            StatusReportRequest request = new StatusReportRequest();
            request.RegionId="cn-north-1";
             
            // Set mobile phone number list to be queried
            List<string> phoneList = new List<string>(){
                "13800013800"
                // ,
                // "phone number"
            };
            request.PhoneList = phoneList;
            // Set SN
            // Get SN from issued interface response. response.getResult().getData().getSequenceNumber();
            request.SequenceNumber = "{{SequenceNumber}}";
             
            //4. Execute requests
            var response = smsClient.StatusReport(request).Result;
            Console.WriteLine(JsonConvert.SerializeObject(response));
            Console.ReadLine();
            // Result.Data.Status = 0, succeeded
        }
 
        /*
         * Get Reply
         */
        public void testReply(SmsClient smsClient) {
            //3. Set request parameters
            ReplyRequest request = new ReplyRequest();
            request.RegionId="cn-north-1";
            // Set application ID View application ID on the page of Application Management - Text Message - Overview
            request.AppId = "{{AppId}}";
            // Set Query Date Time Format: 2019-09-01
            request.DataDate = "{{DataDate}}";
            // Set mobile phone number list to be queried Optional
            List<string> phoneList = new List<string>(){
                "13800013800"
                // ,
                // "phone number"
            };
            request.PhoneList = phoneList;
             
            //4. Execute requests
            var response = smsClient.Reply(request).Result;
            Console.WriteLine(JsonConvert.SerializeObject(response));
            Console.ReadLine();
        }
    }
}
 ```
