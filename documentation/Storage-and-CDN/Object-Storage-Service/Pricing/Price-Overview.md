# Price Overview

The billing cycle of Object Storage Service is based on day, which settles the bills of the previous day in a fixed time every day and the relevant charge standard within a billing cycle is shown as below:

## Price Overview of Object Storage Service

<table>
 <tr>
  <td colspan="2">Charging Items</td>
  <td>Unit Price of Standard Storage</td>
  <td>Unit Price of Reduced Redundancy Storage</td>
 </tr>
 <tr>
  <td rowspan="2">Storage Capacity</td>
  <td>Actual Bucket Usage</td>
  <td>RMB 0.00427/GB/Day <br> (RMB 0.128/GB/Month)</td>
  <td>RMB 0.00233/GB/Day <br> (RMB 0.07/GB/Month)</td>
 </tr>
 <tr>
  <td>Quantity of Data Gotten Back</td>
  <td>-</td>
  <td>Temporarily Free</td>
 </tr>
 <tr>
  <td rowspan="6">Access Traffic</td>
  <td>Intranet Input Traffic</td>
  <td>Free</td>
  <td>Free</td>
 </tr>
 <tr>
  <td>Intranet Output Traffic</td>
  <td>Free</td>
  <td>Free</td>
 </tr>
 <tr>
  <td>Internet Input Traffic</td>
  <td>Free</td>
  <td>Free</td>
 </tr>
 <tr>
  <td>Internet Output Traffic</td>
  <td>RMB 0.50/GB</td>
  <td>RMB 0.50/GB</td>
 </tr>
 <tr>
  <td>CDN Back-to-origin Output Traffic</td>
  <td>RMB 0.14/GB</td>
  <td>RMB 0.14/GB</td>
 </tr>
 <tr>
  <td>Cross-region Replication Traffic</td>
  <td>Temporarily Free</td>
  <td>Temporarily Free</td>
 </tr>
 <tr>
  <td rowspan="2">Number of Requests</td>
  <td>GET Request</td>
  <td>Temporarily Free</td>
  <td>Temporarily Free</td>
 </tr>
 <tr>
  <td>PUT Request</td>
  <td>Temporarily Free</td>
  <td>Temporarily Free</td>
 </tr>
</table>

## Price Overview of Cloud Data Processing

<table>
 <tr>
  <td colspan="3">Charging Items</td>
  <td rowspan="2" align="center">Unit Price</td>
 </tr>
 <tr>
  <td rowspan="6">Video Transcoding</td>
  <td>Coding Mode</td>
  <td>Output Specification</td>  
 </tr>
 <tr>
  <td rowspan="5">Video H.264</td>
  <td>4K (3840×2160) and below (coming soon)</td>
  <td>RMB 0.2800/Minute</td>
 </tr>
 <tr>
  <td>2K (2560×1440) and below</td>
  <td>RMB 0.1400/Minute</td>
 </tr>
 <tr>
  <td>FHD (1920×1080) and below</td>
  <td>RMB 0.0650/Minute</td>
 </tr>
 <tr>
  <td>HD (1280×720) and below</td>
  <td>RMB 0.0330/Minute</td>
 <tr>
  <td>SD (640×480) and below</td>
  <td>RMB 0.0220/Minute</td>
 </tr>
 <tr>
  <td colspan="3">Video Snapshot</td>
  <td>RMB 0.1/1,000 PCS</td>
 </tr>
<table>

Note:

- Transcoding cost = Output file duration x transcoding unit price
- Output specification determination: Determined based on the range fall with which the long and short sides of the output video resolution, with the methods below: Taking the output of specifications of HD (1280 x 720) and below as an example, if the long side of the output video resolution is not greater than 1280 and the short side is not more than 720, it belongs to this output specification. If the long side of the output video is greater than 1280 or the short side of the output video is greater than 720, the output video belongs to a higher output specification.
- If the transcoding fails, the duration of the failure will not be included in the billing.
