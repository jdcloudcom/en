# Strong Consistency

Object action is atomic on OSS, and the action either succeeds or fails, without any Object in the status in between. OSS guarantees that the Object read by user after uploading is completed, and OSS will not return any part of successfully uploaded Object to the user.

Object actions are highly consistent on OSS as well. Once the user receives a response successfully uploaded (PUT), the uploaded Object is ready for reading, and three backup copies of data are written successfully. There is no upload status in between, i.e. read-after-write but unreadable. It is the same for deleting action. After user successfully deletes the specified Object, the Object immediately becomes absent.

Strong consistency facilitates user architecture design, and enables the use of OSS with the same logics as traditional storage devices. Modifications will be immediately visible, without considering the problems brought by final consistency.
