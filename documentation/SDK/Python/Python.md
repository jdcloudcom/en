# Introduction #

Welcome to the JD Cloud Developer Python Tool Kit (Python SDK). With the JD Cloud Python SDK, you can access various services from JD Cloud without complex programming. 

To facilitate the understanding of some concepts and parameters in the SDK, it's recommended to review the Getting Started to the OpenAPI before using the SDK. To understand the specific parameters and meanings of each API, refer to the program comments or documentation for specific product lines under OpenAPI&SDK.

# Environment Preparation #

1. The JD Cloud Python SDK is suitable for Python 2.7. * and 3. * Version.
2. Before calling JD Cloud open API, it's necessary to apply for accesskey and secretKey Key Pair (AK/SK) in advance in Account Mmanagement of JD Cloud User Center [AccessKey Management Page](https://uc.jdcloud.com/accesskey/index). AK/ SK information shall be kept properly and if lost, it is likely to allow illegal users to use this information to operate your resources on the cloud, resulting in data or property losses.

# SDK Usage Method #
It is recommended to install the JD Cloud Python SDK using pip as follows:

	pip install -U jdcloud_sdk
You can also download the [SDK source code](https://github.com/jdcloud-api/jdcloud-sdk-python) yourself.

Using the source code to install as follows:

	python setup.py install

With any problems in the use of SDK, welcome to communicate at the [SDK Use Problem Feedback page](https://github.com/jdcloud-api/jdcloud-sdk-python/issues).

**Note: JD Cloud does not provide other downloading methods. Please be sure to use the above-mentioned official download method.**

Call SDK
The calling of the Python SDK is mainly divided into four steps:

1. Set accessKey and secretKey
2. Create Client (each cloud product has its own Client. When API of this product is called, the Client of such product will be used. For example: When VmClient of Virtual Machines is used, only APIs of Virtual Machines (Vm) can be called; when AgClient of Availability Group is used, only APIs of Availability Group (Ag) can be called.)
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

If you need to set an access point or configure time-out, please refer to the following more complex examples:
```
from jdcloud_sdk.core.credential import Credential
from jdcloud_sdk.core.const import SCHEME_HTTP
from jdcloud_sdk.core.config import Config
from jdcloud_sdk.core.logger import Logger
from jdcloud_sdk.services.vm.client.VmClient import VmClient
```
```
credential = Credential(access_key, secret_key)
# Specify to access vpc private domain by http, the time-out is 20s
config = Config('vm.internal.cn-north-1.jdcloud-api.com', SCHEME_HTTP, 20)
logger = Logger(3) # FATAL = 0 ERROR = 1 WARN = 2 INFO = 3; if you don't want to output a log, you can set the log level to 0 (FATAL); if it is not set as logger, it is INFO by default
client = VmClient(credential, config, logger)
```
For more calling examples, please refer to [SDK Use Demo](https://github.com/jdcloud-api/jdcloud-sdk-python/tree/master/demo)

# Generate Document

```sh
pip3 install -U sphinx
cd docs && make apidoc && make html
```
