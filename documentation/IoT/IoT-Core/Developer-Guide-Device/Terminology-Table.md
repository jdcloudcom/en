# Terms

| Term       | Description                                                         |
| :--------- | :-------------------------------------------------------|
| Directly Connected Device   | Device with abilities of being connected to the IoT Management Platform via the MQTT protocol                       |
| Indirectly Connected Device   | Device without abilities of being connected to the IoT Management Platform via the MQTT protocol                     |
| Directly Connected Device   | Device with abilities of being connected to the IoT Management Platform via the MQTT protocol                       |
| Indirectly Connected Device   | Device without abilities of being connected to the IoT Management Platform via the MQTT protocol                     |
| Gateway Device   | Have the ability of being connected to the IoT Management Platform by virtual of the MQTT protocol and be able to provide proxy service for indirectly connected device |
| Child Device     | Refer to the indirectly connected device herein                                         |
| Attribute       | Some independent parameters indicating status and conditions, such as time, name, version, temperature, volume, on/off and other basic attributes |
| Method       | A method refers to a specific operation with parameter input and output, by calling which a result is provided |
| Incident       | Some messages triggered by some conditions and actively sent by the device end |
| Instance Name       | Unique identifier of one attribute instance, incident instance, method instance or model instance in Thing Model. Require to be keep unique in Thing Model |
| Object Space       | Optional values include {"device", "edge", "group"} and the value supported by SDK now is {"device"}|
| Service Instance Name       | Optional values include {NULL, "connection_agent", "ota", "config"} and values supported by SDK now include {NULL， "connection_agent"}|
| connection_agent       | A built-in proxy service, which is required for gateway device and is used for completing corresponding function for a proxy child device; The directly connected device may not require this service|

