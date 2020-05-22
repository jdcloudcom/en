# Price Overview

## A. Video Transcoding
### Billing Item
Processing Duration of Transcoding
### Billing Price
<table>
<tr>
    <td>Coding Mode<br/>
    <td>Resolution</td>
    <td>Unit Price (RMB/minute)<= 30fps output</td>	
</tr>
<tr>
    <td> H.264<br/>
    <td>4K (3,840 x 2,160) or below</td>
    <td>0.2</td>	
</tr>
<tr>
    <td> H.264<br/>
    <td>2K (2,560 x 1,440) or below</td>
    <td>0.1</td>
</tr>
<tr>
    <td> H.264<br/>
    <td>SD FHD (1,920x1,080) and below</td>
    <td>0.05</td>	
</tr>
<tr>
    <td> H.264<br/>
    <td>HD (1,280 x 720) or below</td>
    <td>0.03</td>	
</tr>
<tr>
    <td> H.264<br/>
    <td>SD (640 x 360) or below</td>
    <td>0.01</td>	
</tr>
<tr>
    <td> H.265<br/>
    <td>4K (3,840 x 2,160) or below</td>
    <td>1.2</td>	
</tr>
<tr>
    <td> H.265<br/>
    <td>2K (2,560 x 1,440) or below</td>
    <td>0.6</td>	
</tr>
<tr>
    <td> H.265<br/>
    <td>SD FHD (1,920x1,080) and below</td>
    <td>0.3</td>	
</tr>
<tr>
    <td> H.265<br/>
    <td>HD (1,280 x 720) or below</td>
    <td>0.15</td>
</tr>
<tr>	
    <td> H.265<br/>
    <td>SD (640 x 360) or below</td>
    <td>0.1</td>
</tr>
<tr>
    <td> Encapsulation Conversion<br/>
    <td>mp4/flv/ts  Provide error detection</td>
    <td>free</td>
</tr>
</table>

### Billing Instructions
•	 Payment method: Pay-As-You-Go.  
•	 Billing rules: Billing is based on encoding method and resolution of transcode request and duration of transcoding output file, taking every day as one billing period.  
•	 Billing period: Billing is based on day. The billing period is from 0:00 to 24:00. The billing time stamp of effective time is the completion time of transcoding task. For example, transcoding is submitted at 23:00 on the day and completed at 0:05 on the next day, then it will be included in the billing period of next day. Settlement, bill output and deduction for cost generated on previous day will be conducted at 12:00 to 18:00  every day.  
•	 Output time: Billing of each transcoding output file is based on minute. The file duration is accurate to two decimal places, wherein the second digit is rounded off according to the third digit, and the duration less than 1 second is calculated as 0.02 minutes.  
•	 Output specification determination: The long side and short side of the output video resolution are determined according to the range defined by the output specification, and the formula is shown as follows:  
Taking an example of outputting specification of HD (1,280 x 720) or below, the outputting video with its long side of resolution not be greater than 1,280 and that of short side not be greater than 720 belongs to this output specification.
If the long side of the output video is greater than 1,280 or the short side of the output video is greater than 720, the output video belongs to a higher output specification.  
•	 Billing formula:
The output file duration of video transcoding (minute) x video transcoding unit price of different coding methods and resolutions (RMB/minute).
### Billing Instance
E.g., you used the transcoding service of Media Processing Service on June 18 to output the video with the resolution of 2,560 x 1,440 of and the duration of 100 minutes by encoding method of H.264, then the transcoding cost you needed to pay on June 19 is as below:  
The output file duration of video transcoding (100 minutes) x video transcoding unit price of different coding methods and resolutions (RMB 0.1/minute) = RMB 10.

## B. Video Snapshot
### Billing Item
Count of video snapshots.
### Billing Price
<table>
<tr>
    <td>Charging Item<br/>
    <td>Unit Price (RMB/1,000 Pieces)</td>
</tr>
<tr>
    <td> Video Snapshot Cost<br/>
    <td>0.1</td>
</tr>
</table>

### Billing Instructions
•	 Payment method: Pay-As-You-Go.   
•	 Billing rules: Billing is based on the actual count of snapshots taken from the view, taking every day as one billing period.  
•	 Billing period: Billing is based on day, from 0:00 to 24:00 every day. Settlement, bill output and deduction for cost generated on previous day from 12:00 to 18:00 every day.  
•	 Billing formula: Count of video snapshot (1,000 pieces) x Unit price per snapshot (RMB/1,000 pieces).     
### Billing Instance
For example, if you used video snapshot service on June 18 and 100,000 images are snapshotted, then the cost you needed to pay for the view snapshotting on June 19 is shown as below:  
Count of video snapshot (100,000 pieces) x Unit price per snapshot (RMB 0.1/1,000 pieces) = RMB 10.
