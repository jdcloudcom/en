# Installing the Edge system failed

## Problem Description

I cannot install the Edge system on the device.

## Troubleshooting

1. Please execute the following command to confirm whether you have correctly installed docker and docker-compose. The correct version number will be returned, if it has been installed.

```
docker --version
docker-compose --version
```

2. Please confirm whether the installation package downloaded by you is correct with the following method.

   - Enter the edge node details page, click to view the configuration information, record the installation package MD5 value, and save it as a md5.txt file. The contents are set below:
```
e0ierfndmjs9a7649b6f2cm3d8gbfu387 jdc-edge-install.tar.gz
```
   - Place the md5.txt and jdc-edge-install.tar.gz installation packages under the same directory, and enter the command shown below to check whether they are correct

```
md5sum -c md5.txt
```

3. Please confirm whether the user profile (UserConfig.toml) identified by you is correct. For details, refer to [Install Edge System](../Getting-Started/Install-Edge-System.md).

   

4. Please confirm that your device configuration has met all the requirements listed in [Specifications](../Introduction/Specifications.md).

   

5. Please confirm whether the networking of your device is normal.

## Follow-up Processing

  If the issue still isn’t solved through the above-mentioned operation, please [Open ticket](https://ticket.jdcloud.com/myorder/form?cateId=166&questionId=238) or call the customer service staff 400-615-1212.
