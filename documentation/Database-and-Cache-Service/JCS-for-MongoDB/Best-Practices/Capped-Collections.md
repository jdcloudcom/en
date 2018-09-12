# Use MongoDB Capped Collections

MongoDB capped collections are fixed-size loop collections that follow insertion order to enable high-performance creation, read, and delete operations. By looping, when the fixed size assigned to the collection is exhausted, it begins to delete the oldest document in the collections without providing any explicit commands.

Capped collections store documents in the order of disk storage, thus ensuring that the document size does not exceed the space allocated on disk. Capped collections are better for storing log information, cached data, or other high-capacity data.

## Create Capped Collections

To create a capped collection, use the createCollection command to specify that the capped option has a value of true and a maximum collection size in bytes.

>db.createCollection( "log", { capped: true, size: 100000 } )

In addition to specifying a collection size, using the max parameter to limit the number of documents in the collection is also available.

>db.createCollection("log", { capped : true, size : 5242880, max : 5000 } )

To see if the collections are capped, use the following isCapped command.

>db.cappedLogCollection.isCapped()

To convert a collection to a collection with upper limit, use the following code to operate.

>db.runCommand({"convertToCapped": "mycoll", size: 100000});

This code converts existing posts to capped collections.

## Query Capped Collections
By default, the query on capped collections displays the results in insertion order. However, to retrieve the documents in the reverse order, use the sort command:
 
db.cappedCollection.find().sort( { $natural: -1 } )

Using capped collections requires to pay attention to the following:

- Cannot delete documents from capped collections.
- There is no default index in capped collections.
- When inserting a new document, there is no need for MongoDB to actually look for a location on disk to hold a new document. It is free to insert new documents at the end of the collection. This makes the insertion in capped collections very fast.
- When reading the document, MongoDB returns the document in the order of disk storage. This makes the reading operation very fast.



For more information, please see the "[MongoDB Official Document](https://docs.mongodb.com/v3.2/core/capped-collections/)".
