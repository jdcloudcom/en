## JAVA Reference  
**I. Environment Preparation**  
Please prepare the environment according to the following description.  
JAVA environment dependence, please ensure that JDK 8 environment has been installed, if not, please go to Oracle official website to download it;  

SDK environment dependence, it is recommended introducing the dependence by way of Maven:  

 ```
<dependency>
   <groupId>com.jdcloud.sdk</groupId>
   <artifactId>sms</artifactId>
   <version>1.2.0</version>
   //Set as the latest version number of Java SDK
</dependency>
 ```
 
  
For the latest version number of Java SDK, please [View](https://mvnrepository.com/artifact/com.jdcloud.sdk/sms)  

<br><br>
**II. Example Code**  
 ```
import com.google.gson.Gson;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.auth.StaticCredentialsProvider;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.http.Protocol;
import com.jdcloud.sdk.service.sms.client.SmsClient;
import com.jdcloud.sdk.service.sms.model.*;
 
import java.util.ArrayList;
import java.util.List;
 
public class SmsClientExample {
    private static SmsClient smsClient;
    // It is unnecessary to modify region information
    private static String region = "cn-north-1";
 
    public static void init() {
        /**
         * Common User ak/sk (You can view your own ak/sk on the page of Application Management - Text Message - Overview)
         */
        // Please fill in AccessKey ID
        String accessKeyId = "";
        // Please fill in AccessKey Secret
        String secretAccessKey = "";
        CredentialsProvider credentialsProvider = new StaticCredentialsProvider(accessKeyId, secretAccessKey);
        smsClient = SmsClient.builder()
                .credentialsProvider(credentialsProvider)
                .httpRequestConfig(new HttpRequestConfig.Builder().protocol(Protocol.HTTP).build()) //HTTPS by default
                .build();
    }
 
    /**
     * Designate template and send SMS to groups
     */
    public static void testBatchSend() {
        BatchSendRequest request = new BatchSendRequest();
        request.setRegionId(region);
        // Set template ID View template ID on the page of Application Management - Text Message - SMS Template
        request.setTemplateId("");
        // Set signature ID View signature ID on the page of Application Management - Text Message - SMS Signature
        request.setSignId("");
        // Set issued mobile phone number list
        List<String> phoneList = new ArrayList<>();
        phoneList.add("");
        request.setPhoneList(phoneList);
        // Set template parameter, optional, if the template includes a variable, please fill in the corresponding parameter, otherwise the variable information will not be replaced.
        List<String> params = new ArrayList<>();
        params.add("");
        request.setParams(params);
        BatchSendResponse response = smsClient.batchSend(request);
        System.out.println(new Gson().toJson(response));
    }
 
    /**
     * SMS Sending Receipt APIs
     */
    public static void testStatusReport() {
        StatusReportRequest statusReportRequest = new StatusReportRequest();
        statusReportRequest.setRegionId(region);
        // Set SN
        // Get SN from issued interface response. response.getResult().getData().getSequenceNumber();
        statusReportRequest.setSequenceNumber("");
        // Set mobile phone number list to be queried
        List<String> phoneList = new ArrayList<>();
        phoneList.add("");
        statusReportRequest.setPhoneList(phoneList);
        StatusReportResponse response = smsClient.statusReport(statusReportRequest);
        System.out.println(new Gson().toJson(response));
    }
 
    /**
     * SMS Reply APIs
     */
    public static void testReply() {
        ReplyRequest replyRequest = new ReplyRequest();
        replyRequest.setRegionId(region);
        // Set application ID View application ID on the page of Application Management - Text Message - Overview
        replyRequest.setAppId("");
        // Set Query Date Time Format: 2019-09-01
        replyRequest.setDataDate("");
        // Set mobile phone number list to be queried Optional
        List<String> phoneList = new ArrayList<>();
        phoneList.add("");
        replyRequest.setPhoneList(phoneList);
        ReplyResponse response = smsClient.reply(replyRequest);
        System.out.println(new Gson().toJson(response));
    }
 
    public static void main(String[] args) {
        // Initialize client
        init();
        testBatchSend();
//        testStatusReport();
//        testReply();
    }
}
 ```
