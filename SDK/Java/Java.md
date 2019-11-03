# Introduction #

  Welcome to the JD Cloud Developer Java Tools Kit (Java SDK). With JD Cloud Java SDK, you can access the services provided by JD Cloud without complex programming. 

  To facilitate the understanding of some concepts and parameters in the SDK, it's recommended to review the [Getting Started to the OpenAPI](http://www.jdcloud.com/help/detail/355/isCatalog/0) before using the SDK. To understand the specific parameters and meanings of each API, refer to the program comments or documentation for specific product lines under OpenAPI&SDK.

# Environment Preparation #
1. The JD Cloud Java SDK is applicable to jdk7 and above versions.
2. Before you calling the open API of JD Cloud, please apply for the key pair of accesskey and secretKey (AK/SK for short) in the [AccessKey Management Page](https://uc.jdcloud.com/accesskey/index) under the User Center Account Management of JD Cloud. Please properly keep your AK/SK information. If lost, your cloud resources may be operated by illegal users with this information, and you may suffer data and property loss.

# SDK Usage Method #
If you use Apache Maven to manage a Java project, you only need to add a corresponding dependency item in the pom.xml file of the project, as follows:
 
```xml
<!-- SDK of corresponding product line -->
<dependency>
	<groupId>com.jdcloud.sdk</groupId>
	<artifactId>vm</artifactId>
	<version>1.2.0</version>
</dependency>
```
 
You can also download the SDK source code yourself.
 
With any of the problems in the SDK use, you are welcomed to communicate at the [SDK Usage Problem Feedback Page](https://github.com/jdcloud-api/jdcloud-sdk-java/issues).

**Note:** 

- JD Cloud does not provide other downloading ways, please be sure to use the above-mentioned official download method.

- The latest version number provided by JD Cloud product shall be used as the version number. For example: The latest version number used by VM in the example can be searched in API [Update History](https://docs.jdcloud.com/cn/virtual-machines/api/changelog).

- Each cloud product has its own Client. When API of this product is called, the Client of such product will be used. For example: When VmClient of Virtual Machines is used, only APIs of Virtual Machines (Vm) can be called; when AgClient of Availability Group is used, only APIs of Availability Group (Ag) can be called.

# Call SDK #
The calling of the Java SDK is mainly divided into four steps:

1. Set accessKey and secretKey
2. Create Client
3. Set Request Parameters
4. Response to implementation requests

The following is an example of a call to query details for individual VM Instance

```java
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.auth.StaticCredentialsProvider;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.http.Protocol;
import com.jdcloud.sdk.service.vm.client.VmClient;
import com.jdcloud.sdk.service.vm.model.*;

public class VmClientExample {

    public static void main(String[] args) {
        //1. Set accessKey and secretKey
        String accessKeyId = "{accessKey}";
        String secretAccessKey = "{secretKey}";
        CredentialsProvider credentialsProvider = new StaticCredentialsProvider(accessKeyId, secretAccessKey);

        // 2. Creating XXXClient
        VmClient vmClient = VmClient.builder()
                .credentialsProvider(credentialsProvider)
                . httpRequestConfig(new HttpRequestConfig.Builder().protocol(Protocol.HTTPS).build()) //HTTPS by default
                .build();

        // 3. Set Request Parameters
        DescribeInstanceRequest request = new DescribeInstanceRequest();
        request.regionId("cn-north-1");
        request.instanceId("i-c0se9uju");

        // 4. Execution Requests
        DescribeInstanceResponse response = vmClient.describeInstance(request);

        //5. Processing response
        System.out.println(new Gson().toJson(response));

    }
}
```

If you need to set up an additional header, for example, call an interface that opens the MFA operation protection, you need to pass x-jdcloud-security-token, as follows:
```
vmClient.setCustomHeader("x-jdcloud-security-token", "xxxx");
```

If you need to set an access point or configure time-out, please refer to the following more complex examples:
```
        Environment env = new Environment.Builder().endpoint("nativecontainer.internal.cn-north-1.jdcloud-api.com").build(); //specify the non-default Endpoint Step1

        //2. Create ncClient
        NativecontainerClient ncClient = NativecontainerClient.builder()
                .credentialsProvider(credentialsProvider)
                .httpRequestConfig(new HttpRequestConfig.Builder()
                        .connectionTimeout(10000) //set connection time-out as 10s
                        .socketTimeout(10000) //set read response time-out as 10s
                        .protocol(Protocol.HTTP) //set to use HTTP rather than HTTPS, vpc private domain does not support HTTPS
                        .build()) //HTTPS by default
                .environment(env)  //specify the non-default Endpoint Step2
                .build();
```

If you need to read all kinds of information of the request response (for example, the value of a header), you can refer to the following method:
```
HttpHeaders headers = response.getJdcloudHttpResponse().getHeaders();
List<String> headerValue = headers.getHeaderStringValues("headerKey");
```

For more calling examples, please refer to [SDK Use Demo](https://github.com/jdcloud-api/jdcloud-sdk-java/tree/master/demo)
