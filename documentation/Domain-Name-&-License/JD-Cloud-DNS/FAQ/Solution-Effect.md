## **Test the Method of Validating Domain Name Resolution**

According to [Domain Name Validation Principle](http://www.jcloud.com/help/detail/2172/isCateLog/1), there are two steps for validating the resolution record: validating in the cloud resolution and  resolution DNS. Only after the Local DNS takes effect can the customer get the correct resolution result. If the resolution record does not take effect locally but is already in effect on the cloud resolution server, please be patient while Local DNS refreshes its own cache, the theoretical length of the cache is determined by the TTL value configured in the resolution record. Some local DNS in the actual network will modify the cache duration, the specific effective time is determined by the local DNS behavior.

The following is an example of www.jddnstest.com, which shows the corresponding test methods and steps on the Windows and Linux platforms, respectively. The jddnstest.com resolution has been added through the cloud resolution console, the NS address has been modified to the cloud resolution address ns1.jdgslb.com/ns2.jdgslb.com, and the A record address of www.jddnstest.com is configured.

## **Windows Platform Test Methods and Steps:**

The Windows platform can use the system command ping and nslookup, implement the command and test in the CMD window.

I. Test whether the resolution record has taken effect in customer/Local DNS

Operation Steps:

1. Open the Windows command line window, click **Start**->**All Programs**->**Attachment**->**Command Prompt**

2. In the CMD window, execute the command ping www.jddnstest.com

![11.png](http://img1.jcloudcs.com/cms/62124ca3-98dd-4892-bb44-528eadb8ed1120180302174149.png)

You can see that www.jddnstest.com has obtained the correct resolution address

3. If you cannot find a resolution address for the domain name, you will be prompted not to find it

![22.png](http://img1.jcloudcs.com/cms/51ec4fe9-5c28-4bce-a877-c6f72c3cc3cf20180302174301.png)

4. You can also use the nslookup command to test, execute nslookup www.jddnstest.com

![33.png](http://img1.jcloudcs.com/cms/d460660e-2268-4d46-ad0e-813dfff1dbd920180302175129.png)

You can obtain the correct IP address of www.jddnstest.com on the customer

II. Test that whether the resolution record has taken effect on the cloud resolution server

Test whether the resolution record has taken effect on the cloud resolution server, you can only use the nslookup command in the CMD window to execute nslookup www.jddnstest.com ns1.jdgslb.com, where ns1.jdgslb.com is the cloud resolution address corresponding to the domain name of jddnstest.com.

![44.png](http://img1.jcloudcs.com/cms/c64afba1-fb02-4e49-812b-1ec17818ac8320180302175530.png)

You can see that the address of www.jddnstest.com was successfully obtained on the customer, and the result is returned by the cloud resolution server.

## **Linux Platform Test Methods and Steps:**

The Linux platform can take the ping and dig commands and test through command lines.

I.Test whether the resolution record has taken effect in Local DNS/customer

1. Execute ping www.jddnstest.com in the command line inwindow

![55.png](http://img1.jcloudcs.com/cms/f6715889-a5fa-4599-b546-3dff760320e920180302192031.png)

You can see that www.jddnstest.com has obtained the correct resolution address

2. If you cannot find a resolution address for the domain name, you will be prompted "unknown host"

![66.png](http://img1.jcloudcs.com/cms/980fab9a-d757-47a9-8231-ac09b5219c3b20180302192113.png)

3. You can also use the dig command to test and execute dig www.jddnstest.com

![77.png](http://img1.jcloudcs.com/cms/4d87e44d-c790-4834-85a5-b442581395aa20180302192158.png)

You can obtain the correct IP address of www.jddnstest.com on the customer

II. Test that whether the resolution record has taken effect on the cloud resolution server

Test whether the resolution record has taken effect on the cloud resolution server, you can only use the dig command in the command line window to execute dig www.jddnstest.com @ns1.jdgslb.com, where ns1.jdgslb.com is the cloud resolution address corresponding to the domain name of jddnstest.com.

![88.png](http://img1.jcloudcs.com/cms/d505cc09-9c2b-4dc6-8a2b-15a62859777e20180302192238.png)

You can see that the address of www.jddnstest.com was successfully obtained on the customer, and the result is returned by the cloud resolution server.