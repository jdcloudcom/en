# java: spymemcached
## Download Client:
https://code.google.com/archive/p/spymemcached/?spm=a2c4g.11186623.2.5.IU7oGl
## Java Example Code 1
(access without password, the jar package of spymemcached should be added under the project directory before the codes can be compiled and run):
```
package Spymemcached;

import java.net.InetSocketAddress;
import net.spy.memcached.MemcachedClient;
import net.spy.memcached.internal.OperationFuture;
 
public class Spymemcached {
   public static void main(String[] args) {
   
      try{
         MemcachedClient mcc = new MemcachedClient(new InetSocketAddress("ip", port));
         System.out.println("Connection to server sucessfully.");
         OperationFuture<Boolean> fo = mcc.set("key", 0, "value");
         System.out.println("set status:" + fo.get());
         System.out.println("key value - " + mcc.get("key"));
         mcc.shutdown();
         
      }catch(Exception ex){
         System.out.println( ex.getMessage() );
      }
   }
}
```
## Java Example Code 2
(access with password, the jar package of spymemcached should be added under the project directory before the codes can be compiled and run):
```
package Spymemcached;

import java.net.InetSocketAddress;

import net.spy.memcached.AddrUtil;
import net.spy.memcached.ConnectionFactoryBuilder;
import net.spy.memcached.ConnectionFactoryBuilder.Protocol;
import net.spy.memcached.MemcachedClient;
import net.spy.memcached.auth.AuthDescriptor;
import net.spy.memcached.auth.PlainCallbackHandler;
import net.spy.memcached.internal.OperationFuture;
 
public class Spymemcached {
   public static void main(String[] args) {
   
      try{
    	  AuthDescriptor ad = new AuthDescriptor(new String[]{"PLAIN"}, new PlainCallbackHandler("test", "test"));
    	  MemcachedClient mcc = new MemcachedClient(
                             new ConnectionFactoryBuilder().setProtocol(Protocol.BINARY)
                  .setAuthDescriptor(ad)
                  .build(),
                  AddrUtil.getAddresses("ip" + ":" + port));
         System.out.println("Connection to server sucessful.");
         OperationFuture<Boolean> fo = mcc.set("key", 0, "value");
         System.out.println("set status:" + fo.get());
         System.out.println("key value - " + mcc.get("key"));
         mcc.shutdown();
         
      }catch(Exception ex){
         System.out.println( ex.getMessage() );
      }
   }
}
```
