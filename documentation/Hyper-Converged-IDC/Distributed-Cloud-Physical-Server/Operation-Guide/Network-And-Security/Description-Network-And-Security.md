# Firewall Configuration Instruction

## Function Description

Firewall with status may be configured via iptables for Linux server, the connection status created for sending and receiving information packages can be specified and remembered, and it is a set of command package to set, maintain and inspect IP package filtration rules of Linux core.

iptables firewall of table--Linux has three tables by default, i.e. Filter, NAT and Mangle, and there are also customized tables, among which Filter is the table to be used by default;

chain--band chain, e.g. filter has three chains, i.e. INPUT, OUTPUT and FORWARD.

**Note: Please disable SSH login port 22 with care, as disabling port 22 will lead to inaccessibility from the external to the Distributed Cloud Physical Server.**
