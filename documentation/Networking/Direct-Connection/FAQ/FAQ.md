## FAQ

### **Service Consultation**

1.Q: What is Direct Connect Service?</br>

A: Direct Connect Service is a network service provided by JD Cloud to customers, which is used to access JD Cloud resources instead of the Internet.</br>

2.Q: What are the advantages of Direct Connect Service compared to the Internet?</br>

A: Direct Connect Service provides Intranet interconnection for customers to access JD Cloud's services by establishing customer-specific physical links between the customer's enterprise data center/office network/JD Cloud's hosting service and JD Public Cloud. Features such as low latency and high bandwidth provide customers with better network service quality.</br>

3.Q: What products are included in the Direct Connect Service?</br>

A: Direct Connect Service includes two different customer scenarios, one is to connect the enterprise's data center/ office network and the public cloud, and another is the hosting service and public cloud connecting JD Cloud. For the first scenario, the Direct Connection is provided, and the Hosted Connect Service is provided for the second.</br>

4.Q: What products of the public cloud can the Direct Connect Service connect to?</br>

A: At present, Direct Connect Service can connect to the public cloud VPC, and can access the products or services provided in the VPC, including VM, load balancer, and RDS, etc., and will subsequently support the object storage service of JD Cloud through the dedicated line.</br>

5.Q: After accessing JD Cloud through direct connection, can the JD Cloud Service be accessed in different regions?</br>

A: At present, JD Cloud only supports access to private cloud services in the same area as the direct connection, and will subsequently support access to cross-region public cloud services.</br>

6.Q: Does it support disaster tolerance of multiple physical links?</br>

A: Multiple physical links in the same region of JD Cloud can be used for ECMP. Up to four lines can be used for ECMP. It is recommended that users access at least two physical links to improve service availability.</br>

7.Q: What is the bandwidth supported by the physical link?</br>

A: The Direct Connection supports two access modes, self-service access or access through JD Cloud Partners. The bandwidth supported by self-service access is gigabit cable, gigabit fiber, and 10-gigabit fiber. The dedicated line partners provide more flexible bandwidth access mode. If the customer has less access requirements than gigabit bandwidth, it can access through the partner, and can also expand the bandwidth cap through ECMP of multiple physical links.</br>

8.Q: What is the difference between the customer self-service application and the partner application?</br>

A: For the self-service application, customers need to contact the operator to carry out line construction, and JD Cloud provides access point information and cooperates with the access. For the partner application, customers can access through the dedicated line partners provided by JD Cloud, the partners have a complete customer service process and more flexible direct connect.</br>

9.Q: What are the preparations needed to make before using the Direct Connection Service?</br>

A: 1) Estimate the traffic, determine the access mode, access bandwidth, electrical/optical port, and determine whether to choose self-service access or through partner access;</br>

2) The network segment planning for both ends of the dedicated line and the IP addresses of both ends cannot conflict and must be private addresses. If the user network of IDC side is a public address, or the IP addresses of the networks at both ends of the dedicated line conflict, the client side needs to run NAT mapping;</br>

10.Q: Does the Direct Connection Service support NAT configuration?</br>

A: Currently, the Direct Connection Service of the public cloud does not currently provide NAT configuration. If there is a conflict between IP addresses at both ends of the dedicated line, the customer needs to make NAT processing on the dedicate line ends.</br>

11.Q: What are the requirements of Direct Connection Service to the client side?</br>

A: 1)  The client side’s initiator of the Direct Connect Service needs to be a 3-layer switch or router device;</br>

2)  Support BGP Protocol;</br>

3)  Support VLAN or 802.1q Protocol;</br>

4)  Support three-layer sub-interface configuration (optional);</br>

12.Q: Direct Connection Service fee</br>

The Direct Connection  Service fee of public cloud consists of two parts: direct connect initial installation fee and access charge. In which, the channels of the same region are free of charge, i.e., the access of VPC of the same region after direct connect  is free.</br>

13.Q: Does the Direct Connection Service provide SLA?</br>

A: Currently it is not provided.</br>



### **Fault Handling**

1.Q: What if the Direct Connection Service interrupts?</br>

A: Check whether the configured interconnect address (/30) of the two ends can communicate normally. If the communication is normal, recheck the routing configuration of the router on the client side, border gateway, and route table in VPC. If the communication cannot be performed normally, the operator/partner will report the failure according to the line code of the physical links, and the operator/partner will be responsible for processing.</br>