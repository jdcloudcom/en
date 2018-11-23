# Open Anti-DDoS Basic

**Preconditions**

- Have a JD Cloud account and have completed the real-name verification. If you do not have an account number, please [register](https://accounts.jdcloud.com/p/regPage?source=jdcloud%26ReturnUrl=%2f%2fuc.jdcloud.com%2fpassport%2fcomplete%3freturnUrl%3dhttp%3A%2F%2Fuc.jdcloud.com%2Fredirect%2FloginRouter%3FreturnUrl%3Dhttps%253A%252F%252Fwww.jdcloud.com%252Fhelp%252Fdetail%252F734%252FisCatalog%252F1), or [real name authentication](https://uc.jdcloud.com/account/certify).

**Operation Steps**

1. Please confirm that you have an EIP in JD Cloud.

a. Confirming method of Elastic IP:

Please log in JD Cloud [Elastic IP Console](http://cns-console.jdcloud.com/host/pip/list) and the console directory "Network -> Virtual Private Cloud -> EIP" to confirm if the Elastic IP is added.
![Create Elastic IP Instance](https://github.com/jdcloudcom/cn/blob/Anti-DDoS/image/Basic%20Anti-DDos/instance%2003.png)

b. Confirming method of Cloud Physical Server:

Please log in JD Cloud [Cloud Physical Server Console](http://cps-console.jdcloud.com/list) and the console directory "Hyper-Converged IDC -> [Cloud Physical Server" to confirm that the instances are added.


2. Switch to the Anti-DDoS Basic under the Cloud Security menu. The Elastic IP or Cloud Physical Server IP bought by you has been automatically added to the Anti-DDoS Basic.

![Create Instance](../../../../image/Basic%20Anti-DDos/Instance02.png)

**Note**: The Anti-DDoS Basic is enabled by default and cannot be disabled. If an EIP is associated with the instance of the protection package, the final black hole threshold of the EIP in the protection package will be displayed.

# Relevant Reference
- [What is Anti-DDoS Basic](../Introduction/Product-Overview.md)
- [Features](../Introduction/Features.md)
- [Application Scenarios](../Introduction/Application-Scenarios.md)
- [Basic Architecture](../Introduction/Basic-Infrastructure.md)
