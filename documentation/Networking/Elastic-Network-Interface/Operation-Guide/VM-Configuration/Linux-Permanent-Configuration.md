# Linux System Permanent Configuration

This Tutorial takes the CentOS 6.8 operating system as an example to explain how to configure the ENI in VM (which saves the configuration of the ENI permanently, and VM will remain in effect after rebooting).

**Note: The contents in brackets are filled out by the user.**

## Procedures
Step 1: Associate ENI to the target VM in JD Cloud console.

Step 2: Remotely log on the target VM via SSH.

Step 3: Execute the following command to query the name of the mounted ENI.

    # ifconfig -a

Step 4: Execute the following command to enter the network interface configuration file directory.

    # cd /etc/sysconfig/network-scripts

Step 5: Execute the following command to create configuration file of ENI.

    # touch ifcfg-[device name]

Step 6: Execute the following command to enable editing for configuration file of ENI.

    # vi ifcfg-[device name]

Step 7: Replace and fill in the following contexts in the configuration file of ENI.

	DEVICE=[device name]
	NM_CONTROLLED=yes
	ONBOOT=yes
	IPADDR=[primary ip]
	NETMASK=[netmask]

Step 8: Execute the following command to restart the network service so that the configuration can take effect.

    # service network restart

