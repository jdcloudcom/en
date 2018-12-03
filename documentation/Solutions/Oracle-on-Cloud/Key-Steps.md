# Main installation steps for JD Cloud Oracle RAC 11g

Oracle is the most widely used business-level database in the industry, and currently many users have the needs for using Oracle RAC on the Cloud. Therefore, this document provides the main steps about how to construct Oracle RAC 11g on JD Cloud through the virtual machine.

## 1. Installation Environment
- Virtual machines: 2 sets with 2-core and 8G configuration above; access to the Internet is required to install some necessary software
- Cloud disks: Above 100GB, and needs to support multi-points mounting
- Operating system environment: centos 6.5, 64-bit
- Database version: oracle 11.2.0.4

## 2. IP Programming

|Machine Name | Public IP | Private IP | VirtualIP|scan IP|
|-|-|-|-|-|
|oracle-rac1|10.10.10.101|192.168.100.101|10.10.10.103|10.10.10.105 scan-ip|
|oracle-rac2|10.10.10.102|192.168.100.102|10.10.10.104|10.10.10.105 scan-ip|

## 3. Install and Configure n2n
Since Oracle RAC requires network with multicast function, it is necessary to implement it in the Cloud with the help of n2n software

### 3.1 Install n2n
Execute the following command on both virtual machines
```
cd /usr/src
svn co https://svn.ntop.org/svn/ntop/trunk/n2n
cd n2n/n2n_v2
make
make PREFIX=/opt/n2n install
```

### 3.2 Configur and start n2n service

```
# Start supernode on the n2n server
/opt/n2n/sbin/supernode -l 65530

# Write in booting self-startup
echo "/opt/n2n/sbin/supernode -l 65530" >> /etc/rc.local
```

Two nodes run the client and write to /etc/rc.local

- **Node 1**
```
/opt/n2n/sbin/edge -d edge0 -a 10.10.10.101 -s 255.255.255.0 -c dtstack -k dtstack -l 10.0.0.32:65530 -E -r
/opt/n2n/sbin/edge -d edge1 -a 192.168.100.101 -s 255.255.255.0 -c dtstack -k dtstack -l 10.0.0.32:65530 -E -r
```

- **Node 2**
```
/opt/n2n/sbin/edge -d edge0 -a 10.10.10.102 -s 255.255.255.0 -c dtstack -k dtstack -l 10.0.0.32:65530 -E -r
/opt/n2n/sbin/edge -d edge1 -a 192.168.100.102 -s 255.255.255.0 -c dtstack -k dtstack -l 10.0.0.32:65530 -E -r
```

## 4. User and Directory Configuration
### 4.1 Creat users of grid and oracle
Execute the following command on both machines
```
/usr/sbin/groupadd -g 501 oinstall
/usr/sbin/groupadd -g 502 asmadmin
/usr/sbin/groupadd -g 503 dba
/usr/sbin/groupadd -g 504 oper
/usr/sbin/groupadd -g 505 asmdba
/usr/sbin/groupadd -g 506 asmoper
/usr/sbin/useradd -u 501 -g oinstall -G asmadmin,asmdba,asmoper,oper,dba grid
/usr/sbin/useradd -u 502 -g oinstall -G dba,asmdba,oper oracle
```

### 4.2 Configure parity
Configure passwordless access for two nodes
- **Node 1**
```
su - grid (oracle)
mkdir .ssh
chmod -R 700 .ssh
ssh-keygen -t rsa
ssh-keygen -t dsa
```

- **Node 2**
```
su - grid 
mkdir .ssh
chmod -R 700 .ssh
ssh-keygen -t rsa
ssh-keygen -t dsa
```

Execute on node 1
```
cat ~/.ssh/id_rsa.pub >> ~/.ssh/authorized_keys 
cat ~/.ssh/id_dsa.pub >> ~/.ssh/authorized_keys
ssh oracle-rac2 cat ~/.ssh/id_rsa.pub >> ~/.ssh/authorized_keys 
ssh oracle-rac2 cat ~/.ssh/id_dsa.pub >> ~/.ssh/authorized_keys
scp ~/.ssh/authorized_keys oracle-rac2:~/.ssh/authorized_keys
```

