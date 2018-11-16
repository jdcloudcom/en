# Image from Third Party Production Specifications

1. System Component Security
1.1 Basic requirements
a) No pirated or cracked programs are allowed

b) No malicious programs such as Trojan horse backdoors, hang-ups, mining, etc.

c) Security vulnerabilities that are public, available, and have fixes are not allowed.

d) Distributions that have been officially stopped for maintenance, such as Debina6, CentOS4, and Win2003, are not allowed.

e) All official security updates must be installed when making image.

f) Ensure that the Endpoint Security System is installed and powered on.

1.2 Operation suggestions
Install the security update:

a) Windows: Make sure the latest update is installed

b) Ubuntu: Update with the apt update && apt upgrade command

c) CentOS: Automatically update with the yum update command

Check Endpoint Security Status:

a) Windows: Task Manager -> Process, check if there is a jdcloudhids process

b) Linux: ps - ef  | grep jdcloudhids, check if there is a jdcloudhids process

1.3 Important component safety
The components listed below must ensure that no vulnerabilities are exploited:

a) Boot, kernel level: grub, kernel, initramfs, sysvinit, systemd, efistub, etc.

b) run dependent libraries: libc6, glibc, libssl (openssl), libgnutls, OpenJDK, SunJDK, libtomcat, libxml, libgd, libpng, zlib, libpython, libkrb, libkrb, libcup, libfuse, libdbus, etc.

c) Common user mode programs: openssh, sshfs, shell (bash, zsh, csh, dash...), ftp, wget, curl, tar, gzip, sudo, su, ppp, rsync, fcitx, exim, apt, dpkg, rpm, yum, and dnf, etc.

2. Third-party Component Security
2.1 Basic requirements
a) Security vulnerabilities that are public, available, and have fixes are not allowed.

b) Software revision series that have been stopped for maintenance, such as PHP 5.2, 5.3, 5.4, 5.6, Mysql 5.1, tomcat6 and above, are not allowed.

c) When making image, third-party components should use the latest stable revision at the time.

d) Please download the software through the official channel, do not download it through the unofficial site, in case it is implanted in the back door.

3. System Configuration Security
4.1 Basic requirements
a) Rational configuration of system security updates (configuration of image source)

b) It is forbidden to use weak password, please use random character as the default password of various programs.

c) The system password must have a certain length and complexity (at least 8 digits, including uppercase letters, lowercase letters, special symbols, numbers).

d) Non-essential SUID privilege procedures are not allowed.

e) Reasonable configuration of system key directory permissions, such as /etc, /bin, ~/.ssh, etc.

f) Except for the /tmp directory, other directories do not allow 777 permissions.

g) The default Log Service is guaranteed to run normally, such as dmesg, syslog, wtmp, btmp, and sudo.

h) Non-public service ports are not open to the extranet (such as redis 6379, mongodb 27017, etc.), only open what is required.

4. Security Testing
4.1. Security testing principle
a) The principle does not allow for the existence of security vulnerabilities with known public fixes.

b) Security vulnerabilities above the official rating of "medium-risk" are not allowed.

c) Security vulnerabilities that could lead to user information disclosure, denial of service, service crashes, remote command execution, and machine control are not allowed.

d) The access rights of various services should be correctly configured, and security vulnerabilities such as redis unauthorized access and MongoDB weak passwords are not allowed.

e) The existence of procedures whose origin is unknown or where the ISV cannot prove other specific uses is not allowed

f) Information that is not necessary for production environment such as test account and test data is not allowed.

g) All temporary data generated when the image is configured should be cleared.

h) Safety test will check the implementation of the aforementioned safety specifications. For the problems found in the process of safety test, it will refuse to pass the safety test link of the third party image. If the case is serious, it will be taken seriously according to relevant regulations.
