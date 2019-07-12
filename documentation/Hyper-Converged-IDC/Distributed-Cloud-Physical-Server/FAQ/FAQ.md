# Distributed Cloud Physical Server FAQ

1.Q: What's the Quota of single-user Distributed Cloud Physical Server?

&nbsp;&nbsp;&nbsp;A: The purchase quota in a single node of the user is 20 sets by default and at most 5 sets can be ordered in a single order. If you need to enable more instances, you may apply for expansion by open ticket, JD Cloud will improve configuration upgrade quota after evaluation based on your actual demands.

2.Q: Is there any public/private IP?

&nbsp;&nbsp;&nbsp;A: Each Distributed Cloud Physical Server provides one public IP and one private IP. Users may select the intranet CIDR segment beginning with 10/192/172. The IP address is automatically allocated by system and can be filled in manually by the user. The user can also choose not to associate the public IP and then purchase and associate the public IP after the server is created successfully.

3.Q: Are the intranets of different nodes connected?

&nbsp;&nbsp;&nbsp;A: The intranets of different nodes are not connected.

4.Q: How many intranets can be created by a user?

&nbsp;&nbsp;&nbsp;A: Users can create only one intranet under the same operator, and can only set intranet CIDR segment when creating the first Distributed Cloud Physical Server. Users will still use the first created intranet segment when creating the second or the later Distributed Cloud Physical Server in the availability zone.

5.Q: What should I do if I forget the OS password of the Distributed Cloud Physical Server?

&nbsp;&nbsp;&nbsp;A: Currently, to reset password, a user is required to open ticket manually and handle it offline.

6.Q: How does the Distributed Cloud Physical Server guarantee high availability?

&nbsp;&nbsp;&nbsp;A: JD Cloud ensures high availability of the Distributed Cloud Physical Server on the network architecture. The high availability architecture of business layer shall be designed by the user.

7.Q: Does the Distributed Cloud Physical Server support Linux kernel upgrade?

&nbsp;&nbsp;&nbsp;A: JD Cloud has no limit to upgrading Linux kernel of the Distributed Cloud Physical Server, but users are not suggested to carry out kernel upgrade. As JD Cloud is only responsible for the revision provided officially, if any use problem arises after upgrade, the user shall be responsible for the consequences.

8.Q: Who should I turn to for consultation and processing if my Distributed Cloud Physical Server has any problem?

&nbsp;&nbsp;&nbsp;A: When your Distributed Cloud Physical Server has any problem, you may contact our customer service staff via online customer service, hotline 4006151212 and in other ways.

9.Q: What browsers does the Console support?

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A:
&nbsp;- chrome: 31.0.1650.57 and above are recommended.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- The support of other browsers are under test.

10.Q: Does the Distributed Cloud Physical Server support the running of virtual software service application?

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A: The Distributed Cloud Physical Server is your exclusive physical server, and supports virtual deployment and development.

11.Q: Can the Distributed Cloud Physical Server change the network interface configuration?

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A: The Distributed Cloud Physical Server does not support changing network interface configuration, or the network exception will be caused, and normal use will fail.

12.Q: Does the system disk of the Distributed Cloud Physical Server support partition operation?

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A: Forced partition is not suggested for the system disk of the Distributed Cloud Physical Server, or the system may not be used normally.

13.Q: Can third party software be installed to the Distributed Cloud Physical Server?

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A: The Distributed Cloud Physical Server of JD Cloud does not limit customer’s installation of third party software by default, but users are required to maintain the security of the leased physical servers. Where the server is attacked due to user, the user may be warned by JD Cloud’s Security Department or even the network will be cut off.


