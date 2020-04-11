## As a backup for Direct Connect, VPN co-establishes hybrid cloud

Scenario: Customers hope to deploy partial resources (e.g. application and database) on cloud and partial core resources in enterprise IDC, and for data with large volume, or high sensitivity to network stability and latency, they can use Direct Connect as the main link and connect intranet environment between JD Cloud and enterprise IDC/office with IPsec VPN as the back-up link.

```
  Intranet segments in networking environments with multiple interconnections shall not conflict with each other and at least one static public IP shall be configured on VPN Gateway in local data center (you are recommended to configure two static public IP).
  Traffic controlled on route level is defaulted to flow through Direct Connect and if the Direct Connect route is invalid, the traffic will flow through VPN Connection.
```

![](../../../../../image/Networking/VPN/Introduction/work-with-directconnect.png)

For Direct Connect VPN primarily prepared solution example, refer to [Dedicated Line VPN Hybrid Cloud Solution](../../Best-Practices/Connection-With-DirectConnect.md).
