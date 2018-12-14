# Core Concepts

Concepts and interpretations for KMS Key Management Service are listed below for reference.

- Customer Managed Key: Passwords, certificates, data keys and other sensitive data can be encrypted via the Customer Managed Key, and the main Key can be created and managed via the console and OpenAPI.

- Data Encryption Keys: The data encryption keys are applicable for keys of envelope encryption data and are protected by the main keys. New data keys can be created via OpenAPI of KMS.

- Envelope Encryption: It is an encryption mean, enclosing data encryption keys in an envelope for storage, transmission and directly encrypting and decrypting data without using any main Key.
