# Python client: bmemcached
## Client Code Address: 
https://github.com/jaysonsantos/python-binary-memcached?spm=a2c4g.11186623.2.5.cAIpTa
## Client Version Introduction:
https://github.com/jaysonsantos/python-binary-memcached/releases?spm=a2c4g.11186623.2.4.cAIpTa 
## bmemcached installation:
<code>pip install python-binary-memcached</code>
## Python Code Example:
```
#!/usr/bin/env python
import bmemcached

if __name__ == '__main__':
client = bmemcached.Client(('ip:port',), 'username', 'password’) #No user name and password are required under mode that does not require password
client.set('test1', 'value1')
    print (client.get('test1'))
    client.add('test2', 'value2')
    print(client.get('test1'))
    client.replace('test1', '1')
    client.incr('test1', 1)
    client.decr('test1', 1)
    _, cas = client.gets('test1')
    client.cas('test1', 11, cas)
    dictMap = {'a': '1', 'b': '2', 'c': '3'}
    client.set_multi(dictMap)
    keys = ['a', 'b', 'c']
print (client.get_multi(keys))
```
