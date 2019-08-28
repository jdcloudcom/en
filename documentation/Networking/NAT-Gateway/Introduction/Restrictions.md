# Restrictions

- Up to 5 NAT Gateways can be created in each region
- Each Gateway is associated with a Public IP by default, which cannot be disassociated nor associated with more IPs
- Users cannot associate security groups for NAT Gateways
- Users cannot route traffic to NAT Gateway through VPC Peering Connection Gateway
- Not support IP packet fragment
- Currently, Application Layer Gateway (ALG) only supports ICMP
- One Source IP initiates a connection to a unique Destination IP port through a NAT Gateway to establish 65,535 concurrent connects at most
- NAT session timeout is divided into 4 types, idle timeout is as follows, subsequent data packets will be silently discarded after a timeout
  - TCP Established Connection Idle Timeout: 1800s
  - TCP Transitory Connection Idle Timeout: 60s
  - UDP Mapping Idle Timeout: 60s
  - ICMP Mapping Idle Timeout: 60s
