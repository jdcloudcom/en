# Description for JD Distributed Service Framework Plug-in

## spring cloud Plug-in Description

* If you have used JD Distributed Service Framework of JD Cloud and needs to use its `Service Administration - Service Authentication` and `Deployment` function, you need to quote the `spring-cloud-jdsf` series plug-ins, including `spring-cloud-jdsf-auth` and `spring-cloud-jdsf-consul`. Please select corresponding plug-ins as per the Spring Cloud version adopted.

* `spring-cloud-jdsf-consul`: Plug-in will get the environment variable for function deployment of JD Distributed Service Framework, automatically search the address of registration center among environment variables, replace the address configured in your configuration file and register service
* `spring-cloud-jdsf-auth`: Service authentication plug-in, if you need to use the service authentication function, please add configuration in the Console and then quote the plug-in in the service. Add the note `@EnableJdsfAuth` to the spring cloud start type. It needs to be noted that if the applications developed with the `Spring WebFlux` framework is under use, please use the annotation of `com.jdcloud.jdsf.auth.annotation.reactive.EnableJdsfAuth`. If the common `Spring WebMVC` is under use, please use the annotation of `com.jdcloud.jdsf.auth.annotation.EnableJdsfAuth`.
* `spring-cloud-jdsf-route`: Routing Plug-in of JD Cloud Distributed Service Framework, the routing function will be automatically enabled when the plug-in is referred. If you do not configure routing rules on JD Cloud Distributed Service Console by default, the service routing function will not come into force, which can only become valid when the routing rules are enabled. It should be noted that at present, when the `Spring WebFlux` framework is used, route request with `RestTemplate` or `AsyncRestTemplate` is not supported now. In such case, you can use `WebClient`. When the routing function is used, you must the deployment function and the registration center plug-in (`spring-cloud-jdsf-consul`) of JD Cloud Distributed Service Framework.
  
&emsp;&emsp; if your springcloud version is `Edgware`, you need to quote:

```xml
    <dependency>
        <groupId>com.jdcloud.jdsf</groupId>
        <artifactId>spring-cloud-jdsf-auth</artifactId>
        <version>1.1.2-Edgware</version>
    </dependency>
    <dependency>
        <groupId>com.jdcloud.jdsf</groupId>
        <artifactId>spring-cloud-jdsf-consul</artifactId>
        <version>1.1.2-Edgware</version>
    </dependency>
    <dependency>
        <groupId>com.jdcloud.jdsf</groupId>
        <artifactId>spring-cloud-jdsf-route</artifactId>
        <version>1.1.2-Edgware</version>
    </dependency>
```

&emsp;&emsp; if the springcloud version adopted is `Finchley`, the following needs to be quoted:

```xml
    <dependency>
        <groupId>com.jdcloud.jdsf</groupId>
        <artifactId>spring-cloud-jdsf-auth</artifactId>
        <version>1.1.2-Finchley</version>
    </dependency>
    <dependency>
        <groupId>com.jdcloud.jdsf</groupId>
        <artifactId>spring-cloud-jdsf-consul</artifactId>
        <version>1.1.2-Finchley</version>
    </dependency>
    <dependency>
        <groupId>com.jdcloud.jdsf</groupId>
        <artifactId>spring-cloud-jdsf-route</artifactId>
        <version>1.1.2-Finchley</version>
    </dependency>
```

&emsp;&emsp; if the springcloud version adopted is `Greenwich`, the following needs to be quoted

```xml
    <dependency>
        <groupId>com.jdcloud.jdsf</groupId>
        <artifactId>spring-cloud-jdsf-auth</artifactId>
        <version>1.1.2-Greenwich</version>
    </dependency>
    <dependency>
        <groupId>com.jdcloud.jdsf</groupId>
        <artifactId>spring-cloud-jdsf-consul</artifactId>
        <version>1.1.2-Greenwich</version>
    </dependency>
    <dependency>
        <groupId>com.jdcloud.jdsf</groupId>
        <artifactId>spring-cloud-jdsf-route</artifactId>
        <version>1.1.2-Greenwich</version>
    </dependency>
```

&emsp;&emsp; if the `Hoxton` version is used, you need to quote

```xml
    <dependency>
        <groupId>com.jdcloud.jdsf</groupId>
        <artifactId>spring-cloud-jdsf-auth</artifactId>
        <version>1.1.2-Hoxton</version>
    </dependency>
    <dependency>
        <groupId>com.jdcloud.jdsf</groupId>
        <artifactId>spring-cloud-jdsf-consul</artifactId>
        <version>1.1.2-Hoxton</version>
    </dependency>
    <dependency>
        <groupId>com.jdcloud.jdsf</groupId>
        <artifactId>spring-cloud-jdsf-route</artifactId>
        <version>1.1.2-Hoxton</version>
    </dependency>
```

* If you do not want to use service administration function of JDSF and just need the registration center and deployment functions of JDSF, you shall just configure parameters of the registration center:  

```yaml
spring:
  cloud:
    consul:
      host: ${JDSF_CONSUL_HOST}
      port: ${JDSF_CONSUL_PORT}
```

## dubbo Plug-in Description

* `dubbo-registry-consul`: dubbo consul registration center plug-in fits for dubbo 2.7.x version. When functions are deployed with JD Cloud Distributed Service Framework, the address of registration center can be automatically gotten. When deployment is made, configured registration center address of configuration file can be normally used, with plug-in information as follows:
  
```xml

<dependency>
    <groupId>com.jdcloud.jdsf</groupId>
    <artifactId>dubbo-registry-consul</artifactId>
    <version>1.0.0</version>
</dependency>

```

* `dubbo-opentracing`: The dubbo opentracing plug-in supports the dubbo 2.7.x version, which can realize development based on the opentracing standard. The plug-in can only be used when it is configured with standard trace based on Opentracing. The plug-in information is as follows:

```xml

<dependency>
    <groupId>com.jdcloud.jdsf</groupId>
    <artifactId>dubbo-opentracing</artifactId>
    <version>1.0.0</version>
</dependency>

```

&emsp;&emsp; When it needs to configure bean of tracing in service, please see [jdsf-demo-dubbo](https://github.com/jdcloud-cmw/jdsf-demo-dubbo) for details

* If you intend to use the dubbo 2.6.x version, please contact the customer service for obtaining the plug-in. Later, the plug-in of 2.6.x version will be released to JD Cloud public repository.



