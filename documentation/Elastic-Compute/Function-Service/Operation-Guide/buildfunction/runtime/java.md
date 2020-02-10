# Java
Support the following Java running environment before function service:

Java 8 (support Java 8 version)

## Operation Instructions

Java language is required to be compiled before running in a container. Therefore, the use methods in function service, which have the following limitations, differ from those of such scripting languages as Python and Node.js:

- Not support uploading codes: Using Java language only supports jar package that has been uploaded, compiled and packaged. The function environment does not provide compiling ability of Java.
- Not support on-line editing: Not support directly uploading codes, so it will not support on-line editing codes. For functions at the time of Java running, you can only upload a new jar package on the function details.



## Processing Program

Because Java includes the concept of package, the processing program is different from other languages and is required to contain package information.

**The format of the function execution entry Handler" is {package}.{class}::{method}**. The package name and class name can be arbitrary and need to be corresponding to the "Handler" field when the function is created. The class method must be handleRequest.


When using Java for programming, users need to implement APIs of function service, including the following 2 optional predefined APIs:

1. `StreamRequestHandler` accepts input event and returns an execution result by way of streaming. Users need to read the input at the time of calling functions from `inputStream`, and then write the function execution result to outputStream and return after the reading.

2. `PojoRequestHandler` is done by way of generic programming. Users can customize types of input and output, which must be the type of `POJO`.

### StreamRequestHandler
A simple handler function is defined as follows:

```Java
package example;

        import com.jdcloud.function.Context;
        import com.jdcloud.function.StreamRequestHandler;

        import java.io.IOException;
        import java.io.InputStream;
        import java.io.OutputStream;
        import java.util.concurrent.TimeUnit;

public class HelloFC implements StreamRequestHandler {

    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
        outputStream.write(new String("hello world").getBytes());;
// inputStream.read();
        System.out.println("*************** " );
        {
            // write your code here

        }
    }
}
```

The corresponding function execution entry Handler in the code example is: example.HelloFC::handleRequest. The example is Java package, HelloFC is a class and handleRequest is a class method.                    
APIs predefined in function service must be implemented in the codes of users. In the above example, StreamRequestHandler is implemented, in which the inputStream parameter is the data uploaded at the time of calling functions, and the outputStream is used to return the execution result of functions.



### PojoRequestHandler
A simple handler function is defined as follows:

```Java
package example;

import com.jdcloud.function.Context;
import com.jdcloud.function.PojoRequestHandler;

public class HelloFC implements PojoRequestHandler<SimpleRequest, SimpleResponse> {
    @Override
    public SimpleResponse handleRequest(SimpleRequest request, Context context) {
        String message = "Hello, " + request.getFirstName() + " " + request.getLastName();
        return new SimpleResponse(message);
    }
}
```


```Java
package example;

public class SimpleRequest {
    String firstName;
    String lastName;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public SimpleRequest() {}
    public SimpleRequest(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

```

```Java
package example;
public class SimpleResponse {
    String message;
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public SimpleResponse() {}
    public SimpleResponse(String message) {
        this.message = message;
    }
}
```

The test event is as follows:
```JSON
{
  "firstName": "FunctionService",
  "lastName": "JDcloud"
}

```
Return below:

```Java

"message":"Hello, FunctionService JDcloud"

```


## Input Parameter

Currently, types supported by event input parameters and function returns include Java basic types and POJO types; the current type is `com.jdcloud.function.Context` in function running.

- Types supported by event input parameters and function returns
1. Java basic type consists of eight basic types including byte, int, short, long, float, double, char and boolen as well as package type, and it also includes String type.           
2. POJO (Plain Old Java Object) type. You shall use the changeable POJO and public getter and setter to implement corresponding types in the codes.
- Context Input Parameters              
When using Context, you need to use `com.jdcloud.function.Context` in the code; introduce package and package into jar package when packaging.

**Description of Introducing Interface Repository**

The ` com.jdcloud.function ` dependence package quoted in the code can be quoted through the following pom.xml:

```
<dependency>
    <groupId>com.jdcloud.function</groupId>
    <artifactId>java-runtime</artifactId>
    <version>1.0.0</version>
</dependency>

```

Through [ maven ](https://mvnrepository.com/artifact/com.jdcloud.function/java-runtime), the repository can get the latest version number of java-runtime and can be directly downloaded to add and package into jar package.

## Deployment Package Upload

Please use Maven to create a jar deployment package or use IDEA to package jar.

After creation, the deployment package can be uploaded directly (less than 50M) through the Console page to complete the submission.


