# JD Cloud C++ Signature Library


## Basic Description
JD Cloud C++ signature tool provides the function of requesting signatures when C++ language accesses JD Cloud OpenAPI. It uses AccessKey and SecretKey as materials to conduct multiple processes of relevant information of HTTP request, and sign the request with time and nonce random value. Using this signature tool can save your time of writing signatures. If there is no correct signature, you possibly cannot normally access JD Cloud OpenAPI. Using the signature function can guarantee your identity will not be impersonated. Please pay attention to the security of AK/SK.

This signature tool is available in a static library using the C++11 standard. The approximate process used is:
- Introducing the dependent header files and static libraries into your project through the cmake tool
- Fill in the HTTP request's information into the HttpRequest object of the signature tool
- Call signature interface
- Put the returned Authorization, x-jdcloud-date, and x-jdcloud-nonce and their values into your real request Header
- Then initiate a call to JD Cloud OpenAPI gateway

## Installation Method
### Linux (Ubuntu)

```
sudo add-apt-repository ppa:jdcloud/sdk
sudo apt-get update
sudo apt-get install libjdcloud-signer-dev
```

### MacOS

1. Install [homebrew](https://brew.sh/index_zh-cn)
2. Run the following script

```sh
brew tap jdcloud-api/tap
# Stable
brew install libjdcloud_signer
# git head version
brew install libjdcloud_signer --HEAD
```

### Windows
1. Install Visual Stdio 2015 or above versions, the official website is: https://visualstudio.microsoft.com/
2. Install CMake 3.5 or above versions, the official website is: https://cmake.org/
3. Execute `cmake .`under the download code directory
4. Download and install openssl library, the website is: http://slproweb.com/products/Win32OpenSSL.html
5. Use Visual Studio to open the Demo.sln solution, and compile it. The generation path is: src/Debug.
## Use Method

* Please refer to [examples](https://github.com/jdcloud-api/jdcloud-sdk-cpp-signer/tree/master/examples)

### Call Method

```cpp
// Reference header file
#include "jdcloud_signer/Credential.h"
#include "jdcloud_signer/JdcloudSigner.h"
#include "jdcloud_signer/http/HttpTypes.h"
#include "jdcloud_signer/http/HttpRequest.h"
#include "jdcloud_signer/logging/Logging.h"
#include "jdcloud_signer/logging/ConsoleLogSystem.h"

using namespace std;
using namespace jdcloud_signer;

// Configuration log
ConsoleLogSystem* cls = new ConsoleLogSystem(LogLevel::Debug);
shared_ptr<ConsoleLogSystem> log(cls);
InitializeLogging(log);

// Create LinkpRequest object
HttpRequest request(URI("http://www.jdcloud-api.com/v1/regions/cn-north-1/instances?pageNumber=2&pageSize=10"), HttpMethod::HTTP_GET);
request.SetHeaderValue(CONTENT_TYPE_HEADER, "application/json");
request.SetHeaderValue(USER_AGENT_HEADER, "JdcloudSdkCpp/1.0.2 vm/0.7.4");

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

## FAQ
### How to use openssl 1.1 for compilation?

#### Ubuntu 18.04

```
sudo apt install libssl-dev
cmake .
make
sudo make install
```

#### MacOS X

```
brew install openssl@1.1
cmake -DOPENSSL_ROOT_DIR=/usr/local/opt/openssl@1.1/ .
make
sudo make install
```

**Note:**

- JD Cloud does not provide other download methods. Please be sure to adopt the above official download method.

- The latest version number provided by JD Cloud product shall be used as the version number. For example: The latest version number used by VM in the example can be searched in API [Update History](../../API/Virtual-Machines/ChangeLog.md).

- Each cloud product has its own Client. When API of this product is called, the Client of such product will be used. For example: When VmClient of Virtual Machines is used, only APIs of Virtual Machines (Vm) can be called; when AgClient of Availability Group is used, only APIs of Availability Group (Ag) can be called.
