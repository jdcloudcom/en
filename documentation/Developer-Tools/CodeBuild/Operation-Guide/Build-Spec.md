# Creation Specification

The creation specification is a compiling script used for creating commands and relevant settings, which is in the YAML format. You may place the creation specification scripts in the source code or define the same as creating projects. If the source code contains the creation specification, the creation specification file must be named as jdcloud-build.yml and placed in the root directory of the source directory.

The creation specification syntax is as follows:

```
---
# Set environment variable
#envs:
#  - name: 'name1' Name of Environment Variable
#    value: 'value1' Value of Environment Variable
#  - name: 'name2' Use list method to set multiple values
#    value: 'value2'

# Set compilation command
#cmds: 
#  - name: 'do make'  Compile step name
#    cmd: 'make'      Compile command, which is executed under path of PATH by default while others shall be provided with absolute paths
#  - name: 'do install'
#    cmd: 'make install'
cmds:
  - name: 'make output dir'
    cmd: 'mkdir -p output bin var src'
  - name: 'copy to output dir'
    cmd: 'cp -r bin var src output'

# Package-extracting path is the required choice
out_dir: 'output'
```

