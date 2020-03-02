# Restrictions

Only JD Cloud users who successfully apply for public network IPs have permission to use the Anti-DDoS Basic function.

## Protective Bandwidth

The protection capability of Anti-DDoS Basic is related to the bandwidth of EIP purchased by you. If the attack to EIP exceeds the blackhole threshold of this IP, the blackhole will be triggered and all accesses of the attack will be shielded. Correspondence between the blackhole threshold of EIP and the bandwidth is shown in the table below.

|     Bandwidth (Mbps)     | Black Hole Threshold |
| :-----------------: | :------: |
|     Bandwidth <= 100    |    2G    |
|  100 < Bandwidth <= 200  |    2G    |
|  200 < Bandwidth <= 500  |    2G    |
| 500 < Bandwidth <= 1,000  |    3G    |
| 1,000 < Bandwidth <= 2,000 |    4G    |
| 2,000 < Bandwidth <= 5,000 | Bandwidth Value*2 |
|     Bandwidth > 5,000     | Bandwidth Value*2 |


If you need higher attack protection capability, please purchase Anti-DDoS Protection Package.


## Related References
- [Anti-DDoS Protection Package Introduction](https://www.jdcloud.com/en/products/anti-ddos-protection-package)
