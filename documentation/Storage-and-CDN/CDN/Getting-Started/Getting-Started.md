# Getting Started Guide

- To help you to enable, configure and enable CDN service, the description of service enabling and configuration is as follows:

   **Step 1: Enable CDN service**

  You may enable CDN service by any of the following methods:

  1. Dial the number: 4006151212, the customer service personnel will enable CDN service for you.

  2. Enter [CDN Ticket System](https://uc.jdcloud.com/myorder/form?cateId=3&questionId=20), fill in and submit the **Permission Usage Application** ticket, and the customer service personnel will contact you to handle the CDN service enabling matters.

   **Step 2: Add CDN accelerated domain name**

  1. Enter the **domain name list** page in the CDN customer console;

  2. Click “Add Domain Name”           

  ![image.png](https://img1.jcloudcs.com/cms/2c5c61ed-968d-46cd-bb04-7ece86b1993120180423140715.png)

  3. Fill in or select the following information in the "Add Accelerated Domain Name" page that opens, and then click the "OK" button.

  1) Accelerated domain name: Fill in the information of the domain name, of which the content needs to be distributed and accelerated.

  ²  Please complete the ICP filing of the domain name with the communications administration and then conduct this domain name adding configuration.

  ²  Domain name filling characters only support 26 English letters, 10 Arabic numerals and the horizontal bar “-”'*’;

  ²  Supporting extensive domain names, up to level 4 extensive domain names, such as “*.*.jdcloud.com”;

  ²  Supporting adding up to 100 accelerated domain names. If there are more domain name acceleration demands, please open online tickets.

  2) Business type: Please select the appropriate business type based on the domain name content.

  ²  Image & small file: Applicable to scenarios of accelerating static websites, images and files smaller than 10MB;

  ²  Large file download: Applicable to scenarios of distributing files larger than 20MB;

  ²  Video file: Applicable to scenarios of accelerating on-demand audios and videos.

  3) Daily peak bandwidth of the business: Please estimate the daily peak bandwidth. For large file download and video file acceleration business, please fill in the file size information, so that we can reasonably allocate resources for you.

   4) Back-to-source mode: Please select IP back-to-source, domain name back-to-source or OSS back-to-source according to actual needs, fill in the origin server IP address and origin server domain name, and select the bucket information of OSS. JD Cloud CDN supports multi-IP load balancer back-to-source, and multi-IP, multi-domain name backup back-to-source, please fill in the back-to-source configuration according to actual needs.

  ![image.png](https://img1.jcloudcs.com/cms/592cae81-fc1b-43ed-889a-9ebc26d73ab720180423141227.png)   

  **Step 3: Complete Domain Name Verification Audit**

  1. The newly added domain name will be displayed as “to be verified” status. Please click “Go to verify” at the far right of the domain name to complete the domain name verification and audit action;     

  ![image.png](https://img1.jcloudcs.com/cms/eef505c1-aec4-4b58-8a03-541cfafab01820180423141306.png)

  2. The system will automatically audit whether the domain name has been filed with the communications administration. JD Cloud does not provide CDN acceleration service to domain names not filed;

  3. After completing the domain name verification, the domain name will be displayed as “auditing” status. For the domain name auditing task submitted between 9 to 21 each day, we will complete the manual auditing of the compliance of the domain name content within 2 hours;

  ![image.png](https://img1.jcloudcs.com/cms/e850171d-8d27-4ed2-8eca-0de0f5f1a09320180423141412.png)

  ​            4. The domain name of which the compliance has been approved will be displayed as “stopped” status. Please complete the CNAME binding before enabling the service.

  **Step 4: Bind CNAME**

  1. Enter the **domain name list** page in the CDN customer console, and replicate the CNAME of the approved domain name;

  ![image.png](https://img1.jcloudcs.com/cms/3eb6b1f9-f6d3-49c1-a068-00e76009c93f20180423141523.png)

  2. Log in to the domain name DNS service provider console to complete the CNAME configuration.

  Take your JD Cloud resolution domain name as an example, the CNAME binding method is as follows:

  1) Log in to [JD Cloud Console](https://www.jdcloud.com/index) and enter the [**Domain Name Service--JD Cloud Resolution**](https://dns-console.jdcloud.com/list) page, click the domain name to be bound

  ![image.png](https://img1.jcloudcs.com/cms/ae21571d-831b-49e2-bea1-be9661afa2d720180423141627.png)

  2) Select the domain name to be bound, click “Resolution”, enter the domain name resolution interface, click “Add Resolution”, select the record type as “CNAME”, and fill in the CNAME information allocated by JD Cloud customer console for the domain name in the record value. The format shall be “*.*.*.jcloud-cdn.com”, set the IP provider type to be "default", and then save them.

  ![image.png](https://img1.jcloudcs.com/cms/3ddf1f01-aafd-4a3f-a9d9-0ad7ab8ac4a820180320194422.png)

  3. Modifying the DNS server requires 0-72 hours of global effective time; if you find that some local records have not taken effect, and the time since modifying DNS is less than 72 hours, please be patient and wait.

  **Step 5: Enable CDN Service**

  ​           After completing the CNAME binding, you can click on "Run" following the domain name to start the CDN service.

  ²  After starting the action, the service will take effect in 15 minutes.

  ²  When performing the switching action, it is recommended to switch the small traffic domain name first, then switch the large traffic domain name; operate cautiously to avoid human error.

  ²  For the large file download acceleration business, it is recommended to prewarm the files under the domain name before starting the service, so as to ensure the user experience of the netizens in the initial stage of the CDN service switched to the JD Cloud CDN.

   
