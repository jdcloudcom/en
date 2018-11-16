**Live Domain Name Creation**

1. Enter the **Domain Name List** page in the CDN customer console; click “Add Domain Name”

![image.png](https://img1.jcloudcs.com/cms/8060a399-d9b1-49e4-9842-b033298704f120180514184345.png)

2. Add the cloud live video domain name

1) The modes fall into pushing streaming mode and pulling streaming mode. Pushing streaming mode means that the streamer pushes the stream to the CDN node, CDN performs the acceleration of the uplink pulling streaming end and the edge distribution acceleration. Pulling streaming mode means that the customer has his own live streaming origin server, and CDN only performs edge distribution acceleration, returning to the customer origin server to pull streaming;

2) Add Domain Name:

- Please complete the ICP filing of the domain name with the communications administration and then conduct this domain name adding configuration; 
- Domain name filling characters only support 26 English letters, 10 Arabic numerals and the horizontal bar “-”;
- The pushing streaming domain name and the pulling streaming domain name cannot be the same one; for example, the streamer’s pushing streaming is a.com, playing domain name can be b.com but cannot be a.com;
- Adding extensive domain name not supported
- Audio and video formats support H264, AAC
- Pulling streaming mode only supports back-to-source pulling rtmp format, playing domain name can be self-switched to https and https based on rtmp format

![image.png](https://img1.jcloudcs.com/cms/e88c953b-d500-49b3-a16a-024e572585ad20180514202416.png)

![image.png](https://img1.jcloudcs.com/cms/cb088c7c-ea22-476f-8c42-e05b953e2b8320180514202823.png)

3. After adding the domain name, the domain name will be displayed as “auditing” status. For the domain name auditing task submitted between 9 to 21 each day, we will complete the manual auditing of the compliance of the domain name content within 2 hours;

4. After the audit is completed, the status is not started by default, that is, the distribution status is not configured. You need to switch cname and click the running status of the domain name

5. The status of the domain name: The status of the pushing streaming domain name and the playing domain name is linked, that is, when the pushing streaming status is enabled to run, the playing status will naturally run.