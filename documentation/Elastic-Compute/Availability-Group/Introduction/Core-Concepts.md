# Core Concepts

When we understand JD Cloud’s Availability Group, we usually involve the following concepts:

Concept|Introduction
:---|:---
Region|The physical location of the Availability Group and within group resources.
Availability Zone|Power and Network Independent Data Centers in the same area.
Instance Template|Creating parameter configuration templates for Virtual Machines instances within availability groups contain configuration information such as mirroring, instance specifications and networks. There is no need to reset the configuration information to specify when creating Virtual Machines based on instance type.
Fault domains|The isolated physical resource pools in the data center can be understood as the rack groups in the data center, called fault domains. A single Availability Group assigns 5 fault domains to a single Availability Zone by default. It can limit the influence of potential physical hardware failure, network interruption or power interruption.
Automatic scaling|Configuring rules based on business load conditions automatically increasing or decreasing the number of Virtual Machines in Availability Groups when triggering rules occur.
Maximum and minimum of automatic scaling|Under auto-scaling conditions, there are upper limits and lower limits on the number of Virtual Machines in Availability Groups. It should be noted that the maximum number of VMs within the Availability Group is also limited by your Virtual Machines quota in the current region.
Alarm strategy|Trigger rules based on monitoring indexes (such as CPU and memory utilization) under auto-scaling conditions.
Timing strategy|Pre-setting time and automatic scaling triggering rules after expiration.

