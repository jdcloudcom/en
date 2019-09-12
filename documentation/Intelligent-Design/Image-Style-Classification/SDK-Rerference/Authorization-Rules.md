# Signature Algorithm #
## Step 1: Create standard request strings and encrypt ##
Firstly, splice the requests in the following fixed form to generate a standard request string. 
Example Pseudocode
 

	CanonicalRequest =
	  HTTPRequestMethod + '\n' +
	  CanonicalURI + '\n' +
	  (CanonicalQueryString or '') + '\n' +
	  CanonicalHeaders + '\n' +
	  SignedHeaders + '\n' +
	  Lowercase(HexEncode(Hash(RequestPayload or '')))


In the pseudocode:

HTTPRequestMethod is HTTP Protocol request method, such as POST and GET, and is indicated with complete uppercase letters.

CanonicalURI is the request path after URI coding.

CanonicalQueryString is request search character string. To construct a standard search character string, firstly sequence the **parameter names** based on character codes in ascending order, and then sequence the parameters with repeated name** based on values in ascending order**. Then, respectively carry out URI coding ** for the name and value of each ** parameter (please don’t carry out coding repeatedly). Then, start constructing standard search character strings from the first parameter name in the sorted list. **For each parameter, add the parameter name of URI code, followed by equal sign character (=) followed by the parameter value of URI code** Use a null character string for parameters with no values. Add sign "&" after each parameter value, except the last value in the list.

To create a list with standard HTTP Request Head, please convert the names of all HTTP heads into **lowercase** (please guarantee that the Request Head name doesn’t contain spaces), and **delete the leading space and following space in the Request Head value. Construct standard HTTP Request Head lists by sequencing the request heads in **ascending order** of character codes and then traversing the Request Head name. Note**: x-jdcloud-date** (the ISO8601 standard is obeyed; the UTC time is used; and the format is YYYYMMDDTHHmmssZ), **x-jdcloud-nonce** must be contained in requests and involved in signature; in case of a **x-jdcloud-security-token** head, it must also be involved in signature.

CanonicalHeaders indicates the request head and value required to be involved in signature, use: Name and value isolated, line break added.
SignedHeaders is used for notifying JD Cloud of which request heads are part of the signature process.

Finally, it is required to express the payload in the request body in the form of **lowercase hexadecimal character string** after it undergoes SHA256 hash. If the effective load is null, an empty character string is used as the input of Hash function.

 

POST Example Request

 
	POST
	/v1/regions/cn-north-1/instances 

	content-type:application/json
	host:vm.jdcloud-api.com
	x-jdcloud-date:20180404T034307Z
	x-jdcloud-nonce:ed558a3b-9808-4edb-8597-187bda63a4f2 	

	content-type;host;x-jdcloud-date;x-jdcloud-nonce
	eadd64d9bd63436404495b9a2cd0a5b4c59b01332a88d81da27815824b3c4280
 

GET Example Request

	GET
	/v1/regions/cn-north-1/metrics/cpu_util/metricData
	serviceCode=vm&startTime=2018-04-04T06%3A01%3A46Z
	content-type:application/json
	host:vm.jdcloud-api.com
	x-jdcloud-date:20180404T061302Z
	x-jdcloud-nonce:ed558a3b-9808-4edb-8597-187bda63a4f2 
	
	content-type;host;x-jdcloud-date;x-jdcloud-nonce
	eadd64d9bd63436404495b9a2cd0a5b4c59b01332a88d81da27815824b3c4280
 

## Signature step 2: Generate character strings to be signed ##
To create the character strings to sign, please connect to the algorithm, date and time of rule request, display in the following pseudocode according to the scope and abstract:

 
	StringToSign =
    Algorithm + \n +
    RequestDateTime + \n +
    CredentialScope + \n +
    Lowercase(HexEncode(Hash(CanonicalRequest)))

In which,
 

The Algorithm fixed as JDCLOUD2-HMAC-SHA256 is the algorithm.

RequestDateTime must be completely **the same as the format and value** in HTTP Request Head x-jdcloud-date.

The format of CredentialScope is "{time}/{regional coding}/{product line}/jdcloud2_request", e.g., 20180130/cn-north-1/vpc/jdcloud2_request

Lowercase (HexEncode(CanonicalRequest)) is indicated as **lowercase hexadecimal character string** after the standard request generated in step 1 undergoes **SHA256 hash**.

For example:

	JDCLOUD2-HMAC-SHA256
	20180404T061302Z
	20180404/cn-north-1/monitor/jdcloud2_request
	5d7d08a5b792a63ad0bd820cff95ff41c6dbcf4bd7bae9e371be0ff891740ee7
 

