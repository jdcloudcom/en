# Price Overview

The billing cycle of Object Storage Service is based on day, which settles the bills of the previous day in a fixed time every day and the relevant charge standard within a billing cycle is shown as below:

## Price Overview of Object Storage Service

<table>
 <tr>
  <td colspan="2">Charging Items</td>
  <td>Unit Price of Standard Storage</td>
  <td>Unit Price of Infrequent Access Storage</td>
  <td>Archival Storage Unit Price</td>
  <td>Unit Price of Reduced Redundancy Storage</td>
 </tr>
 <tr>
  <td>Storage Capacity</td>
  <td>Actual Bucket Usage</td>
  <td>RMB 0.00427/GB/Day</td>
  <td>RMB 0.00267/GB/Day</td>
  <td>RMB 0.001/GB/Day</td>
  <td>RMB 0.00233/GB/Day</td>
 </tr>
 <tr>
  <td rowspan="6">Access Traffic</td>
  <td>Uplink Traffic of Intranet</td>
  <td>Free</td>
  <td>Free</td>
  <td>Free</td>
  <td>Free</td>
 </tr>
 <tr>
  <td>Downlink Traffic of Intranet</td>
  <td>Free</td>
  <td>Free</td>
  <td>Free</td>
  <td>Free</td>
 </tr>
 <tr>
  <td>Uplink Traffic of Internet</td>
  <td>Free</td>
  <td>Free</td>
  <td>Free</td>
  <td>Free</td>
 </tr>
 <tr>
  <td>Downlink Traffic of Internet</td>
  <td>RMB 0.50/GB</td>
  <td>RMB 0.50/GB</td>
  <td>RMB 0.50/GB</td>
  <td>RMB 0.50/GB</td>
 </tr>
 <tr>
  <td>CDN Back-to-origin Downlink Traffic</td>
  <td>RMB 0.14/GB</td>
  <td>RMB 0.14/GB</td>
  <td>RMB 0.14/GB</td>
  <td>RMB 0.14/GB</td>
 </tr>
 <tr>
  <td>Data Synchronization Traffic</td>
  <td>Temporarily Free</td>
  <td>Temporarily Free</td>
  <td>Temporarily Free</td>
  <td>Temporarily Free</td>
 </tr>
 <tr>
  <td>Number of Requests</td>
  <td>All Request Types</td>
  <td>RMB 0.01/10,000 times</td>
  <td>RMB 0.1/10,000 times</td>
  <td>RMB 0.1/10,000 times</td>
  <td>RMB 0.1/10,000 times</td>
 </tr>
 <tr>
  <td>Data Retrieval Cost</td>
  <td>Data Getting Back</td>
  <td>-</td>
  <td>RMB 0.03/GB</td>
  <td>Fast Mode: RMB 0.2/GB<br>Standard mode: RMB 0.06/GB<br> Batch mode: RMB 0.016/GB</td>
  <td>-</td>
 </tr>
</table>

**Description:**

- Archival type storage, the minimum storage period of Object is 60 days. If Object is deleted, modified or overwritten earlier than 60 days, the storage cost of the remaining days of less than 60 days shall be made up, no need to make up after 60 days.
- For archival storage, the storage space is calculated according to the file size of 48KB if Object is the file less than 48KB, and the bucket is calculated according to the actual size if Object is the file larger than 48KB.
- For infrequent access type storage, the minimum storage period of Object is 30 days. If Object is deleted, modified or replaced earlier than 30 days, the storage cost of the remaining days of less than 30 days shall be made up, no need to make up after 30 days.
- For infrequent access type storage, the bucket is calculated according to the file size of 64KB if Object is the file less than 64KB, and the bucket is calculated according to the actual size if Object is the file larger than 64KB.
- Data Retrieval Cost: Restore operations are performed for archival storage types. After completion of retrieval, the data retrieval cost is billed according to the amount of data actually restored. After the restore is completed and the restored replica is within the valid period, the Object is restored again, and no data retrieval cost will be billed. If an infrequent access storage file is retrieved, it is calculated according to the actual read file size.

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
  <td rowspan="5">Video H.265</td>
  <td>4K (3840×2160) and below</td>
  <td>RMB 1.20/minute</td>
 </tr>
 <tr>
  <td>2K (2560×1440) and below</td>
  <td>RMB 0.60/minute</td>
 </tr>
 <tr>
  <td>FHD (1920×1080) and below</td>
  <td>RMB 0.30/minute</td>
 </tr>
 <tr>
  <td>HD (1280×720) and below</td>
  <td>RMB 0.15/minute</td>
 <tr>
  <td>SD (640×480) and below</td>
  <td>RMB 0.10/minute</td>
 </tr>
 <tr>
  <td colspan="3">Video Snapshot</td>
  <td>RMB 0.1/1,000 PCS</td>
 </tr>
<table>

**Note:**

- Transcoding cost = Output file duration x transcoding unit price
- Output specification determination: Determined based on the range fall with which the long and short sides of the output video resolution, with the methods below: Taking the output of specifications of HD (1280 x 720) and below as an example, if the long side of the output video resolution is not greater than 1280 and the short side is not more than 720, it belongs to this output specification. If the long side of the output video is greater than 1280 or the short side of the output video is greater than 720, the output video belongs to a higher output specification.
- If the transcoding fails, the duration of the failure will not be included in the billing.
