# describeTicket


## Description
Search ticket detail

## Request Method
GET

## Request Address
https://jdccs.jdcloud-api.com/v1/tickets/{ticketNo}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ticketNo**|String|True| |Ticket No.|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeticket#result)| |
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**ticket**|[Ticket](describeticket#ticket)|Ticket Details|
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
