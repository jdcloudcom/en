# Customize returned page

Where CC customized protection blocking of Anti-DDoS Pro is triggered or Anti-DDoS Pro node returns the exception status code (590/592/594), corresponding default page will be returned. Meanwhile, a user-define page is supported and can be applied to all domains or CC customized protection rules under instances.

Example of application scenario: For customers attaching importance to its brand exposure, such as the customers of the game or e-commerce industry, if the business of origin server is unavailable, it is required that the client access page returns the customer's brand logo page or advertisement page rather than default page of security product. The customized return page can meet such demands of the customer.

## Operation Steps
1. Log in [Anti-DDoS Pro Console](https://ip-anti-console.jdcloud.com/instancelist).
2. Select a target instance on the **Instance List** Page, click **Instance Name** or **Forwarding Configuration** and enter the **Instance Detail** Page.
3. Click **Customized Return Page** edition button on the **Instance Detail** Page.</br>
![](../../../../image/Advanced%20Anti-DDoS/self-define%20default%20page01.png)</br>
4. On the **Customized Page**, click **Add** to create a customized page. At most 3 customized can be created under one instance.</br>
![](../../../../image/Advanced%20Anti-DDoS/self-define%20default%20page02.png)</br>
5. Enter page name and enter page content in the standard html format, the latter of which supports not more than 10,000 characters.</br>
![](../../../../image/Advanced%20Anti-DDoS/self-define%20default%20page03.png)</br>
6. After completion of edition, the default audit status is **Auditing**, and the edition is to be manually audited at the background by security management staff of JD Cloud & AI. After the audit status is modified to be **Audited and Approved**, the page will be cited under the instance and CC customized rules.</br>
![](../../../../image/Advanced%20Anti-DDoS/self-define%20default%20page05.png)</br>
7. Return to the **Instance Detail** Page and select a customized page from the drop-down list. Then, such page can take effect under the instance. In such case, the exception status code page returned by the Anti-DDoS Pro node is the customized page.</br>
![](../../../../image/Advanced%20Anti-DDoS/self-define%20default%20page04.png)</br>
8. The customized page supports citing of CC-defined protection rules; enter the customized rule page for CC protection and select **Block** as the blocking type; and then, the customized page can be cited in the **Block and Return to Customized Page**.</br>
![](../../../../image/Advanced%20Anti-DDoS/self-define%20default%20page06.png)</br>
