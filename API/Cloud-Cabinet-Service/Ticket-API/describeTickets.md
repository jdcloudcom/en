# describeTickets


## Description
Search ticket list

## Request Method
GET

## Request Address
https://jdccs.jdcloud-api.com/v1/tickets


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number, xxx by default1|
|**pageSize**|Integer|False|20|Paging size, default value is20|
|**type**|String|False| |Ticket TAB type  pendingProcess: to be processed  pendingReview: to be reviewed  processing: processing  all: all (default)|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describetickets#result)| |
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**tickets**|[Ticket[]](describetickets#ticket)|Ticket List|
|**pageNumber**|Integer|Page|
|**pageSize**|Integer|Paging Size|
|**totalCount**|Integer|Total Count|
### <div id="ticket">Ticket</div>
|Name|Type|Description|
|---|---|---|
|**ticketNo**|String|Ticket No.|
|**ticketTemplateName**|String|Ticket name|
|**ticketTemplateCode**|String|Ticket Template CODE|
|**ticketTypeName**|String|Ticket type|
|**status**|String|Ticket status  pendingReview: to be reviewed  revoked: revoked  processing: processing  pendingVerification: to be verified  pending close: to be closed  rejected: rejected  completed: completed  canceled: canceled  draft: draft|
|**description**|String|Description|
|**createdTime**|String|The creation time is subject to the standard ISO8601 and adopts the UTC time in the format of yyyy-MM-ddTHH:mm:ssZ|
|**closedTime**|String|The disabled time is subject to the standard ISO8601 and adopts the UTC time in the format of yyyy-MM-ddTHH:mm:ssZ|
|**phone**|String|Phone Number|
|**email**|String|Email|
|**idc**|String|English Identifier of Data Center|
|**idcName**|String|Data Center Name|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
