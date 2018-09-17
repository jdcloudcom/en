
# JD Cloud Golang SDK

[![GoDoc](https://godoc.org/github.com/jdcloud-api/jdcloud-sdk-go?status.svg)](https://godoc.org/github.com/jdcloud-api/jdcloud-sdk-go)

Welcome to the JD Cloud Developer Golang Kit (Go SDK). With JD Cloud Go SDK, you can access the services provided by JD Cloud without complex programming.
To conveniently understand the meaning of some of the concepts and parameters in the SDK, we recommend that you review the OpenAPI to use the Getting Started document before using the SDK.

## Environment Preparation
1. The JD Cloud Go SDK is suitable for Go 1.6 and above.
2. Before apply for JD Cloud open API, [AccessKey management page](https://uc.jdcloud.com/accesskey/index) shall be called out for application of accesskey and secretKey Key Pair (AK/SK). AK/ SK information shall be kept properly and if lost, it is likely to cause illegal users to use this information to operate your resources on the cloud, resulting data or property losses.

## Download and install
1. Download address of JD Cloud Go SDK:[Go SDK](https://github.com/jdcloud-api/jdcloud-sdk-go).
2. You can also obtain the installation package using the following command, which is downloaded to the first path or directory in the GOPATH environment variable.

    `go get github.com/jdcloud-api/jdcloud-sdk-go/core github.com/satori/go.uuid`

## Call SDK
### The calling of the service side SDK is mainly divided into four steps:
1. Set accessKey and secretKey
2. Create Business Client
3. Set Request Parameters
4. Response to implementation requests

### The general code of is as follows:
``` go
package main

import (
	"fmt"
  	. "github.com/jdcloud-api/jdcloud-sdk-go/services/vm/apis"
	. "github.com/jdcloud-api/jdcloud-sdk-go/services/vm/client"
	. "github.com/jdcloud-api/jdcloud-sdk-go/core"
)

func main() {
	accessKey := "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
	secretKey := "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
	credentials := NewCredentials(accessKey, secretKey)
	client := NewVmClient(credentials)

	req := NewDescribeInstancesRequest("cn-north-1")
	resp, err := client.DescribeInstances(req)
	if err != nil {
		return
	}
	fmt.Println(resp.Result.Instances)
	fmt.Println(resp.Result.TotalCount)
	fmt.Println(len(resp.Result.Instances))
}
```
If you need to set up an additional header, for example to call an interface that opens the MFA operation protection, you need to pass x-jdcloud-security-token, as follows:
```
req := NewDeleteInstanceRequest("cn-north-1", "i-xxxxx")
req.AddHeader("x-jdcloud-security-token", "xxx")
resp, err := client.DeleteInstance(req)
```
Refer to the test cases in demo to access each business line interface of JD Cloud.
