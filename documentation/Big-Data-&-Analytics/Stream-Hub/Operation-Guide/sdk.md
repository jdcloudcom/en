## SDK Description<br>
The streaming data bus allows users to write and read data through SDK. For the time being, only the JAVA language SDK is supported, with the specific method for use as follows: <br><br>
1. **Download SDK**<br>
https://xdata.jdcloud.com/map/spsdownload/downLoadJavaSDK.action<br><br>
2. **Install SDK**<br>
Please unzip the downloaded zip file, and then import the jar package into the item, then develop it by referring to the DEMO program as follows. <br><br>
3. **Data Write**<br>
（1）StreamHubUpload<br>
There are two ways to create StreamHubUpload, i.e. asynchronous call mode and customized call mode. <br><br>
**Asynchronous Call Mode**<br>
Parameter Description: <br>
accessKey : your access key<br>
secretKey: your secret key<br>
topicName: The name of the topic corresponding to the uploaded data<br>
StreamHubUpload(String accessKey, StringsecretKey, String topicName)<br><br>
**Custom Call Method**<br>
Parameter Description: <br>
accessKey : your access key<br>
secretKey: your secret key<br>
topicName: The name of the topic corresponding to the uploaded data<br>
asynchronousfalse : true :<br>
StreamHubUpload(String accessKey, StringsecretKey, String topicName, Boolean asynchronous )<br><br>
Sample Code: <br>
    ```
    String endpoint = "http://streamhub-gw.jcloud.com";
    String accessKey = "Your AccessKey";
    String accessScrect = "Your AccessScrect";
    String topicName = " Your TopicName";
    StreamHubUpload  streamingHubUpload = new StreamHubUpload(accessKey,  accessScrect, topicName, endpoint);
    ```
    (2) Create an upload data object<br>
    ```
    String msg = "单条消息";
    Entity entity = new Entity();
    entity.setKey("KEY：");
    entity.setValue("VALUE：" + msg);
    ```
    (3) Call the Upload Method<br>
    Streaming processing provides two ways to write data: single upload and multiple upload. <br><br>
    **Single Upload**<br>
    There are two ways to write a single record to a data stream: <br>
    Specified-partition upload method: putStreamRecord( Entity, Partition)<br>
    Unspecified-partition upload method: putStreamRecoredNoPartiton(Entity)<br><br>
    **Multiple Uploads**<br>
    There are two ways to write batch record to a data stream: <br>
    Specified-partition upload method: putStreamRecords(List, Partition )<br>
    Unspecified-partition upload method: putStreamRecordsNoPartiton(List)<br><br>
    ```
    String msg = "单条消息";
    Entity entity = new Entity();
    entity.setKey("KEY：");
    entity.setValue("VALUE：" + msg);
    String recordId =  streamingHubUpload.putStreamRecord(entity, 1);
    System.out.println("upload data result : " +  recordId);
    List entities = new ArrayList();
    Entity entity1 = null;
    for (int i  = 0; i < 10; i++) {
    entity1 = new Entity();
    entity1.setKey("批量消息KEY:" + i);
    entity1.setValue("批量消息VALUE:" + i);
    entities.add(entity1);
    }
    String recordIds =  streamingHubUpload.putStreamRecords(entities, 1);
    System.out.println("upload data result : " +  recordIds);
    ```
    (4) Return Results Description<br>
    <table>
        <tr>
         <th width="300">Parameters</th>
         <th width="300">Parameter Description</th>
        </tr>
        <tr>
         <td>result</td>
         <td>true: Upload successfully | false: Upload Failed</td>
        </tr>
        <tr>
         <td>message</td>
         <td>Upload Return Information</td>
        </tr>
        <tr>
         <td>code</td>
         <td>Upload Information Code</td>
        </tr>
    </table>
4. **Data Reading**<br>
(1) Create StreamHubFetch<br>
Parameter Description: <br>
accessKey : your access key<br>
secretKey: your secret key<br>
topicName: The name of the topic corresponding to the written data<br>
StreamHubFetch(String accessKey,String secretKey, String topicName)<br><br>
Sample Code: <br>
    ```
    String endpoint = "http://streamhub-gw.jcloud.com";
    String accessKey = "Your AccessKey";
    String accessScrect = "Your AccessScrect";
    String topicName = " Your TopicName";
    StreamHubFetch streamHubFetch = new StreamHubFetch(accessKey,  accessScrect, topicNam
    ```
    <br>
    (2) Call the Read Method<br>
    Parameter Description: <br>
    partition : Partition value, used to indicate reading data from the specified partition<br>
    offset: Offset, used to indicate the starting position of the reading<br>
    Data reading method: fetchStreamRecord( partition, offset)<br>
        
    ```
    StreamHubFetch streamHubFetch = new StreamHubFetch(accessKey,  accessScrect, topicName, endpoint);
    String result =  streamHubFetch.fetchStreamRecord(1, 1);
    System.out.println("fetch result = ");
    System.out.println(result);
    ```
    (3) Return Results Description<br>
    <table>
        <tr>
         <th width="300">Parameters</th>
         <th width="500">Parameter Description</th>
        </tr>
        <tr>
         <td>Result</td>
         <td>true: Reading successfully | false: Reading Failed</td>
        </tr>
        <tr>
         <td>message</td>
         <td>Read the information returned by the data</td>
        </tr>
        <tr>
         <td>code data</td>
         <td>System returns status code. For details, see the section for status code description<br>including two fields, where, total field indicates the number of pieces of data acquired by this read operation, <br>data field corresponds to a JsonArray, which sequentially stored the read data</td>
        </tr>
    </table>
