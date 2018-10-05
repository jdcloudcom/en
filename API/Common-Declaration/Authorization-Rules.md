# Signature Algorithm #
## Step 1: Create standard request string and encrypt it ##
To start the signature process, please create a string containing request information in a canonical format. This will ensure that JD Cloud can calculate the same signature as you have done when it receives the request. 

The following example shows the pseudo-code for creating canonical request.

Show the pseudo-code for canonical request

 

	CanonicalRequest =
	  HTTPRequestMethod + '\n' +
	  CanonicalURI + '\n' +
	  (CanonicalQueryString or '') + '\n' +
	  CanonicalHeaders + '\n' +
	  SignedHeaders + '\n' +
	  Lowercase(HexEncode(Hash(RequestPayload or '')))


In this pseudo-code:

HTTPRequestMethod refers to HTTP request mode such as POST, GET and so on.

CanonicalURI refers to request path.

CanonicalQueryString refers to request for querying string. To build a canonical query string, firstly sort the parameter names in ascending order of character code, and then encode URI for each parameter name and value. Next, start to build the canonical query string from the first parameter name in the sorting list. For each parameter, the name of URL-encoded parameter should be appended, followed by an equal sign character (=), followed by the value of URL-encoded parameter. Empty strings are used for parameters that are not valued. & symbol should be appended after each parameter value, except for the last value in the list.

CanonicalHeaders refers to the request header and value that need to participate in the signature. To create a list of canonical HTTP request headers, please convert all HTTP header names to lowercase and delete leading and trailing spaces. Sort the request headers in ascending order of character code, and then traverse the request header names to build a list of canonical HTTP request headers. Use: Separate names and values, and add line breaks.

SignedHeaders are used to tell JD Cloud which of the request headers are part of the signature process and which can be ignored by JD Cloud (for example, any additional headers added by the proxy). Pay attention that host, x-jdcloud-date and x-jdcloud-nonce must be included.

Finally, it needs to express the payload in body by sixteen string in lowercase after SHA256 hashing. If the payload is empty, the empty string is used as the input to the hash function.

 

Example for POST Request

 
	POST
	/v1/regions/cn-north-1/instances 

	content-type:application/json
	host:vm.jdcloud-api.com
	x-jdcloud-date:20180404T034307Z
	x-jdcloud-nonce:ed558a3b-9808-4edb-8597-187bda63a4f2 	

	content-type;host;x-jdcloud-date;x-jdcloud-nonce
	eadd64d9bd63436404495b9a2cd0a5b4c59b01332a88d81da27815824b3c4280
 

Example for GET Request

	GET
	/v1/regions/cn-north-1/metrics/cpu_util/metricData
	serviceCode=vm&startTime=2018-04-04T06%3A01%3A46Z
	content-type:application/json
	host:vm.jdcloud-api.com
	x-jdcloud-date:20180404T061302Z
	x-jdcloud-nonce:ed558a3b-9808-4edb-8597-187bda63a4f2 
	
	content-type;host;x-jdcloud-date;x-jdcloud-nonce
	eadd64d9bd63436404495b9a2cd0a5b4c59b01332a88d81da27815824b3c4280
 

## Signature Step 2: Generate the string to be signed ##
To create a string for signature, please concatenate the algorithm, date and time, credential range and summary of the rule request, as shown in the following pseudo-code:

 
	StringToSign =
    Algorithm + \n +
    RequestDateTime + \n +
    CredentialScope + \n +
    HashedCanonicalRequest

Among which,
 

Algorithm always refers to JDCLOUD2-HMAC-SHA256.

The date is in the same format as the one in the x-jdcloud-date HTTP request header, that is, YYYYMMDD'T'HHMMSS'Z', the value of which must match the one used in any previous step.

The format of CredentialScope is ”{time}/{region code}/{product line}/jdcloud2_request\n”, for example, 201130 / cn-north-1/vpc/ jdcloud2_request\n

HashedCanonicalRequest refers that the standard request generated in Step 1 is expressed by sixteen string in lowercase after SHA256 hashing.

E.g:

	JDCLOUD2-HMAC-SHA256
	20180404T061302Z
	20180404/cn-north-1/monitor/jdcloud2_request
	5d7d08a5b792a63ad0bd820cff95ff41c6dbcf4bd7bae9e371be0ff891740ee7
 

## Signature Step 3: Compute signature ##
Pseudo-code for Computing

	kSecret = your secret access key
	kDate = HMAC("JDCLOUD2" + kSecret, Date)
	kRegion = HMAC(kDate, Region)
	kService = HMAC(kRegion, Service)
	kSigning = HMAC(kService, "jdcloud2_request")


Among which, HMAC (key, data) represents the output of HMAC-SHA256 function in binary format. The date format used during hashing is YYYYMMDD. Region refers to the region code, and Service refers to the name of production line.

Finally, a signature string is generated, for example:

	9b2026198d3acbf99da395e23a994ed369a0d70f5b4a5d7567dd0caf3009656d

 

## Signature Step 4: Add signature information to the request ##
After computing the signature, the result of the signature should be added to the request as the Authorization request header.

Example of calling by curl command:

	curl -X GET -H "x-jdcloud-date:20180404T061302Z" -H "x-jdcloud-nonce:ed558a3b-9808-4edb-8597-187bda63a4f2" -H "Authorization:JDCLOUD2-HMAC-SHA256 Credential=C61249XXXXXXXXXXXXXXXXXX/20180404/cn-north-1/monitor/jdcloud2_request, SignedHeaders=content-type;host;x-jdcloud-date;x-jdcloud-nonce, Signature=9b2026198d3acbf99da395e23a994ed369a0d70f5b4a5d7567dd0caf3009656d" -H "Content-Type:application/json" "http://vm.jdcloud-api.com/v1/regions/cn-north-1/metrics/cpu_util/metricData?serviceCode=vm&startTime=2018-04-04T06:01:46Z"
