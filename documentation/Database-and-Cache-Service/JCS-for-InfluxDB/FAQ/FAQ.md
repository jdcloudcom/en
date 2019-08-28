# FAQ

**Q: Is public network connection supported by JCS for InfluxDB?**

A: JCS for InfluxDB supports public network connection. Internet access is not enabled by instance by default and can be manually enabled if required. For safety, it is suggested that the whitelist setting shall be enabled at the same time. For operation method, please refer to [Enable Internet Access](../Operation-Guide/Instance-Management/Internet-access.md) and [Set White List](../Getting-Started/Set-Whitelist.md).

**Q: What is the current version of JCS for InfluxDB?**

A: The current version of JCS for InfluxDB is Version 1.74.

**Q: Will the performance be affected after SSL Encryption is enabled?**

A: After SSL Encryption is enabled, the database performance will be affected to some extent, generally being degraded by 20%-30%. If the database is connected through an Intranet only, it is suggested that the SSL Encryption shall not be enabled.

