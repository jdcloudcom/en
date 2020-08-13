
# API Operation Guideline
JD Blockchain Open Platform Enterprise Networking provides two methods for application access:

* Direct interaction with created blockchain network by use of the SDK officially provided by Hyperledger Fabric. For details, please refer to [Access Guideline](https://github.com/hyperledger)
* Interaction with blockchain networking by use of the HTTP API provided by the Platform

This Guideline focuses on the second access method.
> Note: The API of this version is not combined with JD Cloud OPENAPI temporarily. Besides, this document is only applicable to the function of enterprise networking and for one-click deployment of application access, please refer to the first application access method

## Unified return format
Current APIs shall be returned to the following format in a unified manner:

### API Executed

```json
{
   "code": 200,       // Execution Status Code: 200 
   "status": "ok",    // Status Phrase Character String: ok
   "data": "Operation Description and Result Searching", 
   "err_msg": null,   // When returned successfully, the specific value is null
}
```

### API Execution Failed

```json
{
   "code": 400,                  // Execution Status Code: Error codes such as 400 or 500 are basically same as the http status code
   "status": "error",            // Status Phrase Character String: error
   "data": null,                 // When returned with error, the specific value of data is null
   "err_msg": "Specific error information,     // Status detailed information character string: Specific error information
}
```

## Check service status
### Description
It is used to examine whether the API service at current blockchain nodes is normal, and when http status code is 200 and the character string returning is **ok**, the service is demonstrated as normal.
### Request Methods
GET
### Request Path
/healthz
### Request Parameters
n.a.
### Request Example
```
curl -X GET http://bc-r3scqqdhru-peerft-0-FI.jvessel-public-stag2.jdcloud.com:80/healthz 
```

### Response Example

```
ok
```

## Login
### Description
Login APIs are used for acquiring Token necessary for execution of subsequent APIs. At current stage, the validity period of Token is one hour.
### Request Methods
POST
### Request Path
/external/v1/login
### Request Format
JSON
### Request Parameters
```json
{        
	"username": "",      // API users defined at creation of blockchain network
	"password": "",      // API user passwords defined at creation of blockchain network
}
```

### Request Example
```
curl -X POST \
  http://bc-zrfyffl7cr-peerft-0-FI.jvessel-public-stag2.jdcloud.com/external/v1/login \
  -H 'Content-Type: application/json' \
  -d '{        
	"username": "user",    
	"password": "pass"
}'
```

### Response Example
> Returning results shall be extracted from the **data** field of the unified returning results

```json
{
    "expire": "",
    "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MzkyMjYzNDgsImlkIjoidGVzdHVzZXIiLCJvcmlnX2lhdCI6MTUzOTIyMjc0OH0.5zWYdquAIbdfTSjYBIZ5UB3rBjtbsyc8jBaZKAiupQc"
}
```

## Submit invoke transaction
### Description
It is used for submission of invoke transaction, and only after execution of transaction, the results can be returned
### Request Methods
POST
### Request Path
/external/v1/chaincode/invoke
### Request Format
JSON
### Request Head
* Authorization: Bearer +Token returned at login of APIs

### Request Parameters
```json
{
	"channel": "ledgerw", // Blockchain Channel ID
	"ccname": "kvchaincode",  // Chain code Name
	"function": "put", // Chain code method name to be Executed
	"args": ["k", "100"] // Input parameter of chain code method and note that here is the JSON array
}
```

### Request Example
```
curl -X POST \
  http://bc-sij02orkuz-peerft-0-FI.jvessel-public-stag2.jdcloud.com/external/v1/chaincode/invoke \
  -H 'Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1ODM3NDM5OTIsImlkIjoidXNlciIsIm9yaWdfaWF0IjoxNTgzNzQwMzkyfQ.4M7zR3X7_Tq1zG8Eo7Doi65jPzt11mL5Ziyd7vqDA50' \
  -H 'Content-Type: application/json' \
  -d '{
	"channel": "ledgerw",
	"ccname": "kvchaincode",
	"function": "put",
	"args": ["k", "100"]
}'
```

### Response Example
> Returning results shall be extracted from the **data** field of the unified returning results
```json
{
	"txId": "871bd92a39622a97e8c1384c636774c681631191558d973003a13dfbbf81e899", // ID of this transaction can be regarded as the only identifier of the blockchain under current operation
	"txValidationCode":0,
	"proposalResponse": {
		"status": 200, // Transaction Execution Status Code
		"payload": "ODcxYmQ5MmEzOTYyMmE5N2U4YzEzODRjNjM2Nzc0YzY4MTYzMTE5MTU1OGQ5NzMwMDNhMTNkZmJiZjgxZTg5OQ==" // The results from execution of transaction, the way to use specific returning results shall be in consistent with the logic of returning value by using chain code method
	}
	"ccResponse":{
		"payload":"ODcxYmQ5MmEzOTYyMmE5N2U4YzEzODRjNjM2Nzc0YzY4MTYzMTE5MTU1OGQ5NzMwMDNhMTNkZmJiZjgxZTg5OQ==",
		"status":200
	}
}
```

## Submit query transaction
### Description
It is used for submission of query transaction, and only after the execution of transaction, the results can be returned
### Request Methods
POST
### Request Path
/external/v1/chaincode/query
### Request Format
JSON
### Request Head
* Authorization: Bearer +Token returned at login of APIs

### Request Parameters
```json
{
	"channel": "ledgerw", // Blockchain Channel ID
	"ccname": "kvchaincode",  // Chain code Name
	"function": "get", // Chain code method name to be executed
	"args": ["k"] // Input parameter of chain code method and note that here is the JSON array
}
```

### Request Example
```
curl -X POST \
  http://bc-sij02orkuz-peerft-0-FI.jvessel-public-stag2.jdcloud.com/external/v1/chaincode/query \
  -H 'Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1ODM3NDM5OTIsImlkIjoidXNlciIsIm9yaWdfaWF0IjoxNTgzNzQwMzkyfQ.4M7zR3X7_Tq1zG8Eo7Doi65jPzt11mL5Ziyd7vqDA50' \
  -H 'Content-Type: application/json' \
  -d '{
	"channel": "ledgerw",
	"ccname": "kvchaincode",
	"function": "get",
	"args": ["k"]
}'
```

### Response Example
> Returning results shall be extracted from the **data** field of the unified returning results

```json
{
	"message":"",
	"payload":"100",  // The results from execution of transaction, the way to use specific returning results shall be in consistent with the logic of returning value by using chain code method
	"status":200,   // Transaction Execution Status Code
	"transactionid":"13e1aa10113d8026927469d90d6764add936c6bcebf8cc66d569ac8a9ce56580"  // ID of this transaction can be regarded as the only identifier of the blockchain under current operation
}
```

## Search information of blockchain channel
### Description
It is used to search the information on blockchain channel such as current height and block hash
### Request Methods
GET
### Request Path
/external/v1/channel/info
### Request Format
QUERY
### Request Head
* Authorization: Bearer +Token returned at login of APIs

### Request Parameters
* channelId: Channel ID

### Request Example
```
curl -X GET http://bc-oyw2mynhyj-peerft-0-FI.jvessel-public-stag2.jdcloud.com:80/external/v1/channel/info?channelId=mychannel \
  -H 'Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1ODMyMzQ1OTcsImlkIjoicSIsIm9yaWdfaWF0IjoxNTgzMjMwOTk3fQ.lYH8jHlatgfImJ98SbvOE5clov50Y76tpTXnJqiVCHc' 
```

### Response Example
> Returning results shall be extracted from the **data** field of the unified returning results
```json
{
  	"height":4, // Current block height
	"currentBlockHash":"8bba079e00b7db40257f980901ef332f10ec731b40af4804eff678a6beb5c9ac", // Current block hash
	"previousBlockHash ":"bb708f185322c9939a8696e46dd9d2e89599367e0c3e377a58126e14a4b5f932", // Previous block hash
}
```

## Search block information as per the block height
### Description
Search block information as per the block height
### Request Methods
GET
### Request Path
/external/v1/channel/block/height
### Request Format
QUERY
### Request Head
* Authorization: Bearer +Token returned at login of APIs

### Request Parameters
* channelId: Channel ID
* blockNumber: Block height

### Request Example
```
curl -X GET http://bc-oyw2mynhyj-peerft-0-FI.jvessel-public-stag2.jdcloud.com:80/external/v1/channel/block/height?channelId=mychannel&blockNumber=2 \
  -H 'Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1ODMyMzQ1OTcsImlkIjoicSIsIm9yaWdfaWF0IjoxNTgzMjMwOTk3fQ.lYH8jHlatgfImJ98SbvOE5clov50Y76tpTXnJqiVCHc' 
```

### Response Example
> Returning results shall be extracted from the **data** field of the unified returning results
```json
{
  	"blockHash":"bb708f185322c9939a8696e46dd9d2e89599367e0c3e377a58126e14a4b5f932", // Current block hash
	"blockHeight":2, // Current block height
	"previousBlockHash":"34e9a78ce62fa3b2e2e250ae6b02d4608e75d67ab48ba95acb8bbd00e8216614", // Previous block hash
	"dataHash":"a14815c79e352e63d732a641350130ff2125cd3748f82d0c1e4a8c8afb0f4869", // Current block data hash
	"blockTime":"2020-03-03 06:12:13", // Block creation time
	"txs":[{
		"txId":"9ad0ea1c81d0183d5a7b82fac854d8bf176abccf6d901b9fb5fd9158762a6962", // Transaction ID
		"txTime":"2020-03-03 06:12:13", // Transaction time
		"envelopeInfo": {} // Transaction content (the field is not contained in the specific returning value under test, which may be a result from lack of transaction content)
	}] // Block transaction assembling
}
```

## Search block information as per the block hash
### Description
Search block information as per the block hash
### Request Methods
GET
### Request Path
/external/v1/channel/block/hash
### Request Format
QUERY
### Request Head
* Authorization: Bearer +Token returned at login of APIs

### Request Parameters
* channelId: Channel ID
* blockHash: Block hash

### Request Example
```
curl -X GET http://bc-oyw2mynhyj-peerft-0-FI.jvessel-public-stag2.jdcloud.com:80/external/v1/channel/block/hash?channelId=mychannel&blockHash=bb708f185322c9939a8696e46dd9d2e89599367e0c3e377a58126e14a4b5f932 \
  -H 'Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1ODMyMzQ1OTcsImlkIjoicSIsIm9yaWdfaWF0IjoxNTgzMjMwOTk3fQ.lYH8jHlatgfImJ98SbvOE5clov50Y76tpTXnJqiVCHc' 
```

### Response Example
> Returning results shall be extracted from the **data** field of the unified returning results

```json
{
  	"blockHash":"", // Current block hash
	"blockHeight":1, // Current block height
	"previousBlockHash":"", // Previous block hash
	"dataHash":"", // Current block data hash
	"blockTime":"yyyy-mm-dd hh:MM:ss", // Block creation time
	"txs":[{
		"txId":"", // Transaction ID
		"txTime":"", // Transaction Time
		"envelopeInfo": {} // Transaction Content 
	}] // Block transaction assembling
}
```

## Search block information as per the transaction ID
### Description
Search block information as per the transaction ID
### Request Methods
GET
### Request Path
/external/v1/channel/block/txid
### Request Format
QUERY
### Request Head
* Authorization: Bearer +Token returned at login of APIs

### Request Parameters
* channelId: Channel ID
* txId: Transaction ID

### Request Example
```
curl -X GET http://bc-oyw2mynhyj-peerft-0-FI.jvessel-public-stag2.jdcloud.com:80/external/v1/channel/block/txid?channelId=mychannel&txId=9ad0ea1c81d0183d5a7b82fac854d8bf176abccf6d901b9fb5fd9158762a6962' \
  -H 'Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1ODMyMzQ1OTcsImlkIjoicSIsIm9yaWdfaWF0IjoxNTgzMjMwOTk3fQ.lYH8jHlatgfImJ98SbvOE5clov50Y76tpTXnJqiVCHc' 
```

### Response Example
> Returning results shall be extracted from the **data** field of the unified returning results

```json
{
  	"blockHash":"", // Current block hash
	"blockHeight":1, // Current block height
	"previousBlockHash":"", // Previous block hash
	"dataHash":"", // Current block data hash
	"blockTime":"yyyy-mm-dd hh:MM:ss", // Block creation time
	"txs":[{
		"txId":"", // Transaction ID
		"txTime":"", // Transaction Time
		"envelopeInfo": {} // Transaction Content 
	}] // Block transaction assembling
}
```

## Search transaction information as per the transaction ID
### Description
Search transaction information as per the transaction ID
### Request Methods
GET
### Request Path
/external/v1/channel/tx/txid
### Request Format
QUERY
### Request Head
* Authorization: Bearer +Token returned at login of APIs

### Request Parameters
* channelId: Channel ID
* txId: Transaction ID

### Request Example
```
curl -X GET \
  'http://bc-oyw2mynhyj-peerft-0-FI.jvessel-public-stag2.jdcloud.com:80/external/v1/channel/tx/txid?channelId=mychannel&txId=9ad0ea1c81d0183d5a7b82fac854d8bf176abccf6d901b9fb5fd9158762a6962' \
  -H 'Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1ODMyMzQ1OTcsImlkIjoicSIsIm9yaWdfaWF0IjoxNTgzMjMwOTk3fQ.lYH8jHlatgfImJ98SbvOE5clov50Y76tpTXnJqiVCHc' 
```

### Response Example
> Returning results shall be extracted from the **data** field of the unified returning results

```json
{
	"txId":"9ad0ea1c81d0183d5a7b82fac854d8bf176abccf6d901b9fb5fd9158762a6962", // Transaction ID
	"txTime":"2020-03-03 06:12:13", // Transaction time
	"txStatus":0, // Transaction status, 0 refers to valid status
	"invokes":[{"args": ["a","b"],"chaincode":" test","method":" put"}] // Transaction Content
}
```

## IPFS file upload
### Description
Upload files to the IPFS cluster
### Request method
POST
### Request path
/external/v1/files/upload
### Request format
multipart/form-data
### Request header
* Authorization: Bearer + Token returned by the login API
* Content-Type: multipart/form-data
### Request parameters
* file: Files

```json
curl -i -X POST \
    -H "Content-Type:multipart/form-data" \
    -H "Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1OTA2NTUzNDYsImlkIjoiMTIzIiwib3JpZ19pYXQiOjE1OTA2NTE3NDZ9.sliHlgQkKMywB1VYxM_G1nwG0ZxzDJLGrc8iKgLw8w0" \
    -F "file=@\"./file.txt\";type=application/gzip;filename=\"file.txt\"" \
   'http://bc-6oebaqruiz-peerft-0-FI.jvessel-public-stag2.jdcloud.com/external/v1/files/upload'
```

### Corresponding sample
```json
{
	"code":200,
	"status":"ok",
	"data":"QmPFULsxciTq37P9qL24ttBSsCQ1YzH1VnkKgWrCEJizcn",
	"err_msg":""
}
```

## IPFS file downloading
### Description
Download files from the IPFS cluster
### Request method
GET
### Request path
/external/v1/files/download
### Request format
QUERY
### Request header
* Authorization: Bearer + Token returned by the login API
### Request parameters
* hashId: IPFS hashes returned when uploading
* fileName: File names saved

```
curl -i -X GET \
   -H "Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1OTA3MjU0NTcsImlkIjoiMTIzIiwib3JpZ19pYXQiOjE1OTA3MjE4NTd9.H_nPesJM8mcQ2tMYBEeGOKwHQE0PigjmnEZ20ptBoNI" \
 'http://bc-qgrpi7heoh-peerft-0-FI.jvessel-public-stag2.jdcloud.com/external/v1/files/download?hashId=QmSAQam7ikKh2J1JCBfuZhbv1opCQRWuZacKK5ZbkHw4Yy&fileName=file.txt'
```