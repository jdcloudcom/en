# Callback server sets signature verification

## Overview
If your callback server is maliciously attacked by others, as the malicious callback of your application server, the application server receives some illegal requests and the normal logic is affected. In such case, you need to judge if the callback request is from OSS.

Among the OSS callback notification and video callback, the notification message is sent to your callback server via the NS service. NS supports signature verification via the method below:

### Check Callback Signature
The user can obtain the signature certificate by pushing x-jdcloud-signing-cert-url in request Header, check if such request is sent by the NS system with corresponding method and protect the user against negative effects by malicious requests.verification

Among the request headers pushed by NS, the value of Authorization field is used for producing signature by MNS with the SHA1-RSA signature algorithm according to the character string to be signed. Endpoint can verify the signature by using the public key and the specific verification method is as follows:

### Step 1: Obtaining X509 certificate

Among the http request Headers sent by NS to Endpoint, x-jdcloud-signing-cert-url specifies the signature certificate address (Base64 encoding). The user needs to decode by using Base64, obtain the URL address of the signature file and extract the public key of the signature therefrom.

### Step 2: Computing character string to be singed
```
 VERB + "\n"
+ CONTENT-MD5 + "\n"
+ CONTENT-TYPE + "\n"
+ DATE + "\n"
+ CanonicalizedNSHeaders
+ CanonicalizedResource
```
Note:
* VERB represents Method of HTTP
* CONTENT-MD5 represents the MD5 value of the request content data
* CONTENT-TYPE represents the type of request content, with corresponding value in lower case
* DATE represents the time of this operation, which can’t be blank, and only the GMT format is supported now
* CanonicalizedNSHeaders represents the field combination started with x-jdcloud- in the Header of http request
* CanonicalizedResource represents the relative address in the http request, which can’t be blank
Examples of character strings to be signed (Note: The line which shall not contain any space shall be in the lower case and all values of Content-Type shall be in the lower case)
```
POST
ZDgxNjY5ZjFlMDQ5MGM0YWMwMWE5ODlmZDVlYmQxYjI=
text/xml;charset=utf-8
Wed, 25 May 2016 10:46:14 GMT
x-jdcloud-request-id:57458276F0E3D56D7C00054B
x-jdcloud-signing-cert-url:aHR0cDovL25zdGVzdC5vc3MuY24tbm9ydGgtMS5qY2xvdWRjcy5jb20veDUwOV9wdWJsaWNfY2VydGlmaWNhdGUucGVtCg==
x-jdcloud-version:2015-06-06
/notifications
```
### Step 3: Authorization decryption
After applying Base64 Decode to Authorization signature field, decrypt the signature field with the public key extracted from the certificate of Step 1;
### Step 4: Verification
Compare if the character string to be signed from the Step 2 is consistent with the decryption result of Step 3. If yes, it means that the request is from NS and the access is valid.
Note:
* The following specification shall be conformed to before checking signature with CanonicalizedNSHeaders (i.e. the head begins with x-jdcloud-):
* Change the head name into lower case
* Rank the heads from the shortest one to the longest one
* Do not leave a space before and after the colon used for dividing the head name and the value
* Add a \n after each Head. If the head beginning with x-jdcloud- is available, please set CanonicalizedNSHeaders to be blank at the time of signing.

### Others
1. The character string for signing must be in UTF-8 format;

2. The signing method is the sha1WithRSAEncryption method defined in RFC 3447 ( http://tools.ietf.org/html/rfc3447 );

3. Base64 refers to that the text is transcoded with the base64 algorithm.

### JAVA example code
```
ublic class SignDemo {
      private Boolean authenticate(String method, String uri, Map<String, String> headers) {
          try {
              //Obtaining a certificate URL
              if (!headers.containsKey("x-jdcloud-signing-cert-url")) {
                  System.out.println("x-jdcloud-signing-cert-url Header not found");
                  return false;
              }
             String cert = headers.get("x-jdcloud-signing-cert-url");
             if (cert.isEmpty()) {
                 System.out.println("x-jdcloud-signing-cert-url empty");
                 return false;
             }
             cert = new String(Base64.decodeBase64(cert));
             System.out.println("x-jdcloud-signing-cert-url:\t" + cert);
  
             //Obtaining a certificate based on URL and obtaining public key from the certificate
             URL url = new URL(cert);
             HttpURLConnection conn = (HttpURLConnection) url.openConnection();
             DataInputStream in = new DataInputStream(conn.getInputStream());
             CertificateFactory cf = CertificateFactory.getInstance("X.509");
             Certificate c = cf.generateCertificate(in);
             PublicKey pk = c.getPublicKey();
  
             //Obtaining character string to be signed
             String str2sign = getSignStr(method, uri, headers);
             System.out.println("String2Sign:\t" + str2sign);
  
             //Applying Base64 decoding to Authorization field
             String signature = headers.get("Authorization");
             byte[] decodedSign = Base64.decodeBase64(signature);
  
             //Verification
             java.security.Signature signetcheck = java.security.Signature.getInstance("SHA1withRSA");
             signetcheck.initVerify(pk);
             signetcheck.update(str2sign.getBytes());
             Boolean res = signetcheck.verify(decodedSign);
             return res;
         } catch (Exception e) {
             e.printStackTrace();
             return false;
         }
     }
  
     private String getSignStr(String method, String uri, Map<String, String> headers) {
         StringBuilder sb = new StringBuilder();
         sb.append(method);
         sb.append("\n");
         sb.append(safeGetHeader(headers, "Content-md5"));
         sb.append("\n");
         sb.append(safeGetHeader(headers, "Content-Type"));
         sb.append("\n");
         sb.append(safeGetHeader(headers, "Date"));
         sb.append("\n");
  
         List<String> tmp = new ArrayList<String>();
         for (Map.Entry<String, String> entry : headers.entrySet()) {
             if (entry.getKey().startsWith("x-jdcloud-")) {
                 tmp.add(entry.getKey() + ":" + entry.getValue());
             }
         }
         Collections.sort(tmp);
  
         for (String kv : tmp) {
             sb.append(kv);
             sb.append("\n");
         }
  
         sb.append(uri);
         return sb.toString();
     }
  
     private String safeGetHeader(Map<String, String> headers, String name) {
         if (headers.containsKey(name)) {
             return headers.get(name);
         } else {
             return "";
         }
     }
  
     public static void main(String[] args) {
         SignDemo sd = new SignDemo();
         Map<String, String> headers = new HashMap<String, String>();
         headers.put("Authorization", "Mko2Azg9fhCw8qR6G7AeAFMyzjO9qn7LDA5/t9E+6X5XURXTqBUuhpK+K55UNhrnlE2UdDkRrwDxsaDP5ajQdg==");
         headers.put("Content-md5", "M2ViOTE2ZDEyOTlkODBjMjVkNzM4YjNhNWI3ZWQ1M2E=");
         headers.put("Content-Type", "text/xml;charset=utf-8");
         headers.put("Date", "Tue, 23 Feb 2016 09:41:06 GMT");
         headers.put("x-jdcloud-request-id", "56CC2932F0E3D5BD530685CB");
         headers.put("x-jdcloud-signing-cert-url", "aHR0cDovL25zdGVzdC5vc3MuY24tbm9ydGgtMS5qY2xvdWRjcy5jb20veDUwOV9wdWJsaWNfY2VydGlmaWNhdGUucGVtCg==");
         Boolean res = sd.authenticate("POST", "/notifications", headers);
         System.out.println("Authenticate result:" + res);
     }
 }
```
