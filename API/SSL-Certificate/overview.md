# JDCLOUD SSL Certificate Management API


## Introduction
Provide SSL Certificate and relevant information APIs for certificate purchase record management


### Version
v1


## API
|Interface Name|Request Method|Function Description|
|---|---|---|
|**describeCerts**|GET|View certificate list|
|**describeCert**|GET|View certificate details|
|**uploadCert**|POST|Upload certificate|
|**downloadCert**|GET|Certificate Download<br>Sensitive operation can be enabled<a href="https://docs.jdcloud.com/en/security-operation-protection/operation-protection">MFA Operation Protection</a>|
|**deleteCerts**|DELETE|Certificate Deletion<br>Sensitive operation can be enabled<a href="https://docs.jdcloud.com/en/security-operation-protection/operation-protection">MFA Operation Protection</a>|
