
# Introduction #

Welcome to the JD Cloud Developer Node.js Tool Kit (Node.js SDK). With JD Cloud. Node.js SDK, you can access various services from JD Cloud without complex programming. 

To facilitate the understanding of some concepts and parameters in the SDK, it's recommended to first review [OpenAPI Use Getting Started](../../API/Common-Declaration/Introduction.md) before using the SDK. To understand the specific parameters and meanings of each API, refer to the program comments or the API documentation for specific product lines under the [OpenAPI&SDK](https://www.jdcloud.com/help/faq?act=3).


# Environment Preparation #

1. The JD Cloud Node.js SDK is applicable to Node.js 8.6. 0 and above, npm 5.6.0 and above.

2. Before calling JD Cloud open API, it's necessary to apply for accesskey and secretKey Key Pair (AK/SK) in advance in Account Management of JD Cloud User Center[AccessKey Management Page](https://uc.jdcloud.com/accesskey/index). AK/ SK information shall be kept properly and if lost, it is likely to allow illegal users to use this information to operate your resources on the cloud, resulting in data or property losses.


# SDK Usage Method #

It is recommended to install the JD Cloud Node.js SDK using npm as follows: 
```
npm install jdcloud-sdk-js
```

You can also download the sdk source code yourself. The source code address is [Node.js SDK](https://github.com/jdcloud-api/jdcloud-sdk-nodejs).

With any of the problems in the SDK use, welcome to communicate at the [Github SDK Use Problem Feedback page](https://github.com/jdcloud-api/jdcloud-sdk-nodejs/issues).


**Note:**

- JD Cloud does not provide other downloading ways, please be sure to use the above-mentioned official download method.

- The latest version number provided by JD Cloud product shall be used as the version number. For example: The latest version number used by VM in the example can be searched in API [Update History](../../API/Virtual-Machines/ChangeLog.md).

- Each cloud product has its own Client. When API of this product is called, the Client of such product will be used. For example: When VmClient of Virtual Machines is used, only APIs of Virtual Machines (Vm) can be called; when AgClient of Availability Group is used, only APIs of Availability Group (Ag) can be called.


 


 
# Call SDK #


### Two reference modes: ###

This reference mode can load all available services
```
var JDCloud = require('jdcloud-sdk-js');
```
This reference mode can only load the service to be used, and then you can still use var JDCloud = require('jdcloud-sdk-js/global') to reference SourceCloud object
```
var NC = require('jdcloud-sdk-js/services/nc');
```

### Configuration Method ###

Configure the JDCloud as a common configuration with all services sharing configurations:
```
JDCloud.config.update({//*Configuration Item/*/});
```
The configuration for a service overlaps the general configuration: 
```JavaScript
var NC = require('jdcloud-sdk-js/services/nc'); 
var nc = new NC({//*Configuration Item/*/});
```

### Configuration Item ###
```JavaScript
let config = { 
	credentials: { 
		accessKeyId: global.accessKeyId, secretAccessKey: global.secretAccessKey 
	},
	regionId: 'cn-north-1' //region information, an api call can be referred to as a single reference regionId, and if it is not passed, the regionId in this configuration is used
}
```

### Call Example ###

The following is an example of a call to query details for individual VM Instance


####  Reference and Configuration  ####
```JavaScript
    var VM = require('jdcloud-sdk-js/services/vm')
    var vm = new VM({
            credentials: {
        accessKeyId: global.accessKeyId,
                secretAccessKey: global.secretAccessKey
    },
    regionId: 'cn-north-1'
    })
```


#### Promise Method Calling #### 
```JavaScript
	vm.createInstances({
        instanceSpec: {
            instanceType: 'g.s1.micro',
                    az: 'cn-north-1a',
                    imageId: '98d44a0f-88c1-451a-8971-f1f769073b6c',
                    name: 'node-sdk-test',
                    elasticIp: {
                bandwidthMbps: 2, provider: 'BGP'
            },
            primaryNetworkInterface: {
                networkInterface: {
                    subnetId: 'subnet-3dm13k30gh',
                            az: 'cn-north-1a'
                }
            },
            systemDisk: {
                diskCategory: 'local'
            },
            description: 'sdk'
        },
        maxCount: 1
    },'cn-north-1').then(function(data){ // Return Data Processing data 
    },
    function(e){ // Calling API failed. Wrong processing 
    })
```


#### Callback Method Calling #### 
```JavaScript
	vm.createInstances({
        instanceSpec: {
            instanceType: 'g.s1.micro',
                    az: 'cn-north-1a',
                    imageId: '98d44a0f-88c1-451a-8971-f1f769073b6c',
                    name: 'node-sdk-test',
                    elasticIp: {
                bandwidthMbps: 2,
                        provider: 'BGP'
            },
            primaryNetworkInterface: {
                networkInterface: {
                    subnetId: 'subnet-3dm13k30gh',
                            az: 'cn-north-1a'
                }
            },
            systemDisk: {
                diskCategory: 'local'
            },
            description: 'sdk'
        },
        maxCount: 1
    },'cn-north-1',
    function(err, data){
        if(err){ // Calling API failed. Wrong processing 
        } 
		else { // Return Data Processing data 
        } 
    })
```
If the setting of an additional header is required, for example, the API with MFA operation protection enabled is required to be called, and passing x-jdcloud-security-token is required, the following method shall be followed:
```JavaScript
vm.deleteInstances({ 
	  instanceId: 'xxx', x-jdcloud-security-token: 'xxx' 
	}, 
	'cn-north-1'
)	
```


