# SMS Pricing Manner 
What are the pricing rules for SMS?
SMS characters=characters of SMS template + signature

For SMS characters<=70, one SMS is calculated as 70 characters

For SMS characters>70, i.e., long SMS, one SMS is calculated as 67 characters

What about the SMS pricing manner?
If the acceptance status of SMS has not returned after 5 minutes, the cost will be deducted first. After the actual return status, the SMS will be replenished according to the number of failures.

If the SMS fails to be sent, will it still be charged?
It won’t be charged for the send failure and failure status return by the operator.

When sending a text message, the package closest to the expiration date is preferred, and when the SMS number is insufficient, it will be supplemented from the next package. If the package is under expiration status when the failure receipt is received, SMS number will not be replenished.
