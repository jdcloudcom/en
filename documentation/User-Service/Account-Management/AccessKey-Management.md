# Accesskey Management
To guarantee the use security of cloud resources, when related resources and actions are called by API, it is required to use Access Key to verify the identity of you and the application program in order to ensure visitors have relevant permission. Access Key is composed of Access Key ID and Access Key Secret. Anyone owning your Access Key will have the same resource access and action permission as you, and can access all resources in your account and conduct corresponding actions without limit. You can create, disable or delete your Access Key. Meanwhile, it is recommended to alternate the Access Key at regular intervals to ensure security of your account and resources.

Every primary account can have 5 groups of valid access key and every IAM user can have 2 groups of valid access key, which would be quite useful when you must alternate user's access key. You can disable the user's access key, which means this key cannot be used for API calling; this action can be executed when you alternate the key or cancel the user’s access to API. You can delete access key at any time, but when you are doing this, that means it will be deleted permanently and cannot be restored.

Access Key Management of Primary Account
![](https://github.com/jdcloudcom/en/blob/en-signin-signup/image/User/Account%20Management/AccessKey%20Management/ak-1.png)

Primary account manages Access Key for subaccounts
![](https://github.com/jdcloudcom/en/blob/en-signin-signup/image/User/Account%20Management/AccessKey%20Management/ak-1.png)

Access Key Management of Subaccounts
![](https://github.com/jdcloudcom/en/blob/en-signin-signup/image/User/Account%20Management/AccessKey%20Management/ak-2.png)
