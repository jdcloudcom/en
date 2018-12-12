# Key Management Service


## Introduction
Security Data Escrow Service Based on keys Protected by Hardware


### Version
v1


## API
|Interface Name|Request Mehod|Function Description|
|---|---|---|
|**cancelKeyDeletion**|PATCH|Cancel key deletion|
|**cancelKeyVersionDeletion**|PATCH|Cancel deletion of key with specified version|
|**createKey**|POST|Create a CMK (main key of the user) in enabled status by default|
|**createSecret**|POST|Create confidentiality|
|**createSecretVersion**|POST|Create a new version of confidentiality in enabled status by default|
|**decrypt**|POST|Decrypt data by using keys|
|**deleteSecret**|DELETE|Delete confidentiality|
|**deleteSecretVersion**|DELETE|Delete confidentiality of specified version|
|**describeKey**|GET|Obtain key details|
|**describeKeyDetail**|GET|Obtain version details|
|**describeKeyList**|GET|Obtain key list|
|**describeSecretList**|GET|Obtain confidentiality list|
|**describeSecretVersionInfo**|GET|Obtain details of specified confidentiality version|
|**describeSecretVersionList**|GET|Obtain confidentiality details|
|**disableKey**|PATCH|Disable keys in "enabled" status|
|**disableKeyVersion**|PATCH|Disable keys of specified version|
|**disableSecret**|PATCH|Disable confidentiality|
|**disableSecretVersion**|PATCH|Disable confidentiality of specified version|
|**enableKey**|PATCH|Enable keys in "disabled" status|
|**enableKeyVersion**|PATCH|Enable keys of specified version|
|**enableSecret**|PATCH|Enable confidentiality|
|**enableSecretVersion**|PATCH|Enable confidentiality of specified version|
|**encrypt**|POST|Encrypt data by using keys|
|**exportSecret**|GET|Export confidentiality|
|**generateDataKey**|GET|Obtain plaintext/ciphertext of a data key from KMS|
|**importSecret**|POST|Import confidentiality|
|**keyRotation**|PATCH|Rotate keys now and postpone automatic rotation cycle|
|**scheduleKeyDeletion**|DELETE|It is planned to delete the key at a time in future (7 days by default).|
|**scheduleKeyVersionDeletion**|DELETE|It is planned to delete the key with specified version at a time in future (7 days by default).|
|**updateKeyDescription**|PATCH|Modify the key configuration, including key name, use, automatic rotation or not, rotation cycle, etc.|
|**updateSecret**|PATCH|Modify confidentiality description|
|**updateSecretVersion**|PATCH|Modify configuration of confidentiality with specified version|