Verify that configuration is correct
```
ssh oracle-rac1 date (public network interface)
ssh oracle-rac2 date
ssh oracle-rac1 date (private network interface)
ssh oracle-rac2-priv date
```

### 4.3 Create directory
```
mkdir -p /u01/app/
mkdir -p /u01/app/grid_base
mkdir -p /u01/app/grid_home
chown -R grid:oinstall /u01/app/grid_base
chown -R grid:oinstall /u01/app/grid_home
chown -R oracle:oinstall /u01/app
chmod -R 775 /u01/app/
```

### 4.4 Configure environment variable
**Grid User**
```
vi ~/.bash_profile
umask 022
export ORACLE_BASE=/u01/app/grid_base
export ORACLE_HOME=/u01/app/grid_home
export ORACLE_SID=+ASM1 #the second node +ASM2
export PATH=/usr/sbin:$PATH
export PATH=$ORACLE_HOME/bin:$PATH
```

**Oracle User**
```
umask 022
export ORACLE_BASE=/u01/app/oracle
export ORACLE_HOME=$ORACLE_BASE/product/11.2.0/db_1
export ORA_GRID_HOME=/u01/app/grid_home
export ORACLE_UNQNAME=orcl 
export ORACLE_SID=orcl1 #the second node orcl2
export PATH=/usr/sbin:$PATH
export PATH=$ORACLE_HOME/bin:$PATH
export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:$ORACLE_HOME/lib:/usr/lib
export CLASSPATH=$ORACLE_HOME/JRE:$ORACLE_HOME/jlib:$ORACLE_HOME/rdbms/jlib
export NLS_LANG=AMERICAN_AMERICA.ZHS16GBK
export NLS_DATE_FORMAT="YYYY-MM-DD HH24:MI:SS"
export TNS_ADMIN=$ORACLE_HOME/network/admin
export LANG=en_US
```

### 4.5 Create swap
Execute under the root user
```
# Add file system
mkdir -p /home/oracle/myswaps
dd if=/dev/zero of=/home/oracle/myswaps/swapfile1 bs=1M count=2048
# Note: The path after “of” must not be under / dev, otherwise invalid parameter will be alarmed when swap files are activated.

# Create swap file
mkswap /home/oracle/myswaps/swapfile1

# Activate swap file
swapon /home/oracle/myswaps/swapfile1

# Add the following for vi /etc/fstab:
echo "/home/oracle/myswaps/swapfile1 swap swap defaults 0 0" >>/etc/fstab
```

## 5. Installation Dependent Package of oracle rac

### 5.1 Check the missing rpm packages
```
rpm -q binutils \
compat-libstdc++-33 \
elfutils-libelf \
elfutils-libelf-devel \
gcc \
gcc-c++ \
glibc \
glibc-common \
glibc-devel \
glibc-headers \
ksh \
libaio \
libaio-devel \
libgcc \
libstdc++ \
libstdc++-devel \
libXp \
make \
numactl-devel \
sysstat \
unixODBC \
unixODBC-devel \
compat-libcap1.x86_64 \
libcap.x86_64|grep not
```

For example, enter the following content to the above command
```
package compat-libstdc++-33 is not installed
package elfutils-libelf-devel is not installed
package ksh is not installed
package libaio-devel is not installed
package libXp is not installed
package numactl-devel is not installed
package sysstat is not installed
package unixODBC is not installed
package unixODBC-devel is not installed
package compat-libcap1.x86_64 is not installed
```

### 5.2 Deal with the missing base packages
```
yum install -y compat-libstdc++-33
yum install -y elfutils-libelf-devel
yum install -y ksh
yum install -y libaio-devel
yum install -y libXp
yum install -y numactl-devel
yum install -y sysstat
yum install -y unixODBC*
yum install -y compat-libcap1.x86_64
```
Two of the rpm packages have special handling of pdksh and cvuqdisk; one needs to be downloaded separately and the other needs to be found in the oracle installation medium

