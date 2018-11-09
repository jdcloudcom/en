# Go Client: gomemcache (the client does not support connection with password)
## Client Introduction:
https://godoc.org/github.com/bradfitz/gomemcache/memcache 
## Download client package to GOPATH:
<code>go get github.com/bradfitz/gomemcache/memcache</code>
## Go Code Example:
```
package gomemcached

import (
	"fmt"
	"github.com/bradfitz/gomemcache/memcache"
)

func main() {
	mc := memcache.New("ip:port")//Cluster version clients can be implemented by adding ip: port of multiple instances
	mc.Set(&memcache.Item{Key: "key", Value: []byte("value")})

	it, err := mc.Get("key")
	if err != nil {
		panic(err)
	}

	fmt.Printf("Value: %s", it.Value)
}
```
