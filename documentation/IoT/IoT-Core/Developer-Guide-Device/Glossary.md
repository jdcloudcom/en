# Terminology

| **Noun**      | **Description**                                                     |
| ------------- | ------------------------------------------------------------ |
| ProductKey    | Unique identifier of product, each device belongs to one product.                                               |
| ProductSecret | Product secret key, used for verifying one model and one password of user’s device                       |
| DeviceName    | Device name, generally device mac address, SN, etc.                    |
| DeviceSecret  | Device secret key, used for information signature                                 |
| Identifier    | Global and unique identifier of device, used for information signature                         |
| One Model and One Password      | A device can dynamically get Identifier and DeviceSecret for verification connection via ProductKey, ProductSecret and DeviceName |
| One Machine and One Password      | A device can make verification connection via ProductKey, Identifier and DeviceSecret     |
| Three-element Group        | ProductKey, Identifier and DeviceSecret of device are called as the three-element group         |
| Gateway Device      | The device connecting and managing sub-devices and playing the role of verification and communication with the cloud as the sub-device agent    |
| Sub-device       | Device connected to the cloud via a gateway agent        |
