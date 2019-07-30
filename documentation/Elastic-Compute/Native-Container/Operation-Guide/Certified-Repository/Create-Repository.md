
# Create Secrets

**Operation Instructions**

- **JD Cloud currently has provided Container Registry, so users are strongly suggested to use this product, a fully hosted storage and distribution platform of docker images, providing secure and reliable image services and seamlessly integrating with JD Cloud Native Container and JCS for Kubernetes to provide one-stop deployment services for container application. For details, see [Product Help Documentation](https://docs.jdcloud.com/en/container-registry/product-overview).**  
- If image of third party Container Registry is required when creating Native Container, you need to add relevant information of third party Container Registry to Registry authentication information;
- The authentication information you saved in JD Cloud shall be carefully encrypted and kept for downloading images specified in third party Container Registry;
- Registry authentication information shall be referred to when creating container and refer to [help center for creating container instance](https://docs.jdcloud.com/en/native-container/create-to-instance) for details;
- Please add any updates of third party Container Registry to JD Cloud to avoid failure in downloading container instance;

**Operation Guide**

1. Open JD Cloud console and select **Elastic compute** -**Container services**-**Secrets** to go to the Registry Authentication Information List page;
2. Click **Create Registry authentication information** to open the registry authentication information page.
3. After the name, third-party image repository server address, repository user name and password are entered, the email is an optional; you can add the information related to the third-party image repository to secrets.  
- Public images under library of Dcoekr Hub, such as centos, nginx, etc. directly use the default docker.io without creating information of secrets.  
- When it is necessary to add a third-party repository verification to use the public or private image of private image repository created in Docker Hub, this address: https://index.docker.io is recommended as the repository domain to download the private image. You need to fill in the correct user name and password.  
- **Because Docker Hub server is at abroad and the network is not stable, it is suggested that customers should use JD Cloud's Container Registry Service or the image repository service built by the customers in domestic server.**    
4. If users need to verify the correctness of information, they can click **Information Verification**.   
5. Check the authorization instruction on the page and click **OK** for save.

Please note that: JD Cloud use https protocol to encrypt and transmit relevant information of Container Registry, therefor, add prefix https:\\ before registry domain name;
