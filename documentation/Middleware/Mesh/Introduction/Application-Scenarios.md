# Application Scenarios

###	Cross-language Service Management

JD Cloud Service Mesh has the feature of being irrelevant to the language and supports unified governance to multiple language applications.

When a Golang application is accessed by a Java application, Proxy can forward request traffic while realizing Service Management function.

![](../../../../image/Internet-Middleware/Mesh/struct-kyy.png)


###	Traffic Offloading

The service mesh supports traffic scheduling via three dimensions of HTTP Header, URI and weight. Users can realize functions such as greyscale distribution and blue-green deployment via this feature.

![](../../../../image/Internet-Middleware/Mesh/struct-fl.png)


###	Observable

The Service Mesh can collect metric data via a proxy and send the same to Mixer and the backend supporting and observation platform, so as to realize real-time monitoring to business application.

![](../../../../image/Internet-Middleware/Mesh/struct-kgc.png)