## Signature step 3: Calculate signature ##
Calculated pseudocode

	kSecret = JD Cloud Access Key Secret
	kDate = HMAC("JDCLOUD2" + kSecret, Date)
	kRegion = HMAC(kDate, Region)
	kService = HMAC(kRegion, Service)
	kSigning = HMAC(kService, "jdcloud2_request")


Specifically, HMAC(key, data) represents the HMAC-SHA256 function returned and output in the binary format. The date format used in hashing is YYYYMMDD, and the value must be the same as in x-jdcloud-date. Region means regional coding, and Service means product line name.

Carry out HMAC computing with the generated kSigning for the character string to be signed as obtained in step 2, and convert the calculation result into a lowercase hexadecimal character string:

    signResult = Lowercase(HexEncode(HMAC(kSigning, StringToSign)))

Finally a signature string is generated, such as:

	9b2026198d3acbf99da395e23a994ed369a0d70f5b4a5d7567dd0caf3009656d

 

## Signature step 4: Add signature information in the request ##
After calculating the signature, the signed result is required to be added in the request as Authorization request header.

Authorization format is
JDCLOUD2-HMAC-SHA256 Credential={Access Key}/{Date}/{Region}/{Service}/jdcloud2_request, SignedHeaders={SignedHeaders}, Signature={signResult}

Example of curl command call method:

	curl -X GET -H "x-jdcloud-date:20180404T061302Z" -H "x-jdcloud-nonce:ed558a3b-9808-4edb-8597-187bda63a4f2" -H "Authorization:JDCLOUD2-HMAC-SHA256 Credential=C61249XXXXXXXXXXXXXXXXXX/20180404/cn-north-1/monitor/jdcloud2_request, SignedHeaders=content-type;host;x-jdcloud-date;x-jdcloud-nonce, Signature=9b2026198d3acbf99da395e23a994ed369a0d70f5b4a5d7567dd0caf3009656d" -H "Content-Type:application/json" "http://vm.jdcloud-api.com/v1/regions/cn-north-1/metrics/cpu_util/metricData?serviceCode=vm&startTime=2018-04-04T06:01:46Z"


## Signature Steps Example ##
If the entered information of user signature is:

    Access Key：'TESTAK'
    Access Key Secret：'TESTSK'
    Date：'20190214T104514Z'
    Region：'cn-north-1'
    Service：'test'
    Request Address and Path: 'http://test.jdcloud-api.com/v1/resource:action?p1=p1&p0=p0&o=%&u=u'
    Request Head involved in signature:
         'x-jdcloud-date' => '20190214T104514Z',
         'x-jdcloud-nonce' => 'testnonce',
         'x-my-header' => 'test',
         'x-my-header_blank' => ' blank'
    Request Address and Path: 'http://test.jdcloud-api.com/v1/resource:action?p1=p1&p0=p0&o=%&u=u'
    Request Body: ‘body data'
   
The result of step 1 shall be:

    POST
    /v1/resource%3Aaction
    o=%25&p0=p0&p1=p1&u=u
    x-jdcloud-date:20190214T104514Z
    x-jdcloud-nonce:testnonce
    x-my-header:test
    x-my-header_blank:blank
    
    x-jdcloud-date;x-jdcloud-nonce;x-my-header;x-my-header_blank
    e51832a118eeff7ad976d635b7d04538e362e4c21bd0f6253580b0a83a209074
    
The result of step 2 shall be:

    JDCLOUD2-HMAC-SHA256
    20190214T104514Z
    20190214/cn-north-1/test/jdcloud2_request
    fb2e317056269590681d091f8eb22272967c0b922b2deda887312215ea4eed4c
    
The result of step 3 shall be:

    (Attention: kDate, kRegion, kService and kSigning shall be the results in binary format, and the followings display the result after conversion into hexadecimal character string. This is only for the purpose of page display, and in actual signature process, the hexadecimal conversion result can never be taken as the entry of the next step. Please use the original data in binary format.)
	kDate = dbbdee87f18afeedd6456923587f5323b90c3a77fbc6e381b243c90c672d5daf
	kRegion = 78e1da51757851329da8e31a6bad9f509c4816cacb8d5b2b9d171e49498ce4b6
	kService = 44050ec21c8e839f36ff5b2d44ec4a5876f4ffd6ef9a7a692a3eba40396bdb68
	kSigning = a4e50bcb6001be0008696b173c30172b5ce22a77db00d21c6a9d69de2ba33b7d

    signResult = 2a98f83c074e7bee260bfc8ef64f009c07595bd93f7f0c3f4e156bf6479ed9bf
The result of step 4 shall be:

    JDCLOUD2-HMAC-SHA256 Credential=TESTAK/20190214/cn-north-1/test/jdcloud2_request, SignedHeaders=x-jdcloud-date;x-jdcloud-nonce;x-my-header;x-my-header_blank, Signature=2a98f83c074e7bee260bfc8ef64f009c07595bd93f7f0c3f4e156bf6479ed9bf
