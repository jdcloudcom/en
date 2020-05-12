# Core Concept
The following concepts and interpretations used in the Elastic IP help document are Listed for reference.

| English | Chinese | Description |
| :- | :- | :- |
| Elastic IP | Elastic IP | Elastic IP is Public IP that can be independently applied for, and supports dynamically associating with and disassociating from Virtual Machine, container, Load Balancer, and NFV Instance.
| Standard Elastic IP | Standard Elastic IP | Standard Elastic IP is released in central availability zones in each region and can be associated with resources in central availability zones |
| Edge Elastic IP | Edge Elastic IP | Edge Elastic IP is released in edge zones and can be associated with resources in edge zones. End customers can conduct nearest access and the requirements of customers for high bandwidth and low latency are met |
| Instance | Instance |Instance is a basic service unit of cloud computing provided by JD Cloud & AI, providing computing services with flexible and scalable processing capacity. It includes CPU, memory, operating system, storage, network, and security. Every resource has a variety of specifications to choose to meet the personalized needs of different business. |
| NFV Instance | NFV Instance | NFV is short for Network Function Virtualization. NFV Instance is an abbreviation for virtual network device which has traditional network functions, and is developed with the use of software technologies and virtualization technologies. For example: the VM Instances which are created with images of VPN Gateway and NAT Gateway.|
| BGP | Border Gateway Agreement | BGP is abbreviation for Border Gateway Protocol. Network operators advertise IP address fields to each other through BGP protocol. BGP IP can advertise single IP to multiple IP providers to achieve high-speed access for the users of different operators.|
| Region | Region | Different regions mean different geographic regions. Currently, JD Cloud & AI has four regions: cn-north-1, cn-south-1, cn-east-1, and cn-east-2.
| AZ | Availability Zone | AZ is abbreviation for Availability Zone. There can be a number of AZs in a region, and the resources in different AZs are separated from each other to ensure their high availability. The AZs are normally interconnected with low latency and high bandwidth.
| VPN Gateway | VPN Gateway | VPN is abbreviation for Virtual Private Network. VPN Gateway is an Internet-based product that connects an enterprise data center to the cloud VPC in a secure manner with the tunnel encryption technology.
| NAT Gateway | NAT Gateway | NAT is abbreviation for Network Address Translator. NAT Gateway can provide outbound access to Internet for instances in VPC.
| Load Balancer | Load Balancer | The Load Balancer can distribute traffic to a number of instances such as Virtual Machines, improving application system availability by eliminating single points of fault.

See the following for the concepts and their interpretations used in the Edge Elastic IP.

| English | Chinese | Description |
| :- | :- | :- |
| Edge Ip Provider | Edge Elastic IP ISP Line | ISP line information of Edge Elastic IP includes ISP line access area, resource association range, service type and availability zone of Edge Elastic IP |
| Point of Access | Edge Elastic IP ISP Line Access Area | Region where an Edge Elastic IP is released, which is the edge node where the public network traffic of edge IP flows in and out of JD Cloud. Identify with Edge Zone ID |
| Association Scope| Edge Elastic IP Resource Association Range | Range of availability zone where the instance resources associated with Edge Elastic IP locate. IPs in edge zone (ez) are supported in attaching instance resources in this edge zone and business traffics interact in this edge zone|
| Service Type | Edge Elastic IP Service Type | Operator Service Type of Edge Elastic IP. BGP is a multiple-operator service ISP line, by which Telecom, Unicom and China Mobile provide single-line services for each operator |
| az | Edge Elastic IP Availability Zone | Availability Zone: Availability zone of this Edge Elastic IP ISP line. When its value is in line with the "ISP line access area", the Edge Elastic IP created based on this ISP line can only associate with instance resources under this edge zone and cannot associate with those instance resources under any central availability zone |
