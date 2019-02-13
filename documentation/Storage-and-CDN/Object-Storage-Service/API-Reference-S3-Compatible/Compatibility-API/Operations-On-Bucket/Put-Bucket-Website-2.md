# Put Bucket website

# Description
Specify a certain Bucket to set static website hosted configuration, including website index file, error page and redirection rule, which is only available to the Owner of the Bucket.

## Request
### Syntax
```
PUT /?website HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com 
Date: <date>
Content-Length: <ContentLength>
Authorization: <authorization string> (see Authenticating Requests (AWS Signature Version4))

<WebsiteConfiguration xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
  <!-- website configuration information. -->
</WebsiteConfiguration>
```
### Request Parameter
No Request Parameters
### Request Header
No Special Header
### Request Elements
You can set the Bucket as static website hosted mode, which can specify default home page, error return page and redirection address after access error.

Name|Description|Must
---|---|---
WebsiteConfiguration|website Information Set. <br>Type: Container<br>Ancestors: None|Yes
IndexDocument|suffix Element Information Set<br>Type: Container<br>Ancestors: WebsiteConfiguration|Yes
Suffix|Specify the index file, which cannot be null and contains "/" character, such as index.html. <br>Type: String<br>Ancestors: WebsiteConfiguration.IndexDocument|Yes
ErrorDocument|key Element Information Set <br>Type: Container<br>Ancestors: WebsiteConfiguration|No
Key|When 4XX error occurs, OSS returns the customized error page. <br>Type: String<br>Ancestors: WebsiteConfiguration.ErrorDocument<br>Condition: Required when ErrorDocument is specified.|Specify ErrorDocument to be necessary
RoutingRules|RoutingRule Element Information Set. <br>Type: Container<br>Ancestors: WebsiteConfiguration|No
RoutingRule|Specify redirection rules. In RoutingRules rules, at least one RoutingRule rule is included. <br>Type: String<br>Ancestors: WebsiteConfiguration.RoutingRules|No
Condition|Redirection Conditions Information Set. <br>Type: Container<br>Ancestors: WebsiteConfiguration.RoutingRules.RoutingRule|No
HttpErrorCodeReturnedEquals|HTTP error code, redirect when specified error code occurs. The scope is 400 - 499, cannot be<br>Type: String<br>Ancestors: WebsiteConfiguration.RoutingRules.RoutingRule.Condition|No
Redirect|Set of Redirection Information. <br>Type: String<br>Ancestors: WebsiteConfiguration.RoutingRules.RoutingRule|No
HostName|Host of Redirection Request. Type: String<br>Ancestors: WebsiteConfiguration.RoutingRules.RoutingRule.Redirect|No
ReplaceKeyPrefixWith|The prefix of object key name of KeyPrefixEquals value in the redirection request will be replaced. <br>Type: String<br>Ancestors: WebsiteConfiguration.RoutingRules.RoutingRule.Redirect|No

## Response
### Response Header
No Special Response Header
### Response Element
No Response Element

## Examples
### Example 1
The following request configures example.com as website. Specify index.html as the index page in the request and specify SomeErrorDocument.html as the error page.
```
PUT ?website HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
Content-Length: 256
Date: Thu, 27 Jan 2011 12:00:00 GMT
Authorization: <authorization string>

<WebsiteConfiguration xmlns='http://s3.amazonaws.com/doc/2006-03-01/'>
    <IndexDocument>
        <Suffix>index.html</Suffix>
    </IndexDocument>
    <ErrorDocument>
        <Key>SomeErrorDocument.html</Key>
    </ErrorDocument>
</WebsiteConfiguration>
```
Return Example
```
HTTP/1.1 200 OK
x-amz-request-id: 80CD4368BD211111
Date: Thu, 27 Jan 2011 00:00:00 GMT
Content-Length: 0
Server: JDCloudOSS
```

### Example 2
In the request, specify HTTP error code in RoutingRule as a special condition, and specify the redirection to ec2-11-22-333-44.compute-1.amazonaws.com/reprot-404/. E.g., if 404 error occurs when request ExamplePage.html, it will redirect to report-404/testPage.html. If there is no direction rule, it returns Error.html.
```
PUT ?website HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com 
Content-Length: 580
Date: Thu, 27 Jan 2011 12:00:00 GMT
Authorization: <authorization string>

<WebsiteConfiguration xmlns='http://s3.amazonaws.com/doc/2006-03-01/'>
  <IndexDocument>
    <Suffix>index.html</Suffix>
  </IndexDocument>
  <ErrorDocument>
    <Key>Error.html</Key>
  </ErrorDocument>

  <RoutingRules>
    <RoutingRule>
    <Condition>
      <HttpErrorCodeReturnedEquals>404</HttpErrorCodeReturnedEquals >
    </Condition>
    <Redirect>
      <HostName>ec2-11-22-333-44.compute-1.amazonaws.com</HostName>
      <ReplaceKeyPrefixWith>report-404/</ReplaceKeyPrefixWith>
    </Redirect>
    </RoutingRule>
  </RoutingRules>
</WebsiteConfiguration>
```
