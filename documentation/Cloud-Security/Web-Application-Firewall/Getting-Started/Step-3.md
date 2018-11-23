## Local Verification

Before switching the service traffic to WAF, we recommend that you ensure all configurations and WAF forwarding to be normally by local verification first. Local verification needs to simulate WAF access at local, then access the protected website to verify the normal forwarding of WAF.

By modifying local hosts file to simulate WAF access, which guides the requests accessing the protected sites from local to WAF. Taking Windows Operating System for example:

1. Use notepad, notepad++ or other text editor to open the hosts file that is generally located in the path of C:\Windows\System32\drivers\etc\hosts.

2. Append the following contents at the last line: the domain name protected by the IP of WAF.

3. Save the hosts file, perform ping to the protected domain name.

4. In such case, the resolved IP address shall be the WAF IP address associated just now. If the origin server address resolved is the origin server address, please try to refresh the local DNS cache (using command as `ipconfig`/`flushdns` under cmd of Windows).

5. Verify if WAF forwarding is normal or not. After confirming the hosts association has taken effect (the domain name has been locally resolved as WAF IP), open the browser and enter this domain to access. If the WAF configuration is correct, the website can be normally opened.