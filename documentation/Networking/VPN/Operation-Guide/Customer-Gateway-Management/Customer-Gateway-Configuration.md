## Customer Gateway
Customer Gateway (CGW) is the logical representation of client device on cloud in VPN Connection and customers will create IPsec VPN Tunnel based on public network address of VPN Connection and public network address of Customer Gateway.


### Operation Steps
##### Step 1. Create customer gateway
a) Log in [Customer Gateway Console](https://cns-console.jdcloud.com/host/customerGateway/list);  <br />
b) Select region and click **Create**;<br />
c) Enter name, BGP ASN, public network number, public network address, description to create customer gateway:<br />
* BGP ASN is used to establish BGP session between VPN cloud and client under the operation of BGP Routing Protocol for EBGP running between cloud and client.
* Customer Gateway supports configuring multiple public network addresses, but based on the consideration of business high availability, the client shall use at least two public network addresses to establish VPN tunnel with the cloud.

```
  Client single IP is applicable for a majority of business scenarios with a VPN tunnel being established between two cloud public network addresses and one client public network address respectively with a total of two tunnels, meeting basic demands of business high availability.
  Client double IP can greatly improve business high availability with one-to-one VPN tunnel being established between two cloud public network addresses and two client public network addresses.
  Client four IP is applicable for multi-cloud deployment with Amazon AWS.
```
![](../../../../../image/Networking/VPN/Operation-Guide/create-cgw.png)

##### 2. Modify Customer Gateway
You can modify the name, description, and public network address of Customer Gateway.<br />
a) Log in [Customer Gateway Console](https://cns-console.jdcloud.com/host/customerGateway/list);  <br />
b) Select corresponding Customer Gateway and log in the details of Customer Gateway;<br />
c) Modification of the name, description and public network address of customer gateway is supported, the restriction on each configuration item is the same as the creation of Customer Gateway, and the public network address can be modified if no VPN Tunnel has been created for the Customer Gateway;<br />
![](../../../../../image/Networking/VPN/Operation-Guide/update-cgw.png)

##### 3. Delete Customer Gateway
If you do not need Customer Gateway anymore, you can delete it.<br />
a) Log in [Customer Gateway Console](https://cns-console.jdcloud.com/host/customerGateway/list);  <br />
b) Select corresponding Customer Gateway and click **Delete** on the operation bar. The Customer Gateway without creation of VPN Connection can be deleted;<br />
![](../../../../../image/Networking/VPN/Operation-Guide/delete-cgw.png)


For more contents, refer to [VPN Connection Configuration](../../Operation-Guide/VPN-Connection-Management/VPN-Connection-Configuration.md).
