## Application Security Gateway Log
### Introduction
Currently, the type of application security official website log accessed to Log Service is the WAF access log.

### Field Description
Log Field | Log Description | Log Type
-- | -- | --
time | Time | time
waf_id | wafid | string
weblock_hit | Whether Hit the Webpage Tamper-Proofing | string
weblock_hit_id | Webpage Tamper-proofing id | string
cc_hit | Whether Hit cc | string
cc_hit_id | ccHit Rule id | string
urule_hit | Whether Hit User Rule | string
urule_hit_id | User Rule id | string
waf_hit | Whether Hit waf Rule | string
waf_hit_id | wafRule Hit id | string
remote_addr | Access Source Address | string
server_addr | Server Address | string
http_cookie | cookie | string
upstream_addr | rsAddress | string
request_time | Access Time | double
upstream_connect_time | rsConnection Time | double
upstream_response_time | rsResponse Time | double
status | Status Code | int
upstream_status | rsStatus Code | string
request_length | Access Length | int
bytes_sent | Sent Length | int
request_method | Request Method | string
host | host | string
request_uri | Request uri | string
server_protocol | Protocol | string
http_referer | referer | string
http_user_agent | user_agent | string
ssl_cipher | Encryption Algorithm | string
ssl_protocol | sslProtocol | string

