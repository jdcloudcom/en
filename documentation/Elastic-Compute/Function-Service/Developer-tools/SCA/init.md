# Initialization Project

By initializing projects, users can quickly create a simple template, including code file and configuration file, which can be further configured and developed based on the template and directly packed and deployed to the cloud.

## Initialization Command  

`sca init`

## Parameter Description


| Abbreviation | Parameter       | Required | Description                                                         | Example           |
| ---- | ---------- | ---- | ------------------------------------------------------------ | -------------- |
| -n   | name       | N    | Generated Project Name. If no value is filled in, the default value is testproject.                   | hello-world    |
| -r   | runtime    | N    | Optional values of generated project running environment are python2.7, python3.6 and 3.7. The default value is python3.6 | python2.7      |
| -o   | output-dir | N    | Appoint project generation directory. The existing directory is the default one.                         | /root/sca/code |

## Use Example  
Create an item in the name of helloworld under the directory /home/xxx/sca, which is python 3.6 at the running time.    
```
$ scf init --runtime python2.7 --name testproject --output-dir /Users/xxx/code/scf/
[+] Initializing project...
Template: gh:NevenMoore/demo-python
Output-Dir: /Users/xxx/code/scf/
Project-Name: testproject
Runtime: python2.7
[*] Project initialization is complete

$ tree /Users/xxx/code/scf/testproject
/Users/xxx/code/scf/testproject
├── README.md
├── main.py
└── template.yaml

1 directory, 3 files
```


