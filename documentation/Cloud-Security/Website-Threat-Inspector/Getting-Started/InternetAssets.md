# Add Public Network Asset to Be Scanned

## 1. Support of Public Network Assets:

- Support IP and domain assets
- Support HTTP and HTTPS protocols
- Support multilevel subdomain websites
- Support multilevel subdirectory websites

## 2. Public Network Asset Addition Scenarios:

### (1) Scenario 1: Add assets registered under JD Cloud & AI Domain Resolution Service

Information on domains/subdomains registered under JD Cloud & AI Domain Resolution Service is automatically imported, without manual addition and certification.

### (2) Scenario 2: Add assets registered under the account

Public network IP addresses registered under the account are automatically imported, without manual addition and certification.

### (3) Scenario 3: Add assets registered under other domain resolution services

Information on domains/subdomains not registered under JD Cloud & AI Domain Resolution Service shall be manually added and certified.

- Domains added shall be certified by CNAME
- Subdomains added shall be certified by files

## 3. Operation Steps:

### (1) Step 1: Add public network asset

Note: If the assets added by you are not those registered under the domain resolution service of JD Cloud & AI, you need to carry out manual addition and certification

Enter the Website Threat Inspector Console, click **Asset Management** in the left navigation bar, and on the website management page, click **Add Public Network Asset

Note: You can automatically associate and find the domain and asset under the same account without manually adding them

![](../../../../image/Website-Threat-Inspector/wts-internet-assets-01.png)
### (2) Step 2: Fill in asset information and certification path

![](../../../../image/Website-Threat-Inspector/wts-internet-assets-12.png)

Domain/Subdomain/IP: Select the asset type to be added according to your website access method (e.g.: example.com, test.examlple.com, 116.196.104.180)

Asset certification path: For assets manually added, the asset shall be subject to identity certification, so as to ensure the asset to be scanned is the one under the name of the tenant. By default, the certification path is the root directory. If the root path is unavailable for storing certification files, relevant path can be customized.

### (3) Step 3: Verify public network asset

![](../../../../image/Website-Threat-Inspector/wts-internet-assets-13.png)

- ##### Add resolution for main domain

You need to add CNAME resolution records under your man domain (taking the address 1.1.1.12 for example)

f3d40a15facc466593e32ee91f57f974.1.1.1.12 to df0b08b86088a0f781faade30269a78a.verify.scanner.jdcloud.com, so as to pass main domain asset certification.

- ##### IP/Sub-domain Addition Certificate

(1) Click to obtain the certification file and download the certification file (jd_scanner_verify.html) to a local file.

(2) Upload the downloaded certification file and please do not modify the file name and content

(3) Ensure that the file can be accessed via a public network; Click **Access** to verify if the verification certification succeeds.

### (4) Step 4: Configure assets required login

If some of your assets or partial contents in an asset can only be viewed after you logged in, we recommend you additionally configure such contents (cookies after logged in) before starting a scan task so as to complete an overall scan.

The product supports managing login status of assets, filling in login status information for your target asset, and can help deeply detect the vulnerability risk after an asset is found being logged in when the login status cookies of the target asset is configured.

![](../../../../image/Website-Threat-Inspector/wts-internet-assets-14.png)
After completion of certification, you also can add assets to be logged in. Click **Manage**. After the asset management interface is popped up, fill in contents of login status cookies.

> ##### How to fill in the login status cookies?
>
> 1. Please use Chrome browser to log in your website first, access a page that requires login before access continues, and use F12 key or right click on the page to select **Check**.
>
> ![](../../../../image/Website-Threat-Inspector/wts-internet-assets-05.png)
>
> 2. In the Developer Tools, select **Network-All** and refresh the page.
>
> ![](../../../../image/Website-Threat-Inspector/wts-internet-assets-06.png)
>
> 3. Click the first network request. Find "Cookie" in the "Headers", copy its value and paste it to the "Login Status Cookies" in the login simulation popup.
>
> ![](../../../../image/Website-Threat-Inspector/wts-internet-assets-07.png)

### (5) Step 5: Configure URI white list

URI White List: Means that the Website Threat Inspector is prohibited from accessing when the page address includes these keywords to prevent logout or management background access.

By configuring URI white list, you can designate the page not to be crawled by the product, e.g.: /logout.php, fill in logout here. 

The matching mode is perfect matching, in which logout1.php will not be excluded.
