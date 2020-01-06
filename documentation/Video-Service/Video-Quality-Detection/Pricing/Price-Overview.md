# Price Overview

## Charging Items

Video Quality Detection Period

## Billing Prices
<table>
<tr>
    <td>Coding Mode<br/>
    <td>Resolution</td>
    <td>Unit Price (RMB/minute)</td>	
</tr>
<tr>
    <td> H.264<br/>
    <td>4K (3840 x 2160) or below</td>
    <td>0.0028</td>	
</tr>
<tr>
    <td> H.264<br/>
    <td>2K (2560 x 1440) or below</td>
    <td>0.0014</td>
</tr>
<tr>
    <td> H.264<br/>
    <td>Super Definition FHD (1920x1080) and below</td>
    <td>0.0007</td>	
</tr>
<tr>
    <td> H.264<br/>
    <td>HD (1280 x 720) or below</td>
    <td>0.0005</td>	
</tr>
<tr>
    <td> H.264<br/>
    <td>SD (640 x 360) or below</td>
    <td>0.0003</td>	
</tr>
<tr>
    <td> H.265<br/>
    <td>4K (3840 x 2160) or below</td>
    <td>0.006</td>	
</tr>
<tr>
    <td> H.265<br/>
    <td>2K (2560 x 1440) or below</td>
    <td>0.004</td>	
</tr>
<tr>
    <td> H.265<br/>
    <td>Super Definition FHD (1920x1080) and below</td>
    <td>0.002</td>	
</tr>
<tr>
    <td> H.265<br/>
    <td>HD (1280 x 720) or below</td>
    <td>0.0015</td>
</tr>
<tr>	
    <td> H.265<br/>
    <td>SD (640 x 360) or below</td>
    <td>0.001</td>
</tr>
</table>

## Billing Instructions
•	Payment Method: Pay-As-You-Go  
•	Billing rule: Billing is made according to coding mode, resolution and detection period requested by Video Quality Detection, with the billing period of day.  
•	Billing period: Billing is based by day. The billing period is from 0:00 to 24:00. The effective billing time stamp is the completion time of detection task, e.g., if detection task is submitted at 23:00 on the day and completed at 0:05 on the next day, then it will be included in the billing period of next day. Settlement, bill output and deduction for cost generated on previous day will be conducted at 12:00 a.m. to 18:00 p.m. every day.  
•	Detection duration: Billing of each detected video file is based on minute. The file duration is accurate to two decimal places, wherein the second digit is rounded off according to the third digit, and the duration less than 1 second is calculated as 0.02 minutes.  
•	Output specification determination: JD Cloud can make resolution according to addressable URL provided by customers. The resolved length and width of video resolution are determined according to video specification range according to the formula below:  
Taking an example of specification of HD (1,280 x 720) or below, the video file with resolution of length not greater than 1,280 and width not greater than 720 falls in the specification range.
If the video file length is greater than 1,280 or its width is greater than 720, this video file is the one of higher specification.  
•	Billing Formula:
Video file detection duration (minute) x detection unit of different coding methods/resolution videos (RMB/minute)
## Billing Instance
If you have used Video Quality Detection Service on June 18 with the H.265 coding method, resolution of 3,840 x 2,160 and video duration of 1,000 minutes, you need to pay the following detection cost on June 19:  
Video file detection duration (1,000 minutes) x detection unit of different coding methods/resolution videos (RMB 0.006/minute) = RMB 6 

