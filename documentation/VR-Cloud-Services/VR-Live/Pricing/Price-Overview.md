# Price Overview

## Bandwidth
<table>
<tr>
    <td>Billing model<br/>
    <td>Billing Tier</td>
    <td>Unit Price (RMB/Mbps/day)</td>
</tr>
<tr>
    <td rowspan="3"> Bandwidth peak<br/>
    <td>0-512Mbps (inclusive)</td>
    <td>1</td>
</tr>
<tr>
    <td>512Mbps-5Gbps (inclusive)</td>
    <td>0.9</td>
</tr>
  <tr>
    <td>>5Gbps</td>
    <td>0.75</td>
</tr>
</table>
The peak bandwidth consumed is billed per day. A bandwidth is counted per 5 minutes and 288 points are counted per day in total. For each billing, the maximum bandwidth (peak bandwidth) of the user in this billing period is billed as per the daily tier. If additional storage and calculation cost is produced by using transcode, snapshot and record functions, charges will be collected as per corresponding product price. 

### Billing Instance
For example, if you used VR Live Streaming service on June 18 and the bandwidth peak value consumed by VR Live Streaming was 10Gbps, then the cost you needed to pay for VR Live Streaming bandwidth on June 19 is shown as below:
Bandwidth peak value (10 * 1024) Mbps * tiered unit price of corresponding bandwidth (0.75) = RMB 7,680.

## Traffic  
<table>
<tr>
    <td>Billing model<br/>
    <td>Unit Price (RMB/GB/Day)</td>
</tr>
<tr>
    <td> Cost of VR Video Play Acceleration<br/>
    <td>0.15</td>
</tr>
</table>
The traffic of VR Live Streaming will be deducted as per actual traffic consumed per day. For the cost of VR video play acceleration, customers can select to pay as per bandwidth or traffic.  

### Billing Instance
For example, if you used VR Live Streaming service on June 18 and the live streaming traffic used was 100GB, then the cost you needed to pay for VR Live Streaming traffic on June 19 is shown as below:  
Live streaming traffic (100GB) x tiered unit price of daily traffic (RMB 0.15/GB) = RMB 15.

## VR Live Streaming Transcode 
<table>
<tr>
    <td>Coding Mode<br/>
    <td>Resolution</td>
    <td>Price (RMB/Minute)<br><= 30fps output</td>
</tr>
<tr>
    <td rowspan="5">H.264<br/>
    <td>360P (640 x 360) (inclusive) and less </td>
    <td>0.01 </td>
</tr>
<tr>
    <td>360P (640 x 360) -720P (1280 x 720) (inclusive) </td>
    <td>0.03 </td>
</tr>
<tr>
    <td>720P(1280 x 720）-1080P (1920 x 1080) (inclusive) </td>
    <td>0.05 </td>
</tr>
<tr>
    <td>1080P(1920 x 1080) -2k(2560×1440) (inclusive) </td>
    <td>0.10 </td>
</tr>
<tr>
    <td>2k(2560×1440)-4k(3840×2160) (inclusive) </td>
    <td>0.20 </td>
</tr>        
<tr>
    <td rowspan="5">H.265<br/>
    <td>360P (640 x 360) (inclusive) and less </td>
    <td>0.10 </td>
</tr>
<tr>
    <td>360P (640 x 360) -720P (1280 x 720) (inclusive) </td>
    <td>0.15</td>
</tr>
<tr>
    <td>720P(1280 x 720）-1080P (1920 x 1080) (inclusive) </td>
    <td>0.30</td>
</tr> 
<tr>
    <td>1080P(1920 x 1080) -2k(2560×1440) (inclusive) </td>
    <td>0.60 </td>
</tr>
<tr>
    <td>2k(2560×1440)-4k(3840×2160) (inclusive) </td>
    <td>1.20 </td>
</tr>     
<tr>
    <td>Encapsulation Conversion</td>
    <td>Rtmp, Hls and flv provide error detection </td>
    <td>FREE </td>
</tr>    
<tr>
    <td>Covert to audios</td>
    <td>AAC/MP3 Volume Optimization </td>
    <td>FREE </td>
</tr>      
</table>  
Billing is based on encoding method, resolution of transcode request and duration of transcode output file, taking every day as billing period.  

### Billing Instance
For example, if you used VR Live Streaming transcode service on June 18 to transcode a video of 3840×2160 of resolution and 100 minutes of duration by coding method of H.265, then the cost you needed to pay for transcoding on June 19 is shown as below:  
Output file duration by transcoding (100 minutes) x transcoding unit price of different coding methods/resolutions for videos (RMB 1.2/minute) = RMB 120.

## Live Snapshot
<table>
<tr>
    <td>Billing Type<br/>
    <td>Unit Price (RMB/1,000 Pieces)</td>
</tr>
<tr>
    <td>Key Frame Snapshot<br/>
    <td>0.1</td>
</tr>
</table>  
Charges will be collected as per snapshot number actually produced by the customer with the snapshot function and will be settled by days.   

### Billing Instance
For example, if you used VR Live Streaming snapshot service on June 18 and the snapshot count was 100,000, then the cost you needed to pay for live streaming snapshot on June 19 is shown as below:  
Snapshot images (100000/1000) unit price of snapshot (RMB 0.1/1,000 pieces) = RMB 10.
