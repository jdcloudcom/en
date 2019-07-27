# Introduction

&emsp;&emsp; Welcome to use JD Cloud iOS SDK (programmed with swift). You can access various services provided by JD Cloud without complex programming by using JD Cloud iOS SDK.    
&emsp;&emsp; We recommend you view OpenAPI Getting Started first prior to using SDK so that you can easily understand the meaning of some concepts and parameters in the SDK. Please see program notes or API documents of specific product line under [OpenAPI&SDK](https://docs.jdcloud.com/en/?act=3) for understanding the specific parameters and meaning of each API.

# Environment Preparation & Compilation

* When compilation, the versions of IDE for development and Swift shall be respectively compatible with Xcode 10.1 and swift 4.2 which are used for programming the codes.

* Codes compatible with `swift package manage` can be compiled under Mac OS system by using swift commands and the packages can be managed by using `Swift package manage`

* Now there have been solution files and `objc` head support for projects, which support the project references of Objective-C. View [Apple official development documents](https://developer.apple.com/documentation/swift/imported_c_and_objective-c_apis/importing_swift_into_objective-c) for detailed methods. If you want to program framework of Objective-c, we recommend you use [C++ signature library](https://github.com/jdcloud-api/jdcloud-sdk-cpp-signer) to compile the codes into the project.

* We have not verified the compilation and use support of `linux(ubuntu 18.04 LTS and 16.04 LTS)`, so that you need to submit Issues in the project if you have use problems when you have requirements.

# SDK Use Method

* Please use `pod install` command to install framework you need to use when managing package with Cocoapods, which the target framework will be automatically referenced
    For example:

```Shell
pod install {framework name}
```

* Please configure the reference packages in `dependencies` of your own `Package.Swift` when using `swift package manage` for package management.

```Swift
dependencies: [
        // Dependencies declare other packages that this package depends on.
        .package(url: "https://github.com/jdcloud-api/jdcloud-sdk-ios.git", from: "0.0.11"),
    ]
```

* In addition, you can directly reference framework by using codes to compile framework or directly compile the codes and the project together by copying the codes into the project

# Call Method

    1. Set accessKey and secretKey
    2. Create Client
    3. Set request parameters
    4. Execute request to obtain response

* The follows are the call instance for search user host instance list, which view `VmTest.swift` under Tests directory of the project for details.

```Swift
// AccessKey and SecretAccessKey applied from JD Cloud official website
let credentials = Credential(accessKeyId: "your jdcloud ak", secretAccessKey: "your jdcloud sk");
        
// Initial the client of calling business lines
let vmClient = VmJDCloudClient(credential: credentials)
       
// Create request parameters and view OPEN API calling documents for the detailed request parameters
let describeInstancesRequest = DescribeInstancesRequest(regionId: "cn-north-1");
       
// Open global debug set to see signature data for the convenience of debug
GlobalConfig.debug = true
        
// When executing request, you need to treat exception throws by yourself. If the return result contains AnyObject type, you need use SwiftJson and other framework to treat resultString by yourself and requestResponse contains no result of AnyObject
try vmClient.describeInstancesAsync(request: describeInstancesRequest) { (statusCode, requestResponse, error,resultString) in
    // Callback method is used to execute yourself business logic
  print(statusCode)
  print(requestResponse)
  print(error)
}
```

**Note:**

- JD Cloud does not provide other download methods. Please be sure to adopt the above official download method.

- The latest version number provided by JD Cloud product shall be used as the version number. For example: The latest version number used by VM in the example can be searched in API [Update History](../../API/Virtual-Machines/ChangeLog.md).

- Each cloud product has its own Client. When API of this product is called, the Client of such product will be used. For example: When VmClient of Virtual Machines is used, only APIs of Virtual Machines (Vm) can be called; when AgClient of Availability Group is used, only APIs of Availability Group (Ag) can be called.


 
