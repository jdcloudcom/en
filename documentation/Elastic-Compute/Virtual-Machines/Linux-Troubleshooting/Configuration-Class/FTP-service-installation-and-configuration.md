# Installation and Configuration of FTP Service
In the process of using cloud services, we often encounter situations where we want to upload files to the host or download files to the local area. In this case, we need to use the FTP service.



FTP is the English acronym of File Transfer Protocol, and in Chinese Pinyin, it is shortened as "Wenchuanxieyi" for the bidirectional transmission of control files on the Internet. Meanwhile, it is also an Application. There are different FTP applications based on different operating systems, and all of these applications follow the same protocol to transfer files. How to deploy and use the FTP service to upload and download files in the CentOS system environment is described in detail in this text.



Vsftpd is one of the most recommendable FTP server programs among the Linux release versions. It is small and light, and is safe and easy to use. The name "vsftpd" stands for "very secure FTP daemon", and security is one of the top issues considered by its developer Chris Evans. At the very beginning of design and development of this FTP server, high security is a goal to pursue.

**I.  Preparation Before Installation**

Use the public image CentOS 7.3 64-bit to create a VM instance in JD Cloud, connect and login as root.

**II. FTP Installation**

1. Use the yum command to install vsftpd.

*yum install vsftpd*

View Related Configuration Files:

*cd /etc/vsftpd*

*ls*

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/FTP%E6%9C%8D%E5%8A%A1%E7%9A%84%E5%AE%89%E8%A3%85%E4%B8%8E%E9%85%8D%E7%BD%AE01.png)

*/etc/vsftpd/vsftpd.conf*           Main configuration files and core configuration files

*/etc/vsftpd/ftpusers*               Black list, users inside this list are not allowed to access the FTP server.

*/etc/vsftpd/user_list*              White list, a list of users allowed to access the FTP server.

2. Set the service of booting vsftpd ftp after startup.

*systemctl enable vsftpd.service*

3. Start the vsftpd service.

*systemctl start vsftpd.service*

View ftp Service Port:  
*netstat –antup | grep ftp*

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/FTP%E6%9C%8D%E5%8A%A1%E7%9A%84%E5%AE%89%E8%A3%85%E4%B8%8E%E9%85%8D%E7%BD%AE02.png)

Login the ftp server: ftp://server ip address: ftp port (if you do not specify the port, you will access port 21 by default).

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/FTP%E6%9C%8D%E5%8A%A1%E7%9A%84%E5%AE%89%E8%A3%85%E4%B8%8E%E9%85%8D%E7%BD%AE03.png)

We find that you can login the FTP server without entering a username and password. This is because the default ftp function is enabled by default after vsftpd is installed. Users can login anonymously without additional configuration. At this time, any user can login the ftp server anonymously, view and download all levels of directories and files in the main directory of the anonymous account, but cannot upload files or create directories.

The configuration of anonymous ftp is set in */etc/vsftpd/vsftpd.conf*:

*anonymous_enable=YES* is YES        default is YES.

**III. Other Settings of Anonymous ftp**

For security reasons, vsftpd does not allow users to upload files, create directories, etc. through anonymous FTP under default status, but can modify the options of the vsftpd.conf configuration file items to attach anonymous ftp more permissions.

1. Allow ftp to upload files anonymously:

Modify /etc/vsftpd/vsftpd.conf

*write_enable=YES*

*anon_upload_enable=YES*

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/FTP%E6%9C%8D%E5%8A%A1%E7%9A%84%E5%AE%89%E8%A3%85%E4%B8%8E%E9%85%8D%E7%BD%AE04.png)

2. Allow to modify ftp files anonymously.

Change the permission of the /var/ftp/pub directory, add write permission to the ftp user, and reload the configuration file

1) Change the permission of the /var/ftp/pub directory.

*chmod o+w /var/ftp/pub/*

2) Restart the ftp service

*systemctl restart vsftpd.service*

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/FTP%E6%9C%8D%E5%8A%A1%E7%9A%84%E5%AE%89%E8%A3%85%E4%B8%8E%E9%85%8D%E7%BD%AE05.png)

**IV. Configuration of Local User Login**
After installation of vsftp, only anonymous ftp login is supported by default. If the user attempts to login the server using the account in the Linux operating system, it will be rejected by vsftpd. Local user login means logging in to the ftp server using the user account and password in the Linux operating system.

1. Create a Local User:

*useradd ftptest*

*passwd ftptest*

Need to enter the password twice

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/FTP%E6%9C%8D%E5%8A%A1%E7%9A%84%E5%AE%89%E8%A3%85%E4%B8%8E%E9%85%8D%E7%BD%AE06.png)

2. Modify the vsftpd Configuration File:

Open the configuration file: *vi /etc/vsftpd/vsftpd.conf*

Modify the following codes in the configuration file:

*anonymous_enable=NO* (anonymous login not allowed)

*local_enble=yes* (Local account can login.)

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/FTP%E6%9C%8D%E5%8A%A1%E7%9A%84%E5%AE%89%E8%A3%85%E4%B8%8E%E9%85%8D%E7%BD%AE07.png)

Meanwhile, in order to ensure the accuracy of subsequent client test results, we recommend the configuration as follows:

*local_umask=022* (local file permissions on FTP, 022 by default)

*ftpd_banner=XXXXX* (welcome information)

*listen=NO* (independent VSFTPD server. I set it as NO to prevent the port from being occupied, causing vsftpd cannot be opened)

*anon_upload_enable=NO* (anonymous uploading permission not opened)

*anon_mkdir_write_enable=yes* (anonymous new folder creation permission not opened)

*write_enable=yes* ( local user write permission opened)

3. Client Testing:

Directly use the address ftp://server ip address: ftp port (if you do not specify the port, you will access port 21 by default), as shown in the figure. A pop-up dialog box for entering the user name and password indicates that the configuration is successful. After entering the username and password correctly, click **Login** to execute operations with corresponding permissions on the FTP file.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/FTP%E6%9C%8D%E5%8A%A1%E7%9A%84%E5%AE%89%E8%A3%85%E4%B8%8E%E9%85%8D%E7%BD%AE08.png)

For example, create a new folder on ftp.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/FTP%E6%9C%8D%E5%8A%A1%E7%9A%84%E5%AE%89%E8%A3%85%E4%B8%8E%E9%85%8D%E7%BD%AE09.png)
