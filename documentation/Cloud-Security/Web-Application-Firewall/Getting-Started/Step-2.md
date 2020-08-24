# Release Back-to-origin IP

The Web Application Firewall (hereinafter referred to as WAF) uses specific back-to-origin IP segment to forward the normal traffic tested by the protection engine to the origin server of the site domain. When a website is accessed to the Web firewall for protection, you need to set the security software IAM policy for the origin server and release the inward traffic of the WAP back-to-origin IP segment.

## Background Information

After your website is successfully accessed to WAF protection, all requests for accessing your website will be forwarded to the WAF instance at firs and the be returned to the origin server after filtering by the WAF instance. As the IP count of WAF instance is limited, all requests received by the origin server come from the IPs. If your origin server uses any security software such as Safedog and Clock Chain, you must set the back-to-origin IP segments, used for releasing Web Application Firewall, in the origin server software, avoiding the situation that the normal traffic of origin server, forwarded by the Web Application Firewall, is judged as the abnormal attack and is further intercepted and protecting normal website access against influence.

## Release WAF Back-to-origin IP Segment  

Please add the following back-to-origin IP segments to the white list of the security software of origin server:

101.124.31.248/30

101.124.23.116/30

14.116.246.0/29

103.40.15.0/29

101.124.48.0/26

116.198.194.0/29

114.67.121.64/27



