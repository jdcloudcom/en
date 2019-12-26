# Create edge node

You can rapidly create and register edge nodes via IoT Edge Console or API. For billing instructions, please refer to "[Billing Rules](../Pricing/Billing-Rules.md)".

This Document specifies how to create edge nodes through the Console.

## Preconditions
- JD Cloud account registration is done and real-name verification is completed. If you have no accounts, please [Register](https://accounts.jdcloud.com/p/regPage?source=jdcloud%26ReturnUrl=%2f%2fuc.jdcloud.com%2fpassport%2fcomplete%3freturnUrl%3dhttp%3A%2F%2Fuc.jdcloud.com%2Fredirect%2FloginRouter%3FreturnUrl%3Dhttps%253A%252F%252Fwww.jdcloud.com%252Fhelp%252Fdetail%252F734%252FisCatalog%252F1), or make [Real-name Verification](https://uc.jdcloud.com/account/certify).
- The IoT Core Instance has been created. If the instance hasn’t been created, please create it by logging in [IoT Core Console](https://iot-console.jdcloud.com/core).

## Operation Steps
1. Log in [IoT Edge Console](https://iot-console.jdcloud.com/edge).

2. In the "Edge Node List" Page, click **Create Edge Node** to enter the "Create Edge Node" page.

3. On the "Create Edge Node - Step 1" Page, fill in corresponding information according to notification on the page.

    ![新建边缘节点第一步](../../../../image/IoT/IoT-Edge/Createedge01.png)

    | Project         | Description                                                         |
    | ------------ | ------------------------------------------------------------ |
    | Node Name     | The name is a compulsory item and cannot be null, support English, numbers, underline "_" and line-through "-", must begin and end with English letter and numbers, with the limited length of 3-30 characters. |
    | Hardware Platform     | Edge node hardware architecture currently only supports amd64                            |
    | Operating system     | Operating system environment on which the edge system installation depends currently only supports Linux 64-bit system   |
    | Edge Node Manufacturer | Edge Node Hardware Device Producer or Manufacturer Optional. Support Chinese, English, numbers, underline "_" and line-through "-", must begin and end with Chinese or English letter and numbers, with the limited input of 30 characters. |
    | Edge Node Model | Edge Node Hardware Model Optional. Support Chinese, English, numbers, underline "_" and line-through "-", must begin and end with Chinese or English letter and numbers, with the limited input of 30 characters. |
    | Node Description     | The descriptive information of edge node itself. Optional, 80 characters at most.               |

    

4. Please **be sure to download** the Edge system installation file and configuration file on the "Create Edge Node-Step 2" page and appropriately save the configuration information. Then, please install the Edge system according to the Operation Guide on the bottom of the page. Note: When installing Edge system, you need to keep the edge node device connected to the Internet.

    ![新建边缘节点第二步](../../../../image/IoT/IoT-Edge/Createedge02.png)

5. Click **Complete Creation**, this page will automatically redirect to the "Edge Node List" page and please wait to complete creation of edge node. You can view newly-created edge nodes on the "Edge Node List" page.

## Related References

- [Install Edge System](Install-Edge-System.md)
