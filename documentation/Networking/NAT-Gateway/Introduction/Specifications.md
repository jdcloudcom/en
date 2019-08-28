# Specifications

NAT Gateway provides packages of multiple specifications

## Configuration Type

NAT Gateway is associated with a Public IP by default without user configuration while at least 3 instance specifications are provided to satisfy maximum 10 million concurrent connections:

- Small (maximum 1 million connections)
- Medium (maximum 3 million connections)
- Large (maximum 10 million connections)


## Maximum Internet Outbound Bandwidth

Optional values of maximum Internet Outbound Bandwidth of NAT Gateway (unit: Mbps) are 1-1000, application for opening ticket is required for more than 1000Mbps, support 4Gbps bandwidth at most



## Maximum Internet Inbound Bandwidth

When Internet Outbound Bandwidth is less than or equal to 100Mbps, Internet Inbound Bandwidth is 100Mbps

When Internet Outbound Bandwidth is more than 100Mbps, Internet Inbound Bandwidth is equal to Internet Outbound Bandwidth
