# Set intelligent semantic protection engine

As the traditional rule engine only knows the text rather than the program itself, it has problems such as false positive, frequent rule update and difficulty of detecting unknown threats. However, the intelligent semantic analysis can understand programming languages, realize attack inspection based on logic of context, change rule protection status via iteration of algorithm and find suspicious traffic via detection while reducing rate of false positive. The document mainly specifies how to set intelligent semantic protection engine.


## Prerequisites

- A Web Application Firewall instance has been enabled. For more information, please refer to [Enable Web Application Firewall](https://docs.jdcloud.com/en/web-application-firewall/purchase-process).
- The website has been accessed. For more information, please refer to [Add Website](https://docs.jdcloud.com/en/web-application-firewall/step-1).

## Operation Steps

1. Log in [Web Application Firewall Console](https://cloudwaf-console.jdcloud.com/overview/business).

2. Click **Website Configuration** on the left navigation bar.

3. Locate the domain to be set on the **Website Configuration** page and click **Protection Configuration** on the operation bar.

4. On the protection configuration page, open **Web Protection** tag and ensure the **Overall Protection Switch** is on. If such switch is off, WAF will only keep the traffic forwarding function, providing no protection. As shown in the figure below

![image](../../../../../image/WAF/protect-configure/4.whole-protect-switch.png)



5. Direct to the **Intelligent Semantic Protection Engine** module on the **Web Protection** tag and enable the status switch.

![image](../../../../../image/WAF/protect-configure/76.Intelligent-Protection-Semantics-Engine.png)

6. After the **Detection Mode** is selected, the attack inspection and log record observation are supported. The **Interception Mode** is not supported temporarily.