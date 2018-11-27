
# Introduction #
  Welcome to the JD Cloud Developer Python Tool Kit (Python SDK). With the JD Cloud Python SDK, you can access various services from JD Cloud without complex programming. 

  To facilitate the understanding of some concepts and parameters in the SDK, it's recommended to review the Getting Started to the OpenAPI before using the SDK. To understand the specific parameters and meanings of each API, refer to the program comments or documentation for specific product lines under OpenAPI&SDK.

# Environment Preparation #

1. The JD Cloud Python SDK is suitable for Python 2.7. * and 3. * Version.
2. Before calling JD Cloud open API, it's necessary to apply for accesskey and secretKey Key Pair (AK/SK) in advance in Account Mmanagement of JD Cloud User Center[AccessKey Management Page](https://uc.jdcloud.com/accesskey/index). AK/ SK information shall be kept properly and if lost, it is likely to allow illegal users to use this information to operate your resources on the cloud, resulting in data or property losses.

# SDK Usage Method #
It is recommended to install the JD Cloud Python SDK using pip as follows:

	pip install -U jdcloud_sdk
You can also download the sdk source code yourself.

Using the source code to install as follows:

	python setup.py install
 
With any problems in the use of SDK, welcome to communicate at the[SDK Use Problem Feedback page](https://github.com/jdcloud-api/jdcloud-sdk-python/issues) for the Github project.

**Note: JD Cloud does not provide other downloading methods. Please be sure to use the above-mentioned official download method.**
 
Call SDK
The calling of the Python SDK is mainly divided into four steps:

1. Set accessKey and secretKey
2. Create Client
3. Set Request Parameters
4. Response to implementation requests

The following is an example of a call to query the VM instance type

```python
# coding=utf-8
from jdcloud_sdk.core.credential import Credential
from jdcloud_sdk.services.vm.client.VmClient import VmClient
from jdcloud_sdk.services.vm.apis.DescribeInstanceTypesRequest \
    import DescribeInstanceTypesParameters, DescribeInstanceTypesRequest

access_key = 'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx'
secret_key = 'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx'
credential = Credential(access_key, secret_key)
client = VmClient(credential)

try:
    parameters = DescribeInstanceTypesParameters('cn-north-1')
    request = DescribeInstanceTypesRequest(parameters)
    resp = client.send(request)
    if resp.error is not None:
        print(resp.error.code, resp.error.message)
    print(resp.result)
except Exception as e:
    print(e)
    #Error Handling
```

If you need to set up an additional header, for example, call an interface that opens the MFA operation protection, you need to pass x-jdcloud-security-token, as follows:
```python
parameters = DeleteInstanceParameters('cn-north-1', 'i-xxx')
header = {'x-jdcloud-security-token': 'xxx'} 
request = DeleteInstanceRequest(parameters, header)
```
