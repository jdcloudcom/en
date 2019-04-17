## **Full Log Query**

  After the full log query feature is enabled, WAF will record all the access request logs in your website, you may locate the request record quickly by one-click intelligent search to meet the management demands in operation and maintenance as well as security.

By the full log query feature, you may easily complete the following operation and maintenance:

- Confirm whether a certain request is intercepted or released by WAF.
- Confirm whether a certain interception is triggered by Web attack, CC attack protection or customized identity and access management rule.
- Query the response time of the origin server to a certain request, and observe whether the response is overtime.
- Query a certain request through the combination of conditions such as source IP, URL keyword, cookie, referer, user-agent, X-forwarded-for and server response status code.

**Description:** Enable the full log query feature, i.e. indicating that you allow JD Cloud to record all your Web requests through WAF

Before using Log Retrieval Function, you need to enable the Log Retrieval Function for specified website domain on the Website Configuration Page. Only when the **Log Retrieval** Function is enabled will WAF start to record the access logs of this website. After enabling the Log Retrieval Function for the website domain, you can query the access logs of this website on the FULL Log Page.

### **Operation Steps**

Refer to the following steps to view the FULL Log Information:

1. Log in to [JD Cloud Web Application Firewall Console](https://cloudwaf-console.jdcloud.com).
2. Go to **Website Configuration** page.
3. Select the added website domain, and click to enable the Log Retrieval Function in the **Log Retrieval** Bar. **Description:** You can also disable Log Retrieval on this page. If you disable the Log Retrieval Function, the access request logs will not be recorded during the disabled period; even though the Log Retrieval Function is enabled again, you cannot query the access request logs during the disabled period.![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/%E5%85%A8%E9%87%8F%E6%97%A5%E5%BF%97%E6%9F%A5%E8%AF%A2.png)
4. Go to the **FULL Log** Page.
5. Select **Domain**, set **Query Time**, and click **Query Button to finish these steps**. 

**Description: **The access logs in the latest month at most can be recorded by using the FULL Log Function, and there exists a certain delay in data.

![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/%E5%85%A8%E9%87%8F%E6%97%A5%E5%BF%97%E6%9F%A5%E8%AF%A2-2.png)

### **Advanced Search**:

| **Field**         | **Description**                                                     |
| ---------------- | ------------------------------------------------------------ |
| Source IP             | Source IP of the client that is accessed to.                                         |
| URL Keywords        | Access request URL. **Description:** The filled in URL keywords with the symbol “/” is supported. For example, you can fill in /ntis/cashier. |
| Server Response Status Code | Response status information returned to WAF by the origin server. **Description:** Filling in three-digit number at most is supported. Meanwhile, the symbol “-” is supported. Search the access request without status information. |
| Referer          | Source URL information of access request in the access request header.                  |
| User-Agent       | Information such as the access source client browser identifier and operating system identifier in the access request header. |
| Protection Rules         | Select the hit protection rule categories, including Web attack protection, CC defense policies, identity and access management policies |

1. View the Log Retrieval Result.

2. In the **Access Log** list, view the access request records meeting the retrieval condition. For example, the access request records intercepted by the Web attack protection rule are shown in the figure below. [img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/%E5%85%A8%E9%87%8F%E6%97%A5%E5%BF%97%E6%9F%A5%E8%AF%A2-3.png) **Description about the meaning of parameters in the origin server response information**
   - - **Status**: The response status information returned to the client by WAF. 403 means that the server refuses to provide services upon receipt of the request.
     - **Upstream_ip**: Origin server IP corresponding to this request.
     - **Upstream_time**: Time requested by origin server response WAF. If “-” is returned, it indicates that response times out.

3. Click **Create Log Download Task** on the FULL Log Page to generate the download tasks for the currently retrieved log results. Then Click **View the Downloaded Files**, upon completion of the download tasks in current tasks on the page “View the Downloaded Files”, click **Log Download** to download the log files in the corresponding format to the local.

**Description: **Up to 20 million logs can be exported for a single time. If the number of logs that you need to export is greater than 20 million, you are suggested to export the logs for a plurality of times by dividing these logs into multiple parts.

**Log File Field Description**

| **Field**         | **Field Name**        | **Description**                                                     |
| --------------- | ------------------- | ------------------------------------------------------------ |
| time            | Access Time            | Occurrence time of access request, record in UTC time in the downloaded log file.      |
| remote_addr     | Server IP            | Server IP of access request If “anonymous proxy” is used, current IP is proxy server IP. |
| Domain          | Access Domain            | Domain of access request.                                             |
| http_referer    | HTTP Referer Field    | Source URL information of access request in the access request header.                  |
| http_user_agent | HTTP User-Agent Field | Information such as the access source client browser identifier and operating system identifier in the access request header. |
| status          | Origin Server Response Status Code | Response status returned to WAF by the origin server. If “-” is returned, it indicates that there is no response (for example, this request is intercepted by WAF or origin server response times out). |
| action          | Protection Status            | The processing result on this access request by WAF:     - In the case that attack is not found, the protection status is release    -In case of the WAF attack, the protection status is interception    - In case of the Cc attack, the protection status is interception |
| upstream_ip     | Origin Server Response Time        | Time requested by origin server response WAF. If “-” is returned, it indicates that response times out.           |
| upstream_time   | Region that the source IP belongs to      | Region that the access source IP belongs to                                         |
| req_content     | Request URI             | Request URI                                                      |


 
