# Core Concept
Before operating the ENI, please learn about the following basic concepts and terminologies of the ENI in detail.

| English | Chinese | Description |
| :- | :- | :- |
| ENI | 弹性网卡 | ENI is a virtual network interface that can be applied for independently and can be elastically plugged from the VM |
| Primary Network Interface | 主网卡 | Primary network interface is a special-type ENI that is created with the VM and has the same life cycle as the VM |
| Secondary Network Interface | 辅助网卡 | Secondary network interface is a type of ENI that can be created and deleted independently and can be plugged elastically|
| Primary IP | 主IP | The first private IP address assigned when the ENI was created can be specified by the user or assigned by the system and cannot be modified and released |
| Secondary IP | 辅助IP | Other private IP addresses other than primary IP, which are assigned by the ENI, can be specified by the user or assigned by the system and can be released |
| Elastic IP | 弹性公网IP | The elastic IP is a public IP address that can be applied independently and flexibly associated and disassociated with private IP |
| Security group | 安全组 | Security group is a distributed and stateful firewall that filters traffic to and from an ENI |
| MAC | MAC地址 | MAC address is the unique identifier for an ENI |