
# Create Registry authentication information

**Operation Instructions**

If image of third party Container Registry is required when creating container, you need to add relevant information of third party Container Registry to Registry authentication information;

The authentication information you saved in JD Cloud shall be carefully encrypted and kept for downloading images specified in third party Container Registry;

Registry authentication information shall be referred to when creating container and refer to help center for creating container instance for details;

Please add any updates of third party Container Registry to JD Cloud to avoid failure in downloading container instance;

**Operation Guide**

1. Open JD Cloud console and select **Elastic compute**-**Container services**-**Secrets** to go to the Registry Authentication Information List page;

2. Click **Create Registry authentication information** button to open the Registry Authentication Information page.

3. Enter name, third party Container Registry server address, registry user name and password and email is optional; check the authorization instructions in the page and click OK to add relevant information of third party Container Registry to Registry Authentication Information. When using a private image created in the Docker Hub to add a third-party warehouse certification, it is recommended that the warehouse domain name should be based on this address: https://index.docker.io      

Please note that: JD Cloud use https protocol to encrypt and transmit relevant information of Container Registry, therefor, add prefix https:\\ before registry domain name;
