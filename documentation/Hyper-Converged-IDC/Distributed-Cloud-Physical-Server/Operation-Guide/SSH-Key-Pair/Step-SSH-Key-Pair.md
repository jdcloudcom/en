## SSH Key Pair

SSH Key Pair is a safe and convenient login certification method, which is composed of public key and private key and supports Linux Distributed Cloud Physical Server instances only.

SSH Key Pair can generate a pair of keys through encryption algorithms and adopt the RSA 2048-bit encryption method by default. To log in Linux instances with SSH Key Pair, you must create one key pair, appoint the key pair while creating an instance and connect such instance with a private key.

### Operation Steps

#### Create New Key Pair

- Log in Distributed Cloud Physical Server-SSH Key Pair List, Click **Create Key Pair**, select a node and an operator and enter key pair name. A new key pair can be created or existing public key can be selected for use.

- Select creation method of key pair:<br/>

1. Create a new key pair: JD Cloud & AI will create a new key pair for you. The public key will be saved in JD Cloud & AI, but the private key will be downloaded automatically to your local folder. You must save corresponding private key and ensure that the private key will not be transmitted throughout the Internet. JD Cloud & AI will not save your private key.<br/>
2. To use an existing key pair, you need to upload your local public key file to JD Cloud & AI. Please ensure save the private key which is matched to the public key in your local folder.<br/>

- After being created, the public key fingerprint information can be viewed in key pair details.<br/>

#### Key Pair Deletion

- Log in Distributed Cloud Physical Server-SSH Key Pair List and click **Delete** to delete SSH Key Pair.<br/>

- When the key pair is deleted, you can still log in the instance associated with the private key stored in a local folder.<br/>

#### Restrictions
  Maximum 20 key pairs can be created under the same node for the same account.<br/>
