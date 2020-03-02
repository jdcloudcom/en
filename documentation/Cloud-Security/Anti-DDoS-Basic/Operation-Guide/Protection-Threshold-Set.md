# Protection Threshold Setting

After EIP is purchased, the default cleaning trigger value of EIP is provided as below.

|   Bandwidth (Mbps)   | The default cleaning trigger value is Mbps | The default cleaning trigger value is pps |
| :-------------: | :----------------: | :---------------: |
|    Bandwidth<=100    |        300         |       100K        |
|  100<Bandwidth<=200  |        400         |       150K        |
|  200<Bandwidth<=500  |      Bandwidth Value*3      |    Bandwidth Value*750     |
| 500<Bandwidth<=1,000  |     Bandwidth Value*2.5     |    Bandwidth Value*600     |
| 1,000<Bandwidth<=2,000 |      Bandwidth Value*2      |    Bandwidth Value*500     |
| 2,000<Bandwidth<=5,000 |     Bandwidth Value*1.5     |    Bandwidth Value*400     |
|    Bandwidth>5,000    |     Bandwidth Value*1.2     |    Bandwidth Value*300     |

If it is necessary to modify the cleaning trigger value, please follow the following operation steps.

1. Navigate to the Console->Anti-DDoS Basic->EIP List, base protection, find the IP of the public network that needs to be modified, enter the basic information page, as follows:

![公网IP菜单](../../../../image/Basic%20Anti-DDos/IP-list.png)
![Create Object](../../../../image/Basic%20Anti-DDos/basic%20message.png)

2. Click the **Modify** button beside the protection rules to edit the protection rules of the Anti-DDoS Basic.

If the EIP is associated with an Anti-DDoS Protection Package, rules of the entire protection package can be selected as the protection model, or the customized protection rules can be configured to this IP. To change rules of the entire Anti-DDoS Protection Package, please perform corresponding operation under the "Anti-DDoS Protection Package" menu.
Please set an appropriate threshold for cleaning trigger value, which is suggested to be slightly higher than the service traffic in normal conditions. Once any attack exceeds the threshold, the cleaning will be triggered.

![Create Object](../../../../image/Basic%20Anti-DDos/protection-rules.png)

