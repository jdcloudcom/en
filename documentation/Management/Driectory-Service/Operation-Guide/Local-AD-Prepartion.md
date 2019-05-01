### Prepare Local Domain

First, it is required to complete several prerequisite steps for local domain.

### Configure Local Firewall

An internal firewall must be configured so that all Subnets used by VPC of JD Cloud Directory Service can be included, and the following ports can be opened facing CIDR. In this Tutorial, we allow incoming and outgoing traffic from 10.0.0.0/16 (CIDR data block of VPC of Directory Service) on the following ports:

- TCP/UDP 53 - DNS
- TCP/UDP 88 - Kerberos Identity Verification
- TCP/UDP 389 - LDAP
- TCP 445 - SMB

Note

Those are the minimum ports required for connecting VPC to the local directory Depending on your specific configuration, you may need to open other ports.

### Ensure that Kerberos identity pre-verification has been enabled

User accounts in the two directories must enable Kerberos identity pre-verification This is the default value, but we can check the attribute of any random users to ensure that there is no any change.

**View Kerberos Setting of User**

1. Open Server Manager on the controller of local domain.
2. Select **Active Directory User and Computer ** on the **Tool** menu.
3. Select **Users** folder and open the context (right-click) menu. Select any random user account listed in the right window. Select **Attribute**.
4. Selection **Account** tab. In the **Account Option** list, scroll down and ensure **Not** Select **Kerberos identity pre-verification Not Required**.

![图片](https://github.com/jdcloudcom/cn/blob/joytaobao-ad-2019011501/image/DirectoryService/cn/Local-AD-Prepartion-cn-1.png)

### Configure DNS condition forwarding server for local domain

The DNS condition forwarding server must be set in each domain Before performing such operation to the local domain, it first needs to get some information about details of Directory Service.

**Configure Condition Forwarding Server in Local Domain**

1. Log in Management Console and select the Directory Service Interface.

2. Select directory ID to be trusted in the list.

3. Record the **Directory Name** of your directory and the values in **DNS Address** on the **Detailed Information**.

4. Now return to the local domain controller. Open Server Manager.

5. Select **DNS** on the **Tool** menu.

6. In the Console Tree, expand the DNS server for setting the trusted domain. Our server is **jd1.ngmap.com**

7. In the Console Tree, select **Condition Forwarder**.

8. On the **Operation** menu, select **Create Condition Forwarder**.

9. In **DNS domain (DNS domain)**, enter the fully qualified domain (FQDN) of Directory Service recorded earlier. In this example, FQDN is **jd1.ngmap.com**

10. Select **IP address of Primary Server**, and enter the DNS address of JD Cloud Directory Service recorded earlier. In this example, those are: 10.0.0.9, 10.0.0.10

    After entering the DNS address, you may encounter errors such as “Timeout” or “Unresolvable”. These errors can be ignored generally.

![图片](https://github.com/jdcloudcom/cn/blob/joytaobao-ad-2019011501/image/DirectoryService/cn/Local-AD-Prepartion-cn-2.png)

11. Select **Store the condition forwarder(s) in Active Directory and copy it/them in the following way**.

12. Select **All DNS servers in the domain**, then select **OK**.
