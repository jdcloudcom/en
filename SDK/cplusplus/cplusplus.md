
# JD Cloud C++ Signature Library
## Basic Description
The JD Cloud C ++ signature tool provides the request signature function when C ++ language is used to access the JD Cloud OpenAPI.

Before calling JD Cloud open API, it's necessary to apply for Accesskey and secretKey Key Pair (AK/SK) in advance in Account Management of JD Cloud User Center [AccessKey Management Page](https://uc.jdcloud.com/accesskey/index). AK/ SK information shall be kept properly and if lost, it is likely to allow illegal users to use this information to operate your resources on the cloud, resulting in data or property losses.

This signature tool is available in a static library using the C++11 standard. The approximate process used is:
- Introducing the dependent header files and static libraries into your project through the cmake tool
- Fill in the HTTP request's information into the HttpRequest object of the signature tool
- Call signature interface
- Put the returned Authorization, x-jdcloud-date, and x-jdcloud-nonce and their values into your real request Header
- Then initiate a call to JD Cloud OpenAPI gateway

## Linux(Ubuntu)
### Installation Method
1) Installation of development dependency library
```
sudo apt-get install g++ cmake libssl-dev uuid-dev
```
2) Download the Demo example from the GitHub, the address is https://github.com/jdcloud-api/jdcloud-sdk-cpp-signer

### Application Method
1) Create Project Catalogue
2) Write the cmake file, refer to the examples in Demo, and reference the header file
```
include_directories(${PROJECT_SOURCE_DIR}/h)
include_directories(${PROJECT_SOURCE_DIR}/http)
include_directories(${PROJECT_SOURCE_DIR}/util)
include_directories(${PROJECT_SOURCE_DIR}/util/crypto)
include_directories(${PROJECT_SOURCE_DIR}/util/logging)
```
3) Refer to static library
```
link_libraries(${PROJECT_SOURCE_DIR}/libjdcloudsigner.a)
link_libraries(ssl)
link_libraries(crypto)
link_libraries(uuid)
```
4) Refer to the main.cpp in Demo to call the signature interface. See Subsection "Call Method" for details.
5) Compile link
```
cmake .
make
```

## macOS
### Installation Method
1) Install the cmake of above 3.5 version
```
brew install cmake
```
2) Download the Demo example from the GitHub, the address is https://github.com/jdcloud-api/jdcloud-sdk-cpp-signer

### Application Method
1) Create Project Catalogue
2) Write the cmake file, refer to the examples in Demo, and reference the header file
```
include_directories(${PROJECT_SOURCE_DIR}/h)
include_directories(${PROJECT_SOURCE_DIR}/http)
include_directories(${PROJECT_SOURCE_DIR}/util)
include_directories(${PROJECT_SOURCE_DIR}/util/crypto)
include_directories(${PROJECT_SOURCE_DIR}/util/logging)
```
3) Refer to static library (ssl library is brought with the mac system without installation)
```
link_libraries(${PROJECT_SOURCE_DIR}/libjdcloudsigner.a)
link_libraries(ssl)
link_libraries(crypto)
```
4) Refer to the main.cpp in Demo to call the signature interface. See Subsection "Call Method" for details.
5) Compile link
```
cmake .
make
```
## Windows
### Installation Method
1) Updated version of Visual Studio 2015, the official address is https://visualstudio.microsoft.com/
2) Updated version of CMake 3.5, the official address is https://cmake.org/
3) Download the Demo example from the GitHub, the address is https://github.com/jdcloud-api/jdcloud-sdk-cpp-signer

### Application Method
1) Create Project Catalogue
2) Write the cmake file, refer to the examples in Demo, and reference the header file
```
include_directories(${PROJECT_SOURCE_DIR}/h)
include_directories(${PROJECT_SOURCE_DIR}/http)
include_directories(${PROJECT_SOURCE_DIR}/util)
include_directories(${PROJECT_SOURCE_DIR}/util/crypto)
include_directories(${PROJECT_SOURCE_DIR}/util/logging)
```
3) Refer to static library
```
link_libraries(${PROJECT_SOURCE_DIR}/jdcloudsigner.lib)
link_libraries(${PROJECT_SOURCE_DIR}/libeay32.lib)
```
4) Refer to the main.cpp in Demo to call the signature interface. See Subsection "Call Method" for details.
5) Compile link

Open Visual Studio developer command prompt, execute
```
cmake .
devenv Demo.sln /build
```

Open the Demo.sln solution using Visual Studio, compile.

## Call Method
```
// reference header files
#include "Credential.h"
#include "JdcloudSigner.h"
#include "http/HttpTypes.h"
#include "http/HttpRequest.h"
#include "util/logging/Logging.h"
#include "util/logging/ConsoleLogSystem.h"

// Configuration log
ConsoleLogSystem* cls = new ConsoleLogSystem(LogLevel::Debug);
shared_ptr<ConsoleLogSystem> log(cls);
InitializeLogging(log);

// Create LinkpRequest object
HttpRequest request(URI("YOUR URL"), HttpMethod::HTTP_GET);
request.SetHeaderValue(CONTENT_TYPE_HEADER, "application/json");
request.SetHeaderValue(USER_AGENT_HEADER, "JdcloudSdkGo/1.0.2 vm/0.7.4");

// Create signature object
Credential credential("YOUR AK", "YOUR SK");
JdcloudSigner signer(credential, "vm", "cn-north-1");

// Call signature method
bool result = signer.SignRequest(request);
if(result)
{
    // Put the three items of "Authorization, x-jdcloud-date and x-jdcloud-nonce" in Header into the real request header.
    // Send an HTTP request to the JD Cloud Gateway
}
else
{
    return;
}
```
