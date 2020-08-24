# Local Verification

After a website is added to Web Application Firewall and before DNS resolution of protection domain is not modified (resolving the website domain to Web Application Firewall), you are suggested to ensure that every configuration is normal via local configuration. Local verification refers to verify if the domain access setting of Web Application Firewall on the local computer is correct and effective or not by virtual of DNS resolution of a local computer. The document specifies the operation steps of local verification with the example of Windows Operating System.

## Prerequisites

A domain has been added to the Web Application Firewall and protocol, address and port configuration of origin server are ensured to be correct. Please refer to [Add a Website](Step-1.md) for more details.

## Background Information

By modifying the hosts file on the local computer, domain address mapping of the local computer can be set, i.e., DNS resolution record effective only for local computer. For local verification, you need to direct the website domain resolution of the local computer to the IP address of Web Application Firewall. In this way, you can access the domain under protection via the local computer, verify if the domain access setting added in the Web Application Firewall is correct and valid and avoid website access exception due to abnormal domain access configuration. 

## Operation Steps

The operations below are conducted based on the Windows Operating System used by the local computer.

1. Obtain CNAME value. Enter the **Website Configuration** page, position the domain added by you, move the icon to the top of CNAME and then you can view the CNAME value. Click ![image](../../../../image/WAF/join-in-WAF/Local Verification/Checking-Click-Cname.png) and obtain and copy CNAME. ![image](../../../../image/WAF/join-in-WAF/Local Verification/Checking-Get-Cname.png)

2. Obtain a WAF IP address. Turn on the cmd command line tool in Windows and run the `ping  CNAME` command. Then, you can obtain the WAF IP address corresponding to CNAME.

Taking the domain `demo.jd.com` for example, the domain has been added to the WAF website configuration and the following CNAME value has been assigned for WAF: demo.jd.com-891519e3530e.jdcloudwaf.com.

Run the ping  demo.jd.com-891519e3530e.jdcloudwaf.com command in the cmd command line tool. Then, you can obtain WAF IP corresponding to CNAME.

![image](../../../../image/WAF/join-in-WAF/本地验证/Checking-Get-WAF_IP.png)

Record the WAF IP address corresponding to the domain in the results returned by the ping command. For example, the WAP IP of the example is 101.124.17.209.

3. Modify the local hosts file, add the record below at the last line of the hosts file: `WAF IP Address    Protected Domain`. Details of modification methods are as follows:

i. Turn on the File Explorer on the local computer.

ii. Generally, the hosts file is located under the path C:\Windows\System32\drivers\etc\ and please open the hosts file with the notepad or the text editor.

iii. Add the record below at the last line of the hosts file: `WAF IP Address Protected Domain`

![image](../../../../image/WAF/join-in-WAF/本地验证/Checking-Add-Hosts.png)

4. Modify hosts and save the same, run the command `ping  <Protected Domain>` in the cmd command line tool to verify the modification of hosts has taken effect.

![image](../../../../image/WAF/join-in-WAF/本地验证/Checking-Hosts-Modify.png) 

The WAF IP address is resolved via `ping` as expected (as shown in the figure above). If the origin server IP address is resolved, please refresh the local DNS cache (please execute the commands `ipconfig` and `flushdns` in cmd of Windows) and re-execute the ping command, until the hosts modification has taken effect upon verification.

5. Enter the protection domain in a local browser and verify if WAF forwarding is correct or not. Clear the browser cache, enter the protection domain in the browser and test if the website domain is available for normal access. If the hosts association has taken effect and WAF configuration is correct, the website can be normally opened by accessing the domain as expected.

6. Local simulation of simple web attack command is **optional** for view of protection effect of the Web Application Firewall.

  i.  Set the **Web Application Attack Protection** mode as **Interception Mode**. For details of the setting method, please refer to the setting of **Web Application Protection Engine**. 

  ii. For example, you can enter `<Domain under Protection>/?id=1%20or%201<>2` (this is a stimulated SQL injection attach request. Please enter http://demo.jd.com/?id=1%20or%201<>2 in the instance) in the browser address field and view protection effect against Web application attack by WAF.

As expected, the Web Application Firewall will return the following interception page.

![image](../../../../image/WAF/join-in-WAF/本地验证/Checking-WAF-Attack.png)

iii. Log in the **Web Application Firewall Console**, click **Analysis Statement** > **Full Log** on the left side, screen instance domains and view testing data of protection domain. as shown in the figure below.

![image](../../../../image/WAF/join-in-WAF/本地验证/Checking-Attack-Record.png)