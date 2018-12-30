# Creation Specification

The creation specification is a compiling script used for creating commands and relevant settings, which is in the YAML format. You may place the creation specification scripts in the source code or define the same as creating projects. If the source code contains the creation specification, the creation specification file must be named as build.yml and placed in the root directory of the source directory.

The creation specification syntax is as follows:

```
cmds:
  - name: 'list current dir'
    cmd: 'ls'
  - name: 'make output dir'
    cmd: 'mkdir -p output'
  - name: 'touch some files'
    cmd: 'touch a b c'
  - name: 'copy to output dir'
    cmd: 'cp a b c output'

# Package-extracting path is the required choice
out_dir: 'output'
```

