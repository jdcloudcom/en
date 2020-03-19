# Create Key Pair

## Operation Steps
1. Access [Key Console][1], or access [JD Cloud & AI Console][2] Click  navigation bar on the left **Elastic Compute** - **Virtual Machines**- **SSH Key Pair** to enter the key pair list page.
2. Select the region where you want to use key pair and click **Create** to start the creation process of key pair.
3. Name the public key that will be saved in JD Cloud & AI.
4. Select the creation method of key pair: <br>
   * Create a new key pair: JD Cloud & AI will create a key pair for you. Among them, JD Cloud & AI saves the public key and you save the private key. Note that you only have one chance to download the private key. Please download the private key in time during the link validity period.
   * Use Existing public key: Upload your local public key file to JD Cloud & AI. When creating in this way, make sure you have a private key saved in the local with the public key.
   
5. After it is created, the public key fingerprint information is available in the details of key pair.
Note: If you select to create a new key pair, the private key will be downloaded automatically to your local after creation succeeded. You must save the corresponding private key and ensure the private key will not be disseminated throughout the Internet. JD Cloud & AI will not save your private key.

![](../../../../../image/vm/Operation-Guide-keypair-create1.png)


  [1]: https://cns-console.jdcloud.com/host/ssh/list
  [2]: https://console.jdcloud.com/