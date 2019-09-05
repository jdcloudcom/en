# Python WSGI Web Service Migration to Function Service

## What is WSGI
Full name of WSGI is: Web Server Gateway Interface. WSGI defines the interaction between Web server and Python application program, which enables the Web application program written by Python can connect to Web server. The latest official version is defined in [PEP-3333](https://www.python.org/dev/peps/pep-3333) of Python.

## Function Service and WSGI
The application function of a user can both be completely implemented by itself and developed based on the web framework of WSGI.
Many Frameworks are based on WSGI protocol now, commonly including Flask, Django and so on. For details, please refer to [Frameworks that run on WSGI](https://wsgi.readthedocs.io/en/latest/frameworks.html).

### Function Service Python API supports WSGI

Function Service has built in the database jdcloud_wsgi_wrapper converting API Gateway trigger event to WSGI, which will convert the event of API Gateway to WSGI protocol format by quoting the wsgi_run function in jdcloud_wsgi_wrapper and run the application program.

Refer to the following user writing entry functions of the function by application or similar ways:

```Python
from jdcloud_wsgi_wrapper import wsgi_run


def application(environ, start_response):
    print(environ['function.event'])
    print(environ['function.context'])

    status = "200 OK"
    path = environ["PATH_INFO"]
    print(path)
    length = int(environ["CONTENT_LENGTH"], 0)
    body = environ["wsgi.input"].read(length)
    print(body)
    response_headers = [('Content-type', 'text/plain')]

    start_response(status, response_headers)
    return ['Function : My Own Hello World!']


class AppClass:
    def __init__(self, environ, start_response):
        self.environ = environ
        self.start_response = start_response

    def __iter__(self):
        self.start_response('200 OK', [('Content-type', 'txt/plain')])
        yield "Hello World"


def handler(event, context):
    result = wsgi_run(event, context, AppClass)
    return result

```

### Migrate django framework service to Function Service

#### step1: virtualenv development code migration
In the development environment using virtualenv, use pip freeze to view the dependencies of the code and package the dependency package and source code.
Here we take the code imported to beatifulsoup database as example. The specific operations are as follows:

```Shell
➜  dev$ mkdir venv-test
➜  dev$ cd venv-test
➜  venv-test$ virtualenv --no-site-packages venv
➜  venv-test$ . ./venv/bin/activate
(venv) ➜  venv-test$ pip install beautifulsoup4
(venv) ➜  venv-test$ vim test.py
from bs4 import BeautifulSoup
soup = BeautifulSoup("<p>Some<b>bad<i>HTML",features="html.parser")
print(soup.prettify())
(venv) ➜  venv-test$ pip freeze
beautifulsoup4==4.7.1
soupsieve==1.9.2
(venv) ➜  venv-test$ cp -R venv/lib/python3.7/site-packages/bs4  .
(venv) ➜  venv-test$ cp -R venv/lib/python3.7/site-packages/soupsieve .
(venv) ➜  venv-test$ zip -r  code.zip bs4  soupsieve test.py

```
code.zip is uploaded to the Function Service as a program package, including:

* Source code: test.py
* Dependency database: bs4 soupsieve

#### step2: django code migration
Execute the following file pack.sh under the project directory, including:

1. Modify the project to the django project name;

2. LIBPATH is the dependency package directory under the virtualenv path.

pack.sh should complete the following tasks:

1. Generate index.py as the entry function of the Function Service;

2. Package the code and dependency package as code.zip and upload it as a code package of the Function Service.

```Shell
#!/bin/bash
export PROJECT=mysite
export LIBPATH=venv/lib/python3.7/site-packages
 
cat << EOF > index.py
import sys,os
sys.path.append(os.path.dirname(os.path.abspath(__file__))+'/' + '$PROJECT')
sys.path.append(os.path.dirname(os.path.abspath(__file__))+'/' + '$LIBPATH')
 
from $PROJECT.wsgi  import application as app
from jdcloud_wsgi_wrapper import wsgi_run
def handler(event, context):
    result=wsgi_run(event, context, app)
    return result
EOF
 
ZIPFILE="index.py "$PROJECT" "
require=`pip freeze $PROJECT | awk -F'==' '{print tolower($1)}'`
for i in $require
do
    ZIPFILE=$ZIPFILE" "$LIBPATH"/"$i" "
done
echo $ZIPFILE
zip -r -q code.zip  $ZIPFILE

```

index.py function is as follows:

```Python
import sys,os
sys.path.append(os.path.dirname(os.path.abspath(__file__))+'/' + 'mysite')
sys.path.append(os.path.dirname(os.path.abspath(__file__))+'/' + 'venv/lib/python3.6/site-packages')
 
from mysite.wsgi  import application as app
from jdcloud_wsgi_wrapper import wsgi_run
def handler(event, context):
    result=wsgi_run(event, context, app)
    return result

```

#### step3: Create a function and configure a trigger for verification
1. Create a function on JD Cloud Function Service Console and upload code.zip code package; the entry function is index.handler.
![创建函数](https://github.com/jdcloudcom/cn/blob/function3/image/Elastic-Compute/functionservice/apigw%E8%A7%A6%E5%8F%91%E5%99%A8-wsgi-1.png) 

2. Configure a test event for Console test; once the code expectation is met, configure API Gateway trigger and verify the trigger execution result. For configuration steps and methods, please refer to [How to use API Gateway trigger](../use-cases/apig-case.md).
![apigw触发器](https://github.com/jdcloudcom/cn/blob/function3/image/Elastic-Compute/functionservice/apigw%E8%A7%A6%E5%8F%91%E5%99%A8-wsgi-3.png) 

Open the link in browser and the execution result is returned as follows:

![验证触发器执行](https://github.com/jdcloudcom/cn/blob/function3/image/Elastic-Compute/functionservice/apigw%E8%A7%A6%E5%8F%91%E5%99%A8-wsgi-2.png) 

Doing the above can quickly complete code migration and verification.

In a similar way, you can transfer the service code from flask framework to the Function Service. You only need to package the service code and dependency and upload them to the Function Service, and then modify the entry function to complete the conversion of event of API Gateway to WSGI function format. With reference to the index.py function in step2, you can immediately complete the service migration.




