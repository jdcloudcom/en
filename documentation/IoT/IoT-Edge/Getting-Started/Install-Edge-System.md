# Install Edge system

You need to install and configure the Edge system on the edge node by hand.

## Preconditions

- Upon completing the operation of creating edge node, please download configuration files and Edge system installation package.

  - If the edge node is not created, please log in [IoT Edge Console](https://iot-console.jdcloud.com/edge) to create the same
  - If the Edge system installation package is not downloaded or configuration information is missing, please log in **Edge Details** to download and obtain the same again.
  - Edge node device needs to be connected to the Internet at all times.

- The Object Storage Service business is subscribed and one Bucket for storing edge computing result data is created. In case the service is not subscribed, please firstly enter the Console of [Object Storage Service](https://oss-console.jdcloud.com) to apply for subscribing the service.

  

## Operation Steps

1. Before installing the Edge system, please install docker and docker-compose.

   ```
   sudo apt install docker.io
   sudo curl -L "https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" -o    /usr/local/bin/docker-compose
   sudo chmod +x /usr/local/bin/docker-compose
   ```

   Add the current user $USER to the docker user group

   ```
   sudo gpasswd -a $USER docker
   ```

   **Note: Please reboot the system after completing all of the above steps.**

2. Decompress Edge installation package to any directory (${destdir})

   ```
   tar zxvf jdcloud-iot-edge-install.tar.gz –C ${destdir}
   ```

3. Edit the configuration file **UserConfig.toml**

   ```
   cp configuration.toml ${destdir}/edge-mgmt-agent/res/
   ```

   [Edge]: Please fill in configuration information saved under the created Edge page in the region:

   ```
   sudo ./install.sh   
   ```

5. After the system installation is completed, you can view that the current edge node is activated and online in the IoT Edge Console.

## Related References

- [Create Edge Computing Node](Create-Edgenode.md)
