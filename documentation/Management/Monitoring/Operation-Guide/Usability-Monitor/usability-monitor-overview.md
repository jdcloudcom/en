## Overview of Availability Monitoring
Availability monitoring is to use one or more servers under the user name as the detection source, to conduct detection on the path or port specified by the user, and determine whether the path or port is normal and the availability of the port according to the response time and the returned status code. The users can set alarm rules according to their needs. When the alarm rules are triggered, the users can be notified by SMS and email, so that they can find problems quickly.

## Precautions
The implementation of availability monitoring requires the installation of plugins on the virtual machine serving as the detection source, and currently only the virtual machine that selects the Linux system is supported as the detection source.


## Application Scenarios
- The users set up a website on JD Cloud; through availability monitoring, they use their own virtual machines to access the website, and get the usability and response time of the website. And they can set alarm rules, so that they can find problems quickly.
- The users can use their own virtual machine to access the port of RDS on which an application service depends to determine whether the port is available and whether it will affect the application service according to the availability and response time. And they can set alarm rules, so that they can find quickly when there are problems in the port of RDS.









