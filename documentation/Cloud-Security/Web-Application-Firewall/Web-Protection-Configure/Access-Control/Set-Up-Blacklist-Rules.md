# Set Black List Rules

After the website is accessed to the Web Application Firewall, you can enable the black list function. Dimensions like Method, URI, IP, Cookie, Geo (geographic region), and Header can be added to the black list. You can configure the black list based on your actual needs.

## Prerequisites

- A Web Application Firewall instance has been enabled. For more information, please refer to [Enable Web Application Firewall](https://docs.jdcloud.com/en/web-application-firewall/purchase-process).
- The website has been accessed. For more information, please refer to [Add Domain](https://help.aliyun.com/document_detail/97063.html#task-1796689).

## Background Information

Dimensions like Method, URI, IP, Cookie, Geo (geographic region), and Header can be added to the black list.

- IP black list helps you block access requests from specified IP addresses and IP address segments.
- Geo black list helps you block access requests from IP addresses in specified geographic regions. Provinces within China and overseas regions can all be specified.
- URI black list helps you block requests to access the specified URI.
- Method black list helps you block access requests for the specified request method.
- Cookie black list helps you block access request carrying specified Cookie information.

For Web Application Firewall instances in Monthly Package, the following restrictions are made to its black list function.

| Function       | Description                             | Advanced Version   | Enterprise Version   | Flagship Version   |
| :--------- | :------------------------------- | :------- | :------- | :------- |
| Black List Rules | The maximum black list rules that can be added.  | 20 (entries) | 50 (entries) | 50 (entries) |

## Operation Steps

1. Log in [Web Application Firewall Console](https://cloudwaf-console.jdcloud.com/overview/business).

2. Click **Website Configuration** on the left navigation bar.

3. Locate the domain to be operated on the **Web Configuration** page and click **Protection Configuration** on the operation bar.

4. On the Protection Configuration page, click the **IAM** tab, locate to the **Black List** module, enable the **Status** switch and click **Add Rules**.

   ![image](../../../../../image/WAF/protect-configure/11.Black-List.png)

5. Configure **Method Black List**, **URI Black List**, **IP Black List**, **Cookie Black List**, **Geo Region-level IP Black List** and **Header Black List** respectively on the **Black List** page.

   - **IP Black List**: When entering the IP address to be blocked, you can enter the addresses IPv4 (8 16 24 32) and IPv6 (64 128) as well as the IP segment. After the IP hits the match value, you can choose to execute: block, 302 redirect, or verification code. After the configuration is completed, click **OK** at the bottom of the page.

     ![image](../../../../../image/WAF/protect-configure/12.Black-List-IP.png)

   - **Geo Black List**: You can choose **Mainland China** or **Overseas Region**:

     - If to choose Mainland China, you can choose a region match value. After the region of the requested IP hits the region, you can choose to execute: block, 302 redirect, or verification code. After the configuration is completed, click **OK** at the bottom of the page.

     - If to choose Overseas Region, after the region of the requested IP hits the region, you can choose to execute: **Block**, **302 Redirect**, or **Verification Code**. After the configuration is completed, click **OK** at the bottom of the page.

       ![image](../../../../../image/WAF/protect-configure/13.Black-List-Geo.png)

   - **URI Black List**: For the URI type, the specified URI can be filled in. For the matching type, you can choose the exact match, prefix match, and regex match. When the requested target URL hits the matching rules, you can choose to execute: **Block**, **302 Redirect**, or **Verification Code**. After the configuration is completed, click **OK** at the bottom of the page.
    ![image](../../../../../image/WAF/protect-configure/15.Black-List-URI.png)
   
- **Method Black List**: For the type of the request method, the match values of GET, POST, HEAD, PUT, DELETE, PATCH, COPY, OPTIONS, LINK, UNLINK, PURGE, LOCK, UNOCK, PROPFIND, and VIEW can be selected. After the request Method hits the method, you can choose to execute: **Block**, **302 Redirect**, or **Verification Code**. After the configuration is completed, click **OK** at the bottom of the page.
     	![image](../../../../../image/WAF/protect-configure/14.Black-List-Method.png)

   - **Cookie Black List**: Add a cookie-type black list, and add matching rules based on the requested Cookie:

     - key: The key to Cookie. It is editable.

     - Match type: Exact match, prefix match or regex match are optional

     - Match value: Strings to be matched.
  
     - Execution rule: **Block**, **302 Redirect** or **Verification Code** are optional.
  
       After the configuration is completed, click **OK** at the bottom of the page.

     ![image](../../../../../image/WAF/protect-configure/16.Black-List-Cookie.png)
  
   - **Header Black List: **Add a Header-type black list, and add matching rules based on the key of the Request Header:
  
     - key: The key to Header. It is optional and editable.
  
     - Match type: Exact match, prefix match or regex match are optional.
  
     - Match value: Strings to be matched.
  
     - Execution rule: **Block**, **302 Redirect** or **Verification Code** are optional.
  
       After the configuration is completed, click **OK** at the bottom of the page.
     
     ![image](../../../../../image/WAF/protect-configure/17.Black-List-Header.png)
  
   For actions to be performed, see the table below
  
  | Action | Configuration                                            | Action Meaning                                                     |
  | -------- | ----------------------------------------------- | ------------------------------------------------------------ |
  | Intercept     | Return to 493 page by default, and click the pen icon on the right to support custom intercept page | Requests that hit the rules will be intercepted and returned to the configuration page                     |
  | 302 redirect  | Configure the target page to redirect to                              | Requests that hit the rule will redirect to the target page configured                     |
  | Verification code   | No configuration is required                                        | For requests that hit the rule, a verification code will pop up for a second verification. Passing the verification, access is allowable. Otherwise, interception will occur. |
  
   After the black list rules are successfully added, the rules are disabled by default. You can view the newly created rules in the Rules list, and the **Protection Status** switch is disabled.

