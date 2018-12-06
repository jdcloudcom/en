## Customized Resolution ISP Line

1. Login JD Cloud console, access Domain Name Resolution interface, click to enter primary domain name or click **Resolution** to access Resolution Operation page.

 ![img](https://github.com/jdcloudcom/cn/blob/edit/image/dns-img/Custom-Route1.png)
 
2. Click **Customized ISP Line Tag** in Tag field.

![img](https://github.com/jdcloudcom/cn/blob/edit/image/dns-img/Custom-Route2.png)

3. Click **Add ISP Line**, enter ISP line name and address in the popped dialogue box, of which ISP line address only supports CIDR format and IP segment scope format. (E.g., 1.1.1.1/24 or 1.1.1.1-2.2.2.2)

![img](https://github.com/jdcloudcom/cn/blob/edit/image/dns-img/Custom-Route3.png)

4. After adding customized ISP line, it will be displayed in resolution ISP lines (as test in the following figure), and the system will prioritize the matched customized ISP line.

![img](https://github.com/jdcloudcom/cn/blob/edit/image/dns-img/Custom-Route4.png)

5. Customized resolution ISP line supports deletion, and this ISP line can only be deleted when there is no resolution record using it.

![img](https://github.com/jdcloudcom/cn/blob/edit/image/dns-img/Custom-Route5.png)
