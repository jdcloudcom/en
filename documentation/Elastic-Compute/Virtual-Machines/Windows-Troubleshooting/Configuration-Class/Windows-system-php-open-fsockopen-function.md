# Open fsockopen Function for php in Windows System
To install the Discuz and phpwind programs, you need to enable the fsockopen function. The method is as follows:

After the php environment is configured, there will be a php.ini file, which is the php configuration file. Take the Windows 2008 one-click installation environment as an example.

1. The php.ini file is located in the directory C:websoftphp-5.5.7 of the server. The php environment installed by other methods can be searched in the disk.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9Fphp%E5%BC%80%E5%90%AFfsockopen%E5%87%BD%E6%95%B001.png)

2. Find the php.ini file, open it with Notepad, look for allow_url_fopen = and check if it is followed by off or On. Change it to On if it is off.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9Fphp%E5%BC%80%E5%90%AFfsockopen%E5%87%BD%E6%95%B002.png)

3. Continue to find extension=php_openssl.dll in the php.ini file, delete ";" if there is a ";" in front of extension=php_openssl.dll and then save it.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9Fphp%E5%BC%80%E5%90%AFfsockopen%E5%87%BD%E6%95%B003.png)

4. Finally restart IIS, open the IIS Information Service Manager, select "Restart" on the right, and the fsockopen function will be normally started after the restart.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9Fphp%E5%BC%80%E5%90%AFfsockopen%E5%87%BD%E6%95%B004.png)

If your problem still can not solved, please submit open ticket to us.
