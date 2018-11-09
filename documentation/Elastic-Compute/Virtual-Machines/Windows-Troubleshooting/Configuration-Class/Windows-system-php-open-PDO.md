# Open PDO for php in Windows System
1. Open the php.ini file

2. Once the file is opened, search for *extension=php_pdo.dll* and *extension=php_pdo_mysql.dll* and remove the comment of the front ";". 

The final two lines of configuration are as follows: 


***extension=php_pdo.dll*** 

***extension=php_pdo_mysql.dll***

3. Restart apache or iis service

4. Create a new PHP test with content:


<?php

phpinfo();

?>

You can test if the PDO module is enabled.



If your problem still can not solved, please submit open ticket to us.
