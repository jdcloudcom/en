# Core concept

Physical computing resources on the cloud, i.e. one Cloud Physical Server running in the data center, also **instance**.

Describe the data center where the Cloud Physical Server is located, i.e. **region and availability zone**.

Scenario applicable to Cloud Physical Server, consisting of different CPU, memory, storage and network etc., i.e. **instance type family**.

Private and public instance service addresses, i.e. **private IP and public IP addresses**.

Operation interface based on Web, i.e. **JD Cloud console**.

## Concept Details

### Instance
Physical computing resources on the cloud, i.e. one Cloud Physical Server running in the data center, also instance. Instance is a JD Cloud Physical Server purchased by user. JD Cloud provides instances with different storage space, computing capability and storage redundancy to meet different requirements of user for instances under different business scenarios. When a user purchases one instance, he or she may obtain its complete control right, including startup, shutdown, reboot, out-of-band monitoring, etc.

### Region and Availability Zone
We use region and availability zone to describe the location of the data center where the Cloud Physical Server is located, you may purchase Cloud Physical Servers at a specific region and availability zone.

Region refers to an independent geographic area. There are multiple data centers isolated from each other in one region, called as availability zone.

Different regions are completely independent, which allows the achievement of the maximum fault tolerance capability and stability. Each availability zone is also independent, but the availability zones under the same region may connect to each other via low-delay intranet links. You may purchase Cloud Physical Server at different locations, and you are suggested to deploy business at different availability zones to prevent service unavailability status due to single point failure.

The following is the regions and availability zones where the data centers with Cloud Physical Servers open for sale or under construction.

<table>
    <tr>
        <td >&nbsp;</td> 
        <td ><B>Region</B></td> 
		<td ><B>Availability Zone</B></td>
		<td ><B>Open Status</B></td>		
    </tr>
    <tr>   
        <td rowspan="5"><B>Mainland China</B></td>
		<td >cn-north-1</td>
		<td >Availability Zone A, Availability Zone C</td>
		<td >In Preparation</td>
    </tr>
    <tr>  
	<td >Availability Zone B</td>
	<td >Open</td>
    </tr>
    <tr>   
        <td >cn-east-2</td>
		<td >Availability Zone A and Availability Zone B</td>
		<td >In Preparation</td>
    </tr>
	<tr>   
        <td >cn-east-1</td>
		<td >Availability Zone A</td>
		<td >Open</td>
    </tr>
	<tr>   
        <td >cn-south-1</td>
		<td >Availability Zone A</td>
		<td >In Preparation</td>
    </tr>
</table>



### Private IP
Under the basic network mode, the private IP address under the subnet specified by the user is allocated uniformly by the system. If you change the private IP in the operating system, the intranet communication will be cut off. Communication traffic via private IP between Cloud Physical Servers in the same data center is free. Private IP is used for accessing each other of intranets between Cloud Physical Servers.

### Public IP
Public IP address is the main method for users to access Cloud Physical Server and for Cloud Physical Server instance to provide service externally. Under the basic network mode, a Cloud Physical Server must and can only be associated with one public IP. You may adjust the bandwidth peak of public IP dynamically.
