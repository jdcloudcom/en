# Download
 Adopt the getObject method and provide bucket name and object name in the request.
 
 ## Download Method
 
* Download an entire Object: [Download an Entire Object](getObject-JavaSDK#user-content-1)
* Download part of objects: [Range Download](getObject-JavaSDK#user-content-2) 

<div id="user-content-1"></div>

## Download an entire Object

 ```Java
String bucket_name = "<your bucketname>";
String key = "your keyname";
System.out.format("Downloading %s from S3 bucket %s...\n", key, bucket_name);

try {
    S3Object o = s3.getObject(bucket_name, key);
    S3ObjectInputStream s3is = o.getObjectContent();
    FileOutputStream fos = new FileOutputStream(new File(key));
    byte[] read_buf = new byte[1024];
    int read_len = 0;
    while ((read_len = s3is.read(read_buf)) > 0) {
        fos.write(read_buf, 0, read_len);
    }
    s3is.close();
    fos.close();
} catch (AmazonServiceException e) {
    System.err.println(e.getErrorMessage());
    System.exit(1);
} catch (FileNotFoundException e) {
    System.err.println(e.getMessage());
    System.exit(1);
} catch (IOException e) {
    System.err.println(e.getMessage());
    System.exit(1);
}
    System.out.println("Done!");  

```
<div id="user-content-2"></div>

## Range Download

```Java
       
String bucket_name = "<your bucketname>";
String key = "<your keyname>";
String file_path = "<your path>";
int start = 1;
int end = 1000;
	    
GetObjectRequest getObjectRequest = new GetObjectRequest(bucket_name, key).withRange(start,end);
s3.getObject(getObjectRequest, new File(file_path));
```
