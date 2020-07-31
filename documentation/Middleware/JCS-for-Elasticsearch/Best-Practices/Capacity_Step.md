## : Performance Test Steps
By virtual of geonames (size: 3.3G, total 11,396,505 docs) and the benchmark rally scrips provided by Elasticsearch officially, we have conducted pressure test to JCS for Elasticsearch of JD (V6.7.0) in cn-north-1. Different [Specifications of JCS for Elasticsearch](https://docs.jdcloud.com/en/jcs-for-elasticsearch/specifications) have different cluster performances.


## Test Environment
- All tests are finished in Availability Zone A in cn-north-1
- Specification of testing Virtual Machines: 8C 32GB
- Images of Virtual Machines for testing: CentOS 7.4 64-bit
- Elasticsearch version for testing: V6.7.0

## Testing Tool
### rally
[rally](https://github.com/elastic/rally) is an official open source pressure test tool for es, which is provided by elastic and implemented based on python3. Main functions of rally are as follows:</br>
- Automatic creation, pressure measurement, destroy of ES cluster</br>
- Pressure test data and scheme can be managed by ES versions</br>
- Completely display pressure data, support data comparison and analysis between different pressure tests and store data in assigned ES for secondary analysis</br>
- Collection of JVM details is supported, including memory, GC and other data for positioning performance issues</br>

## Install rally

### Prerequisite
- Python3.5 and above versions
- git1.9 and above versions
- JDK 1.8 and above versions
- Install Python3.7

### Install Python3.7

**Step 1**: Install developer tools

```
yum -y groupinstall "Development Tools"
```

**Step 2**: Install Python compiler-reliant packet

```
yum -y install openssl-devel zlib-devel bzip2-devel sqlite-devel readline-devel libffi-devel systemtap-sdt-devel
```

**Step 3**: Download installation package

```
wget https://www.python.org/ftp/python/3.7.0/Python-3.7.0.tgz
```

**Step 4**: Decompress and install

```
tar zvxf Python-3.7.0.tgz -C /usr/local/

cd Python-3.7.0

./configure --prefix=/usr/local/python3.7

make

make install
```

**Step 5**: Create soft link files to execution file path

```
ln -s /usr/local/python3.7/bin/python3 /usr/bin/python3

ln -s /usr/local/python3.7/bin/pip3 /usr/bin/pip3
```

**Step 6**: Configure environment variable

Add the following two environmental variables in the /etc/pfofile file:

```
export PYTHON37_HOME=/usr/local/python3.7

export PATH=${PYTHON37_HOME}/bin:${PATH}
```

Execute source /etc/pfofile

**Step 7**: Verify if installation succeeds

```
python3 --version
```


### Install git2.5.5

**Step 1**: Unload low version git

```
yum remove git
```

**Step 2**: Install relevant dependency


```
yum install curl-devel expat-devel gettext-devel openssl-devel zlib-devel asciidoc

yum install gcc perl-ExtUtils-MakeMaker
```

**Step 3**: Download git 2.5.5

```
wget https://mirrors.edge.kernel.org/pub/software/scm/git/git-2.5.5.tar.gz
```

**Step 4**: Decompress and install

```
tar -xzvf git-2.5.5.tar.gz

cd git-2.5.5

./configure --prefix=/usr/local/git --with-openssl=/usr/local/openssl

make && make install
```

**Step 5**: Configure environment variable

Add the following two environment variables in the /etc/pfofile file

```
export GIT_HOME=/usr/local/git/bin

export PATH=$PATH:$GIT_HOME
```

Execute source /etc/pfofile

**Step 6**: View git version

```
git --version
```


### Install JDK1.8

```
yum install java-1.8.0-openjdk* -y
```



### Install the esrally tool

```
pip3 install esrally==1.0.0  //Official Document https://esrally.readthedocs.io/en/stable/install.html

esrally configure    //Detailed Official Configuration https://esrally.readthedocs.io/en/stable/configuration.html
```


## Testing Command

```
#test mode
esrally --test-mode --target-hosts=es-nlb-XXX.jvessel-open-hb.jdcloud.com:9200 --pipeline=benchmark-only
 
#geonames
esrally  --track=geonames --target-hosts=es-nlb-XXX.jvessel-open-hb.jdcloud.com:9200  --pipeline=benchmark-only
```