- pdksh
ksh is useless, and pdksh needs to be installed
```
rpm -ivh pdksh-5.2.14-21.x86_64.rpm
pdksh conflicts with ksh-20120801-37.el6_9.x86_64
rpm -e ksh-20120801-37.el6_9.x86_64
```
- cvuqdisk
It can be found in the Oracle installation medium
```
rpm -ivh cvuqdisk-1.0.9-1.rpm
Depend on: yum install -y smartmontools
```

Install related packages for asmlib; oracleasmlib, oracleasm-support, Kmod-oracleasm
```
rpm -ivh kmod-oracleasm-2.0.6.rh1-3.el6.x86_64.rpm
rpm -ivh oracleasm-support-2.1.8-1.el6.x86_64.rpm 
rpm -ivh oracleasmlib-2.0.4-1.el6.x86_64.rpm
```

## 6. System Parameter Setting

1. Modify kernel parameter
```
vi /etc/sysctl.conf
echo "fs.aio-max-nr = 1048576" >> /etc/sysctl.conf
echo "fs.file-max = 6815744" >> /etc/sysctl.conf
echo "kernel.shmall =7864320" >> /etc/sysctl.conf 
echo "kernel.shmmax = 52451655680" >> /etc/sysctl.conf
echo "kernel.shmmni = 4096" >> /etc/sysctl.conf
echo "kernel.sem = 250 32000 100 128" >> /etc/sysctl.conf
echo "net.ipv4.ip_local_port_range = 9000 65500" >> /etc/sysctl.conf
echo "net.core.rmem_default = 262144" >> /etc/sysctl.conf
echo "net.core.rmem_max = 4194304" >> /etc/sysctl.conf
echo "net.core.wmem_default = 262144" >> /etc/sysctl.conf
echo "net.core.wmem_max = 1048576" >> /etc/sysctl.conf
sysctl -p 
```

2. Modify user restriction
```
vi /etc/security/limits.conf
echo "oracle soft nofile 4096" >> /etc/security/limits.conf
echo "oracle hard nofile 65536" >> /etc/security/limits.conf
echo "oracle soft nproc 2047" >> /etc/security/limits.conf
echo "oracle hard nproc 16384" >> /etc/security/limits.conf
echo "oracle soft stack 10240" >> /etc/security/limits.conf
echo "grid soft nofile 4096" >> /etc/security/limits.conf
echo "grid hard nofile 65536" >> /etc/security/limits.conf
echo "grid soft nproc 2047" >> /etc/security/limits.conf
echo "grid hard nproc 16384" >> /etc/security/limits.conf
echo "grid soft stack 10240" >> /etc/security/limits.conf
echo "* soft memlock 18874368" >> /etc/security/limits.conf
echo "* hard memlock 18874368" >> /etc/security/limits.conf
```

3. Modify /etc/pam.d/login, and add the verification module
```
echo "session required pam_limits.so" >> /etc/pam.d/login
```

4. disable iptables and selinux
```
chkconfig --list iptables
chkconfig iptables off
chkconfig --list iptables
service iptables stop
service network restart
echo "SELINUX=disabled" >>/etc/selinux/config
```

5. disable ntp server
```
/sbin/service ntpd stop
chkconfig ntpd off
mv /etc/ntp.conf /etc/ntp.conf.bk
rm /var/run/ntpd.pid
```

6. Configure asmlib, and partition planning (6 partitions)
```
parted /dev/vdb mklabel gpt
parted /dev/vdb mkpart primary 0 10000 
parted /dev/vdb mkpart primary 10000 20000
parted /dev/vdb mkpart primary 20000 30000
parted /dev/vdb mkpart primary 30000 40000
parted /dev/vdb mkpart primary 40000 50000
parted /dev/vdb mkpart primary 50000 60000
parted /dev/vdb p
```

