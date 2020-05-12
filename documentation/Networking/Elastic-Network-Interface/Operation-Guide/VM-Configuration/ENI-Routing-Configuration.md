# Secondary Network Interface Route Configuration

This Tutorial takes the CentOS 6.8 operating system as an example to explain how to configure the elastic network interface in Virtual Machines (please first complete the activation and IP configuration of the secondary network interface according to the above documents).

**Note: The contents in square brackets are filled out by the user.**

## Operation Steps
Step 1: Locate to the Target Virtual Machines in JD Cloud & AI Console.

Step 2: Remotely log on the target virtual machine via SSH.

Step 3: Execute the following command to query the mounted elastic network interface name.

	# ifconfig -a

Step 4: Execute commands below to edit Route Table File.

	# vi /etc/iproute2/rt_tables

Step 5: Add the following content to the rt_tables file, such as the secondary network interface name to be added as eth1. Save and exit after adding content.

	100 eth1_table

Step 6: Execute the following command to import the data package with the Source IP as primary IP address of eth1 into the eth1_table Route Table for routing search.

	# ip rule add from [eth1 ip address] lookup eth1_table

It is assumed that the IP address of eth1 is 10.0.2.3/24, the above command is:

	# ip rule add from 10.0.2.3 lookup eth1_table

Step 7: Execute commands below to add default route in eth1_table Route Table.

	# ip route add table eth1_table 0.0.0.0/0 via [eth1 subnet gateway] dev eth1 src [eth1 ip address]

It is assumed that the IP address of eth1 is 10.0.2.3/24, and the gateway address is 10.0.2.1/24, the above command is:

	# ip route add table eth1_table 0.0.0.0/0 via 10.0.2.1 dev eth1 src 10.0.2.3




