# Set White List Rules

After the website is accessed to the Web Application Firewall, all request traffic will pass by the WAF and then return to the origin server in turn to ensure the security of the website. You can set a white list so that the specified detection module will be ignored for the requests that meet the conditions.

## Prerequisites

- A Web Application Firewall instance has been enabled. For more information, please refer to [Enable Web Application Firewall](https://docs.jdcloud.com/en/web-application-firewall/purchase-process).
- The website has been accessed. For more information, please refer to [Add Domain](https://docs.jdcloud.com/en/web-application-firewall/step-1).

## Background Information

Dimensions like Method, URI, IP, Cookie, Geo (geographic region), and Header can be added to the white list. It is generally used to release special service requests that have been mistakenly intercepted due to triggering rules so that corresponding modules can be directly released or chosen not to be detected.

For Web Application Firewall instances in Monthly Package, the following restrictions are made to its white list function.

| Function       | Description                             | Advanced Version   | Enterprise Version   | Flagship Version   |
| :--------- | :------------------------------- | :------- | :------- | :------- |
| White List Rules | The maximum white list rules that can be added.  | 20 (entries) | 50 (entries) | 50 (entries) |

## Operation Steps

1. Log in [Web Application Firewall Console](https://cloudwaf-console.jdcloud.com/overview/business).

2. Click **Website Configuration** on the left navigation bar.

3. Locate the domain to be operated on the **Web Configuration** page and click **Protection Configuration** on the operation bar.

4. On the Protection Configuration page, click the **IAM** tab, locate to the **White List** module, enable the **Status** switch and click **Add Rules**.

   ![image](../../../../../image/WAF/protect-configure/20.White-List.png)

5. Configure **Method White List**, **URI White List**, **IP White List**, **Cookie White List**, **Geo Region-level IP White List**, and **Header White List** respectively on the **Black List** page.

   - **IP White List**: When entering the IP address to be released, you can enter the addresses IPv4 (8 16 24 32) and IPv6 (64 128) as well as the IP segment. After the IP hits the match value, you can choose to release it directly or choose the subsequent execution stage. After the configuration is completed, click **OK** at the bottom of the page.

     ![image](../../../../../image/WAF/protect-configure/23.White-List-IP.png)

   - **Geo White List**: You can choose **Mainland China** or **Overseas Region**:

     - If to choose Mainland China, you can choose a region match value. After the region of the requested IP hits the region, you can choose to release it directly or choose the subsequent execution stage. After the configuration is completed, click **OK** at the bottom of the page.
     - If to choose Overseas Region, after the region of the requested IP hits the region, you can choose to release it directly or choose the subsequent execution stage. After the configuration is completed, click **OK** at the bottom of the page.
     
     ![image](../../../../../image/WAF/protect-configure/25.White-List-Geo.png)
          

- **URI White List**: For the URI type, the target URI can be filled in. For the matching type, you can choose the exact match, prefix match, and regex match. You can choose to release it directly or choose the subsequent execution stage. After the configuration is completed, click **OK** at the bottom of the page.
  
  ![image](../../../../../image/WAF/protect-configure/22.White-List-URI.png)
  
- **Method White List**: For the type of the request method, the match values of GET, POST, HEAD, PUT, DELETE, PATCH, COPY, OPTIONS, LINK, UNLINK, PURGE, LOCK, UNOCK, PROPFIND, and VIEW can be selected. After the request Method hits the method, you can choose to release it directly or choose the subsequent execution stage. After the configuration is completed, click **OK** at the bottom of the page.
  
  ![image](../../../../../image/WAF/protect-configure/21.White-List-Method.png)
  
- **Cookie White List**: Add a cookie-type white list, and add matching rules based on the requested Cookie:
  
  - **key**: The key to Cookie. It is editable.
  
  - **Match Types**: Exact match, prefix match or regex match are optional
  
     - Match value: Strings to be matched.
  
       After the requested Cookie hits the set rules, you can choose to release it directly or choose the subsequent execution stage. After the configuration is completed, click **OK** at the bottom of the page.
  
  ![image](../../../../../image/WAF/protect-configure/24.White-List-Cookie.png)
  
   - **Header White List: **Add a Header-type white list, and add matching rules based on the key of the requested Header:
  
     - key: The key to Header. You can select the key in the drop-down box or click to enter and edit.
  
     - Match type: Exact match, prefix match or regex match are optional
  
     - Match value: Strings to be matched.
  
       After the requested Header hits the set rules, you can choose to release it directly or choose the subsequent execution stage. After the configuration is completed, click **OK** at the bottom of the page.
  
     ![image](../../../../../image/WAF/protect-configure/26.White-List-Header.png)
  
   **Check the release rules**:
  
   - If the request meets the rules, all modules will not be detected, and you can check the release.
  
   - If the request meets the rules, a part of the modules is selected to be released, and a part of the modules is selected to be detected, then you should uncheck the release and select the subsequent execution stage. The sequence to execute modules in WAF: **White List** -> **Black List** -> **CC Security Protection** -> **BOT Management** -> ** Business Risk Control** -> **Web Protection** -> **Speed Limit**.
  
   After the white list rules are successfully added, the rules are disabled by default. You can view the newly created rules in the Rules list, and the **Protection Status** switch is disabled.