7. Configure asmlib
```
/usr/sbin/oracleasm configure -i # two nodes
/etc/init.d/oracleasm enable # two nodes
/etc/init.d/oracleasm start # two nodes
```

8. Create disk
```
/etc/init.d/oracleasm createdisk VOLCRS01 /dev/vdb1
/etc/init.d/oracleasm createdisk VOLCRS02 /dev/vdb2
/etc/init.d/oracleasm createdisk VOLCRS03 /dev/vdb3
/etc/init.d/oracleasm createdisk VOLDATA01 /dev/vdb4
/etc/init.d/oracleasm createdisk VOLDATA02 /dev/vdb5
/etc/init.d/oracleasm createdisk VOLDATA03 /dev/vdb6
/usr/sbin/oracleasm scandisks # After one node has created a disk, another node scans the disk
/usr/sbin/oracleasm listdisks #
```

## 7. grid Installation

1. Verify environmental
```
/home/grid/grid/runcluvfy.sh stage -pre crsinst -n oracle-rac1,oracle-rac2 -verbose 
```

2. Prepare the response file
```
ORACLE_HOSTNAME=oracle-rac1
INVENTORY_LOCATION=/u01/app/oraInventory
oracle.install.option=CRS_CONFIG
ORACLE_BASE=/u01/app/grid_base
ORACLE_HOME=/u01/app/grid_home
oracle.install.asm.OSDBA=asmdba
oracle.install.asm.OSOPER=asmoper
oracle.install.asm.OSASM=asmadmin
oracle.install.crs.config.gpnp.scanPort=1521
oracle.install.crs.config.clusterName=rac-cluster
oracle.install.crs.config.clusterNodes=oracle-rac1:oracle-rac1-vip,oracle-rac2:oracle-rac2-vip
oracle.install.crs.config.privateInterconnects=edge1:192.168.100.0:2,edge0:10.10.10.0:1 # 1 for public; 2 for private; 3 for not using the network interface in the cluster
oracle.install.crs.config.storageOption=ASM_STORAGE
oracle.install.asm.SYSASMPassword=Grid123
oracle.install.asm.diskGroup.name=OCR
oracle.install.asm.diskGroup.redundancy=NORMAL
oracle.install.asm.diskGroup.AUSize=1
oracle.install.asm.diskGroup.disks=/dev/oracleasm/disks/VOLCRS01,/dev/oracleasm/disks/VOLCRS02,/dev/oracleasm/disks/VOLCRS03
oracle.install.asm.diskGroup.diskDiscoveryString=/dev/oracleasm/disks
oracle.install.asm.monitorPassword=Grid123
```

3. Install grid
```
./runInstaller -silent -responseFile /home/grid/grid/response/grid_install_jdtest.rsp -ignoreSysPrereqs -ignorePrereq
```
After waiting for a period of time, it will give notification to execute with the root user respectively at each of the two nodes:
```
/u01/grid/oraInventory/orainstRoot.sh
/u01/crs/11.2.0/root.sh
```

