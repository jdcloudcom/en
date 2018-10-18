# Image Use Instructions

## Function Description

Image is the format of Cloud Physical Server running environment, including two modes, i.e. “standard image” and “standard image+application”.

### Standard Image
Currently the standard image of Cloud Physical Server supports:

|Operating System|Kernel Version|
|:--:|:--|
|CentOS-6.6 64 bits|2.6.32-504|
|CentOS-7.1 64 bits|3.10.0-229|
|CentOS-7.2 64 bits|3.10.0-327|
|CentOS-7.5 64 bits|3.10.0-862|
|Ubuntu-14.04 64 bits|4.2.0-27|
|Ubuntu-16.04 64 bits|4.4.0-62|


### Standard Image+Application
Currently the "standard image+application" of Cloud Physical Server supports:

|Operating System|Kernel Version|Application Version|
|:--:|:--|:--|
|CentOS-6.6 64 bits|2.6.32-504|Nginx, MySQL, RabbitMQ|
|CentOS-7.2  64 bits|3.10.0-327|Nginx, MySQL, RabbitMQ|
|CentOS-7.1  64 bits|3.10.0-229|N/A|
|CentOS-7.5  64 bits|3.10.0-862|N/A|
|Ubuntu-14.04 64 bits|4.2.0-27|N/A|
|Ubuntu-16.04 64 bits|4.4.0-62|N/A|

[Instructions] The cloud physical server only provides official standard image and does not support kernel version upgrade. If the user upgrades the kernel version on its own, unavailability to log in to the system or data loss may be caused. The user shall assess the risks on his/her own and be cautious to operate.
