Use Npm Software Package Management System to manage software packages and the example of jdcloud-build.yml is as follows:

```
cmds:
  - name: 'Load dependence'
    cmd: 'npm install'
  - name: 'Copy construction results from specified directory to output directory'
    cmd: 'cp -rf bin output'
    
# The compilation product storage directory is the required item
out_dir: 'output'

```
