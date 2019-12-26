## Template Variable Rule<br>
  
SMS template=fixed text+variable, or SMS template=fixed text.  
Variables refer to the variable contents of each SMS sent.  

**Variable Rule**  
Each template contains at most 20 variables and at most 2 variables are placed together. (Discontinuous variables refer to the variables with characters placed between them)  
The system supports the following four variable formats. Please fill in the format according to requirements and select appropriate variable format and length.  
    
<table>
     <tr align="center">
        <th width="150">Variable Format</th>
        <th width="150">Type</th>
        <th width="150">Completion Example</th>
        <th width="400">Description</th>
     </tr>
      <tr>
         <td>${TXT_number}</td>
         <td>Character, i.e., text</td>
         <td>${TXT_20}</td>
         <td>"Number" refers to the maximum length, within value range: 1~20 and the unit: character number.<br>
1 Chinese character, Chinese punctuation or other non-English character, or 1 English letter, number, English punctuation shall be deemed as 1 character.<br>  
Please take the value according to real business and do not take too large value.<br>
Note: The variable value cannot contain the character "{"and"}", i.e., the brace. Otherwise, template variable resolution exception may be caused.</td>
      </tr>
      <tr>
         <td>${NUM_number}</td>
         <td>Number</td>
         <td>${NUM_8}</td>
         <td>"Number" refers to the maximum length, within value range: 1~20 and the unit: character number. 1 number is deemed as 1 character.<br> 
When an SMS is sent, only numbers from 0 to 9 can be filled in, without any other characters such as "-".<br> 
Please take the value according to real business and do not take too large value.</td>
      </tr>
      <tr>
         <td>${DATE}</td>
         <td>Date</td>
         <td>${DATE}</td>
         <td>SMS to be sent shall be in the format of "YYYY/MM/DD", such as 2017/07/16, 2017/7/16 and 2017/7/1.</td
      </tr>
      <tr>
         <td>${TIME}</td>
         <td>Time</td>
         <td>${TIME}</td>
         <td>SMS to be sent can be in two formats.<br> 
•	HH: MM, Hour : Minute, e.g., 14:30.<br> 
•	HH:MM:SS, Hour : Minute : Second, e.g., 14:30:30.  </td>
      </tr>      
</table>  

Special Specification of Template Type  

In addition to public specification, the following special specifications are made to each template type of SMS:  

<table>
     <tr align="center">
        <th width="150">Category</th>
        <th width="300">Variable Specification</th>
        <th width="400">Content Specification</th>
     </tr>
      <tr>
         <td>Verification Code SMS</td>
         <td>One variable is supported and is used for filling in the digital verification code.<br> 
         The "maximum length" of the verification code variable can only contain 8 or less bits.</td>
         <td>A domestic SMS must contain one of the 4 words, including verification code, registration codes, check code and dynamic code.</td>
      </tr>
      <tr>
         <td>Notification SMS</td>
         <td>The link cannot be sent via a variable. Please fill in the link in the fixed text of template.</td>
         <td>Contents with marketing promotion are not supported.</td>
      </tr>
      <tr>
         <td>Promotion SMS</td>
         <td>Variables are not supported and templates shall be the pure fixed texts.</td>
         <td>In addition to public specifications, the promotion SMS containing information below mustn’t be sent: training, investment attraction, franchisee, group buying meeting, decoration (including building material and furniture), cigarette, wine, tea, donation, blood donation, superstition, manual or software click farm, task, virtual currency, RMB collection, buying and sales of currency and coin, sofa refurbishment, industry and commerce commission, invoice issuance, buying and sales of illegal vehicle, illegal entrapment, exhibition, website, coupon promotion, card, insurance, tax, APP promotion, certificate handling, recycle, health care, related affairs of POS machine, credit card, dating, head hunting, live broadcasting and other contents violating laws and regulations.<br>
         SMS can only be sent to the member user who subscribes the product and the template must show that the SMS is sent to the member.<br>
         The service of sending to international/Hong Kong, Macao and Taiwan region is not supported. </td
      </tr> 
</table>  

Note:  
Template specification may be adjusted with change of operator rule in real time and is subject to final template audit result.  