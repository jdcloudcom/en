# Introduction


&emsp;&emsp; Welcome to use JD Cloud Developer.NET SDK. To use JD Cloud .NET SDK, you can access the various services provided by JD Cloud without complex programming.    
&emsp;&emsp; To facilitate the understanding of some concepts and parameters in SDK, it is recommended to view Getting-Started Guide for OPENAPI before using SDK. To understand the specific parameters and meanings of each API, please refer to the program comments or refer to the API documentation of the specific product line under [OpenAPI&SDK](https://www.jdcloud.com/help/faq?act=3).

# Environment Preparation & Building

* This project is developed with visual studio 2017. If code editing and debugging is required, it is recommended to be opened with updated version of visual studio 2017.

* This project is compiled with the latest dotnet standard multi-target framework approach and versions of .NET 3.5, .NET 4.0, .NET 4.5, and .net standard 2.0. Prior to compiling, it is necessary to install the development sdk of Net Framework 3.5, 4.0 or 4.5 and sdk in the version of dotnet core 2.0. or above.; In case of Windows 10 operating system, .NET Framework 3.5 should be checked on the control panel for 'Enable and Close Windows Function' for application before installing visual studio 2017 and.net framework 4.7. For installation method of .dotnet core, please refer to [Microsoft Official Website File](https://dotnet.microsoft.com/learn/dotnet/hello-world-tutorial/intro). Other target frameworks should be checked when installing visual studio or downloaded from Microsoft official website.

* This project supports compiling sdk in the version of dotnet standard 2.0 under linux, with the compiled script as `linux-bulid.sh`under the project, which needs to be copied to the sdk directory to run. Please view the script to modify the output directory.

* Because the current Http call tool uses `HttpClient`, if using `.Net Framework 4.5`, it is necessary to reference the framework package`System.Net.Http`. Since `HttpClient` does not support `.Net Framework 3.5` and the asynchronous support for `.NetFramework 4.0` is not very complete, it was replaced in the project with `HttpWebRequest`.

* Since the `Newtonsoft.Json` was used in the project as a toolkit for Json object conversion,　you need to reference `Newtonsoft.Json`, please select the version reference corresponding to the framework you use when using.

* If you need to use a different version of the SDK, please add the build version in the project, and modify the building criteria at the same time. For the specific building target framework’s building condition information, see [Microsoft official website file (Target frameworks page)](https://docs.microsoft.com/en-us/dotnet/standard/frameworks).

* Before you start calling JD Cloud open API, you need to request the Accesskey and secretKey Key Pair (AK/SK) in advance in the AccessKey Management page under JD Cloud User Center Account Management. AK/SK information should be kept properly, and if lost, it's likely to allow illegal users to use this information to operate your resources on the cloud, causing you data and property losses.

# How to use SDK

&emsp;&emsp; In your project, reference the dll for the related module you want to call and the related class library file that this dll depends on. Then, follow the instructions below to call the Demo of sdk.    
&emsp;&emsp; JD Cloud .NET SDK can use Nuget for package management, with the use method as follows:

Find the JDCloudSDK in the visual studio Nuget package browser or enter commands with Package Management Console

```powershell
Install-Package JDCloudSDK.Vm -Version 1.2.0.1
```

or use .NET CLI for installation

```powershell
dotnet add package JDCloudSDK.Vm --version 1.2.0.1
```  

You can also download the [SDK source code](https://github.com/jdcloud-api/jdcloud-sdk-net) and directly add to the project or compile it into DLL and quote it to the project.  

For any questions in using SDK, welcome to communicate with us at the [SDK Feedback Page of problems](https://github.com/jdcloud-api/jdcloud-sdk-net/issues).

Please select the module which you need to install.

<em> Note: </em> Please use the package manager to update the version of JDCloudSDK.Core to 0.2.8 because in 0.2.7 version, if there is a space in the value when post transmits the data, the space will be put away, resulting exceptions of backend

```powershell
Install-Package JDCloudSDK.Core -Version 0.2.8
```

# Call SDK

.NET SDK is called mainly in four steps:

    1. Set accessKey and secretKey
    2. Create Client
    3. Set Request Parameters
    4. Response to implementation requests
The following is an example of a call to query details for individual VM Instance

```csharp
using System;

using Newtonsoft.Json;

using JDCloudSDK.Core.Auth;
using JDCloudSDK.Core.Client;
using JDCloudSDK.Core.Http;
using JDCloudSDK.Vm.Model;
using JDCloudSDK.Vm.Apis;
using JDCloudSDK.Vm.Client;

namespace JDCloudSDK.ConsoleTest
{
    class Program
    {
        static void Main(string[] args)
        {
            // 1. Set accessKey and securKey
            string accessKeyId = "{accessKey}";
            string secretAccessKey = "{secretKey}";
            CredentialsProvider credentialsProvider = new StaticCredentialsProvider(accessKeyId, secretAccessKey);
            
            // 2. Creating XXXClient
            VmClient vmClient = new VmClient.DefaultBuilder()
                     .CredentialsProvider(credentialsProvider)
                     .HttpRequestConfig(new HttpRequestConfig(Protocol.HTTP,10))
                     .Build();

            // 3. Set Request Parameters
            DescribeInstanceRequest request = new DescribeInstanceRequest();
            request.RegionId="cn-north-1";
            request.InstanceId="i-c0se9uju";
            
            // 4. Execution Requests
            var response = vmClient.DescribeInstance(request).Result;
            Console.WriteLine(JsonConvert.SerializeObject(response))
            Console.ReadLine();
        }
    }
}
```

If you need to set up an additional header, for example, call an interface that opens the MFA operation protection, you need to pass x-jdcloud-security-token, as follows:

```csharp
vmClient.SetCustomHeader("x-jdcloud-security-token","xxx");
```  
If you need to set an access point or configure time-out, please refer to the following examples:  

```csharp

//1.Set accessKey and secretKey
string accessKeyId = "";
string secretAccessKey = "";
CredentialsProvider credentialsProvider = new StaticCredentialsProvider(accessKeyId, secretAccessKey);
//2.Build request endpoint configuration
SDKEnvironment sdkEnvironment = new SDKEnvironment("nativecontainer.internal.cn-north-1.jdcloud-api.com");
//3.Create XXXClient
VmClient vmClient = new VmClient.DefaultBuilder()
        .CredentialsProvider(credentialsProvider)
        .Environment(sdkEnvironment) //specify the non-default Endpoint
        .HttpRequestConfig(new HttpRequestConfig(Protocol.HTTP, 50))  // set request http schema HTTP or HTTPS ,50 is the time-out period, second by default
        .Build();

```

If you need to read all kinds of information of the request response (for example, the value of a header), you can refer to the following method:  

```csharp
 Dictionary<string,List<string>> headers = response.HttpResponse.Header;
if (headers.ContainsKey("headerKey")) {
    List<string> headerValue = headers["headerKey"];
}
```  

For more calling examples, please refer to [SDK Use Demo](https://github.com/jdcloud-api/jdcloud-sdk-net/tree/master/sdk/src/Examples)


**Note:**

- JD Cloud does not provide other download methods. Please be sure to adopt the above official download method.

- The latest version number provided by JD Cloud product shall be used as the version number. For example: The latest version number used by VM in the example can be searched in API [Update History](../../API/Virtual-Machines/ChangeLog.md).

- Each cloud product has its own Client. When API of this product is called, the Client of such product will be used. For example: When VmClient of Virtual Machines is used, only APIs of Virtual Machines (Vm) can be called; when AgClient of Availability Group is used, only APIs of Availability Group (Ag) can be called.
