# Description for JD Distributed Service Framework Plug-in

## spring cloud Plug-in Description

* If you have used JD Distributed Service Framework of JD Cloud and needs to use its `Service Administration - Service Authentication` and `Deployment` function, you need to quote the `spring-cloud-jdsf` series plug-ins, including `spring-cloud-jdsf-auth` and `spring-cloud-jdsf-consul`. Please select corresponding plug-ins as per the Spring Cloud version adopted.

&emsp;&emsp; if your springcloud version is `Edgware`, you need to quote:

```xml
    <dependency>
        <groupId>com.jdcloud.jdsf</groupId>
        <artifactId>spring-cloud-jdsf-auth</artifactId>
        <version>1.0.2-Edgware</version>
    </dependency>
    <dependency>
        <groupId>com.jdcloud.jdsf</groupId>
        <artifactId>spring-cloud-jdsf-consul</artifactId>
        <version>1.0.2-Edgware</version>
    </dependency>
```

&emsp;&emsp; if the springcloud version adopted is `Finchley`, the following needs to be quoted:

```xml
    <dependency>
        <groupId>com.jdcloud.jdsf</groupId>
        <artifactId>spring-cloud-jdsf-auth</artifactId>
        <version>1.0-Finchley</version>
    </dependency>
    <dependency>
        <groupId>com.jdcloud.jdsf</groupId>
        <artifactId>spring-cloud-jdsf-consul</artifactId>
        <version>1.0-Finchley</version>
    </dependency>
```

&emsp;&emsp; if the springcloud version adopted is `Greenwich`, the following needs to be quoted

```xml
    <dependency>
        <groupId>com.jdcloud.jdsf</groupId>
        <artifactId>spring-cloud-jdsf-auth</artifactId>
        <version>1.0-Greenwich</version>
    </dependency>
    <dependency>
        <groupId>com.jdcloud.jdsf</groupId>
        <artifactId>spring-cloud-jdsf-consul</artifactId>
        <version>1.0-Greenwich</version>
    </dependency>
```

&emsp;&emsp; After quote, service requires no configuration and all verification configurations are required to be done in the Console only

* If you do not want to use service administration function of JDSF and just need the registration center and deployment functions of JDSF, you shall just configure parameters of the registration center:  

```yaml
spring:
  cloud:
    consul:
      host: ${JDSF_CONSUL_HOST}
      port: ${JDSF_CONSUL_PORT}
```

* If you only want to use the registration center and deployment and do not want to configure environment variable in the configuration file, you are recommended to quote our plug-ins:
  
```xml
    <dependency>
        <groupId>com.jdcloud.jdsf</groupId>
        <artifactId>spring-cloud-jdsf-consul</artifactId>
        <version>${version}</version>
    </dependency>
```  

## Plug-in Function Description

* `spring-cloud-jdsf-consul` plug-in will get the environment variable for function deployment of JD Distributed Service Framework, automatically search the address of registration center from the environment variable, replace the address configured in your configuration file and register service
