# Creation Specification

The creation specification is a compiling script used for creating commands and relevant settings, which is in the YAML format. You may place the creation specification scripts in the source code or define the same as creating projects. If the source code contains the creation specification, the creation specification file must be named as build.yml and placed in the root directory of the source directory.

The creation specification syntax is as follows:

```
envs:
name: TEST_ENV
value: test
cmds:
name: who
cmd: id
name: see
cmd: pwd
name: build
cmd: ./build.sh
out_dir: output
```

