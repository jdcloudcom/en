# FAQ

**Q1: What are the public key and private key? **

A1: The public key and private key are commonly known as a kind of asymmetric encryption mode. Public key and private key constitute a key pair (i.e. a public key and a private key) obtained by an algorithm, in which the public key is the public part while the private key is the non-public part. The public key is usually used to encrypt session keys, check digital signatures, or encrypt data that can be decrypted with the corresponding private key. The key pair obtained by such algorithm can be guaranteed to be unique in the world. When using this key pair, if you encrypt a piece of data with one key therein, you must decrypt it by the other key. For example, data encrypted with the public key must be decrypted by the private key, while it must be decrypted by the public key if encrypted with the private key; otherwise, it will not successfully decrypt.

**Q2: What is the principle of digital certificate? **

A2: Digital certificate adopts public key system, i.e., conduct encryption and decryption by using a pair of matching key pair. Each user sets up a specific private key on his own (private key) that is only known to him, which is used for decryption and signature; at the same time, a public key (public key) shall be set up also to be made open by himself and shared for a group of users for encryption and checking signatures. Since the key is owned by the user himself, thus a file that no one else can generate is generated and a digital signature is formed. A digital certificate is a file that is digitally signed by the Certificate Authorization Center (CA) containing the information of the public key owner and the public key. The simplest certificate contains a public key, the name and the digital signature of the Certificate Authorization Center. Another important feature of a digital certificate is that it is valid only for a specific period of time.

