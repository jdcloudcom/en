# Image from Third Party Production Specifications

Update on: July 24, 2018



System Requirement

Configuration Self-test

(The default configuration of the public image has met the following requirements, please do not modify it. To ensure the normal use of the image, please follow the following requirements for self-test)

1 The public image has been configured with the system update source. Please do not modify it at will. Please refer to the document to check configuration:

https://www.jdcloud.com/help/detail/349/isCateLog/1

https://www.jdcloud.com/help/detail/714/isCateLog/1

2 Turn off the firewall:

l Linux platform: turn off the default firewall iptables

l Windows platform: turn off the default firewall

3 Network interface MTU value confirmation

l Linux platform:

As soon as the network interface is started, the dhcp service is automatically started. After connecting to the network, the appropriate MTU value is automatically assigned. So there is no need for user to set the usage command.

You can use the command: ifconfig |grep to view the MTU value. (Currently, the official is 1450)

l Windows platform:

You can use the command: netsh interface ipv4 show interface to view the MTU value. (currently official number is 1400)

       To adjust, open the command line window and enter the following command to set the MTU (up to 1500):

c:\> netsh interface ipv4 set subinterface “local connection" mtu=1500 store=persistent (network interface name: 2008 is "local connection" and 2012 is "Ethernet")



System component installation

Install the cloud-init tool

l Linux platform - CentOS system

A. Detach the official cloud-init

If the official cloud-init is installed on the current system, it must be completely uninstalled. The following instructions can be executed to ensure that the official revision is completely detached.

n Detach the old cloud-init:

rpm –e cloud-init

n Delete the original configuration and save the file:

rm –rf /etc/conf/cloud/* 

rm –rf /var/lib/cloud/*

B. Install JD Cloud cloud-init

n Please download CentOS 6.X series from the following links


http://iaas-cns-download.oss.cn-north-1.jcloudcs.com/cloud-init-0.7.5-20.el6.2.x86_64.rpm

Perform the following instructions to install:

rpm –ivh cloud-init-0.7.5-20.el6.2.x86_64.rpm

n Please download CentOS 7.X series from the following links


http://iaas-cns-download.oss.cn-north-1.jcloudcs.com/cloud-init-0.7.5-20.el7.centos.1.x86_64.rpm

Perform the following instructions to install:

rpm –ivh cloud-init-0.7.5-20.el7.centos.1.x86_64.rpm

l Linux platform - Ubuntu system

A. Detach the official cloud-init

If the official cloud-init is installed on the current system, it must be completely uninstalled. The following instructions can be executed to ensure that the official revision is completely detached.

n Detach the old cloud-init:

apt-get purge cloud-init

n Delete the original configuration and save the file:

rm -rf /var/lib/cloud/*

B. Install JD Cloud cloud-init

n Please download Ubuntu 16.04 series from the following links


http://iaas-cns-download.oss.cn-north-1.jcloudcs.com/cloud-init_17.2-35-gf576b2a2-0ubuntu1_16.04.2-jd_all.deb

Perform the following instructions to install:

①    dpkg -i cloud-init_17.2-35-gf576b2a2-0ubuntu1_16.04.2-jd_all.deb

②    dpkg-reconfigure cloud-init

If you do not succeed in executing ①, execute the following ③ and ④ instructions and then execute ②

③    apt-get install -f

④    dpkg -i cloud-init_17.2-35-gf576b2a2-0ubuntu1_16.04.2-jd_all.deb

In the subsequent page, cancel some of the data source options, leaving only the following 4 options:

* NoCloud: Reads info from /var/lib/cloud/seed only

* ConfigDrive: Reads data from Openstack Config Drive

* OpenStack: native openstack metadata service

* None: Failsafe datasource

l Windows platform:


No need to install



Operation Suggestion

1. Check for updates and install updates of the Windows system.

2. Clear the access traces when Create Image.

3. It is recommended to perform a shutdown and power-on operation before the final image file is generated to ensure that all updates and configurations have taken effect to avoid the situation that the user receives the reboot notification after login after the user creates the machine using the image.
