## Action Steps

**1. Obtain Login Password**

When you find that the status of the purchased server on the Cloud Physical Server console is [operating], it means that the operating system is installed and delivered to you. The login password is the password you set when creating the Cloud Physical Server, you may also change it by logging into the operating system after the creation.

**2. Obtain Extranet IP**

Please find the server just purchased on the console and find the extranet IP address.

**3. Remote Login**

Download the remote link software PuTTY, the download link for reference is: https://www.chiark.greenend.org.uk/~sgtatham/putty/latest.html.
Open Putty client, and enter the following contents in the PuTTY Configuration window:
- Host  Name：The extranet IP address of the server
-	Port：Server port, must enter 22.
-	Connect type：Select “SSH”.
-	Click “Open” after entering all the contents and create a new dialog.

![PuTTY Window](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS005.png)

Enter the administrator account in the Putty dialog window, and press enter key.
```
Administrator account:
CentOS：root
Ubuntu：ubuntu
```
Enter the initial password again, and press enter key to finish the login process.

![PuTTY Window](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS006.png)

Login to Linux cloud server from local Linux or Mac OS, use SSH command directly to conduct connection; for example: ssh root@Linux cloud server EIP, then enter the initial password of root user; then login is finished.

