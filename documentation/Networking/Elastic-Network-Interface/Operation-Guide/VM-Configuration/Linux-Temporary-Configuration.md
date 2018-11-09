# Linux System Temporary Configuration

This Tutorial takes the CentOS 6.8 operating system as an example to explain how to configure the ENI in VM (which does not save the configuration of the ENI permanently, and will become invalid after rebooting).

**Note: The contents in brackets are filled out by the user. **

## Procedures
Step 1: Associate ENI to the target VM in JD Cloud console.

Step 2: Remotely log on the target VM via SSH.

Step 3: Execute the following command to query the name of the mounted ENI.

	# ifconfig -a

Step 4: Execute the following command to enable ENI.

	# ifconfig [device name] up

Step 5: Execute the following command to configure the primary IP of ENI.

	# ifconfig [device name] [primary ip] netmask [netmask] broadcast [broadcast ip]

Step 6: Execute the following command to configure the secondary IP of ENI.

	# ifconfig [device name]:[secondary ip sequence number] [secondary ip] netmask [netmask] broadcast [broadcast ip]


