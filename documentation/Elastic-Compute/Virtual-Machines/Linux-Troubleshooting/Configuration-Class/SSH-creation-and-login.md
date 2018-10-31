# SSH Creation and Login
For Linux host, the SSH service encrypts all transmitted data, providing greater security than traditional telnet services. The SSH automatic login based on key pair authentication can simplify the login process and reduce the operation and maintenance cost while guaranteeing security. This article mainly explains the user's own configuration method. JD Cloud also provides the key pair injection port in the console. Please refer to the key pair.

Key Pair Configuration for Linux System Virtual Machines
During the preparation phase, the user needs to log in to the Virtual Machines to edit the configuration file of the Virtual Machines. The process is "create a key pair" - "send the public key into the authentication file" - "configure the key pair login file" - "restart key pair service". The commands are as follows:

***yum install lrzsz/*** Install upload and download tool

***ssh-keygen -t dsa -f ~/.ssh/JD/*** JD is key pair name that is customizable

***Enter passphrase (empty for no passphrase):/*** Enter the password, or directly press Enter without setting the password.

***Enter same passphrase again:***

***cd ~/.ssh***

***ls –l***

***cat JD.pub [1jeemaa1][1jeemaa1]authorized_keys/*** Output the contents of the public key to the corresponding file

***chmod 400 authorized_keys/*** Set file attribute into read-only

***sz JD/*** Download the private key to the default download directory

***sz JD.pub/*** Download the public key to the default download directory

***rm –f ~/.ssh/JD.pub/*** Delete the original public key file

***rm –f ~/.ssh/JD/*** Delete the original private key file

***cd /etc/ssh***

***cp sshd_config sshd_configback/*** Back up the ssh configuration file

***vi sshd_config/*** Edit ssh configuration file

***PubkeyAuthentication yes/*** Open key pair authentication

***AuthorizedKeysfile .ssh/authorized_keys/*** PublicKey file path

***PasswordAuthentication no/*** Turn off password authentication (optional)

***#service sshd restart/*** Restart sshd service

**User Login**

1. SecureCRT login as an example for Windows users. The operation is as follows:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/SSH%E5%88%9B%E5%BB%BA%E5%92%8C%E7%99%BB%E5%BD%9501.png)

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/SSH%E5%88%9B%E5%BB%BA%E5%92%8C%E7%99%BB%E5%BD%9502.png)

2. Linux users can log in directly through the command. The operation is as follows:

***ssh [–i path][-p port][user@hostname]***

For example:

***ssh -i /path/to/JD –p 22 root@192.168.0.1***

More information
Secure Shell: Introduction and discussion on SSH on Wikipedia.

https://en.wikipedia.org/wiki/Secure_Shell?spm=5176.7741493.0.0.dYU3RS

OpenSSH Manual Pages: OpenSSH official manual.

www.openssh.com/manual.html?spm=5176.7741493.0.0.dYU3RS

RSA: Introduction to the RSA algorithm on Wikipedia. 

https://en.wikipedia.org/wiki/RSA_(cryptosystem)?spm=5176.7741492.0.0.K5YDOk

DSA: Introduction to the DSA algorithm on Wikipedia.

https://en.wikipedia.org/wiki/Digital_Signature_Algorithm?spm=5176.7741492.0.0.K5YDOk
