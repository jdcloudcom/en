# C++ client: libmemcached
## Client Introduction:
https://launchpad.net/libmemcached?spm=a2c4g.11186623.2.5.bGUAw2
## Install SASL relevant environment:
<code>yum install -y cyrus-sasl-plain cyrus-sasl cyrus-sasl-devel cyrus-sasl-lib </code>
## libmemcached Installation:
```
wget https://launchpad.net/libmemcached/1.0/1.0.18/+download/libmemcached-1.0.18.tar.gz
tar -xvf libmemcached-1.0.18.tar.gz 
cd libmemcached-1.0.18 
./configure --enable-sasl
make && make install 
```
## C++ Example Code 1 (access without password):
```
  #include <iostream>
  #include <string>
  #include <libmemcached/memcached.h>

  using namespace std;
    
  #define IP "ip"
  #Define PORT port//default is 11211
  
  int main(int argc,char *argv[])
  {
      //connect server
     memcached_st *memc;
     memcached_return rc;
     memcached_server_st *server;
     time_t expiration = 0;
     uint32_t  flags;
 
     memc = memcached_create(NULL);
     server = memcached_server_list_append(NULL,IP,PORT,&rc); 
     rc=memcached_server_push(memc,server);
     memcached_server_list_free(server);
 
     string key = "Key";
     string value = "Value";
     size_t value_length = value.length();
     size_t key_length = key.length();
 
     rc=memcached_set(memc,key.c_str(),key.length(),value.c_str(),value.length(),expiration,flags);
     if(rc==MEMCACHED_SUCCESS)
     {
         cout<<"Save key: "<<key<<", value: "<<value<<", sucessfully!"<<endl;
     }

     char* result = memcached_get(memc,key.c_str(),key_length,&value_length,&flags,&rc);
     if(rc == MEMCACHED_SUCCESS)
     {
         cout<<"Get key: "<<key<<", value: "<<result<<", sucessfully!"<<endl;
     }

     rc=memcached_delete(memc,key.c_str(),key_length,expiration);
     if(rc==MEMCACHED_SUCCESS)
     {
         cout<<"Delete key: "<<key<<", value: "<<value<<", sucessfully!"<<endl;
     }
     else
     {
        cout<<rc<<endl;
     }

    memcached_free(memc);
     return 0;
 }
 ```
 
## C++ Example Code 2 (access with password):
```
  #include <iostream>
  #include <string>
  #include <libmemcached/memcached.h>

  using namespace std;
    
  #define IP "ip"
  #Define PORT port//default is 11211
  #define USERNAME "username"
  #define PASSWORD "password"
  
  int main(int argc,char *argv[])
  {
     memcached_st *memc;
     memcached_return rc;
     memcached_server_st *server;
     time_t expiration = 0;
     uint32_t  flags;
 
     memc = memcached_create(NULL);
     server = memcached_server_list_append(NULL,IP,PORT,&rc); 
     sasl_client_init(NULL);
     rc = memcached_set_sasl_auth_data(memc, USERNAME, PASSWORD);
     if(rc != MEMCACHED_SUCCESS)
        {
        cout<<"Set SASL err:"<< endl;
        }
     rc = memcached_behavior_set(memc,MEMCACHED_BEHAVIOR_BINARY_PROTOCOL,1);
     if(rc != MEMCACHED_SUCCESS)
        {
         cout<<"Binary Set err:"<<endl;
        }
     rc=memcached_server_push(memc,server);
     memcached_server_list_free(server);
 
     string key = "Key";
     string value = "Value";
     size_t value_length = value.length();
     size_t key_length = key.length();
 
     rc=memcached_set(memc,key.c_str(),key.length(),value.c_str(),value.length(),expiration,flags);
     if(rc==MEMCACHED_SUCCESS)
     {
         cout<<"Save key: "<<key<<", value: "<<value<<", sucessfully!"<<endl;
     }

     char* result = memcached_get(memc,key.c_str(),key_length,&value_length,&flags,&rc);
     if(rc == MEMCACHED_SUCCESS)
     {
         cout<<"Get key: "<<key<<", value: "<<result<<", sucessfully!"<<endl;
     }

     rc=memcached_delete(memc,key.c_str(),key_length,expiration);
     if(rc==MEMCACHED_SUCCESS)
     {
         cout<<"Delete key: "<<key<<", value: "<<value<<", sucessfully!"<<endl;
     }
     else
     {
        cout<<rc<<endl;
     }

    memcached_free(memc);
     return 0;
 }
 ```
## Code Compilation Link:
<code>g++ -o libmemcached libmemcached.cpp -lmemcached -std=c++0x -lpthread -lsasl2</code>
