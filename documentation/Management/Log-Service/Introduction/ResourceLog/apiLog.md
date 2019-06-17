## API Gateway Log
### Introduction
At present, the log type of the API Gateway for access of log service is the **API Calling Log**.

### Field Description
Log Field | Log Description | Log Type
-- | -- | --
version | Request version number: always be "1" | string
req_id | request id: Every request is unique for the same service (For the same request chain, you can share REQID, or share the REQID prefix) | string
time | Format of $msec output of nginx is 1525259222.686 | string
ip | Request IP: Format is "1.2.3.123" | string
pin | Format is "userName" which is JD Mall account base64 format, caller pin | string
host | Request HOST address: Format is "xi6d7nci0239.cn-north-1.jdcloud-api.net" | string
method | Request HTTP method: Format is "GET", "POST", etc., using the uppercase | string
SCHEME | Request scheme: Format is "http", "https", etc., using the lowercase | string
path | Request HTTP PATH: Format is "GET /hello?a=1&b=2 HTTP/1.1", without quotation marks at both ends  | string
request_content_length | Request content length: Format is  "123456" | string
response_status | Response status code: Format is "200", "400" , "500" , "502" |string
response_content_type | Response format: Format is "application/json" | string
response_content_length | Response content length: Format is "123456" . Note: It is for the part of body only, which has nothing to do with the HEADER | string
reponse_time | Response time: "0.123", the unit is second, accurate to millisecond | string
x_forwarded_for | X-Forwarded-For:XFF head for short; real IP of request side of client HTTP: Format is "12.34.56.78"; it can be "-" | string
referer | Request source: Format is "http://www.baidu.com"; if there is no source, denoting with "-" | string
user_agent | Request client agent: Format example "JdcloudSdkPython/1.0.0 vm/0.6.1" | string
upstream_response_time | Product line processing duration, "0.123",  the unit is second, accurate to millisecond | string
call_log | Dependent service processing duration; format is "UC:5,FUNC:0", etc. | string
uuid |  uuid passed by the caller | string
upstream_host | Upstream Address | string
code_source | Status code response source; format is "upstream" or "gw" | string
service_prod | Environment identifier; format is "apim" | string
group_id | api identifier, containing environmental information; format is ag-xi6d7nci0239-online; wherein, online refers to the environmental information | string
group_name | Group name and format. Only support numbers, uppercase and lowercase letters, English underline "_" and line-through "-", and cannot exceed 32 characters | string
api_name | api name and format. Only support numbers, uppercase and lowercase letters, English underline "_" and line-through "-", and cannot exceed 32 characters | string
api_version | api version; format, such as 0.0.1 | string
proxy_time | Gateway time: "0.123", the unit is second, accurate to millisecond | string
creater_pin | Format is "userName" which is JD Mall account base64 format, creator pin | string
