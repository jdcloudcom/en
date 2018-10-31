
# FAQ

## 1. How to get AccessKey and SecretKey?

Refer to "Precondition Section" in JD Cloud OpenAPI Help page: https://www.jdcloud.com/help/detail/355/isCatalog/0



## 2. How to select RegionId?

Refer to "Regional Coding Section" in JD Cloud OpenAPI Help page:https://www.jdcloud.com/help/detail/355/isCatalog/0



## 3. Does the CLI Command Line Open Source?

JD Cloud CLI is open-source and can be downloaded from GitHub. Address: https://github.com/jdcloud-api/jdcloud-cli



## 4. What to do when an error is returned?

Print details using the overview option debug and feed back to the issue of the GitHub library of the JD Cloud CLI, or open ticket in JD Cloud.

Example:

	jdc --debug command sub-command
   

## 5. Is the CLI charged?

Free charge for now.



## 6. How to feedback and ask for help when you encounter problems?

Open ticket in JD Cloud Console

Refer to the contact information on Contact Us page of JD Cloud official website for feedback and the address is https://www.jdcloud.com/help/detail/129/isCatalog/1

Submit Issue at GitHub, Address: https://github.com/jdcloud-api/jdcloud-cli/issues



## 7. How to install JD Cloud Python SDK?

Pip Installation


	pip install jdcloud_sdk
 This command relates to install the latest version, and specifies a version for installation. Please refer to the following example. The same to CLI installation, it's not described in detail.

	pip install jdcloud_sdk==1.1.2
   

Source Code Installation

Download Address: https://github.com/jdcloud-api/jdcloud-sdk-python

After unzipping, it is performed in the project directory:

	python setup.py install
It is recommended to download a stable version of the releases by version number.