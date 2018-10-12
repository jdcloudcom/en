# Domain Name Resolution
After the domain name is registered, the customer only has the right to use the domain name, but cannot directly access your website through the domain name, or send and receive mail by using it as an email suffix. "Domain Name Resolution" is a necessary for accessing your website or email address by using the domain name.

1. Prepare the domain name, website (or email)

You need a domain name and get the machine IP address (or email MX record) from the server provider to complete the subsequent resolution setting.

2. Set domain name resolution

On JD Cloud [Console], enter the domain name management list, click **Resolution** and point the domain name to the website machine IP address (or e-mail MX record), then you can quickly complete the domain name resolution setting. The specific operation process is as follows:

A. Enter the domain name resolution setting page

- On JD Cloud [Console], enter the domain name management list, then select the domain name to be operated, click **Resolution Operation**, and directly enter the resolution operation page.




- Click **Add Resolution**, select the record type as A record; the machine record is empty, or fill in www; Fill in the machine IP address with record you obtained earlier; resolve the line, and wait for TTL default. Click **Save** to complete the domain name resolution setting.



B. DNS Check

The domain name resolution service defaults to Xinnet DNS service. However, after modifying the default DNS service or using the DNS service of other third-party company, domain name resolution will no longer be operated on this console.

C. Effective Time of Resolution

The new resolution takes effect immediately after the completion of setting.

It takes 10 minutes to 2 hours to modify the resolution. The final effect depends on the cache refresh time of the local operators. Please be patient to wait.
