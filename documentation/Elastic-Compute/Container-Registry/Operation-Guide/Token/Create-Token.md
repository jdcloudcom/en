# Creation of Token

 **Two Methods**

**I. Obtaining through the Console**

 1. Log in [Elastic Compute-Container Registry-Registry](https://cns-console.jdcloud.com/host/containerregistry/list) and Click **Get Tokens**. The token can be used for finishing authorization verification of Docker client. At most 5 tokens can be applied within one hour.
 ![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Container-Registry/获取临时令牌.png)   
 2. Set validity period of token: 12h by default, being an integer from 1~24h. Click **OK**
 3. In the "Download Token" popup, click **Download .xlsx File** to download the token to the local file with the file name "registry name-token.xlsx". Or copy and save the information.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Container-Registry/下载临时令牌.png)  
**Note: Once being disabled, it cannot obtain the Docker client login command of the token again.**

**II. Obtaining through JD Cloud CLI**

 1. Install the [JD Cloud CLI](https://docs.jdcloud.com/cn/cli/introduction).
 2. Get tokens via the following commands
    `jdc cr get-authorization-token --region-id **** --registry-name ****`
