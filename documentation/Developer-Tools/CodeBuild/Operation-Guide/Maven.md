Use Apache Maven for construction of Java project and the example of build.yml is as follows:


```
cmds:
  - name: 'Packing, skip unit test; check update at each time of construction'
    cmd: 'mvn package -Dmaven.test.skip=true  -U'
  - name: 'Copy construction results from specified directory to output directory'
    cmd: 'cp -rf target/demo-1.0-SNAPSHOT-all output'
    
# The compilation product storage directory is the required item
out_dir: 'output'

```
