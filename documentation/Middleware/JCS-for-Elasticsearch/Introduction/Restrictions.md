## Restrictions
### Region and Availability Zone

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

### Specification Restriction

|Limit Item|Limiting Rules | Exceptional Application Method
:--|:---|:---
|Cluster Version|V6.5.4, V5.6.9, V6.7.0|Unadjustable
|Quota of Instances that Can Be Created in Each Region|20| Ticket

### Network Access

For security reasons, JCS for Elasticsearch cluster is constructed in Virtual Private Cloud (VPC), and the writing and search of the cluster data is also limited within the same VPC network.

```
Note:
* After the JCS for Elasticsearch cluster is created successfully, the switchover of VPC network is not supported. You need to conduct the business plan deployment in advance when you create the cluster.

```
