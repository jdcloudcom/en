# Instruction
The procedure of quickly using the Message Queue:

1. Access to Message Queue [Console](https://jcq-console.jdcloud.com/topics/).
2. Create resources
3. Send consumer messages</br>

 Note: 
 
 - If you need to establish a direct connection of public network with Message Queue, please select **Public network-North China* Region where the performance is limited (with TPS limit of 1000), and the quota is 10.
 - In the region: public network (North China), Message Queue Service can only be used for testing (public network can be directly accessed); please do not use it in the production environment, related resources expense will not be collected (since April 15, 2019), and the product's service level agreement shall not be committed.
 - The production environment is recommended to be in other regions (Message Queue Service public network is inaccessible; it can be directly accessed within VPC).


### The access protocol and development language supported by Message Queue
At present, we only support TCP (SDK) and HTTP protocol under Java.
