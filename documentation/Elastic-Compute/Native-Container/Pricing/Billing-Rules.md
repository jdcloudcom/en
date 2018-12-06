
# Billing Rules

JD Cloud provides two billing modes for different user needs, namely Pay-By-Configuration and Monthly-Package, which:

**Pay By Configuration**

- Billing according to the actual usage of the resource, the statistical time is accurate to the second, which is suitable for situations with large fluctuations in traffic. The stop state is not charged, and the minimum billing period is 5 minutes.
- Open-up instructions: In order to ensure your normal use, your account balance must not be less than CNY 50 when you open an instance for pay by configuration. If the account amount is less than CNY 50, you need to recharge before you can use it.
- Use the first-use Pay-as-you-go method, and generate the previous hour's bill and settle the fee for each hour according to the resource allocation and actual usage time.

**Monthly Package**
- Pay in advance for several months or years. The current purchase period supports 1 month to 9 months, 1 year, 2 years; the fee is deducted once you create an instance:
- In order to protect your use rights, the container of the monthly package does not support the deletion before it expires.
- Use the first-use Pay-as-you-go payment method, the expiration time of the monthly package is the Nth natural month or the natural year's 23:59:59 from the date of the order start time; E.g: If the order start time at 15:00:00 on January 1, 2017, and the purchase duration is 1 month, then the expiration time is 23:59:59 on February 1, 2017.

**The Pay by configuration and Pay by Monthly Package modes support different functions, see the table below for details:**

Function     | Pay by Configuration |Pay by Monthly Package
-------- | ---|----
Renewal | Non-support|Non-support
Release the instance at any time  | Supported|Non-support
Adjust insaatance configuration     | Non-support|Non-support
Associate Elastic IP     | Supported| Supported
Attach Cloud Disk   | Supported, attach only when creating a container | Supported, attach only when creating a container 
Expand Cloud Disk Service     | Supported| Supported
Convert billing mode     | Non-support|Non-support
Create all specification instances     | Supported  | Supported
Use the Cloud Monitoring for free     | Supported| Supported

