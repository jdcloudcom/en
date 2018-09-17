# Infrastructure

    The Basic Anti-DDoS framework consists of three modules: management center, detection device and cleaner device.
    
## Business Architecture

The basic protection business structure is shown in the following figure:

![Create instance](https://github.com/jdcloudcom/cn/blob/edit/image/Basic%20Anti-DDos/Infrastructure01.png)

Note: 1. The image flow to the detection device 2. The detection device detects an attack, and notifies the management center of the attack information.
      3. After receiving the attack information, the management center shall notify the cleaner device to prepare for cleaning.
      4. Introduce the flow to the cleaner deivice for flow cleaning and re-inject the cleaned flow.
      5. Normal flow

| Name | Description |
| - | - |
| Management Center | is mainly responsible for receiving attack information and sending a cleaning strategy to guide the cleaner equipment to carry out flow cleaning.
| Cleaner Device | Mainly based on the cleaning strategy issued by the management center, wash the iffish flow, and re-inject the cleaned flow.
| Detection Device | Mainly analyzes the flow to judge whether there exist attacks. If so, send attack information to the management center.

## Related Reference

- [What is Basic Anti-DDoS](https://github.com/jdcloudcom/cn/blob/edit/documentation/Cloud-Security/Basic-Anti-DDoS/Introduction/Overview.md)
- [Core Concepts](https://github.com/jdcloudcom/cn/blob/edit/documentation/Cloud-Security/Basic-Anti-DDoS/Introduction/Core-Concepts.md)
- [Application Scenarios](https://github.com/jdcloudcom/cn/blob/edit/documentation/Cloud-Security/Basic-Anti-DDoS/Introduction/Application-Scenarios.md)
- [Basic Function](https://github.com/jdcloudcom/cn/blob/edit/documentation/Cloud-Security/Basic-Anti-DDoS/Introduction/Functions.md)
- [Use limit](https://github.com/jdcloudcom/cn/blob/edit/documentation/Cloud-Security/Basic-Anti-DDoS/Introduction/Restrictions.md)
