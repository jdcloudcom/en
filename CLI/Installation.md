
#Installation #

The CLI is currently supported on Linux, macOS, and Windows systems.

##Installation Instructions ##

JD Cloud CLI is developed based on Python language and JD Cloud Python SDK. Please install Python 2.7 before using the CLI. * Version. Visit, download, and install the Python 2.7. * Version from the official website.

The JD Cloud Python SDK does not have to be installed manually, and the Python package administration tool automatically downloads and installs the corresponding version of the dependency package. If you have installed the JD Cloud Python SDK and do not work properly because the CLI version does not correspond to it, refer to the version correspondence table in the “CLI use instructions”, install the corresponding version, or delete the old Python SDK and reinstall the CLI.

  

## Python 2.7 Installation ##

Download and install: https://www.python.org/downloads

Operating System Package Administrative Tools Installation

CentOS  


	yum install python


Ubuntu


	apt-get install python2.7


macOS


	brew install python@2


## Installation of Pip ##

For installation, refer to: https://pip.pypa.io/

The specific command is 

	curl https://bootstrap.pypa.io/get-pip.py -o get-pip.py
	python get-pip.py


To install the pip using the Linux distribution package administration tools, refer to the installation method:

https://packaging.python.org/guides/installing-using-linux-tools/#installing-pip-setuptools-wheel-with-linux-package-managers



## CLI Installation ##

## Linux & macOS Installation ##

- pip Installation (Recommended)


	pip install jdcloud_cli


- Source Code Installation

Download Address: https://github.com/jdcloud-api/jdcloud-cli

After unzip, it is performed in the project directory:


	python setup.py install


- Open Bash auto-completion

The CLI's auto-completion feature can be turned on by executing the following command.


	echo 'eval "$(register-python-argcomplete jdc)"' >> .bashrc
	echo 'export COLUMNS=100' >> .bashrc
	source ~/.bashrc


The AutoComplete feature greatly improves the efficiency of CLI use and recommends installation. Once configured, the prompt for the corresponding command can be ejected by entering the tab key twice. The effect is shown below. 

	Bash-3.2$ jdc configure [tab][tab]
	--help    --version   -v       delete        show-current
	--output  -h          add      show-all      use


### Windows Installation ###

JD Cloud CLI is running on Windows relying on Git 2.9. 0 and above version. It is recommended to use the latest version. The download address is: https://git-scm.com/download/win

Note: When installed, the analog terminal option selects the **Use MinTTY (the default terminal of MSYS2)**.

                                               


- pip Installation


	pip install jdcloud_cli


- Source code installation (not dependent on pip)


	python setup.py install


- Open Bash auto-completion

After installation, perform the following scripts in the git bash:

	curl https://raw.githubusercontent.com/jdcloud-api/jdcloud-cli/master/jdcloud_cli/resources/jdc.rc > ~/jdc.rc
	echo 'source ~/jdc.rc' >> ~/.bashrc
	echo 'export PYTHONIOENCODING="UTF-8"' >> ~/.bashrc
	source ~/.bashrc


## Uninstalling CLI ##


	pip uninstall jdcloud_cli


## Upgrade CLI ##

Use the following command to upgrade to the latest version.

	pip install --upgrade jdcloud_cli
