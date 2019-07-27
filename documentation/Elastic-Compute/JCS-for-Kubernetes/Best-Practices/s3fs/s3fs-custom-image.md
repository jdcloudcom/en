# Build s3fs Customized Image
By using S3fs, a Bucket can be mounted into the Linux system as a folder and used as a system folder. For more details, please refer to [Attach Bucket on Linux Instances by Using S3fs](https://docs.jdcloud.com/en/object-storage-service/s3fs). It needs to build s3fs image first before using s3fs in JCS for Kubernetes; this paper provides a Dockerfile of s3fs image, and you can add customized parameters in Dockerfile to build a customized s3fs image.

## I. s3fs Dockerfile

1. Download s3f3 Dockerfile the Local

`
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/s3fs/s3fs-dockerfile.yml
`
    
2. Content descriptions of Dockerfile are as follows

```    
FROM ubuntu:16.04

# Define ENV Environment Variable used by the CMD exec directive in Dockerfile
ENV S3_BUCKET ''
ENV MNT_POINT /data
ENV S3_URL ''
ENV S3_UID 0
ENV S3_GID 0
ENV OPTION ''

RUN DEBIAN_FRONTEND=noninteractive apt-get -y update --fix-missing && \
apt-get install -y automake autotools-dev g++ git libcurl4-gnutls-dev wget \
libfuse-dev libssl-dev libxml2-dev make pkg-config && \
git clone https://github.com/s3fs-fuse/s3fs-fuse.git /tmp/s3fs-fuse && \
cd /tmp/s3fs-fuse && ./autogen.sh && ./configure && make && make install && \
ldconfig && /usr/local/bin/s3fs --version && \
mkdir -p "$MNT_POINT" && \
DEBIAN_FRONTEND=noninteractive apt-get purge -y wget automake autotools-dev g++ git make && \
apt-get -y autoremove --purge && apt-get clean && \
rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/*

CMD exec /usr/local/bin/s3fs $S3_BUCKET $MNT_POINT -f -o passwd_file=/mysecret/passwd-s3fs -o url=$S3_URL -o uid=$S3_UID -o gid=$S3_GID $OPTION
    
```

3. Build docker Image;

    ```
    ##Use dockerfile provided by JD Cloud for building##
    docker build --network host -t s3fs:latest https://kubernetes.s3.cn-north-1.jdcloud-oss.com/s3fs/s3fs-dockerfile.yml
    
    ##Build using customized dockerfile, replace $PATH according to actual conditions of dockerfile file##
    docker build --network host -t s3fs:latest $PATH

    ##After the image is built successfully, use the following commands to verify the newly built docker image
    docker images

    REPOSITORY                                            TAG                  IMAGE ID            CREATED             SIZE
    s3fs                                                  latest               9581af047109        13 seconds ago      307 MB    
    ```

4. Save the docker image s3fs to [JD Cloud Image Repository](https://docs.jdcloud.com/en/container-registry/create-image) or other image repositories that can be accessed through the public network

5. Mount Object Storage Service using customized s3fs image, please refer to [Mount Object Storage Service Bucket IN JCS for Kubernetes](https://docs.jdcloud.com/en/jcs-for-kubernetes/Oss-s3fs-volume) for details.


