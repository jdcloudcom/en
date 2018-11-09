# Upload Backup Files
## 1. Generate Key Value of File Upload
- Click ***Generate an Uploading Key*** to generate a key for file authentication, login, etc.
- Click on the last icon of key to copy the key automatically.

![Upload Backup 1](../../../image/RDS/Upload-Backup-1.png)

## 2. Download Uploading Tools

- In the details of SQL Server instance, enter the page of ***Cloud on Single Database***, click ***Download Uploading Tool***, and download upload-tool.exe.
- The uploading tool currently only supports windows versions.

![Upload Backup 2](../../../image/RDS/Upload-Backup-2.png)

## 3. Upload Files

Run upload-tool.exe to upload the backup files. The command format of upload-tool.exe is:
```
upload-tool.exe -r [Region code] -f [Local path of backup file] -k [Upload key value]
```
If the backup files are already in the JD Cloud intranet, it is recommended to upload it through intranet for higher uploading efficiency. The command is as follows:
```
upload-tool.exe -r [Region code] -f [Local path of backup file] -k [Upload key value -i

## -i: Represent unloading files with intranet
```

The region code supports the following regions

|Region Name|Region Code|
|-|-|
|cn-north-1|cn-north-1|
|cn-east-1|cn-east-1|
|cn-east-2|cn-east-2|
|cn-south-1|cn-south-1|

**Command Instance:** Upload the backup file "z:/Backup/testdb.bak" to cn-north-1.
```
upload-tool.exe -r cn-north -f z:/Backup/testdb.bak -k   U2FsdGVkX19c7B0ZGP0mU++sXgWZoHCeGP0tacbRz3TpoOKPsXmncA
```
Precautions:

1. The key is valid within 1 hour for sake of security. Click the button to regenerate a key after the key expires.
2. The files with the same name are not allowed to replace when uploading. Please delete the original files before uploading for the sake of security.
