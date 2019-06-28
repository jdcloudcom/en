## Restrictions
For security reasons, JCS for Elasticsearch cluster is constructed in Virtual Private Cloud (VPC), and the writing and search of the cluster data is also limited within the same VPC network.

<table>
	<thead>
	<tr>
		<th colspan="2">Region Name and Code</th>
      	<th>Availability Zone Name and Code</th>
      	<th>City</th>
   	</tr>
		</thead>
	<tbody>
   	<tr>
      	<td rowspan="6">Regions in the Chinese Mainland</td>
      	<td rowspan="3">cn-north-1<br>cn-north-1</td>
     	<td> Availability Zone A<br>cn-north-1a</td>
	   	<td> Beijing</td>
   </tr>
		
   <tr>
     	<td> Availability Zone B<br>cn-north-1b</td>
	   	<td> Beijing</td>
   </tr>
   <tr>
     	<td> Availability Zone C<br>cn-north-1c</td>
	   	<td> Beijing</td>
   </tr>
   </tr>
    	<tr>
     	<td rowspan="3">cn-east-2<br>cn-east-2</td>
     	<td>Availability Zone A<br>cn-east-2a</td>
	   	<td>Shanghai</td>
   </tr>
      </tr>
    	<tr>
     	<td>Availability Zone B<br>cn-east-2b</td>
	   	<td>Shanghai</td>
   </tr>
  <tr>
     	<td> Availability Zone C<br>cn-east-2c</td>
	   	<td> Shanghai</td>
   </tr>
   </tbody>
</table>


### Specification Configuration

|Limit Item|Limiting Rules | Exceptional Application Method
:--|:---|:---
|Cluster Version|V6.5.4, V5.6.9|Unadjustable
|Data Node Count|cn-north-1 (Availability Zone A): 1-20, cn-north-1 (Availability Zone B): 1-40, cn-north-1 (Availability Zone C): 1-15, cn-east-2 (Availability Zone A): 1-30, cn-east-2 (Availability Zone B): 1-15, cn-east-2 (Availability Zone C): 1-15, |Ticket
|Coordinator Node Count	|cn-north-1 (Availability Zone A): 2-20, cn-north-1 (Availability Zone B): 2-40, cn-north-1 (Availability Zone C): 2-15, cn-east-2 (Availability Zone A): 2-30, cn-east-2 (Availability Zone B): 2-15, cn-east-2 (Availability Zone C): 2-15 |Ticket
|Dedicated Primary Node Count|	3|Unadjustable
|Node Storage|20-4000G (the step size is 10GB)|Unadjustable
|Specification of Data Node|1-core 2G, 2-core 4G, 2-core 8G, 4-core 16G, 8-core 32G, 16-core 64G|Unadjustable
|Specification of Coordinator Node|2-core 8G, 4-core 16G, 8-core 32G, 16-core 64G|Unadjustable
|Specification of Dedicated Primary Node|2-core 8G, 4-core 16G, 8-core 32G, 16-core 64G|Unadjustable

### Network Access

For security reasons, JCS for Elasticsearch cluster is constructed in Virtual Private Cloud (VPC), and the writing and search of the cluster data is also limited within the same VPC network.

```
Note:
* After the JCS for Elasticsearch cluster is created successfully, the switchover of VPC network is not supported. You need to conduct the business plan deployment in advance when you create the cluster.

```
