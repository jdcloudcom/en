
# Container Instance Creation Failed

**Creation shall be considered failed in case of any circumstances as follows: If you have other questions, you may open ticket; After the creation failed, the resource will be rolled back and the order will be cancelled.**

- This is the most common reason for image download failure. Please confirm whether the image exists first and then check if the completed contents are correct (options of Repository, image name and version name).    
- An existing disk will be used for 3 reasons: In case of a partitioned cloud disk, the mount point has been set up; in case of a formatted Cloud Disk Service, if not in the format of xfs or ext4, the amount point fails to be mounted; in case of a formatted Cloud Disk Service, if the specified file format does not comply with the actual file system format, the Cloud Disk Service fails to be mounted; the existing Cloud Disk Service does not exist.
- Newly Created Cloud Disk Service Failed  
- Failed to Be Associated with EIP  
- In case of batch creation, failure to create one or more sets will be considered as failure to create as a whole  
