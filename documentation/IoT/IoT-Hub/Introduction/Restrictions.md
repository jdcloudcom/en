# Restrictions


IoT Hub is the PaaS service for device connection, device management, data forwarding and storage in IoT.

## Support Regions
The region supported now is cn-north-1.

## Use Restrictions

| Type           | Description                                          | Restriction  |
| -------------- | --------------------------------------------- | ----- |
| Number of Products         | Maximum number of products that can be created under a single account              | 1,000  |
| Number of Devices         | Maximum number of devices that can be registered under a single product              | 100,000  |
|                | Maximum number of devices that can be registered under a single account              | 5 million |
|                | Maximum number of registered device in each batch                    | 500   |
| Gateway Sub-device Number   | Maximum number of sub-devices that can be associated under a single gateway            | 1,000  |
| Thing Model Function Definition | Maximum number of functions that can be defined by the Thing Model of a single product        | 100   |
|                | Maximum number of input parameters defined for each service                    | 20    |
|                | Maximum number of output parameters defined for each service                    | 20    |
|                | Maximum number of output parameters defined for each event                    | 20    |
| Rule Engine       | Number of rules allowed to be created under the same account                | 100   |
|                | Number of operations for forwarding data in a rule                  | 10    |
| Maximum Number of MQTT Connections | Maximum number of MQTT connections allowed per second under a single account            | 100   |
| Size of MQTT Messages   | Maximum length of a single MQTT message(2KB per message when billing)  | 16KB  |

## Related References

- [Product Overview](../Introduction/Product-Overview.md)
- [Price Overview](../Pricing/Price-Overview.md)