4. After the grid installation is complete, view the output of the cluster resource as follows:
```
crs_stat -t
Name Type Target State Host 
# ------------------------------------------------------------
ora....ER.lsnr ora....er.type ONLINE ONLINE oracle-rac1 
ora....N1.lsnr ora....er.type ONLINE ONLINE oracle-rac1 
ora.OCR.dg ora....up.type ONLINE ONLINE oracle-rac1 
ora.asm ora.asm.type ONLINE ONLINE oracle-rac1 
ora.cvu ora.cvu.type ONLINE ONLINE oracle-rac1 
ora.gsd ora.gsd.type OFFLINE OFFLINE 
ora....network ora....rk.type ONLINE ONLINE oracle-rac1 
ora.oc4j ora.oc4j.type ONLINE ONLINE oracle-rac1 
ora.ons ora.ons.type ONLINE ONLINE oracle-rac1 
ora....SM1.asm application ONLINE ONLINE oracle-rac1 
ora....C1.lsnr application ONLINE ONLINE oracle-rac1 
ora....ac1.gsd application OFFLINE OFFLINE 
ora....ac1.ons application ONLINE ONLINE oracle-rac1 
ora....ac1.vip ora....t1.type ONLINE ONLINE oracle-rac1 
ora....SM2.asm application ONLINE ONLINE oracle-rac2 
ora....C2.lsnr application ONLINE ONLINE oracle-rac2 
ora....ac2.gsd application OFFLINE OFFLINE 
ora....ac2.ons application ONLINE ONLINE oracle-rac2 
ora....ac2.vip ora....t1.type ONLINE ONLINE oracle-rac2 
ora.scan1.vip ora....ip.type ONLINE ONLINE oracle-rac1 
crsctl check cluster -all
# **************************************************************
oracle-rac1:
CRS-4537: Cluster Ready Services is online
CRS-4529: Cluster Synchronization Services is online
CRS-4533: Event Manager is online
# **************************************************************
oracle-rac2:
CRS-4537: Cluster Ready Services is online
CRS-4529: Cluster Synchronization Services is online
CRS-4533: Event Manager is online
# **************************************************************
```

5. Create asmdisk group
```
su – grid
asmca -silent -createDiskGroup -sysAsmPassword Grid123 -diskString '/dev/oracleasm/disks/*' -diskGroupName DATA -diskList '/dev/oracleasm/disks/VOLDATA01' -redundancy EXTERNAL -compatible.asm 11.2 -compatible.rdbms 11.2
asmca -silent -addDisk -sysAsmPassword Grid123 -diskGroupName DATA -diskList '/dev/oracleasm/disks/VOLDATA02','/dev/oracleasm/disks/VOLDATA03'
```

6. View information:
```
select name,path,STATE,GROUP_NUMBER 
from v$asm_disk;
select name,state,type,total_mb,free_mb 
from v$asm_diskgroup;
```


## 8. Install oracle database software:

1. Verify before installation:
```
/home/grid/grid/runcluvfy.sh stage -pre dbinst -n oracle-rac1,oracle-rac2 -verbose
```

2. Compile the response file
```
vi u01/soft/oracle/database/response/db_install_jdtest.rsp
```

Modify reference:
```
oracle.install.option=INSTALL_DB_SWONLY
ORACLE_HOSTNAME=oracle-rac1
UNIX_GROUP_NAME=oinstall
INVENTORY_LOCATION=/u01/app/oraInventory
SELECTED_LANGUAGES=en
ORACLE_HOME=/u01/app/oracle/product/11.2.0/db_1
ORACLE_BASE=/u01/app/oracle
oracle.install.db.InstallEdition=EE
oracle.install.db.EEOptionsSelection=false
oracle.install.db.optionalComponents=oracle.rdbms.partitioning:11.2.0.4.0,oracle.oraolap:11.2.0.4.0,oracle.rdbms.dm:11.2.0.4.0,oracle.rdbms.dv:11.2.0.4.0,oracle.rdbms.lbac:11.2.0.4.0,oracle.rdbms.rat:11.2.0.4.0
oracle.install.db.DBA_GROUP=dba
oracle.install.db.OPER_GROUP=oinstall
oracle.install.db.CLUSTER_NODES=rac1,rac2
DECLINE_SECURITY_UPDATES=true
```

3. Execute silent installation of oracle software
```
./runInstaller -silent -ignoreSysPrereqs -ignorePrereq -responseFile /home/oracle/database/response/db_install_jdtest.rsp
```

4. Execute the following script according to notification:
```
/u01/app/oracle/product/11.2.0/db_1/root.sh
```


## 9. Install DB

1. Prepare the response file
```
vi /u01/soft/oracle/database/response/dbca_jdtest.rsp
```

2. Modify reference:
```
GDBNAME = "orcl"
SID = "orcl"
NODELIST=oracle-rac1,oracle-rac2
SYSPASSWORD = "Oracle123"
SYSTEMPASSWORD = "Oracle123"
STORAGETYPE=ASM
DISKGROUPNAME=DATA
RECOVERYGROUPNAME=DATA
CHARACTERSET = "ZHS16GBK"
```

