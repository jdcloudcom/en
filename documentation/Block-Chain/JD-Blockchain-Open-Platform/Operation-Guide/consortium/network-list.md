# Enterprise Networking List
As indicated above, enterprise networking can help users to create a Consortium Blockchain network in JD Cloud BaaS Platform. Consortium Blockchain is the most extensive form creating blockchain network at present. It can combine multiple nodes to make these nodes not transferring communications with each other combined and deliver trusted data information under the same rules. JDD BaaS platform provides convenience for users with the page for the creation and configuration of Consortium Blockchain, enabling users to rapidly increase or decrease the blockchain network nodes just like "creating a Circle of Friends".

![图片](../../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/consortium11.png)

Consortium blockchain is display in 4 tab pages. The information displayed in each page is different, as follows:

* **Chain I Create**: In the default display interface, all chains created by the current account are displayed under this tab page. Under this page, the permissions to operate the chain are also different. Under this tab page, you can conduct operations including open/hide, access, invitation and deletion to the Blockchain you create. The meaning of each operation is as follows
	* Open/Hide: Whether to open the chain, if so, enterprises using JDD BaaS platform and accessing the Internet can view the basic information of this blockchain network (the basic information refers to the name and creator, excluding business information), and can apply to join the blockchain network
	* Access: After clicking **Access**, you can query the information that you apply for joining the chain on the page, and decide whether to run you partners to join the chain according to the application information. The ** ** button indicates that you agree to join the network, and the ** ** button indicates that you disagree to join the network. Upon successfully clicking either of the two buttons, a prompt telling you the operation is successful will pop up at the top right corner
![图片](../../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/consortium12.png)
	* Invitation: While the chain is in operation, it is still possible to invite more partners to join the blockchain network. This feature allows the chain creator to invite partners to join the network. After clicking, the page is shown as the following.
![Image](../../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/consortium13.png) After entering the page, the nodes that can form a network in JD Cloud Network will be found by default. You can click the **Add** button to invite someone. The added person(s) will be shown in the list below. If you add an error invitee, you can click the **Delete** button to delete the invitee. More than one invitee can be invited on this page.
![Image](../../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/consortium14.png) If you want to invite a person specified, you can select the network and enter the user identification (user identification code). Then click the *Search* button. The information searched out will be shown in the result list. Click the **Add** button for invitation.
	* Delete: This button is set for network creators. You can delete useless networks to save space. Note, that if you are a network initiator, you can start deleting only after all participants exiting the network; otherwise, the deletion of useless networks won’t succeed.
* **Chain I Joined**: For the blockchain network you join, you can view under this tab page, and enter this blockchain network for more details. The network on this page does not have too much permission for operation as it is not an account login.
![Image](../../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/consortium15.png) On this page, you can only "Exit" the network you have joined. Upon clicking the **Exit** button, you need to confirm whether to exit in the page popped-up, and then you can exit the current network:
![图片](../../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/consortium16.png)
* **Chain Opened**: For the blockchain network to which the Open button has been clicked, you can view it in the tab. On this page, for the blockchain network created by a non-login account, you can choose whether to join the network. If the blockchain network is created by this account, no button will appear. After clicking **Apply to Join the Network**, you can see the details of the network. Confirmed as correct, you can click the **Apply to Join** button to join the network.
![Image](../../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/consortium17.png) After clicking the **Apply to Join** button, you can check the details of the public chain. Confirmed as correct, you can click the **Apply to Join** button, then the application information will be sent to the initiator of the blockchain network.
![图片](../../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/consortium18.png)
When the creator of the blockchain network agrees to let you join, the Operation button on this page becomes ** **. After clicking the button, it starts to enter the Node Startup Interface. Unlike the Network Creation page, the Node Startup page displays the basic information of blockchain network before asking users to enter details.
![图片](../../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/consortium19.png)
At the end, there is information to be configured for the application of joining the chain, and the items to be entered are as shown in table below:

