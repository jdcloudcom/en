# Overview of Bare Metal Virtual Machines

The Bare Metal Virtual Machines are of a VM instance type launched based on JD Cloud & AI’s new-generation self-developed virtualization technology architecture, which are equipped with both performance of physical machines and flexibility of virtual machines. Compared with the previous generation virtualization technology architecture, the new generation virtualization technology architecture no longer has any virtualization overhead. It provides physical level of resource isolation and supports nested virtualization. Your business can make direct access to computing resources on the Bare Metal Virtual Machines to secure your business.
 
## Product Features
*  Perfect performance: It has the same perfect performance as physical machines, providing network and storage with hardware acceleration capability, unintalling the original virtual network and storage protocol stack load from physical host machine to specified hardware without extra virtualization depletion, providing network bandwidth with speed over 10Gbit/s, and supporting nested virtualization
*  Security isolation: It provides hardware-level isolation and exclusive resources, which means you do not need to scramble for the resources of machines with other users on cloud
*  Delivery within minutes: It can deliver a Bare Metal Virtual Machine within minutes without advanced purchasing and manual intervention, which ensures in-time response to demand on business expansion
*  Seamless integration of cloud products: It is fully compatible with cloud products including VPC, cloud disk service, cloud database and cloud monitoring, providing complete cloud solutions
*  Consistent management experience: It supports console and SDK/OpenAPI/CLI operation, providing the same experience as ordinary Virtual Machines

## Compared with ordinary Virtual Machines and cloud physical servers
<table>
   <tr>
      <td colspan="2">Function</td>
      <td >Ordinary VMs</td>
      <td >Bare Metal Virtual Machines</td>
      <td >Cloud Physical Server</td>
	</tr>
	<tr>
      <td rowspan="2">Computation/Memory</td>
      <td >No performance loss</td>
      <td >N</td>
      <td >Y</td>
      <td >Y</td>
	</tr>
	<tr>
      <td >No resource competition</td>
      <td >N</td>
      <td >Y</td>
      <td >Y</td>
   	</tr>
  	<tr>
      <td rowspan="3">Storage</td>
      <td >Cloud Disk System Disk/Data Disk</td>
      <td >Y</td>
      <td >Y</td>
      <td >N</td>
	</tr>
	<tr>
      <td >Cloud Disk Snapshot and Recovery</td>
      <td >Y</td>
      <td >Y</td>
      <td >N</td>
   	</tr>
	<tr>
      <td >Complete Machine Image</td>
      <td >Y</td>
      <td >Y</td>
      <td >N</td>
   	</tr>
  	<tr>
      <td rowspan="3">Network</td>
      <td >VPC Interconnection</td>
      <td >Y</td>
      <td >Y</td>
      <td >N</td>
	</tr>
	<tr>
      <td >Security Group</td>
      <td >Y</td>
      <td >Y</td>
      <td >N</td>
   	</tr>
	<tr>
      <td >ACL</td>
      <td >Y</td>
      <td >Y</td>
      <td >N</td>
   	</tr>
  	<tr>
      <td rowspan="5">Operation and Maintenance Management</td>
      <td >SDK/OpenAPI/CLI</td>
      <td >Y</td>
      <td >Y</td>
      <td >N</td>
	</tr>
  	<tr>
      <td >Console</td>
      <td >Y</td>
      <td >Y</td>
      <td >N</td>
	</tr>
	<tr>
      <td >VNC</td>
      <td >Y</td>
      <td >N</td>
      <td >N</td>
	</tr>
	<tr>
      <td >Remote Connect</td>
      <td >Y</td>
      <td >Y</td>
      <td >Y</td>
	</tr>
	<tr>
      <td >Delivery within Minutes</td>
      <td >Y</td>
      <td >Y</td>
      <td >Y</td>
	</tr>
  	<tr>
      <td >Virtualization</td>
      <td >Nested Virtualization</td>
      <td >N</td>
      <td >Y</td>
      <td >Y</td>
	</tr>
</table>

## Instance Type

Support general Bare Metal Virtual Machines currently g.n2.metal (80C384GB) and storage optimized Bare Metal Virtual Machines s.i2.metal (80C384GB+1862GB NVMe SSD):

*	Intel Xeon Gold 6148 (Skylake) Processor based on 2.4 GHz dominant frequency.
* 	Memory based on the latest generation 2666 DDR4.
*  Support number of network queue to be 60, which does not support modification currently.
*  Intranet bandwidth can support up to 10Gbps.

## Use Restrictions

* 	Support only the following public images provided by JD Cloud & AI on and after January 2, 2020 in cn-north-1 region: CentOS 7.2, CentOS 7.4 and CentOS 7.6, as well as private images based on Virtual Machines created by the above public images. If you need to convert an existing private image to an image that supports the creation of Bare Metal Virtual Machines, please refer to [Create Bare Metal Virtual Machines](Create-BM-Instance.md)
*  	Provided only in cn-north-1 region
*  	Only the Cloud Disk is supported to be a system disk
* 	Configuration of multiple network interfaces are not supported, and only a single network interface (primary network interface) is supported
*  	Hot-plug of Cloud Disk is not supported; shutting down is required to attach/detach Cloud Disk
*  	Attaching encrypted disk and multi-point attached disk are not supported
*	Resizing is not supported
* 	Console VNC access is not supported; it requires access via Public IP or access via the same subnet jump server

