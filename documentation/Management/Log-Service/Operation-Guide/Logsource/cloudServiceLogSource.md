# Setting of Cloud Product Log Source

## Overview
Cloud product log sources refer to cloud products from logs. After a user purchases any cloud product at the Console, the cloud product will provide a log by default for checking by the user. The cloud product log requires no user-defined fields and formats and no installation of log collection agent by users and can be reported or collected at the backend of JD Cloud & AI. Users only need to create log configuration corresponding to cloud product log type.

## Operation Steps
1. Log in the Log Service Console, click **Create Log Configuration** or enter a designated log set and click **Create Subject** on the left navigation bar.
2. Complete setting of log set and log subject.
3. Click **Next** to enter the [Log Source Setting] Page.
4. [Log Source] Select a cloud product.
5. [Product] Select a cloud product to be checked.
6. [Log Type] Select a log type supported by a corresponding cloud product.
7. [Collection Instance] According to product line features, instances to be collected can be selected directly at the Log Service Console for some product lines; After log configuration for some product lines, logs of designated instances will be delivered to the created log sets and log subjects on corresponding cloud product page.

## Notes
- On the Log Service Console, select a cloud product whose instances are collected. **Select at most 30 collection instances** under a single log subject.
- If log subjects of log sets are set as the designations at the Console of cloud products to be collected, such log sets are not subject to the restriction of 30 collection instances.

## Configurable Cloud Product and Log Type

<table>
	<tr>
	    <th>Cloud Product Name</th>
	    <th>Log Type</th> 
	</tr >
	<tr >
	    <td rowspan="2">Application Load Balancer (ALB)</td>
	    <td>Access Log</td>
	</tr>
	<tr>
	    <td>Health Check Log</td>
	</tr>
	<tr>
	    <td>Application Security Gateway</td>
	    <td>Security Log</td>
	</tr>
	<tr>
	    <td>Function Service</td>
	    <td>Execution Log</td>
	</tr>
	<tr >
	    <td rowspan="4">ElasticSearch</td>
	    <td>Primary Log</td>
	</tr>
  	<tr>
	    <td>Search slow log</td>
	</tr>
  <tr>
	    <td>Index Slow Log</td>
	</tr>
  <tr>
	    <td>GC Log</td>
	</tr>
  <tr>
	    <td>API Gateway</td>
	    <td>Call log</td>
	</tr>
  <tr >
	    <td rowspan="3">MySQL</td>
	    <td>Audit Log</td>
	</tr>
  	<tr>
	    <td>Statistics of Slow Log</td>
	</tr>
  <tr>
	    <td>Details of Slow Log</td>
  </tr>
  <tr>
	    <td>Kubernetes Cluster</td>
	    <td>System Log</td>
	</tr>
  <tr>
	    <td>JCS for Redis</td>
	    <td>Slow log</td>
	</tr>
  <tr >
	    <td rowspan="3">MySQL</td>
	    <td>Audit Log</td>
	</tr>
  <tr>
	    <td>Error Log</td>
	</tr>
  <tr>
	    <td>Slow search log</td>
	</tr>
  <tr>
	    <td>JDW Data Warehouse</td>
	    <td>Audit Log</td>
	</tr>
  <tr>
	    <td>Automatic Task Policy</td>
	    <td>Automatic Mirroring Execution Log</td>
  </tr>
</table>