| Category | Parameter Name | Required | Rules |
|----------|----------|:------:|--------------------------------------------------|
| Regional Information | Region | Yes | Choose the region at which the server is located |
| | Optional Areas | Yes | Choose available server areas under the region |
| Network Information | Private Network | Yes | |
|  | Subnet | Yes | |
| Specification | Machine Specification | Yes | Machine specification is optional. The detailed configuration based on the specification you choose will be displayed on the right. |
| Storage | Data Disk Type | Yes | HDD and SSD Cloud Disk are optional |
|  | Data Disk Capacity | Yes | Select a Data Disk Capacity between 40 (minimum) and 400 (maximum) |
| Blockchain Configuration |	API User	| Yes| The user whose name is used to call APIs needs to be used for calling when the application system calls.|
| |	API Password	|Yes|	The API user passwords are a combination of characters and letters|
||	Node Number|	Yes|	Number of Blockchain consensus nodes set the home terminal|
||	Status Database|	Yes|	Choose LevelDB or couchDB|
||	Browser|	Yes|	Choose to enable the browser function or not. It is not supported in this version|

Enter the configuration of different information. The prices are displayed in the configuration item on the right in detail. After all information is entered, you can click the **Purchase** button to start purchasing.
After clicking the button, you will log into the Information Confirmation page, which is divided into two pages for two steps, namely the Order Confirmation page and the Enabled Successfully page respectively. You can confirm the order amount in the Order Confirmation page. Confirmed as correct, you may click the **Instant Account Setup** button to complete the confirmation.
![图片](../../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/consortium20.png)

After entering the Enabled Successfully page, if there is sufficient amount in your account, the system will show you a notification congratulating for you successful enabling. Then, the page will automatically redirect back to the Networking List page after 5 seconds.

![图片](../../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/consortium21.png)
On the Networking List Page I Joined, you can check the network status. When the operation status changes into "In Operation" and all backend operation buttons appear, the network is successfully created. For the specific operations on the Chain Page I Joined, please refer to the above-mentioned "Chain I Joined". Note, that you can click the name of the blockchain network to enter the Details after you have successfully joined.
![图片](../../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/consortium22.png)

* **Chain Where I am Invited**: If you are invited, the tab page will display the blockchain network information of the inviter. Optional operations include Overview. After you accept or refuse to join the chain, this page will be cleared. After clicking the **Overview** button, the Input Information page will pop up. The basic information of Blockchain is shown at the top of this page.

![图片](../../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/consortium23.png)

At the end, there is information to be configured by the invitee, and the items to be inputted are as shown in table below:

| Category | Parameter Name | Required | Rules |
|----------|----------|:------:|--------------------------------------------------|
| Regional Information | Region | Yes | Choose the region at which the server is located |
| | Optional Areas | Yes | Choose available server areas under the region |
| Network Information | Private Network | Yes | |
|  | Subnet | Yes | |
| Specification | Machine Specification | Yes | Machine specification is optional. The detailed configuration based on the specification you choose will be displayed on the right. |
| Storage | Data Disk Type | Yes | HDD and SSD Cloud Disk are optional |
|  | Data Disk Capacity | Yes | Select a Data Disk Capacity between 40 (minimum) and 400 (maximum) |
| Blockchain Configuration |	API User	| Yes| The user whose name is used to call APIs needs to be used for calling when the application system calls.|
| |	API Password	|Yes|	The API user passwords are a combination of characters and letters|
||	Node Number|	Yes|	Number of Blockchain consensus nodes set the home terminal|
||	Status Database|	Yes|	Choose LevelDB or couchDB|
||	Browser|	Yes|	Choose to enable the browser function or not. It is not supported in this version|

Enter the configuration of different information. The prices are displayed in the configuration item on the right in detail. After all information is entered, you can click the **Purchase** button to start purchasing.
After clicking the button, you will log into the Information Confirmation page, which is divided into two pages for two steps, namely the Order Confirmation page and the Enabled Successfully page respectively. You can confirm the order amount in the Order Confirmation page. Confirmed as correct, you may click the **Communicate Now** button to complete the confirmation.
![图片](../../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/consortium24.png)
After entering the Enabled Successfully page, if there is sufficient amount in your account, the system will show you a notification congratulating for you successful enabling. Then, the page will automatically redirect back to the Networking List page after 5 seconds.

![图片](../../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/consortium25.png)

On the Networking List Page I Joined, you can check the network status. When the operation status changes into "In Operation" and all backend operation buttons appear, the network is successfully created. For the specific operations on the Chain Page I Joined, please refer to the above-mentioned "Chain I Joined". Note, that you can click the name of the blockchain network to enter the Details after you have successfully joined.
![图片](../../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/consortium26.png)