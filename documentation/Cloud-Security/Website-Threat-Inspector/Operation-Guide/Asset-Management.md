# Asset Management

### Interface

![](../../../../image/Website-Threat-Inspector/wts-internet-assets-01.png)

![](../../../../image/Website-Threat-Inspector/wts-internet-assets-12.png)

### Add Public Network Asset to Be Scanned

[Scenario 1]: Website Threat Inspector will automatically import the information about the domain/sub-domain registered under JD Cloud & AI's domain resolution service, requiring no verification. At the same time, adding asset cookies is supported (after an asset is added, click **Management** to add cookies information).

[Scenario 2]: Website Threat Inspector will automatically import the public IP address registered under your user PIN account, requiring no verification. At the same time, adding asset cookies is supported (after an asset is added, click **Management** to add cookies information).

[Scenario 3]: You need to manually add the information about the domain/sub-domain registered under JD Cloud & AI's domain resolution service (it is verified by CNAME if a primary domain is added or by files if a subdomain is added), requiring verification. At the same time, adding asset cookies is supported (after an asset is added, click **Management** to add cookies information).

### Verification Management

First, add the relevant verification information based on the verification scenario, and then manually click **Verify**.

- Domain Verification Scenario

  You need to log in your own domain resolution service to add relevant cname information generated.  

![](../../../../image/Website-Threat-Inspector/wts-internet-assets-13.png)

- IP/Sub-domain Certification Scenario

  To download asset certification files (jd_scanner_verify.html), you need to log in your own website and add such files to the root directory of the website for certification.  

 ### Add the cookies login status & URI whitelist

 Click **Manage** to enter the URI whitelist and cookies login status management

 ![](../../../../image/Website-Threat-Inspector/wts-internet-assets-14.png)
