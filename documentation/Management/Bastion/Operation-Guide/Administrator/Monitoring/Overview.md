
# Monitoring Overview

The monitoring module will provide the real-time monitoring and management service for the Bastion instance, supporting different monitoring dimensions. The data will be collected once the resources are successfully created, and directly displayed in the form of charts, thus you can know information as resource usage conditions and running status conveniently. At the same time, you can set different alarm rules. The alarm notification can be triggered upon meeting the triggering conditions, making fault localization easy.

**Monitoring Item**

JD Cloud & AI provides the Bastion instance with the following monitoring items:

| Monitoring Item         | Description                       | Unit |
| -------------- | -------------------------- | -------- |
| CPU Utilization Rate     | CPU Use Rate of Instance          | %        |
| Memory Use Rate     | Memory Use Rate of Instance           | %        |
| Disk Read Bytes   | Traffics Read by Instance Disk  | MB       |
| Disk Write Bytes   | Traffics Written by Instance Disk  | MB       |
| Bytes Received by Network | Traffics Received by Instance | MB       |
| Bytes Sent by Network | Traffics Set by Instance | MB       |
| Disk Read IOPS     | Read IOs per Second           | Nr./s     |
| Disk Write IOPS     | Write IOs per Second           | Nr./s     |
| Disk Utilization Rate     | Provide this indicator for node dimension only       | %        |





**Monitoring Data Description**

The collection period of monitoring data is 1 minute;

The statistical period by default supports 1 hour, 6 hours, 12 hours, 1 day, 3 days, 7 days and 14 days, as well as a statistical period set by you from 1 minute (minimum) to one month (maximum);

Monitoring values of different statistics cycles will be aggregated correspondingly. For example, if the statistics cycle is 6 hours, the monitoring graph will display one monitoring value every 5 minutes and this monitoring value is aggregated by the collected values in the corresponding statistics cycle. Recently, three different aggregation types of average value, maximum value and minimum value will be support and you can set the aggregation type on the page;

The monitoring data can be saved for 180 days at most. The user can observe monitoring data of 30 days via Console. If the user needs to obtain monitoring data for a period of 30 days to 180 days, the user shall open ticket.


