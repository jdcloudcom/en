# Windows VM adjustment and activation mode is KMS

From June 2018, JD Cloud Virtual Machines has successively completed the adjustment of the Microsoft Genuine activation mode for the official Windows Server image in all regions. The original MAK activation is changed to KMS activation, which is an intranet activation where Virtual Machines's connection to the public network or manual phone activation is not required, convenient for initial activation of the intranet server.

1. Log in to the Virtual Machines **Start －> Run－> Type cmd** to enter the MS-DOS command mode

2. Check the current activation mode

***slmgr /dlv

3. If you choose MAK activation, please uninstall the MAK product key pair first.

***slmgr /upk

4. Clear the registry information

***slmgr /cpky

5. Install KMS activation product key pair

***slmgr /ipk "KMS-Client-Setup-Key

"KMS-Client-Setup-Key" is the unified KMS activation key pair for each operating system version as shown below:

Operating System and Version KMS Client Activation Key Pair

Windows Server 2016 Data Center Edition 64-bit Chinese Version	
CB7KF-BWN84-R7R2Y-793K2-8XDDG
Windows Server 2012 R2 Standard Edition 64-bit Chinese Version	
D2N9P-3P6X9-2R39C-7RTCD-MDVJX
Windows Server 2008 R2 Data Center Edition 64-bit Chinese Version	
74YFP-3QFB3-KQT8W-PMXWJ-7M648

(If the Windows Server image you are using is an older image that has been offline, you can go to the Microsoft official website to find the corresponding activation key pair: https://docs.microsoft.com/en-us/previous-versions/windows/it-pro/windows-server-2012-R2-and-2012/jj612867(v%3dws.11))

6. Set the activation server address

*slmgr /skms 169.254.169.250:1688*

7. Reset authorization state

*Slmgr /rearm*

8. Restart VM

9. Activate VM

*slmgr /ato*

10. Check again to see if the adjustment was successful for KMS activation

*slmgr /dlv*

For MAK and KMS activation information, please refer to:

(Introduction to MAK activation: https://technet.microsoft.com/en-us/library/ff793435.aspx)

(Introduction to KMS activation: https://technet.microsoft.com/en-us/library/ff793434.aspx)
