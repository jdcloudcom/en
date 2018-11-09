
# Introduction #
  Welcome to the JD Cloud Developer Node.js Tool Kit (Node.js SDK). With JD Cloud. Node.js SDK, you can access various services from JD Cloud without complex programming. 

  To facilitate the understanding of some concepts and parameters in the SDK, it's recommended to first review [JD Cloud OpenAPI Use Getting Started](http://www.jdcloud.com/help/detail/355/isCatalog/0) before using the SDK. To understand the specific parameters and meanings of each API, refer to the program comments or the API documentation for specific product lines under the OpenAPI & SDK.



# Environment Preparation #
 1. The JD Cloud Node.js SDK is applicable to Node.js 8.6. 0 and above, npm 5.6.0 and above.

 2. Before calling JD Cloud open API, it's necessary to apply for accesskey and secretKey Key Pair (AK/SK) in advance in Account Management of JD Cloud User Center[AccessKey Management Page](https://uc.jdcloud.com/accesskey/index). AK/ SK information shall be kept properly and if lost, it is likely to allow illegal users to use this information to operate your resources on the cloud, resulting in data or property losses.



# SDK Usage Method #
It is recommended to install the JD Cloud Node.js SDK using npm as follows: 

`npm install jdcloud-sdk-js`
 

You can also download the sdk source code yourself. The source code address is [Node.js SDK](https://github.com/jdcloud-api/jdcloud-sdk-nodejs).

 

With any of the problems in the SDK use, welcome to communicate at the[SDK Use Problem Feedback page](https://github.com/jdcloud-api/jdcloud-sdk-nodejs/issues) for the Github project.



Note: JD Cloud does not provide other downloading ways, please be sure to use the above-mentioned official download method.

 

# Call SDK #

## Two reference modes: ##
```
	var JDCloud = require('jdcloud-sdk-js');
```
This reference mode can load all available services


```
	var NC = require('jdcloud-sdk-js/services/nc');
```
This reference mode can only load the service to be used, and then you can still use var. Cloud = request ('jdcloud-sdk-js/.') to reference SourceCloud object
## 
Configuration Method ##
Configure the JDCloud as a common configuration with all services sharing configurations:

```
	JDCloud.config.update({/*Configuration Item*/});
```

The configuration for a service overlaps the general configuration: 

```
	var NC = require('jdcloud-sdk-js/services/nc');
	var nc = new NC({/*Configuration Item*/});
```

## Configuration Item ##
```
	let config = {
	    credentials:{
	        accessKeyId,
	        secretAccessKey,
	    },
	    regionId,   //region information, an api call can be referred to as a single reference regionId, and if the call is not passed, the regionId in this configuration is used
	}
```

## Call Example ##
The following is an example of a call to query details for individual VM Instance
```
	var VM = require('jdcloud-sdk-js/services/vm')
	
	var vm = new VM({
	  credentials: {
	    accessKeyId: global.accessKeyId,
	    secretAccessKey: global.secretAccessKey
	  },
      version: {
	    vm: 'v1'
      },
	  regionId: 'cn-north-1'
	})
	
	vm.createInstances({
	    instanceSpec: {
	      instanceType: 'g.s1.micro',
	      az: 'cn-north-1a',
	      imageId: '98d44a0f-88c1-451a-8971-f1f769073b6c',
	      name: 'node-sdk-test',
	      elasticIp: { bandwidthMbps: 2, provider: 'BGP' },
	      primaryNetworkInterface: {
 	       networkInterface: {
	          subnetId: 'subnet-3dm13k30gh',
	          az: 'cn-north-1a'
	        }
	      },
	      systemDisk: { diskCategory: 'local' },
	      description: 'sdk'
	    },
	    maxCount: 1
	  }, 'cn-north-1')
```
