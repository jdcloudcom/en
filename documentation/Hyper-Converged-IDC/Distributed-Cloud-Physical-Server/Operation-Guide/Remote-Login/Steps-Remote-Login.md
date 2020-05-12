## Remote Login

You may use remote connection software to implement the remote management and control of Distributed Cloud Physical Server.

### Operation Steps

**1. Obtain login passwords**

When you view that the status of the purchased server on Distributed Cloud Physical Server Console is [running], it means that the operating system has been installed and delivered to you. The login password is the password you set when creating Distributed Cloud Physical Server, and you may also change it by logging into the operating system after the creation.

**2. Obtain Internet IP**

Please find the server just purchased on the Console and find the Internet IP address.

**3. Remotely log in**

Download the remote link software Putty, the download link for reference is: https://www.chiark.greenend.org.uk/~sgtatham/putty/latest.html.
Open Putty client, and enter the following contents in the PuTTY Configuration window:
- Host Name: The Internet IP address of the server
-	Port: Server port, must enter 22.
-	Connect type: Select **SSH**.
-	Click **Open** after entering all the contents and create a new dialog.

![PuTTY窗口](https://github.com/jdcloudcom/cn/blob/cn-distributed-cloud-physical-service/documentation/Hyper-Converged-IDC/Distributed-Cloud-Physical-Server/Image/DCPS-013.png)

Enter the administrator account in the Putty dialog window, and press enter key.
```
Administrator account:
CentOS：root
Ubuntu：ubuntu
```
Enter the initial password again, and press enter key to finish the login process.

![PuTTY窗口](https://github.com/jdcloudcom/cn/blob/cn-distributed-cloud-physical-service/documentation/Hyper-Converged-IDC/Distributed-Cloud-Physical-Server/Image/DCPS-014.png)

Login to Linux cloud server from local Linux or Mac OS, use SSH command directly to conduct connection; for example: ssh root@Linux cloud server EIP, then enter the initial password of root user; then login is finished.

