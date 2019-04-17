Brief Steps for Use of openapi:

### 1. Prepare AKSK

For system users, please apply to IAM.

For individual users, please obtain it from JD Cloud [Console](https://uc.jdcloud.com/accesskey/index).

### 2. Download SDK

Taking Golang as an example, please refer to [Go](https://docs.jdcloud.com/cn/sdk/go) for the download and use instructions

### 3. Example of Use of JD Cloud DNS Interface

```
func initDNSClient() *ClouddnsserviceClient{
	// AKSK that has applied for; the following is an example of a system user
	accessKey := "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
	secretKey := "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
	credentials := NewCredentials(accessKey, secretKey)

	config := NewConfig()
	config.SetScheme(SchemeHttp)
	// Cloud Gateway Endpoint
	config.SetEndpoint("clouddnsservice.jdcloud-api.com")

	client := NewClouddnsserviceClient(credentials)
	client.SetConfig(config)
	return client
}
```

Obtain the Primary Domain first:

```
func GetDomains() {
    // Initialization
	client := initDNSClient()
	// Request Assignment
	req := apis.NewGetDomainsRequest("cn-north-1", 1, 10)
	req.AddHeader("x-jdcloud-pin", "UserName")
	
	// Make a request
	resp, err := client.GetDomains(req)
	// Output Result
	if err != nil {
        client.Logger.Log(1, "err ->", err.Error())
	} else {
		if resp.Error.Code != 0 {
			fmt.Println("Error: ", resp.Error.Status, resp.Error.Message, resp.Error.Code)
		} else {
			fmt.Println(resp.Result)
		}
	}
}
```

For example, the domainId of jdclou.com is 199, add A record of the subdomain www.jdcloud.com:

```
func AddRR() {
	// Initialization
	client := initDNSClient()
	// Request Assignment
	rr := &models.AddRR {
        	/* Host Record  */
        	HostRecord: "www",
        	/* Value of Resolution Record  */
        	HostValue: "1.2.3.4",
        	/* TTL of Resolution Record  */
        	Ttl: 600,
        	/* Type of Resolution  */
        	Type: "A",
        	/* ID of Resolution Line, please call getViewTree interface to get the ID of resolution Line.  */
        	ViewValue: -1,
    	}
	req := apis.NewAddRRRequest("cn-north-1", "199", rr)
	req.AddHeader("x-jdcloud-pin", "UserName")
	
	// Make a request
	resp, err := client.AddRR(req)
	// Output Result
	if err != nil {
        client.Logger.Log(1, "err ->", err.Error())
	} else {
		if resp.Error.Code != 0 {
			fmt.Println("Error: ", resp.Error.Status, resp.Error.Message, resp.Error.Code)
		} else {
			fmt.Println(resp.Result)
		}
	}
}
```

Add a primary domain abcde.com for package of the free version:

```
func AddFreeDomain() {
	// Initialization
	client := initDNSClient()

	// Request Assignment
	req := apis.NewAddDomainRequest("cn-north-1", 0, "abcde.com")
	req.AddHeader("x-jdcloud-pin", "UserName")
	
	// Make a request
	resp, err := client.AddDomain(req)

	// Output Result
	if err != nil {
        client.Logger.Log(1, "err ->", err.Error())
	} else {
		if resp.Error.Code != 0 {
			fmt.Println("Error: ", resp.Error.Status, resp.Error.Message, resp.Error.Code)
		} else {
			fmt.Println(resp.Result)
		}
	}
}
```

For more interfaces, please view [Overview Page](https://docs.jdcloud.com/cn/jd-cloud-dns/api/overview).
