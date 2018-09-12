# Permission to Modify File Directory of Linux System

There are nine basic permissions for Linux files. They are owner/group/others and each has its own read/write/execute permission.

For example: the permission character of the file is -rwxrwxrwx. These nine permissions are ternary! Among them, we can use figures to represent each permission, and the score comparison table of each permission is as follows:

r:4 　　w:2　　　x:1



The scores of the three permissions (r/w/x) for each identity (owner/group/others) need to be accumulated, for example, when the permissions is: [-rwxrwx---], the score is:

owner = rwx = 4+2+1 = 7

group = rwx = 4+2+1 = 7

others= --- = 0+0+0 = 0



So when we set the permission change, the permission figure of the file is 770! The syntax of command chmod to change the permission is like this:


*[root@www ~]# chmod [-R] xyz* 

File or directory Options and parameters: xyz : is the permission attribute of the numeric type just mentioned, which is the sum of the values ​​of the rwx attribute. -R : Make continuous changes of recursive, that is, all files in the sub-directory will be changed together.


For example, if you want to enable all permissions for the .bashrc file, then execute:


*[root@www ~]# ls -al .bashrc* 

*-rw-r--r-- 1 root root 395 Jul 4 11:45 .bashrc* 

*[root@www ~]# chmod 777 .bashrc* 

*[root@www ~]# ls -al .bashrc* 

*-rwxrwxrwx 1 root root 395 Jul 4 11:45 .bashrc*


If to change the permission into -rwxr-xr--? Then the score of the permission becomes [4+2+1][4+0+1][4+0+0]=754! Then execute:


*[root@www ~]# chmod 754 filename*


If your problem still can not solved, please submit open ticket to us.
