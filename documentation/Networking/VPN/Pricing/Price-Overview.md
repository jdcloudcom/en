# Price Overview

For price, refer to the following table, with specific price subject to the charge made by the Console. The current VPN Connection doesn't support billing by fixed bandwidth yet.

## VPN Connection Pay by Consumption:
| Region | VPN Connection Occupancy Expenses (RMB/Hour) | Outbound Traffic Fee (RMB/GB) |
|:---:| ---:| ---:|
| cn-north-1 | 0.1 | 0.8 |
| cn-east-2 | 0.1 | 0.8 |
| cn-south-1 | 0.1 | 0.8 |

## VPN Tunnel Pay By Configuration:
| Region | VPN Tunnel Occupancy Expenses (RMB/Hour) |
|:---:| ---:|
| cn-north-1 | 0.12 |
| cn-east-2 | 0.12 |
| cn-south-1 | 0.12 |

#### Billing Example

| Region | Billing Resources | Resource Configuration | Billing  Period | Cost |
|:---:|:---:|:---:|:---:|:---:|
| cn-north-1 | VPN connection is paid by consumption and resource occupation |  | Day | 0.1\*24=RMB 2.4 |
|  | VPN connection is paid by consumption of outbound traffic and actually 10GB is produced |  | Day | 10\*0.8=RMB 8 |
|  | VPN tunnel is paid by occupation of configuration resources | The max. bandwidth per tunnel is 1.5Gbps | Hour | 0.12=RMB 0.12 |
