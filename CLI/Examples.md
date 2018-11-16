
# Use Example

## Create A Container in JSON

	jdc nc create-containers --input-json \
    '{
        "maxCount": 1, 
        "regionId": "cn-north-1",
        "containerSpec": 
        {
            "instanceType": "g.s1.micro", 
            "az": "cn-north-1b",  
            "name": "cli-test",
            "image": "library/httpd",
            "command": ["/bin/bash"],
            "tty": true,
            "rootVolume": 
            {
                "category": "cloud", 
                "cloudDiskSpec": 
                {
                    "az": "cn-north-1b", 
                    "name": "testaa", 
                    "diskType": "ssd", 
                    "diskSizeGB": 20
                }
            }, 
            "primaryNetworkInterface": 
            {
                "networkInterface": 
                {
                    "subnetId": "subnet-ejs1bir2b2", 
                    "az": "cn-north-1b"
                }
            }
        }
    }'
   

## Create A Container Using File

If the json string in the upper section is stored in the container-spec.json of a directory, you can create a container using the following command.

Linux & macOS：

	jdc nc create-containers --input-json 'file:///tmp/container-spec.json'
   

Windows：

	jdc nc create-containers --input-json  'file://c:/container-spec.json'
   

## Start Container

	jdc nc start-container --container-id c-igz8rekh5q
Return:

	{
	    "error": null,
	    "result": null,
	    "request_id": "bcajj7uhqf35o1cajrbu9umfuwe5uruu"
	}
   

## Query Container

	jdc nc describe-container --container-id c-igz8rekh5q
Return: 

	{
    "error": null,
    "result": {
        "container": {
            "tty": false,
            "vpcId": "vpc-0bf7bkl91s",
            "image": "nginx:latest",
            "elasticIpAddress": "",
            "subnetId": "subnet-84ahj1qekm",
            "az": "cn-north-1a",
            "instanceType": "g.n2.medium",
            "description": "",
            "envs": null,
            "hostAliases": null,
            "hostname": "c-igz8rekh5q",
            "workingDir": "",
            "charge": {
                "chargeRetireTime": "",
                "chargeStartTime": "2018-05-28T16:31:37Z",
                "chargeExpiredTime": "",
                "chargeStatus": "normal",
                "chargeMode": "postpaid_by_duration"
            },
            "secret": "",
            "rootVolume": {
                "category": "cloud",
                "mountPath": "/",
                "autoDelete": true,
                "fsType": "xfs",
                "cloudDisk": {
                    "status": "in-use",
                    "name": "test",
                    "diskType": "ssd",
                    "diskSize": 10,
                    "az": "cn-north-1a",
                    "createTime": "2018-05-28 16:31:38",
                    "diskId": "vol-wi2e13nhdv",
                    "description": ""
                },
                "readOnly": false
            },
            "launchTime": "2018-05-28 16:32:13",
            "privateIpAddress": "10.0.0.18",
            "status": "running",
            "containerId": "c-igz8rekh5q",
            "elasticIpId": "",
            "args": null,
            "logConfiguration": null,
            "reason": "taskCompleted",
            "dataVolumes": null,
            "name": "test",
            "primaryNetworkInterface": {
                "deviceIndex": 1,
                "networkInterface": {
                    "macAddress": "fa:16:3e:81:55:37",
                    "vpcId": "vpc-0bf7bkl91s",
                    "description": "",
                    "networkInterfaceId": "port-0pvhhh2mdy",
                    "secondaryIps": null,
                    "sanityCheck": false,
                    "securityGroups": [
                        {
                            "groupName": "Default security group open all ports",
                            "groupId": "sg-iuqpipzp30"
                        }
                    ],
                    "subnetId": "subnet-84ahj1qekm",
                    "primaryIp": {
                        "elasticIpAddress": "",
                        "elasticIpId": "",
                        "privateIpAddress": "10.0.0.18"
                    }
                },
                "attachTime": "",
                "autoDelete": true,
                "attachStatus": ""
            },
            "command": null
        }
    },
    "request_id": "bcajk4jk2vh52d5u8tgejwpjubqhc68s"
	}
	
	
## Use Filters Parameter Query Container

 	jdc nc describe-containers --filters '[{"name":"name", "operator":"eq", "values":["container-name"]}]'
  

## Delete Container

	jdc nc delete-container --container-id c-igz8rekh5q
Return: 

	{
	    "error": null,
	    "result": null,
	    "request_id": "bcajksbtncchv08qwaimfip2mjurupm0"
	}