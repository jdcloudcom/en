## VPN Monitoring
Via Monitoring, the VPN Tunnel level monitoring information can be provided to you. When the VPN Tunnel is under service, these monitoring data will be automatically and periodically collected to Monitoring and be displayed in the form of monitoring graph. Meanwhile, you can get VPN monitoring data via Open API for further treatment for monitoring data.

#### VPN Tunnel Monitoring Item

| Monitoring Item | Unit | Description |
|:---:|:---:|:---:|
| Original Outflow Traffic Rate | bps | Rate of traffic in VPN tunnel, flowing from the cloud to the customer’s gateway before encryption |
| Original Inflow Traffic Rate | bps | Rate of traffic in VPN tunnel, flowing from the customer’s gateway to the cloud after decryption |
| Rate of Encrypted Outflow Traffic | bps | Rate of encrypted traffic in VPN tunnel, flowing from the cloud to the customer’s gateway |
| Encrypted Inflow Traffic Rate | bps | Rate of traffic in VPN tunnel, flowing from the customer’s gateway to the cloud before decryption |
| Inflow Data Package Number | pps | Number of encrypted data package in VPN Tunnel, flowing from the cloud to the customer’s gateway |
| Inflow Data Package Number | pps | Number of data package in VPN Tunnel, flowing from the customer’s gateway to the cloud before decryption |
