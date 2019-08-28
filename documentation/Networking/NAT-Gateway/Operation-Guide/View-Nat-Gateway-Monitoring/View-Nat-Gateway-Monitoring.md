# View NAT Gateway Monitoring Information
1. Open VPC Console https://cns-console.jdcloud.com/host/vpc/list

2. Click **NAT Gateway** on the navigation bar on left side**

3. In ID/ Name column, click **NAT Gateway Name** to be edited, go to the NAT Gateway Details

4. Enter the Monitoring page by click **Monitoring** in the Details to view monitoring information

Detailed description of monitoring item is as shown in the table below

| Monitoring Item | Description |
| :- | :- |
| Number of New Connections | Number of connections established through the NAT Gateway in the last 60 seconds.|
| Number of Active Connections | Total number of concurrent TCP connections that are activated through NAT Gateways. A zero value indicates that no connection is activated through the NAT Gateway. |
| Public IP Rate (Inbound/Outbound)| Public network traffic generated through NAT Gateway Public IP. Unit: bps |
| NAT Gateway Rate (Inbound/Outbound) | NAT Gateway Rate, including all traffic generated through NAT Gateways on Internet and Intranet. Unit: bps |
| Packet Loss Number | Number of data packages lost by the NAT Gateway. A value greater than zero may indicate that NAT Gateway has temporary problems persistently. Unit: piece |
| Depletion Number of Source Port | Number of times that the NAT Gateway cannot allocate the source port. A value greater than zero indicates too many concurrent connections opened through the NAT Gateway.|
