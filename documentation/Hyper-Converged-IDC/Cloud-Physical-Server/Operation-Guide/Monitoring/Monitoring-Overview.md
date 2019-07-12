# Performance Monitoring

## Overview

The Cloud Physical Server product performance monitoring service supports different monitoring dimensions. At present, users are required to install the agent to a created instance manually before they can begin to collect their monitoring data which is displayed more clearly by icons to enable users to master the real-time use of resources.<br/>

## Monitoring Item

The monitoring items provided at present: CPU Usage, Memory Usage, Memory Used, Disk Util, Disk Used, Disk Read Traffic, Disk Write Traffic, Disk Read IOPS, Disk Write IOPS, Network Interface Ingress Traffic, Network Interface Egress Traffic, Network Ingress Packets, Network Egress Packets, CPU Average Load 1min, CPU Average Load 5min, CPU Average Load 15min, TCP Total Connection, TCP Normal Connection, and Total Process Count.

## Description of Monitoring Data

The collection period of monitoring data is 1 minute;<br/>
The statistical period by default supports 1 hour, 6 hours, 12 hours, 1 day, 3 days, 7 days and 14 days, as well as a statistical period set by you. It supports a period of 30 days at most;<br/>
Different statistical periods and different monitoring items will carry out corresponding aggregations;<br/>

## Install Agent

curl [http://jdcps-proxy.jdcloud.com/agent/download/jdcps-agent-v1.0.0.bin](http://jdcps-proxy.jdcloud.com/agent/download/jdcps-agent-v1.0.0.bin) -O <br/>
chmod +x jdcps-agent-v1.0.0.bin<br/>
sudo ./jdcps-agent-v1.0.0.bin<br/>

## Detach Agent

service jdcpsd stop <br/>
chkconfig --del jdcpsd <br/>
/bin/rm -f /etc/init.d/jdcpsd <br/>

## Description of Monitoring Data

1. Go to the Cloud Physical Server list page and select **Instance List** -> **VPC Instance**; select the instance you need to view and click to install the "Monitoring Plug-in"; you can finish the installation as per the operations as described above to obtain the monitoring data;<br/>
2. Click **Instance Name** in VPC Instance List and go to the resource information page to view "Agent Status".<br/>
3. Click **Monitoring** in VPC Instance List and go to the performance monitoring page to view the performance monitoring indicator of the server.<br/>