3. Create database in silence
```
dbca -silent -responseFile /home/oracle/database/response/dbca_jdtest.rsp
```


Now that the installation is complete, the output for confirming the result is as follows:
```
[grid@oracle-rac1 ~]$ crs_stat -t
Name Type Target State Host 
------------------------------------------------------------
ora.DATA.dg ora....up.type ONLINE ONLINE oracle-rac1 
ora....ER.lsnr ora....er.type ONLINE ONLINE oracle-rac1 
ora....N1.lsnr ora....er.type ONLINE ONLINE oracle-rac1 
ora.OCR.dg ora....up.type ONLINE ONLINE oracle-rac1 
ora.asm ora.asm.type ONLINE ONLINE oracle-rac1 
ora.cvu ora.cvu.type ONLINE ONLINE oracle-rac1 
ora.gsd ora.gsd.type OFFLINE OFFLINE 
ora....network ora....rk.type ONLINE ONLINE oracle-rac1 
ora.oc4j ora.oc4j.type ONLINE ONLINE oracle-rac1 
ora.ons ora.ons.type ONLINE ONLINE oracle-rac1 
ora....SM1.asm application ONLINE ONLINE oracle-rac1 
ora....C1.lsnr application ONLINE ONLINE oracle-rac1 
ora....ac1.gsd application OFFLINE OFFLINE 
ora....ac1.ons application ONLINE ONLINE oracle-rac1 
ora....ac1.vip ora....t1.type ONLINE ONLINE oracle-rac1 
ora....SM2.asm application ONLINE ONLINE oracle-rac2 
ora....C2.lsnr application ONLINE ONLINE oracle-rac2 
ora....ac2.gsd application OFFLINE OFFLINE 
ora....ac2.ons application ONLINE ONLINE oracle-rac2 
ora....ac2.vip ora....t1.type ONLINE ONLINE oracle-rac2 
ora.orcl.db ora....se.type ONLINE ONLINE oracle-rac1 
ora.scan1.vip ora....ip.type ONLINE ONLINE oracle-rac1
crsctl status res -t
--------------------------------------------------------------------------------
NAME TARGET STATE SERVER STATE_DETAILS 
--------------------------------------------------------------------------------
Local Resources
--------------------------------------------------------------------------------
ora.DATA.dg
ONLINE ONLINE oracle-rac1 
ONLINE ONLINE oracle-rac2 
ora.LISTENER.lsnr
ONLINE ONLINE oracle-rac1 
ONLINE ONLINE oracle-rac2 
ora.OCR.dg
ONLINE ONLINE oracle-rac1 
ONLINE ONLINE oracle-rac2 
ora.asm
ONLINE ONLINE oracle-rac1 Started 
ONLINE ONLINE oracle-rac2 Started 
ora.gsd
OFFLINE OFFLINE oracle-rac1 
OFFLINE OFFLINE oracle-rac2 
ora.net1.network
ONLINE ONLINE oracle-rac1 
ONLINE ONLINE oracle-rac2 
ora.ons
ONLINE ONLINE oracle-rac1 
ONLINE ONLINE oracle-rac2 
--------------------------------------------------------------------------------
Cluster Resources
--------------------------------------------------------------------------------
ora.LISTENER_SCAN1.lsnr
1 ONLINE ONLINE oracle-rac1 
ora.cvu
1 ONLINE ONLINE oracle-rac1 
ora.oc4j
1 ONLINE ONLINE oracle-rac1 
ora.oracle-rac1.vip
1 ONLINE ONLINE oracle-rac1 
ora.oracle-rac2.vip
1 ONLINE ONLINE oracle-rac2 
ora.orcl.db
1 ONLINE ONLINE oracle-rac1 Open 
2 ONLINE ONLINE oracle-rac2 Open 
ora.scan1.vip
1 ONLINE ONLINE oracle-rac1
```
