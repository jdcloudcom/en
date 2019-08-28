# Core Concepts  
**Site Monitoring**  
Site monitoring is a monitoring product that performs detection in respect with the status of the Internet network. User can use the product to set the site address that is required to be detected, select the detection nodes of different operators’ network of JD Cloud which are distributed in different regions across the country, send to the site address a request similar to a real user accesses to, so as to get the availability and response time of the site address.  

**Availability Monitoring**  
Availability monitoring is to use one or more servers under the user name as the detection source, to conduct detection on the path or port specified by the user, and determine whether the path or port is normal and the availability of the port according to the response time and the returned status code. The users can set alarm rules according to their needs. When the alarm rules are triggered, the users can be notified by SMS and email, so that they can find problems quickly.  

**Availability Rate**  
Refer to the count of detection results with less than 400 status codes of the detection points during the detection period / the total count of the detection results * 100.  

**Response Time**  
Refer to the time from initiating detection to the reception of all request results. If there is a redirection in the process of the detection, the value shall contain the redirected time.  

**Statistical Period of Alarm**   
It is called as the alarm statistical period, used for counting time period of data. Generally, all data in this period will be calculated as per specific statistical method (Statistics).  

**Statistical Method**  
Refer to aggregation of monitoring item data during a specific period. Now, the statistical method provides the average value.  

**Duration**  
Alarm after the threshold has been exceeded for several times consecutively: It means that the alarm is triggered after the monitoring item values of a few statistical periods consecutively exceed the threshold.  

**Notification Period**  
It means when the alarm notification will be sent again if it does not resume normally after alarm.





