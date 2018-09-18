
# Introduction #

The JD Cloud Developer Java Tools Kit (Java SDK) is also suitable for Android development and operating environments. With JD Cloud Java SDK, you can access the services provided by JD Cloud without complex programming. 

To conveniently understand the meaning of some of the concepts and parameters in the SDK, we recommend that you review the OpenAPI to use the Getting Started document before using the SDK. To understand the specific parameters and meanings of each API, refer to the program comments or documentation for specific product lines under OpenAPI&SDK.


# Environment Preparation #

1. The JD Cloud Java SDK is applicable to jdk7 and above, and Android 5.0 and above.

2. To apply the accesskey and the secretKey (AK/ SK) in advance in the AccessKey Management page under the Account Management of JD Cloud User Center before starting to call the JD Cloud open API. AK/ SK information shall be kept properly and if lost, it is likely to cause illegal users to use this information to operate your resources on the cloud, resulting data or property losses.



# SDK Usage Method #

If you use Grader to manage the project, you only need to add a corresponding dependency in the build.gradle file of the project, as follows:

    //Corresponding product line SDK
    implementation 'com.jdcloud.sdk:vm:1.0.3'

You can also download the SDK source code yourself. The source code address is: [Java SDK](https://github.com/jdcloud-api/jdcloud-sdk-java).

With any of the problems in the SDK use, you are welcomed to communicate with the Github project [SDK Usage Problem Feedback Page](https://github.com/jdcloud-api/jdcloud-sdk-java/issues).

Note: JD Cloud does not provide other downloading ways, please be sure to use the above-mentioned official download method!

 

# Call SDK #

The calling of the Java SDK is mainly divided into four steps:

- STEP1: Set accessor Key and secretKey

- STEP2: Create Client

- STEP3: Set Request Parameters

- STEP4: Response to execution request

The following is an example of a call to query details for individual VM Instance

    private static CredentialsProvider credentialsProvider = new StaticCredentialsProvider("ak", "sk");

    VmClient vmClient = VmClient.builder()
                .credentialsProvider(credentialsProvider)
                .httpRequestConfig(new HttpRequestConfig.Builder().build())
                .build();
                
    DescribeInstanceRequest instanceRequest = new DescribeInstanceRequest();
    instanceRequest.setRegionId("cn-north-1");
    instanceRequest.setInstanceId("i-274krai3dw");
    DescribeInstanceTask describeInstanceTask = new DescribeInstanceTask();
    describeInstanceTask.execute(instanceRequest);
        
    
    class DescribeInstanceTask extends  AsyncTask<DescribeInstanceRequest, Integer, DescribeInstanceResponse>{

        @Override
        protected DescribeInstanceResponse doInBackground(DescribeInstanceRequest... describeInstanceRequests) {
            try {
                return vmClient.describeInstance(describeInstanceRequests[0]);
            }catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(DescribeInstanceResponse result) {
            if(result != null) {
                String json = new Gson().toJson(result);
                textView.setText(json);
            }
        }

    }

If you need to set up an additional header, for example to call an interface that opens the MFA operation protection, you need to pass x-jdcloud-security-token, as follows:

	vmClient.setCustomHeader("x-jdcloud-security-token", "xxxx");
