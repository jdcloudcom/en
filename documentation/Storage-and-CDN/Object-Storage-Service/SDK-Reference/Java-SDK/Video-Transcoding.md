# Video Transcoding

Video processing is a service provided by JD Cloud Object Storage Service to complete coding format conversion of video resources in the cloud. The following is the example to use OSS Java SDK to create code conversion task:

```
String accesskey = "your ak";
String secretkey = "your sk";
String endpoint = "oss.cn-north-1.jcloudcs.com";

String sourceBucket = "source bucket";
String sourceKey = "source key";

String targetBucket = "target bucket";
String targetKey = "target key";

//Code conversion parameter
String persistentOps = "video_mp4_480x360_440kbps";

//Voucher
Credential credential = new Credential(accesskey, secretkey);
JingdongStorageService jss = new JingdongStorageService(credential);
jss.setEndpoint(endpoint);

//Create task
String createTaskResult = jss.bucket(sourceBucket).object(sourceKey).pretreatmentStrategy(3600, new StringMap().put("saveas", targetBucket + ":" + targetKey).put("persistentOps", persistentOps), false).put();
System.out.println("createTaskResult: " + createTaskResult);

//Resolute taskId
JSONObject createTaskResultJson = JSON.parseObject(createTaskResult);
String taskId = createTaskResultJson.getString("persistentId");
System.out.println("taskId: " + taskId);

//Obtain task based on taskId
VideoTaskInfo videoTaskInfo = jss.getVideoTask(taskId);
System.out.println("videoTaskInfo: " + JSON.toJSONString(videoTaskInfo));
```
