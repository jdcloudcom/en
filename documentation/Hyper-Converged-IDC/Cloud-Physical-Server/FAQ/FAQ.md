# Cloud Physical Server FAQ

1. Q: Single user Cloud Physical Server quota?
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A: No quota for single user, but single orders of up to 5 sets are supported.

2. Q: Is there any public/Private IP?
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A: Under the basic network environment, each Cloud Physical Server provides one Public IP and a Private IP. Users may select the intranet CIDR segment beginning with 10/192/172. IP address is automatically allocated by system, rather than the user.

3. Q: Are the intranets of different regions connected? Are the intranets of different availability zones connected?
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A: The intranets of different regions are not connected, and the intranets of different availability zones are not connected.

4. Q: How may intranets can be created by a user?
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A: User can create only one intranet in one availability zone, and can only set intranet CIDR segment when creating the first Cloud Physical Server. User will use the first created intranet segment when creating the second or the later Cloud Physical Server in the availability zone.

5. Q: What should I do if I forget the password of operating system of the Cloud Physical Server?
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A: Currently, to reset password, user is required to open ticket manually and handle it offline.

6. Q: How does the Cloud Physical Server ensure high availability?
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A: JD Cloud ensures high availability of the Cloud Physical Server on the network architecture. The high availability architecture of business layer shall be designed by the user.

7. Q: How is the security protection performance of Cloud Physical Server?
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A: The Cloud Physical Server contains free 2G Basic Anti-DDoS, and sets the firewall of OS of initial installation (extranet only allows IN22 port).

8. Q: Does the Cloud Physical Server support Linux core upgrade?
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A: JD Cloud has no limit to upgrading Linux core of the Cloud Physical Server, but users are not suggested to carry out core upgrade. As JD Cloud is only responsible for the revision provided officially, if any use problem arises after upgrade, the user shall be responsible for the consequences.

9. Q: Who should I turn to for consultation and processing if my Cloud Physical Server has any problem?
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A: When your Cloud Physical Server has any problem, you may contact our customer service personnel via online customer service, tel. 4006151212 and in other ways.

10. Q: What browsers does the console support?
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A:
&nbsp;- chrome: 31.0.1650.57 and above are recommended.
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- the support of other browsers is under test.

11. Q: Does the Cloud Physical Server support the running of virtual software service application?
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A: The Cloud Physical Server is your exclusive physical server, and supports virtual deployment and development.

12.Q: Can the Cloud Physical Server change the network interface configuration?
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A: The Cloud Physical Server does not support changing network interface configuration, or the network exception will be caused, and normal use will fail.

13.Q: Does the system disk of the Cloud Physical Server support partition operation?
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A: Forced partition is not suggested for the system disk of the Cloud Physical Server, or the system may not be used normally.

14.Q: Can third party software be installed to the Cloud Physical Server?
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A: The physical server of JD Cloud does not limit customer’s installation of third party software by default, but users are required to maintain the security of the leased physical servers. Where the server is attacked due to user, the user may be warned by JD Cloud’s Security Department or even the network will be cut off.
