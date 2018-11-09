# Specifications

The cloud physical server provides the following instance types: Standard Computing Type, Computing Performance Type Ⅰ, Computing Performance Type Ⅱ, and Standard Storage Type. Now, the GPU Cloud Physical Server comprises GPUⅠ and GPUⅡ. More models are coming.

<table align="center" >
<table>
    <tr>
        <td align="center"><B>Instance Type</B></td> 
        <td align="center"><B>CPU</B></td> 
		    <td align="center"><B>Memory</B></td>
		    <td align="center"><B>Hard Disk</B></td>
		    <td align="center"><B>Network Interface</B></td>
	    <td align="center"><B>Support RAID Mode</B></td>
    </tr>
    <tr>   
        <td align="center"><B>Standard Calculation Type <br/> (cps.c.normal)<B></td>
		    <td align="center">2*2683V4<br/> (16-core 2.1G)</td>
		    <td align="center">256G（8*32G）DDR4</td>
		    <td >2*300GB（SAS）+<br/>2*800GB（SSD）</td>
		    <td align="center">1 independent management port +<br/>2*10GE network interface</td>
		<td align="center">NO RAID/RAID0/RAID1</td>
    </tr>
	  <tr>   
        <td align="center"><B>Computing Performance Type Ⅱ <br/> (cps.c.perf1)<B></td>
		    <td align="center">2*2683V4<br/> (16-core 2.1G)</td>
		    <td align="center">256G（8*32G）DDR4</td>
		    <td >2*300GB（SAS）+<br/>1*4000GB（NVME）</td>
		    <td align="center">1 independent management port +<br/>2*10GE network interface</td>
		<td align="center">NO RAID</td>
    </tr>
    <tr>   
        <td align="center"><B>Computing Performance Type Ⅱ <br/> (cps.c.perf2)<B></td>
		    <td align="center">2*2683V4<br/> (16-core 2.1G)</td>
		    <td align="center">256G（8*32G）DDR4</td>
		    <td >1*240GB（SSD）+<br/>16*960GB（SSD）</td>
		    <td align="center">1 independent management port +<br/>2*10GE network interface</td>
		<td align="center">NO RAID/RAID0/RAID1/RAID10</td>
    </tr>
    <tr>   
        <td align="center"><B>Standard Storage Type <br/> (cps.s.normal)<B></td>
		    <td align="center">2*2650V4<br/> (12-core 2.2G)</td>
		    <td align="center">256G（8*32G）DDR4</td>
		    <td >1*240GB（SSD）+<br/>12*6TB（SATA）</td>
		    <td align="center">1 independent management port +<br/>2*10GE network interface</td>
		<td align="center">NO RAID</td>
    </tr>
</table>

The instance type of GPU Cloud Physical Server is as follows:

<table>
    <tr>
        <td align="center"><B>Instance Type</B></td> 
        <td align="center"><B>CPU</B></td> 
		    <td align="center"><B>Memory</B></td>
		    <td align="center"><B>Hard Disk</B></td>
		    <td align="center"><B>Network Interface</B></td>
	    	<td align="center"><B>GPU</B></td>
	    <td align="center">Support RAID Mode</td>
    </tr>
    <tr>   
        <td align="center"><B>GPUⅠ<br/>（cps.gpu.1）<B></td>
		    <td align="center">2*2683V4<br/> (16-core 2.1G)</td>
		    <td align="center">256G（8*32G）DDR4</td>
		    <td >2*300GB（SAS）+<br/>6*960GB（SSD）</td>
		    <td align="center">1 independent management port +<br/>2*10GE network interface</td>
		<td align="center">NVIDIA P40*4</td>
		<td align="center">NO RAID/RAID0/RAID10</td>
    </tr>
    <tr>   
        <td align="center"><B>GPUⅡ<br/>（cps.gpu.2）<B></td>
		    <td align="center">2*2650V4<br/> (12-core 2.2G)</td>
		    <td align="center">256G（8*32G）DDR4</td>
		    <td >2*300GB（SAS）+<br/>4*4000GB（SATA）</td>
		    <td align="center">1 independent management port +<br/>2*10GE network interface</td>
		<td align="center">NVIDIA P40*4</td>
		<td align="center">NO RAID/RAID0/RAID10</td>
    </tr>
</table>
