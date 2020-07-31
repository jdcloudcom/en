# FAQ
## Is refund supported after the purchase of the Text Message package?
- A refund can be applied within seven days from the purchase of Text Message package provided that there are no breaches against any JD Cloud Text Message Service protocol;  
- Full-amount refund of the purchase payment will be implemented if the Text Message package is not used;  
- Refund is not supported for the used Text Message package;  
- Subscription cancellation/refund is not supported for domestic SMS packages more than 7 days after purchase, whether used or not.  
  
## Why is the SMS signature not approved all the time?
There are many reasons for not approving an SMS signature, most commonly as follows:  
- The corporate or individual real-name verification is not completed (please complete real-name verification first)  
- The signature is inconsistent with the company qualification (please provide the evidence for signature consistency, e.g. product certificate, trademark certificate, ICP certificate, APP/WeChat official account/mini program registration snapshot, etc.)  
- The incorrect certificate is uploaded (please query and download the data based on qualification uploading interface)  
- The standard signature for an operator is 3-8 Chinese characters  
- If the signature of another company is used, please provide the authorization certificate (with the seal of the authorizer)  
For details, please visit [Audit Standard](https://docs.jdcloud.com/en/text-message/standard)  
  
## Why is the template not approved all the time?
There are many reasons for not approving a template, most commonly as follows:  
- Sending is not supported now (for detailed rules, please view Audit Standard)  
- The signature and template are submitted separately (please submit the signature and template at the corresponding positions)  
- Excessive variables or variable characters may result in failure to determine application scenarios (if a variable is included in the SMS content, the definition and scope of the variable shall be specified explicitly, and the service application scenarios shall be described in the application description)  
- The link contained in the template cannot be variable or redirect for more than one time, and the linked destination shall be with ICP certificate  
For details, please visit [Audit Standard](https://docs.jdcloud.com/en/text-message/standard)  
  
## Why did the SMS sending fail?  
There are many reasons for SMS sending failure, most commonly as follows:  
- Please check the sending frequency setting of the application for whether "no more than 1 message can be sent on each natural day for the application" is checked and other frequency settings  
- Abnormal service scenario and frequency limit (no more than 1 message within 30 seconds, no more 5 messages within 1 hour, no more 10 messages within 1 natural day for one mobile number by default) triggered  
- Operator policy management and signature blocked (please contact the customer service and provide the pin, sending number and sending content for query)  
- Keyword intercepted (please contact the customer service and provide the pin, sending number and sending content for keyword query of the failing number)  
Other failure reasons can be submitted to the customer service by ticket  
  
## The sending status is "Succeeded" but the user has not received the message. What to do?  
The following troubleshooting is suggested to inspect the mobile phone status:  
- Please dial the number to check if the mobile phone is off or the number is in arrears or suspended  
- Please restart the terminal if your mobile phone cannot receive short messages normally as it is not turned off within a long time  
- Please restart the terminal if your mobile phone cannot receive short messages normally due to abnormal signal  
- Please delete excessive short messages if your inbox is full  
- The mobile phone cannot receive short messages normally due to abnormal mobile phone setting or abnormal hardware: Please modify the relevant setting or insert your SIM card to another mobile phone for testing (or card slot for testing in case of dual SIM mobile phone)  
- Please check the spam inbox on whether the short message is intercepted by the system/software of the user's mobile phone  
  
## Other FAQs  
1. Is the short message group sending supported for individual users?  
A: No; Verified individual user: sending of verification codes and short message notices via API; verified corporate user: sending of verification codes and short message notices and group sending of promotion short messages  
2. Is application deletion supported?  
A: No. Enabled applications can be suspended  
3. Is signature and template deletion supported?  
A: No  
4. Why are my signature and template not reviewed?  
A: Signatures and templates are expected to be reviewed within 2 hours after submission. Review time: From Monday to Sunday at 9:00-23:00 (to be postponed in case of legal holidays). You are suggested to submit applications before 18:00; if they are not reviewed beyond 2 hours, you can provide the pin and signature/template ID to the customer service for query  
5. Why was I charged fees for more than one short message when I just sent one short message?  
A: Please check if the number of characters in the short message exceeds 70. You can check the SMS Rules - Billing Rules. The short message sending interface will also give notification of the SMS billing;  
6. How to get the user short message reply after sending a short message to a customer?  
A: View path: Application - Statistics - SMS Records - Reply Records  
