# Create Key Pair

## Operation Steps
1. Access [Key Console][1], or access [JD Cloud Console][2] Click  navigation bar on the left **Elastic Compute** - **Virtual Machines**- **SSH Key Pair** to enter the key pair list page.
2. Select the region where you want to use key pair and click **Create** to start the creation process of key pair.
3. Name the public key that will be saved in JD Cloud.
4. Select the creation method of key pair: <br>
   * Create a new key pair: JD Cloud will create a key pair for you. Among them, JD Cloud saves the public key and you save the private key. Note that you only have one chance to download the private key. Please download the private key in time during the link validity period.
   * Use Existing public key: Upload your local public key file to JD Cloud. When creating in this way, make sure you have a private key saved in the local with the public key.
5. After the successful creation, you can view the public key plaintext in the details page of key pair.
Note: If you choose to create a new key pair, the console will provide a  interface to download private key after creation. Please be sure to save the corresponding private key and ensure that the private key is not spread on the Internet. JD Cloud will not save your private key. The link to download the private key is only valid within 10 minutes. Please download it in time.
![](../../../../../image/vm/Operation-Guide-keypair-create1.png)


  [1]: https://cns-console.jdcloud.com/host/ssh/list
  [2]: https://console.jdcloud.com/