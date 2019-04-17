# Information Completion

1. Log in the Console, select **Cloud Security** -> **SSL Certificate** -> **Certificate Management** from the navigation bar on the left in turn and log in the SSL Certificate Subscription Management Page

![申购管理](/image/SSL-Certification/申购管理.png)

2. After subscription, the certificate shall be in the state of **Information to be Completed**. In such case, please click **Complete Information** and the following page will be popped up

![补全信息](/image/SSL-Certification/Symantec-DV-补全信息.png)

3. Complete information such as certificate name, association domain and check method according to the notification. However, the applicant shall have the ownership for the associated domain. The check method is the **DNS Check** or **File Check**. Introductions and operation steps of the two check methods are as follows.

## DNS Check

You need to add one TXT type resolution record for the domain manually to verify the domain ownership.

Operation Steps:

- Log in the DNS Domain Resolution Page from the DNS resolution service provider

- Add JD Cloud DNS and add resolution contents, including website information. Select record type as TXT and a series of record values will be obtained for entering and verification of record values
  
  ![添加解析内容](/image/SSL-Certification/添加解析内容.png)

- Wait until the resolution takes effect


## File Check

You need to upload specified files to the specified directory of the domain site to verify the domain ownership.

Operation Steps:

- File content replication: Click **Copy** and the content is valid for 24 hours generally.

![文件内容](/image/SSL-Certification/文件内容.png)

- Directory Creation
  - Log in the server and create the specified file directory (your-domain.com/.well-known/pki-validation/fileauth.txt)
  - Copy file contents to specified file directory
  
- Configuration Detection
  - HTTP configuration detection link: http://your domain/.well-known/pki-validation/fileauth.txt 

Please make sure your Virtual Machines Service Provider does not shield the overseas access. If the overseas access is shielded, please contact the Virtual Machines Service Provider.

After the configuration is done, please check if the access address has normal output with a browser.

**Common Error**:
- File content is incorrect;
- The content seems to be correct, but it is not, because it contains the HTML element;
- The original address is redirected;
- The content expired.
