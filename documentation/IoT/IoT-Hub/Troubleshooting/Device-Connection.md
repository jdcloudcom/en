# Problem concerning failure to connect a device to the IoT Hub Service

## Problem Description

My device cannot be connected to the IoT Hub Service.

## Troubleshooting

The device needs to be registered before it is connected to the IoT Hub Service. Please confirm that the correct device ID (i.e. value of DeviceName Field in the device registration file) is loaded in the device registration file.

Or

The MQTT client in the device firmware configured the correct public network domain of the IoT Hub Service.

Or

The MQTT client in the device firmware needs to send the correct device ID (i.e. value of DeviceName Field in the device registration file) when communicating with the IoT Hub Service.

## Follow-up Processing
  If the problem remains unresolved through the above operations, please call the customer service at 400-615-1212.
