- ### I.    Applicable Scope

  Endpoint Security product is only applicable to JD Cloud virtual machines and it is not applicable to both virtual machines of other cloud vendors and physical machines. Please confirm that Endpoint Security package is installed and running on JD Cloud virtual machines.

  ### II.    Official Download Link

  1. The download link of Installation Manual of Endpoint Security: <https://hids.oss.cn-east-1.jcloudcs.com/hips_manual.docx>

  2. Internet download link:

  Windows client:

  Internet access domain name:<https://hids.oss.cn-east-1.jcloudcs.com/jcloudhids_v1.0_Installer.exe>

  64-bit Linux client:

  Internet access domain name: <https://hids.oss.cn-east-1.jcloudcs.com/jcloudhids_linux64_V1.0.tar.gz>

  \3. Intranet download link:

  Windows client:

  Intranet access domain name:<https://hips.jdcloud.com/jcloudhids_v1.0_Installer.exe>

  64-bit Linux client:

  Intranet access domain name:<https://hips.jdcloud.com/jcloudhids_linux64_v1.0.tar.gz>

  ### III. Installation Instructions for Windows System

  1. Get software:

  Please confirm that the Endpoint Security software package has been downloaded on the virtual machines, shown as in Figure 1:

  ![img](https://img1.jcloudcs.com/cms/52a493d5-3005-41e0-92ae-a7ad111529ad20170626123325.png)

  Figure 1

  2. Double click the downloaded software. Shown as in Figure 2

  ![img](https://img1.jcloudcs.com/cms/c9183ecf-3b5b-4f5e-a73c-409335a2c4f820170626123537.png)

  Figure 2

  3. Click “Running” button. Follow the notification to click “Next” button, shown as in Figure 3:

  ![img](https://img1.jcloudcs.com/cms/a3de1bf9-06a9-49c9-b2a1-5e2c5001fd9620170626123726.png)

  Figure 3

  4.   Click “I accept” button, shown as in Figure 4:

  ![img](https://img1.jcloudcs.com/cms/88deb22d-1655-4ffd-b773-5f3b479dcd3020170626123833.png)

  Figure 4

  5. You may choose the installation path, then click “Next” button, shown as in Figure 5:

  ![img](https://img1.jcloudcs.com/cms/b701a89a-e0fb-4972-bed5-74b4b11b18d020170626123916.png)

  Figure 5

  6.    Select “Start Menu” folder, click “Install” button, shown as in Figure 6:

  ![img](https://img1.jcloudcs.com/cms/f7cbee27-3029-4c6c-9bc3-999c22f6b70620170626124000.png)

  Figure 6

  7.    The program begin to be installing, shown as in Figure 7:

  ![img](https://img1.jcloudcs.com/cms/d969ef9b-53b1-479f-8293-9f5574366e8e20170626124146.png)

  Figure 7

  8. Click “Finish” button to complete the installation.

  ![img](https://img1.jcloudcs.com/cms/53b47fd3-71da-4a02-ac81-800c4200d95c20170626124223.png)

  Figure 8

  9. Finish installation.

  ### IV. Installation Instructions for Linux System 

  \1. Path for getting software: use wget command to obtain the software.
      $ wget https://hids.oss.cn-east-1.jcloudcs.com/jcloudhids_linux64_V1.0.tar.gz

  \2. Unzip the downloaded file.
      $ tar xvf jcloudhids_linux64_v1.0.tar.gz
  \3. Enter unzipped file path:
      $ cd jcloudhids_linux64_v1.0/
  \4. The user need sudo privilege to install the program:
      $ sudo ./install.py
  \5. Installation finished, shown as in Figure 9:
      $ sudo ./install.py

  ![img](https://img1.jcloudcs.com/cms/8c4ba2d2-4f35-40b4-aa31-29d698e2c21820170626124803.png)

  Figure 9
