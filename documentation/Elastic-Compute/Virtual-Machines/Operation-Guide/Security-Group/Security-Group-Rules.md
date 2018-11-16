# Security Group Rules
Security group rules can control the allowed inbound/outbound traffic of instances associated with the security group.
## Contents of Security Group Rules
* Type: Common application types, such as SSH, PING, or HTTP, or you can choose to customize TCP or UDP.
* Protocol: Select the type of protocol to which it belongs according to the application type.
* Destination Port:

  - If an inbound rule is configured, the destination port refers to the instance port in the security group; if an outbound rule is configured, the destination port refers to the remote port.
  - The port value is 1-65535 and a single port such as "22" or a port range such as "20-22" can be filled in.
  - If you select a common application in the rule type, the destination port will be displayed directly as corresponding default port, and the setting is unnecessary; if you choose to customize TCP/ UDP, you can customize the port range.

* Source/ Destination IP: The IP address or address field (CIDR) that is allowed to access/ be accessed only supports IPv4. If you fill in 0.0.0.0/0, it means that access to all IP addresses is allowed.
* Policy: Allowed (Default and cannot be modified).
* Remarks: Mark the purpose of the rules, and up to 256 characters can be entered.

## Restrictions of Security Group Rules
* By default, there are following rules for security groups created by the user
   * Inbound Direction: Drop all traffic
   * Outbound Direction: As required by internal services, allow TCP port 80 and UDP port 67, 68 and 161, and drop the traffic of rest port
* The security group rule policy is always "Allow"; you cannot create rules that "Drop" access.
* Security groups are stateful: If you configure an outbound rule to allow an instance to send a request externally, the response traffic for that request will be allowed to flow in regardless of the inbound security group rules, and vice versa.
* You can add and delete rules at any time. The new security group policy will be automatically applied to the instance associated with the security group.

## Security Group Priority
The security group has no priority. When an instance is associated with multiple security groups, the rules of each security group will be aggregated to take effect, and whether the access is allowed is determined according to the aggregated rules.

## Security Group Service Limits
* Security groups are applicable to instances in a VPC environment; 　　
* You can create 50 security groups under each VPC in each region. At most 100 rules can be added for each security group in both directions;
* A single network interface of each instance can be associated with 5 security groups at the same time;
