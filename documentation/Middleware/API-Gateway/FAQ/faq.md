# FAQ

**1: What is the requirement for definition of version number?**

A: For normative consideration, you must comply with {}. {}. {} can only be filled in with a format consisting of 3-digit number.


**2: How to charge and refund and other issues about expenses**

A: For API Gateway, the pay-as-you-go method shall be adopted as per resource consumption. For billing method, please refer to: [Billing Rules](../Pricing/Billing-Rules.md)


**3: How many customized domain names based on grouping can be associated at maximum**

A: At present, each group supports to associate up to 5 customized domain names. [Description of steps for domain name configuration](../Operation-Guide/Create-APIGroup/Create-Domain.md)


**4. When an API is released in the API Gateway and the request parameter is put in the body by way of post, it reports error if parameters are none, why?**

Answer: The request body needs to select a type in the "Request Body Type" and then use jsonschema to describe the requested fields in the request body format.

If there are no parameters, it should be dict () be default.


**5. Can upload binary streams in body?**

A: Yes, it is supported. The contentType of APPLICATION_OCTET_STREAM can be set in SDK.


**6. When byte stream is inside the body and it cannot transform to utf-8 character string, how does the API Gateway verify the signature?**

Answer: Uploading only one header: x-jdcloud-content-sha256 will be fine. After this header is used, the body will not join the signature. The value can be any value.


**7. When the gateway calls the backend API, what authentication information will it pass to the backend API?**

Answer: It will provide backend signature, like IP white list, to ensure the security of API providers.


**8. Will the API Gateway pass the information of current caller to the backend?**

Answer: Yes.

**9. Will the information that the API caller creates and provides the gateway signature key pair be passed to the backend?**

Answer: No.


**10. What information will the API Gateway pass to the backend to help the backend identify the caller who calls the API?** 

Answer: The API Gateway will provide the backend with user information, including x-jdcloud-pin andx-jdcloud-userId.


**11. For HTTP/HTTPS type in advanced configuration, can an intranet address be filled in the backend service IP address?**

Answer: No. It only supports public IP currently. But users can implement the intranet calling function with VPC agent mode.


**12. What's the difference between JD Cloud User Signature and API Gateway Signature? Can the backend get pin and userid?**

Answer: The AK/SK of JD Cloud User Signature is derived from [Account Management](https://uc.jdcloud.com/account/accesskey). [API Gateway Signature](https://apigateway-console.jdcloud.com/accessSecretKey) is created in API Gateway product.
For these two methods, the backend can both get pin and userid.


**13. API now can be accessed externally when it is authorized on API Gateway. If a C user wants to directly access from Mini Program or APP, could the permission be changed to open by default?**

Answer: You may use the authentication free mode. However, by using this mode, the backend will not receive the user pin information. We recommend the authorization method of subscription key pair, which is simpler than the authorization method of API Gateway Signature and by which the backend can receive pin information.

**14. Can the subscription key pair directly placed in a third-party application immediately call an API? Is it a one-time authorization?**

Answer: Yes.


**15. Will the automatically generated domain remain the same?**

Answer: Yes.


**16. Is SDK version of Java supported currently?**

Answer: JDK1.7 and above are supported.




