# Creation of Docker Image

**Preconditions**

 - Register a JD Cloud account, activate and verify the same, to respectively access JD Cloud registration, JD Cloud Login and Real-name Verification.
 - If you need to create the billing instances paid by configuration, you need to keep your balance above RMB 50. If the balance is less than the limit, please recharge your account.
 - For information about regions and availability zones, please refer to the region and the availability zones.

**Action Steps**

**I. Creation of Registry**

 1. Turn on the console, log in Elastic Compute-Container Registry-Registry, and click **Create**.
 2. Select a region from cn-north-1, cn-east-2 and cn-south-1.
 3. Complete a name which is unique globally and is unchangeable; such name shall contain more than 3 characters but not more than 32 characters, started and ended with lower case letters and numbers; and the use of lower case letters, numbers and line-through (-) is supported.
 4. Description is not the compulsory item, which cannot exceed 256 characters and cannot be altered.
 5. The registry URI is automatically produced IN THE format of registry name-region abbreviation.jcr.service.jdcloud.com.
 6. Click **OK**

**II. Creation of Repository**

 1. Log in Elastic Compute-Container Registry-Repository, and click **Create**.
 2. Select a region from cn-north-1, cn-east-2 and cn-south-1.
 3. Select registry
 4. Complete the name which shall contain more than 3 characters but not more than 255 characters; the name under the same registry is unique and unchangeable; the use of multiple namespace stages is supported, which are separated with a /; the namespace of each stage shall not be empty, started and ended with lower case letters and numbers; and the use of lower case letters, numbers, line-through (-) and underline (_) is supported.
 5. Description is not the compulsory item, which cannot exceed 256 characters and cannot be altered.
 6. Repository URI and registry URI/repository name are automatically produced.
 7. Click **OK**

**III. Get Token**

 1. Log in Elastic Compute-Container Registry-Registry and Click **Get Tokens**. The token can be used for finishing authorization verification of Docker client. At most 5 tokens can be applied within one hour.
 2. 2. Set validity period of token: 12h by default, being an integer from 1~24h. Click **OK**
 3. In the “Download Token” popup, click **Download .xlsx File** to download the token to the local file with the file name “registry name-token.xlsx”. Or copy and save the information.

**Note: Once being disabled, it cannot obtain the Docker client login command of the token again.**

**IV. Image Upload and Download**

 1. Install the JD Cloud CLI or Docker of latest version.
 
 2. For example, the registry is myregistry, the repository is myrepo, the image version number is latest and the region is cn-north-1. Users can make the alternation depending on specific conditions.
 
    Obtain the token from a specified login registry by using JD Cloud CLI or obtain the token from the console.
    ```
    jdc cr get-authorization-token --region-id cn-north-1 --registry-name myregistry
    ```
 3. Log in JD Cloud registry with a token; if the token is obtained by using the JD Cloud CLI, please enter the Docker client login command returned:
    ```
    docker login -u jdcloud -p ********* myregistry-cn-north-1.jcr.service.jdcloud.com 
    ```
 4. Push images to JD Cloud repository, for example ubuntu:latest for the local images.
    
    Mark the local images to be pushed to the JD Cloud repository:
    ```
    docker tag ubuntu:latest myregistry-cn-north-1.jcr.service.jdcloud.com/myrepo:latest
    ```
    Push the marked images to the JD Cloud repository:
    ```
    docker push myregistry-cn-north-1.jcr.service.jdcloud.com/myrepo:latest
    ```
 5. Fetch images from the JD Cloud repository:
    ```
    docker pull myregistry-cn-north-1.jcr.service.jdcloud.com/myrepo:latest
    ```
