# Create Rule Engine

You can create rules through the Console or API of the IoT Hub Service. This document introduces how to create a rule through the Console.


## Preconditions
- JD Cloud account registration is done and real-name verification is completed. If you have no accounts, please [Register](https://accounts.jdcloud.com/p/regPage?source=jdcloud%26ReturnUrl=%2f%2fuc.jdcloud.com%2fpassport%2fcomplete%3freturnUrl%3dhttp%3A%2F%2Fuc.jdcloud.com%2Fredirect%2FloginRouter%3FreturnUrl%3Dhttps%253A%252F%252Fwww.jdcloud.com%252Fhelp%252Fdetail%252F734%252FisCatalog%252F1), or make [Real-name Verification](https://uc.jdcloud.com/account/certify).
- The instance of IoT Hub Service has been created.


## Operation Steps
1. Log in [IoT Hub Service Console](https://iot-console.jdcloud.com/iothub).
2. On the “Rule Engine” page, you can conduct the Create Rule operation.

	
	
3. In the drop-down list of the instance list, select one IoT Hub Service instance.

![实例列表](../../../../../image/IoT/IoT-Hub/iothub-006.png)


5. On the “Create Rule” page, enter the basic information of the rule: rule name and rule description. Name cannot be duplicated.
6. On the “Create Rule” page, you can write JS script to pre-process the data.
7. On the “Create Rule” page, you can set the forwarding data action to forward the data to JD Cloud JCQ, JD Cloud RDS and JD Cloud ES services or other Topic subjects of MQTT to implement M2M communication.
8. On the “Create Rule” page, you can set the forwarding failure data action and then you can forward the device data to other available services when the destination service of forward service is unavailable.
		*Note
		The destination service setting defined in forwarding failure action must be different from that defined in forwarding data action.

    
	

## Related References
- [Design TSL](../../Best-Practices/Design-OM.md)
- [Instance List](../../Getting-Started/List-Instance.md)
- [Billing Rules](../../Pricing/Billing-Rules.md)

