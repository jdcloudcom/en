# Image Overview
## Image Definition
The image is a template for the instance running environment, including the operating system and pre-installed software and related configurations. You can launch any number of instances based on a image, or launch an instance from any number of different images as required.

## Main Role of Image
1. Deploy Software Environment in Batches:
Customize the instances deployed with environment to create the image, and then create instances in batches based on this image. After the machine is created, it has the software environment as the same with that of the previous instance, which achieves the purpose of software environment deploying in batches.

2. As a backup of the server's running environment:
An image created by instances can be used to recover a damaged instance If this instance can not run normally due to damaged software environment during subsequent use.