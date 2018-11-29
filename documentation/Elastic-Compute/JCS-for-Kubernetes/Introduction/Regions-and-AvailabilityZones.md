# Region and Availability Zone
JD Cloud's machine room is distributed in multiple locations around the world. These locations are called regions. Each region is an independent geographical area, and each region is completely independent.  

JD Cloud supports you to deploy cloud business at different regions, and to prevent simple point risk possibly brought by single region deployment, multiple availability zone deployment in multiple regions is suggested to be considered at the deployment scheme design stage. After creation of JCS for Kubernetes, its region or availability zone cannot be changed.

Availability zone is a physical region where power and network are independent of each other. Clusters at the same availability zone have less network delay than instances at different availability zones in a same region. Different availability zones in a same region provide an environment for intranets to connect to each other while there is fault isolation between availability zones.

* If high disaster tolerance is required in your business, JCS for Kubernetes is suggested to be deployed at different availability zones in a same region.  
* If low network delay is required in your business, JCS for Kubernetes is suggested to be deployed at a same availability zone.  

## Region and Availability Zone Distribution of JCS for Kubernetes
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
      	<td rowspan="6">Regions in Mainland China</td>
      	<td rowspan="2">Cn-north-1<br>cn-north-1</td>
     	<td> Availability Zone A<br>cn-north-1a</td>
	   	<td> Beijing</td>
   </tr>
		
   <tr>
     	<td> Availability Zone B<br>cn-north-1b</td>
	   	<td> Beijing</td>
   </tr>
    	<tr>
     	<td rowspan="2">Cn-east-2<br>cn-east-2</td>
     	<td>Availability Zone A<br>cn-east-2a</td>
	   	<td>Shanghai</td>
   </tr>
      </tr>
    	<tr>
     	<td>Availability Zone B<br>cn-east-2b</td>
	   	<td>Shanghai</td>
   </tr>
  <tr>
     	<td>Cn-south-1<br>cn-south-1</td>
     	<td>Availability Zone A<br>cn-south-1a</td>
	   	<td>Guangzhou</td>
   </tr>
   </tbody>
</table>
