# Cookie Verification Questions

### 1. How to obtain website cookie value?

- Open Google Chrome.

- Press "F12" to enter the developer mode of the browser.

- Select **Network** in the debugging page, shown in the figure.
![](../../../../image/Website-Threat-Inspector/wts-cookie-01.png)

- Enter the target website url "www.jdcloud.com" in the address bar and log in

- Select an http request in the left navigation tree. Select www.jdcloud.com as shown in the figure. Click **Headers** -> **Request-Headers** -> **Cookie** again.  The content in cookie is the Cookie we want
![](../../../../image/Website-Threat-Inspector/wts-cookie-02.png)
### 2. How to set cookie value before scanning?

- Website Threat Inspector Cloud Service -> Asset Management -> click the **Management** button for the cookie asset to be added -> enter the cookie to be added in the login status cookies input box
![](../../../../image/Website-Threat-Inspector/wts-cookie-03a.png)

### 3. How to implement website vulnerability scanning if the website’s cookie value changes?

- If the website’s cookie value changes, please set a new cookie according to the method to obtain and set the cookie value
