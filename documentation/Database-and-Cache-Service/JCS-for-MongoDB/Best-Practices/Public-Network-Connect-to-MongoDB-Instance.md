# Public Network Connection MongoDB Instance

## Background Information
JCS for MongoDB does not provide public network connection at present. If you need to connect JCS for MongoDB instance locally, you can do it by means of Virtual Machines proxy forwarding.

## Precautions

- The means of connecting MongoDB instance through the public network can only be used in the test environment. Please do not use in the production environment.
- Connecting through the Virtual Machines proxy, the MongoDB instance does not support Connection String URI and cannot guarantee high availability of the instance.

	

## Mode 1: Taking SecureCRT as an example, realize proxy forwarding by listening on local ports.



### Precondition

A virtual machine associated with an EIP and Linux system is in the same VPC with the MongoDB, and the virtual machine connection is not limited by ACL and security group.

### Operation Steps

1. The local computer installs the SecureCRT, which is remotely connected to the Virtual Machines with EIP by the SSH2 protocol.
   
   - Select **Connection**, fill in the name and select SSH2 protocol.
  
      ![](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-031.png)

   - Select **SSH2**, fill in the machine information as proxy.
   
      Hostname: Fill in the EIP of the Virtual Machines.

      Port: Can be 22 by default.
      
      Username: Fill in the login user name of virtual machine, and the default is "root".
      
      ![](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-032.png)

1. Set the port forwarding rules.
   - Select **Port Forwarding** and click **Add**.

      ![](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-033.png)

   - Fill in the port forwarding related information.
   
      Name: fill in the name

      Port: Fill in the local listening port, which is greater than 1024 and less than 65535. For example, fill in 27019.
      
      Fill in the domain name of MongoDB (available on the instance details page).
      
      Fill in the MongoDB port, which is 27017.
      
      ![](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-034.png)

1. Save the settings and connect to the Virtual Machines.
1. Connect to the MongoDB instance locally.

   Connection Address: fill in localhost or 127.0.0.1.
   
   Port: The local port to listen on, such as 27019 above.
   
   Account and Password: Account and password information set by the MongoDB instance.

## Mode 2: Set the forwarding rules on the Virtual Machines, taking socat as an example below.

### Precondition

A virtual machine associated with an EIP and Linux system is in the same VPC with the MongoDB, and the virtual machine connection is not limited by ACL and security group.

### Operation Steps

1. Login to the Virtual Machines.
1. Install socat.
   > yum install -y socat

2. Add a proxy rule.
   > socat TCP-LISTEN:27019,fork TCP:jmongo-hb1-prod-mongo-xxxx.jmiss.jcloud.com:27017

   - TCP-LISTEN: Fill in the listening port, such as 27019 above.
   - TCP: The connection address and domain name of your MongoDB.

1. Local connection to the MongoDB instance.
   - Connection Address: Fill the EIP of the Virtual Machines.
   - Port: The listening port, such as 27019 above.
   - Account and Password: Account and password information set by MongoDB.
   
### Related Reference

- [Connection Instance](../Getting-Started/Connect-Instance.md)
- [Virtual Machines cannot connect to MongoDB?](..//Troubleshooting/Connect-Failed.md)
