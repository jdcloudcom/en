## SMS Business Rule<br>

**Billing Rules for SMS Content:**<br>
SMS characters=characters of SMS template + signature characters<br>
SMS Characters<=70, one SMS is calculated as 70 characters<br>
For SMS characters>70, i.e., long SMS, one SMS is calculated as 67 characters<br><br>

**SMS Pricing Manner:**<br>
If the acceptance status of SMS has not returned after 5 minutes, the cost will be deducted first. After the actual return status, the SMS will be replenished according to the number of failures.<br><br>

**If the SMS fails to be sent, will it still be charged?**<br>
It won’t be charged for API calling failure and return failure status of operator<br><br>

**Can SMS be sent by three networks (telecom network, computer network and cable television network)? Can it be sent to abroad/Hong Kong/Macao/Taiwan?**<br>
The service of sending international/Hong Kong, Macao/Taiwan message isn’t supported for the time being