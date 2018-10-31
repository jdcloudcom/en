# SSH Service Change Port



ssh logs in to the server and executes command.


*vi /etc/ssh/sshd_config*

Find the following configuration information:


*#Port 22*

*#AddressFamily any*

*#ListenAddress 0.0.0.0*

*#ListenAddress ::*

Add the changed ssh service port after Port, and remove # in the front to make it take effect. For example


*Port 2203*

Save the file, restart the sshd service, and execute


*service sshd restart*


If your problem still can not solved, please submit open ticket to us.
