# Image from Third Party Production Specifications

Update on: October 19, 2018



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

c:\> netsh interface ipv4 set subinterface "local connection" mtu=1500 store=persistent (network interface name: 2008 is "local connection" and 2012 is "Ethernet")




Operation Suggestion

1. Check for updates and install updates of the Windows system.

2. Clear the access traces when Create Image.

3. It is recommended to perform a shutdown and power-on operation before the final image file is generated to ensure that all updates and configurations have taken effect to avoid the situation that the user receives the reboot notification after login after the user creates the machine using the image.
