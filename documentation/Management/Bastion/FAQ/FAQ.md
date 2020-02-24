## FAQ

Q: How should I configure it if I just want to conduct operation and maintenance by logging in the machine by Bastion rather than other means?</br>

A: You can only allow accessing this VM Instance with Bastion system IP in the inbound/outbound rules by setting the Security Group of this VM Instance;</br>
  Or you can reclaim all login credentials and only save the login credentials in Bastion system so that users can only log in the machine via Bastion system.</br>


Q: In the Bastion instance, what should I do if the machine connectivity test fails?</br>

A: Check it in the following ways:</br>
  Check if relevant Security Group rules for the target machine are correctly set to ensure that the Bastion instance can be connected to relevant operation and maintenance port of the machine.</br>
  Check if the firewall or other intermediate devices of the machine exists restriction of other access connection, e.g. iptables, etc.</br>
