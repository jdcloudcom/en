# Create edge computing node

You can rapidly create and register edge nodes via IoT Edge Console or API. For billing instructions, please refer to “[Price Overview](../Pricing/Billing-Overview.md)” and “[Billing Rules](../Pricing/Billing-Rules.md)”.

This Document specifies how to create edge nodes through the Console.

## Preconditions
- JD Cloud account registration is done and real-name verification is completed. If you have no accounts, please [Register](https://accounts.jdcloud.com/p/regPage?source=jdcloud%26ReturnUrl=%2f%2fuc.jdcloud.com%2fpassport%2fcomplete%3freturnUrl%3dhttp%3A%2F%2Fuc.jdcloud.com%2Fredirect%2FloginRouter%3FreturnUrl%3Dhttps%253A%252F%252Fwww.jdcloud.com%252Fhelp%252Fdetail%252F734%252FisCatalog%252F1), or make [Real-name Verification](https://uc.jdcloud.com/account/certify).
- One IoT Hub instance has been created. If the instance hasn’t been created, please create it by log in [IoT Hub Console](https://iot-console.jdcloud.com/iothub).

## Operation Steps
1. Log in [IoT Edge Console](https://iot-console.jdcloud.com/iotedge).

2. In the “Edge Node List” Page, click **Create Edge Node** to enter the “Create Edge Node” page.

3. On the “Create Edge Node - Step 1” Page, fill in corresponding information according to notification on the page.

    ![新建边缘节点第一步](../../../../image/IoT/IoT-Edge/Createedge01.png)

    Note: During Beta, only the X86-64 architecture and the above Ubuntu18.04 system are supported.

4. Please download the Edge system installation file on the “Create Edge Node-Step 2” page and appropriately save configuration information. Then, please install the Edge system according to the Operation Guide on the bottom of the page.

    ![新建边缘节点第二步](../../../../image/IoT/IoT-Edge/Createedge02.png)

5. Click **Complete Creation**, this page will automatically redirect to the “Edge Node List” page and please wait to complete creation of edge node. You can view newly-created edge nodes on the “Edge Node List” page.

## Related References

- [Install Edge System](Install-Edge-System.md)
