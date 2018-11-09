# Cross-origin Resource Sharing Setting

The cross-origin resource sharing (CORS) defines the interaction method between a client Web application program loaded in one domain and resources in another domain. When any one of the protocol, domain name and port requesting URL is different from the current page address, it is cross-origin. For example, the most common one is to call a resource in one domain name in the webpage under another domain name, such as a JavaScript script, Web fonts, etc. The browser limits cross-origin HTTP requests originating from scripts usually out of security reasons, and the default security limit is the same-origin policy. As a result, a cross-origin access check mechanism is recommended by W3C, i.e., CORS. With the mechanism, the Web application server is able to support the cross-station identity and access management, make the cross-station data transmission safer and relieve risk of cross-origin HTTP request. You can refer to the W3C CORS specification for [CORS rules](https://www.w3.org/TR/cors/).

Common customer scenarios for cross-origin resource sharing:

1. Call XMLHttpRequest or FetchAPI to access resources through cross-site method;

2. Web fonts, call fonts across origins with @font-face through CSS (Web fonts hosted by OSS require preflight when the browser loads);

3. Draw charts and videos through the canvas tags;

## Implementation of Cross-origin Resource Sharing

Cross-Origin Resource Sharing (CORS) is a standard cross-origin solution provided by HTML5. The process of processing cross-origin requests by the server is as follows:

1.CORS indicates the source domain through the Header with attached Origin in the HTTP request. After the server side receives the request, firstly check whether the HTTP Header has an Origin field; if the HTTP Header does not have an Origin, or does not allow it, then process it as a normal request. Process completed.

2.If the HTTP Header has an Origin and allows it, the server will include the Access-Control-Allow-Origin Header in the returned response.

3.The browser determines whether the cross-origin request is successful according to whether the corresponding Header is returned. If there is no corresponding attached Header, the browser will intercept the request; in addition, it needs to judge whether the request is a simple request or a Preflighted Request; if it is not a simple request, the browser will not immediately execute the corresponding request code, but will firstly send a Preflighted Request, which is an OPTION request used to query whether the server to be accessed across origins allows the pages under the current domain name to send cross-origin requests. The OPTIONS request Headers will include the following Headers: Origin, Access-Control-Request-Method, Access-Control-Request-Headers. After the server receives the OPTIONS request, set the Headers of Access-Control-Allow-Origin, Access-Control-Allow-Method and Access-Control-Allow-Headers to communicate with the browser to judge whether to allow the request. If the Preflighted Request is verified, the browser will send a true cross-origin request. Otherwise, the browser will intercept the next request.

4.If the server allows all cross-origin requests, set the Header of Access-Control-Allow-Origin to *, but do not recommend it.

5.Successful CORS rules matching must meet three conditions. Firstly, the requested Origin must match an AllowedOrigin item; secondly, the requested method (such as GET, PUT, etc.) or the Access-Control-Request-Method Header requested by OPTIONS must match an AllowedMethod item; and lastly, each Header contained in the Headers of Access-Control-Request-Headers requested by OPTIONS must match an AllowedHeader item.

## Details Analysis:

1.The configuration of the CORS rules is applied to the Bucket level. The Bucket does not enable the CORS rules by default, and all the Origins requested across origins are not allowed; the CORS settings of each Bucket are assigned by multiple CORS rules, and each Bucket allows at most 10 rules. If the CORS rules are added by customized XML method, then the XML document allows the size of 16KB at most.

2.CORS-related Header attachments are automatically done by the browser; the user does not need to conduct any extra actions. The CORS request is completely independent of the identity authentication of Object Storage Service, namely the CORS rules are only used to determine whether or not to attach CORS-related Header, and it is only determined by the browser whether to intercept the request.

3.When using cross-origin requests, pay attention to whether the browser has turned on the Cache function. When two pages respectively from www.example1.com and www.example2.com running on the same browser both request the same cross-origin resource simultaneously, if the request of www.example1.com arrives at the server first, the server will bring the resource to the Header of Access-Control-Allow-Origin to return it to the user for www.example1.com. At this time, www.example2.com initiates a request again, and the browser will return the last request of the Cache to the user. If the contents of the Header do not match the requirements of the CORS at this time, the subsequent request will fail.

## The setup process in the console is as follows:

1.Login to the console->Object Storage Service->Space Management->Login to a certain Bucket->Space Settings, name it as “Cross-origin Access Settings”:

![跨域访问设置](../../../../../image/Object-Storage-Service/OSS-037.png)

2.Click **Cross-origin Access Settings** and the following is a list of CORS rules. Each bucket supports at most 10 rules by default. The description of each field of the rule list is as follows:

a. Source Allowed Origin: Multiple sources allowing cross-origin requests can be assigned simultaneously. The configuration shall be with complete domain information, such as http://10.100.100.100:8001 or https://www.jcloud.com. Note: Do not omit the protocol name http or https, and bring the port too if the port is not default 80. If the domain name is uncertain, turn on the call debugging function of the browser to view the Origin in the header. The domain name supports the wildcard *; one * is allowed to be used in each domain name at most, such as https://*.jcloud.com. If the source is assigned as *, it means allowing the cross-origin requests from all sources.

b. Allowed Method: Enabling corresponding methods according to demands will do, such as GET, PUT, POST, HEAD, and DELETE; may select all.

c. Allowed Headers: Allowed cross-origin request headers can configured with multiple matching rules, which can be separated with carriage return interval. Each header assigned in the Access-Control-Request-Headers must have a corresponding item in the Allowed Header. Header is easy to be omitted. If there is no special demand, it is recommended to set it to * to indicate that all is allowed. Case insensitive; when there are multiple records shown in different lines in the same rule on the CORS rule list page, no abbreviations shall be performed. If the records of each line exceed the line width limit, the suffixes shall be displayed in....

d. Exposed Headers: A list of headers exposed to the browser, namely the response headers that the users access from the application program (for example, a Javascript XMLHttpRequest object). Wildcards are not allowed. The specific configuration needs to be determined according to the demands of the application, and only the headers that need to be used shall be exposed. Leave it blank if no exposure is needed. Case insensitive, the item is a selectable configuration item; when there are multiple records shown in different lines in the same rule on the CORS rule list page, no abbreviations shall be performed. If the records of each line exceed the line width limit, the suffixes shall be displayed in....

e. Cache Max Age: The cache time, in seconds, for the browser to return results for an OPTIONS request for a specific resource. It can be longer if there is no special case, e.g. 60 seconds. The item is a selectable configuration item.

3.Add CORS rules: Above the list of cross-origin access CORS rules, CORS rules can be added by clicking on the “CORS Rules Settings” button. The effect is as follows:

![添加CORS规则](../../../../../image/Object-Storage-Service/OSS-038.png)

Detail Specification:

a. The Sources Allowed Origin, Allowed Headers, and Exposed Headers are multi-line text boxes. For the enter rules of the source Allowed Origin, please refer to the previous paragraph. Lines shall be separated by line feed characters.

b. Cache Max Age only allows to enter a positive integer greater than or equal to 0, in the range of 0-999999999.

c. If two lines of exactly the same contents are entered in the multi-line text boxes, for example, after entering “www.jcloud.com” in the Allow Headers text box, enter the “www.jcloud.com” again after line feed, then only one "www.jcloud.com" record will be kept after submitting the rules.

d. The wildcard of the domain name format only supports http://*.example.com, and does not support the format of http://www.abc.*.com; for IP, it shall support CIDR format, support http://10.110. 120.*:8080, and does not support the http://10.110.*.*:8080 format

4.You can also customize the CORS rules by clicking on the “CORS Rules Editor”. The effect is as follows:

![CORS规则编辑器](../../../../../image/Object-Storage-Service/OSS-039.png)

Detail Specification:

a. The CORS Rules Editor will display all the currently added CORS rules.

b. Code comments cannot be used in the editor, and the total size must not exceed 16KB.

