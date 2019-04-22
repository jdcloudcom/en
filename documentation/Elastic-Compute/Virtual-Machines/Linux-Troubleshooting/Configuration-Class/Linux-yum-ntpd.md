# Linux system is configured with yum source and ntpd service 

**I. Configuration of yum Source**

**1. Centos7 System:**

Execute *vi /etc/yum.repos.d/CentOS-Base.repo*
, change the original content into the following content:

[base]
name=CentOS-$releasever - Base - mirrors.jdcloudcs.com
baseurl=http://mirrors.jdcloudcs.com/centos/$releasever/os/$basearch/
gpgcheck=1
gpgkey=http://mirrors.jdcloudcs.com/centos/RPM-GPG-KEY-CentOS-7

[updates]
name=CentOS-$releasever - Updates - mirrors.jdcloudcs.com
baseurl=http://mirrors.jdcloudcs.com/centos/$releasever/updates/$basearch/
gpgcheck=1
gpgkey=http://mirrors.jdcloudcs.com/centos/RPM-GPG-KEY-CentOS-7

[extras]
name=CentOS-$releasever - Extras - mirrors.jdcloudcs.com
baseurl=http://mirrors.jdcloudcs.com/centos/$releasever/extras/$basearch/
gpgcheck=1
gpgkey=http://mirrors.jdcloudcs.com/centos/RPM-GPG-KEY-CentOS-7

[centosplus]
name=CentOS-$releasever - Plus - mirrors.jdcloudcs.com
baseurl=http://mirrors.jdcloudcs.com/centos/$releasever/centosplus/$basearch/
gpgcheck=1
enabled=0
gpgkey=http://mirrors.jdcloudcs.com/centos/RPM-GPG-KEY-CentOS-7

[contrib]
name=CentOS-$releasever - Contrib - mirrors.jdcloudcs.com
baseurl=http://mirrors.jdcloudcs.com/centos/$releasever/contrib/$basearch/
gpgcheck=1
enabled=0
gpgkey=http://mirrors.jdcloudcs.com/centos/RPM-GPG-KEY-CentOS-7

wq saves the file and exits.

**2. Centos6 System:**

Execute *vi /etc/yum.repos.d/CentOS-6.repo*
, change the original content into the following content:

[base]
name=CentOS-$releasever - Base - mirrors.jdcloudcs.com
baseurl=http://mirrors.jdcloudcs.com/centos/$releasever/os/$basearch/
gpgcheck=1
gpgkey=http://mirrors.jdcloudcs.com/centos/RPM-GPG-KEY-CentOS-6

[updates]
name=CentOS-$releasever - Updates - mirrors.jdcloudcs.com
baseurl=http://mirrors.jdcloudcs.com/centos/$releasever/updates/$basearch/
gpgcheck=1
gpgkey=http://mirrors.jdcloudcs.com/centos/RPM-GPG-KEY-CentOS-6

[extras]
name=CentOS-$releasever - Extras - mirrors.jdcloudcs.com
baseurl=http://mirrors.jdcloudcs.com/centos/$releasever/extras/$basearch/
gpgcheck=1
gpgkey=http://mirrors.jdcloudcs.com/centos/RPM-GPG-KEY-CentOS-6

[centosplus]
name=CentOS-$releasever - Plus - mirrors.jdcloudcs.com
baseurl=http://mirrors.jdcloudcs.com/centos/$releasever/centosplus/$basearch/
gpgcheck=1
enabled=0
gpgkey=http://mirrors.jdcloudcs.com/centos/RPM-GPG-KEY-CentOS-6

[contrib]
name=CentOS-$releasever - Contrib - mirrors.jdcloudcs.com
baseurl=http://mirrors.jdcloudcs.com/centos/$releasever/contrib/$basearch/
gpgcheck=1
enabled=0
gpgkey=http://mirrors.jdcloudcs.com/centos/RPM-GPG-KEY-CentOS-6

wq saves the file and exits.

**3. Ubantu System:**

Execute *vi /etc/apt/sources.list*
, change the original content into the following content:

deb http://mirrors.jdcloudcs.com/ubuntu/ xenial main restricted

deb http://mirrors.jdcloudcs.com/ubuntu/ xenial-updates main restricted

deb http://mirrors.jdcloudcs.com/ubuntu/ xenial universe

deb http://mirrors.jdcloudcs.com/ubuntu/ xenial-updates universe

deb http://mirrors.jdcloudcs.com/ubuntu/ xenial multiverse

deb http://mirrors.jdcloudcs.com/ubuntu/ xenial-updates multiverse

deb http://mirrors.jdcloudcs.com/ubuntu/ xenial-backports main restricted universe multiverse

deb http://mirrors.jdcloudcs.com/ubuntu/ xenial-security main restricted

deb http://mirrors.jdcloudcs.com/ubuntu/ xenial-security universe

deb http://mirrors.jdcloudcs.com/ubuntu/ xenial-security multiverse

wq saves the file and exits.

**II. Configuration of ntpd Service**

**1. Adjust ntpd Configuration File:**

Execute *vi /etc/ntp.conf*, change the original content to the following content:

driftfile /var/lib/ntp/drift

pidfile /var/run/ntpd.pid

logfile /var/log/ntp.log

#Access Control Support

restrict default kod nomodify notrap nopeer noquery

restrict -6 default kod nomodify notrap nopeer noquery

restrict 127.0.0.1

#local clock

server 127.127.1.0

fudge 127.127.1.0 stratum 10

#jdcloud ntp server

server ntp.jdcloudcs.com iburst minpoll 4 maxpoll 10

fudge ntp.jdcloudcs.com stratum 2

wq saves the file and exits.

**2. Enable ntpd Service:**

Execute *services ntpd start* (Centos6 System)

Execute *systemctl start ntpd* (Centos7 System)

Execute *services ntpd start* (Ubantu System)

**3. Set booting self-startup service:**

Execute *chkconfig ntpd on* (Centos6 System)

Execute *systemctl enable ntpd* (Centos7 System)

Execute *chkconfig ntpd on* (Ubantu System, it is required to install first by using apt-get install chkconfig)
