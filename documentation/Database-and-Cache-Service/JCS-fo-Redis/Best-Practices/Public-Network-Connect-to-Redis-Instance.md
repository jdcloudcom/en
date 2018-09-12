# Public connects Redis instance

If you need a local computer to connect it to JD Cloud Redis, you can use SSH's port forwarding function. Here is an example of Xshell to explain how to set it up.

Prerequisite: a JD Virtual Machine with Linux system, Associate EIP which is in the same virtual private cloud as JD Cloud Redis.

## Action Steps

1.  Install Xshell on local computer and remote connect to the virtual machine with Public IP by SSH protocol.

- Select “connect”, enter name, and select protocol as SSH;

- Machine IP: fill in the public IP of JD Cloud Virtual Machine

2. User identification login

- Method: Password;

- User Name: fill in the login user name of JD Cloud Virtual Machine, and it is “root” by default;

- Password: password used to log in to JD Cloud Virtual Machine.

3. Set port forwarding rules

- Select “tunnel” under “SSH” and click “add”

4. Fill in the transferring rules

- Source machine: localhost or 127.0.0.1;

- Listen port: fill in local listen port when forwarding Xshell setting port;

- Target machine: fill in the domain of Redis; see JD Cloud cache Redis console for details; click the instance name to enter the instance details, resource information –> access domain;

- Target port: fill in the port of Redis; see JD Cloud cache Redis console for details; click the instance name to enter the instance details, resource information –> port, and it is 6379 by default.

5. Connection test (window client)
