# Call Chain Code
Deployed chain codes run in the server where the Peer locates as Docker image or local process. The block chain application client cannot access chain codes directly. All chain code operations are implemented through requesting endorsement service of Peers. For transaction chain code operations, Peers are only in simulative execution and will not be recorded in ledger. The block chain application client needs to commit a transaction through the broadcast service of Orderer peer. The transaction commitment course in Hyperledger is asynchronous, so the broadcast service of Orderer peer only accepts the transaction commitment request. The transaction will be completed in fact only when the Orderer peer generates a block and transmits it to Peer to record this block. Peer provides event services. The block chain application client can obtain transaction results from block chain events by registering event services.

Hyperledger is a block chain with permission. The block chain application client can access Hyperledger when possessing an identity certificate. Hyperledger can be configured to enable TLS communication protocol. If TLS communication protocol is enabled, the block chain application client needs to complete relevant settings of TLS.

When starting Hyperledger network, the BaaS platform automatically generates a certificate of identity permission and provides user certificate downloads. Furthermore, to lower the level of difficulty in use, the BaaS platform disables TLS by default in deployment of Hyperledger.

## Obtain Connection Parameters

Access to chain codes in Hyperledger network needs to connect to relevant services in Hyperledger network. The connection parameters include Channel name, Orderer service address, Peer endorsement service address, Peer event service address etc. The list of parameters and format are shown in Table - Table for Hyperledger Connection Parameters.

You can get the connection parameters of Hyperledger network based on the information attributes provided by BaaS platform. See Table - Table for Hyperledger Connection Parameter Sources for source of attributes. See Figure - Figure for Examples of Hyperledger Network List, Figure - for Figure for Examples of Hyperledger Consensus Information, Figure - Figure for Examples of Hyperledger Channel Information, Figure - Figure for Examples of Downloading MSP Certificate and Figure - Figure for Examples of MSP Certificate Download Contents for specific examples.

| Parameter Name                                               | Parameter Format                                | Parameter Example                                                                                         |
|------------------------------------------------------|---------------------------------------|--------------------------------------------------------------------------------------------------|
| Channel Name                                            |                                       | mychannel                                                                                        |
| Ordererer Service Address                                    | gprc://%Network Domain%/%Ordererer Server Port% | grpc://k8s.3.cn/32123                                                                            |
| Peer Endorsement Service Address                                     | gprc://%Network Domain%/%Peer Endorsement Service Port%  | grpc://k8s.3.cn/31093                                                                            |
| Peer Event Service Address                                     | gprc://%Network Domain%/%Peer Event Service Port%  | grpc://k8s.3.cn/32511                                                                            |
| MSP Identifier                                              |                                       | jdMSP                                                                                            |
| User Name                                               |                                       | User1                                                                                            |
| User Private Key File                                         |                                       | msp/keystore/key.pem                                                                             |
| User Certificate File                                         |                                       | msp/signcerts/User1@org0.peer.baas.jd.com-cert.pem                                               |

Table - Table for Hyperledger Connection Parameters

<table class="tg">
  <tr>
    <th class="tg-s268"><br>&nbsp;&nbsp;Attribute Name<br>&nbsp;&nbsp;</th>
    <th class="tg-s268"><br>&nbsp;&nbsp;Attribute Source<br>&nbsp;&nbsp;</th>
    <th class="tg-s268"><br>&nbsp;&nbsp;Attribute Example<br>&nbsp;&nbsp;</th>
  </tr>
  <tr>
    <td class="tg-s268" colspan="3"><br>&nbsp;&nbsp;Hyperledger Interface (Figure - Figure for Examples of Hyperledger Network List)<br>&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td class="tg-s268"><br>&nbsp;&nbsp;Network Domain<br>&nbsp;&nbsp;</td>
    <td class="tg-s268"><br>&nbsp;&nbsp;"Network Domain" List in Network List<br>&nbsp;&nbsp;</td>
    <td class="tg-s268"><br>&nbsp;&nbsp;k8s.3.cn<br>&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td class="tg-s268" colspan="3"><br>&nbsp;&nbsp;Network Detail Interface.Consensus Management Page (Figure - for Figure for Examples of Hyperledger Consensus Information)<br>&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td class="tg-s268"><br>&nbsp;&nbsp;Ordererer Service Port<br>&nbsp;&nbsp;</td>
    <td class="tg-s268"><br>&nbsp;&nbsp;"Ports" List in Ordererer List<br>&nbsp;&nbsp;</td>
    <td class="tg-s268"><br>&nbsp;&nbsp;32123<br>&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td class="tg-s268" colspan="3"><br>&nbsp;&nbsp;Network Detail Interface.Channel Management Page (Figure - Figure for Examples of Hyperledger Channel Information)<br>&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td class="tg-s268"><br>&nbsp;&nbsp;Channel Name<br>&nbsp;&nbsp;</td>
    <td class="tg-s268"><br>&nbsp;&nbsp;Drop-down Box in the Upper Left of the Page<br>&nbsp;&nbsp;</td>
    <td class="tg-s268"><br>&nbsp;&nbsp;mychannel<br>&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td class="tg-s268"><br>&nbsp;&nbsp;MSP Identifier<br>&nbsp;&nbsp;</td>
    <td class="tg-s268"><br>&nbsp;&nbsp;"MSP Identifier" List in Organization List View<br>&nbsp;&nbsp;</td>
    <td class="tg-s268"><br>&nbsp;&nbsp;jdMSP<br>&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td class="tg-s268"><br>&nbsp;&nbsp;Peer Endorsement Service Port<br>&nbsp;&nbsp;</td>
    <td class="tg-s268"><br>&nbsp;&nbsp;The First Port of "Ports" List in Organization List View<br>&nbsp;&nbsp;</td>
    <td class="tg-s268"><br>&nbsp;&nbsp;31093<br>&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td class="tg-s268"><br>&nbsp;&nbsp;Peer Event Service Port<br>&nbsp;&nbsp;</td>
    <td class="tg-s268"><br>&nbsp;&nbsp;The Second Port of "Ports" List in Organization List View<br>&nbsp;&nbsp;</td>
    <td class="tg-s268"><br>&nbsp;&nbsp;32511<br>&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td class="tg-s268" colspan="3"><br>&nbsp;&nbsp;MSP Certificate Download Interface (Figure - Figure for Examples of Downloading MSP Certificate)<br>&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td class="tg-s268"><br>&nbsp;&nbsp;User Name<br>&nbsp;&nbsp;</td>
    <td class="tg-s268"><br>&nbsp;&nbsp;User Name Selected in Download Box<br>&nbsp;&nbsp;</td>
    <td class="tg-s268"><br>&nbsp;&nbsp;User1<br>&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td class="tg-s268" colspan="3"><br>&nbsp;&nbsp;MSP Certificate Download Contents (Figure - Figure for Examples of MSP Certificate Download Contents)<br>&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td class="tg-0lax"><br>&nbsp;&nbsp;User Private Key File<br>&nbsp;&nbsp;</td>
    <td class="tg-0lax"><br>&nbsp;&nbsp;key.pem File under keystore Directory<br>&nbsp;&nbsp;</td>
    <td class="tg-0lax"><br>&nbsp;&nbsp;msp/keystore/key.pem<br>&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td class="tg-0lax"><br>&nbsp;&nbsp;User Certificate File<br>&nbsp;&nbsp;</td>
    <td class="tg-0lax"><br>&nbsp;&nbsp;pem File under signcerts Directory<br>&nbsp;&nbsp;</td>
    <td class="tg-0lax"><br>&nbsp;&nbsp;msp/signcerts/User1@org0.peer.baas.jd.com-cert.pem<br>&nbsp;&nbsp;</td>
  </tr>
</table>

Table - Table for Hyperledger Connection Parameter Sources

![图片](../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/image010.jpg)

Figure - Figure for Examples of Hyperledger Network List
 
![图片](../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/image012.jpg)

Figure - Figure for Examples of Hyperledger Consensus Information

![图片](../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/image014.jpg)
 
Figure - Figure for Examples of Hyperledger Channel Information

![图片](../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/image016.jpg)
 
Figure - Figure for Examples of Downloading MSP Certificate

![图片](../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/image017.png)
 
Figure - Figure for Examples of MSP Certificate Download Contents

## Develop Application Program

Hyperledger offers Java, Node.js and Java version SDK. It is suggested to use Java or Node.js to develop Hyperledger block chain application client.
## Development Environment for Java Version
It is necessary to prepare the development environment as below when using Java version Fabric SDK to develop application client:
1.	JDK, JDK 1.8 and above versions are recommended;
2.	IDE, familiar IDE can be used and Eclipse is recommended;
3.	Fabric Java SDK, it is recommended to use it to keep consistency with Fabric version;
## API Description
The main API-class relationship related to chain code calling in Java Fabric SDK is shown in the following figure.
 
![图片](../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/image019.png) 

HFClient provides client environment. Objects communicating with Hyperledger are initiated through this class of instances. It should be noted that parameter initialization has a relationship of dependencies in HFClient. See example code for specific details.

CryptoSuite defines PKI APIs. Methods of generation, signature and verification of secret keys of PKI are defined in this API. Implementation of all PKIs requires for inheriting this API. CryptoPrimitives provides basic implementation in SDK. You can create this implemented instance through CryptoSuite.Factory class.

The chain code calling function is offered by Chanel class, including queryByChaincode, sendTransactionProposal, sendTransaction. The Peer, Ordererer and Event services are respectively used to define the Peer, Ordererer peer and event notification service addresses, and Channel calls corresponding services through these defined addresses.

User and Enrollment APIs are used for providing identity verification information in operation of ledger. User defines the basic information of a user; Enrollment provides the certificate and corresponding signature private key. SDK doesn't provide User implantation but only provide Enrollment implantation corresponding to Fabric CA. The application needs to provide its own implementation.

## Example Code

Hyperledger is block chain with permission and can only be operated by authorized users. Therefore, at access to Hyperledger, it is necessary to provide the user identity information. In Fabric Java SDK, the user identity verification information is defined by User and Enrollment APIs and the application provides identity verification information by instantiating objects of APIs.

In chain code development based on BaaS platform deployment and management, parameters required for instantiated identity verification information can be taken through the user certificate download function, mainly including user name, MSP identifier, signature private key and CA certificate. For Enrollment instantiation, see example code-Enrollment instantiation; for User instantiation, see example code-User instantiation.

Before calling chain codes through Fabric Java SDK, you need to specify Channel, Peer endorsement service address, Ordererer broadcast service address and Peer Event service address. Besides, you also need to initiate the signature and verification for chain code calling request and response data and other dependent PKI components as well user identity identifier information. For environment initialization codes before calling chain codes, see example code-initialization of Channel. You need to pay attention to the dependency relationship among modules in the course of initialization. See NOTE in the example for details.

In Hyperledger, chain code operations can be divided into two classes, i.e. executing transactions and querying status. In transaction operations, a request is sent to one or more Peers for endorsement. The Peer endorsement result is broadcasted to Ordererer service and the execution result is listened to by Peer Event service. For implementation methods, see example code-execute transactions. Implementation of querying status is relatively simple because it just needs to call Peer endorsement service. For implementation methods, see example code-query chain code data status.

```
/**
 * load enrollment from local key and certificate files.
 * 
 * @param keyFile file path of private key
 * @param certFile file path of CA certificate
 * @return  enrollment loaded from local key and certificate files
 * @throws Exception  any exception occurred during  enrollment loading
 */
private static Enrollment loadEnrollment(String keyFile, String certFile) throws Exception {
    PemReader reader = null;
    PemObject pemObj = null;

    // read private key PEM file
    try {
        reader = new PemReader(new java.io.FileReader(keyFile));
        pemObj = reader.readPemObject();
    } finally {
        if(reader != null) {
            try {
                reader.close();
            } catch(Exception e) {}
        }
    }

    // generate private key from PKCS8 encoded data
    EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(pemObj.getContent());;
    KeyFactory generator = KeyFactory.getInstance("ECDSA", BouncyCastleProvider.PROVIDER_NAME);
    final PrivateKey privateKey = generator.generatePrivate(privateKeySpec);


    // read CA certificate content
    final String cert =  IOUtils.toString(new File(certFile).toURI());

    return new Enrollment() {
        public PrivateKey getKey() {
            return privateKey;
        }

        public String getCert() {
            return cert;
        }
    };

}
```

Example code-Enrollment instantiation

```
/**
 * create user with specified MSP, user name and enrollment.
 * 
 * @param user  ID, i.e., unique name of user
 * @param mspId ID of MSP which user belongs to
 * @param enrollment user's enrollment
 * @return  user instance with attributes provided by parameters, and others as default.
 */
private static User createUser(String user, String mspId,  final Enrollment enrollment) {
    return new User() {
        public String getName() {
            return user;
        }

        public Set<String> getRoles() {
            return null;
        }

        public String getAccount() {
            return null;
        }

        public String getAffiliation() {
            return null;
        }


        public Enrollment getEnrollment() {
            return enrollment;
        }

        public String getMspId() {
            return mspId;
        }
    };
}
```

Example code-User instantiation

```
HFClient hfClient = HFClient.createNewInstance();

// NOTE: CryptoSuite must be set first.
hfClient.setCryptoSuite(CryptoSuite.Factory.getCryptoSuite());

// NOTE: User must be set before Ordererer, Peer and EventHub.
hfClient.setUserContext(createUser("User1", "houseMSP",
        loadEnrollment("data/msp/keystore/key.pem", "data/msp/signcerts/User1@house.peer.k8s.3.cn-cert.pem")));

Channel channel = hfClient.newChannel("mychannel");

// NOTE: Ordererer is used to send transaction.
Properties OrderererProp = new Properties();
OrderererProp.setProperty("OrderererWaitTimeMilliSecs", "30000");
channel.addOrdererer(hfClient.newOrdererer("Ordererer", "grpc://k8s.3.cn:30094", OrderererProp));

// NOTE: Peer is used to interact with ChainCode, including transaction and query. 
channel.addPeer(hfClient.newPeer("peer0org0", "grpc://k8s.3.cn:31636"));

// NOTE: EventHub is used to listen block events.
// NOTE: EventHub must be added if transactions state is needed.
channel.addEventHub(hfClient.newEventHub("peer0org0", "grpc://k8s.3.cn:30512"));

// NOTE: channel must be initialized before any ledger operation.
channel.initialize();
```

Initialize Channel client

```
TransactionProposalRequest txReq = hfClient.newTransactionProposalRequest();
ChaincodeID cid = ChaincodeID.newBuilder().setName("cdemo").build();
        txReq.setChaincodeID(cid);
        txReq.setFcn("invoke");
        txReq.setArgs(new String[] {"12"});
Collection<ProposalResponse> txRsps = channel.sendTransactionProposal(txReq);
CompletableFuture<TransactionEvent> eFuture = channel.sendTransaction(txRsps);
// NOTE: if no EventHub, this function will be blocked. 
TransactionEvent txEvent = eFuture.get();
```

Example code-execute transactions

```
QueryByChaincodeRequest qryReq = hfClient.newQueryProposalRequest();
        qryReq.setChaincodeID(cid);
        qryReq.setFcn("query");
        qryReq.setArgs(new String[] {});
        Collection<ProposalResponse> 
Collection<ProposalResponse> qryRsps =channel.queryByChaincode(qryReq);
```
Example code-query chain code data status

## Development Environment for Nodejs Version

1.	Node, 6.9.x or higher versions and 8.4.0 or higher versions are required by Node and Node v7+ is not supported; NPM version supports 3.10.x or higher versions;
2.	IDE, vscode is recommended and others such as Sublime Text or even notepad can be used;
3.	Fabric Nodejs SDK, it is recommended to use it to keep consistency with Fabric version;

## API Description
SDK is composed of three modules:
1.	api: Provide application developers with pluggable APIs to offer alternative implementation of key APIs used by SDK. Every API has built-in implementation by default;
2.	fabric-client: This module provides APIs to communicate with core components of block chain network built by Hypreledger, namely peer, sequencer and event stream;
3.	fabric-ca-client: This module provides APIs to communicate with optional component fabric-ca which is included to use for service of member management;

## Example Code
Query：

```
var Fabric_Client = require('fabric-client');
var path = require('path');
var util = require('util');
var os = require('os');
var console = require("console")
var fabric_client = new Fabric_Client();
// setup the fabric network
var channel = fabric_client.newChannel('mychannel');
var peer = fabric_client.newPeer('grpc://192.168.*.*:32683');
channel.addPeer(peer);
var member_user = null;
var store_path = path.join(__dirname, 'hfc-key-store');
console.error('Store path:'+store_path);
var tx_id = null;
// create the key value store as defined in the fabric-client/config/default.json 'key-value-store' setting
Fabric_Client.newDefaultKeyValueStore({ path: store_path
}).then((state_store) => {
    // assign the store to the fabric client
    fabric_client.setStateStore(state_store);
    var crypto_suite = Fabric_Client.newCryptoSuite();
    var crypto_store = Fabric_Client.newCryptoKeyStore({path: store_path});
    crypto_suite.setCryptoKeyStore(crypto_store);
    fabric_client.setCryptoSuite(crypto_suite);
    // get the enrolled user from persistence, this user will sign all requests
    var userOpt = {
            username: 'User1',
            mspid: 'org0MSP',
            //  Here is the certificate and private key downloaded from the web page
            cryptoContent: {
                privateKey: './key.pem',
                signedCert: './cert.pem'
            }
        }
        return fabric_client.createUser(userOpt)
}).then((user_from_store) => {
    if (user_from_store && user_from_store.isEnrolled()) {
        console.log('Successfully loaded user1 from persistence');
        member_user = user_from_store;
    } else {
        throw new Error('Failed to get user1.... run registerUser.js');
    }
    fabric_client.setUserContext(user_from_store, true)
    const request = {
        chaincodeId: 'cdemo',
        fcn: 'query',
        args: ['']
    };
    console.log("pass")
    // send the query proposal to the peer
    return channel.queryByChaincode(request);
}).then((query_responses) => {
    console.log("Query has completed, checking results");
    // query_responses could have more than one  results if there multiple peers were used as targets
    if (query_responses && query_responses.length == 1) {
        if (query_responses[0] instanceof Error) {
            console.error("error from query = ", query_responses[0]);
        } else {
            console.log("Response is ", query_responses[0].toString());
        }
    } else {
        console.log("No payloads were returned from query");
    }
}).catch((err) => {
    console.error('Failed to query successfully :: ' + err);
});
```
Invoke：

```
'use strict';
var hfc = require('fabric-client');
var path = require('path');
var util = require('util');
var sdkUtils = require('fabric-client/lib/utils')
const fs = require('fs');
var options = {
    user_id: 'User1',
    msp_id:'Org0MSP',
    channel_id: 'mychannel',
    chaincode_id: 'cdemo',
    peer_url: 'grpc://192.168.*.*:32683',
    event_url: 'grpc://192.168.*.*:32134',
    Ordererer_url: 'grpc://192.168.*.*:31048',
    privateKeyFolder:'./keystore',
    signedCert:'./cert.pem',
};
var channel = {};
var client = null;
var targets = [];
var tx_id = null;
Promise.resolve().then(() => {
    console.log("Load privateKey and signedCert");
    client = new hfc();
    var createUserOpt = {
        username: 'Admin',
        mspid: 'org0MSP',
        cryptoContent: {
            privateKey: './key.pem',
            signedCert: './cert.pem'
        }
    }
//The above code specifies the private key, certificate and other basic information of the current user
return sdkUtils.newKeyValueStore({
                        path: "/tmp/fabric-client-stateStore/"
                }).then((store) => {
                        client.setStateStore(store)
                        return client.createUser(createUserOpt)
                })
}).then((user) => {
    channel = client.newChannel(options.channel_id);
    let peer = client.newPeer(options.peer_url,
        {}
    );
    var Ordererer = client.newOrdererer(options.Ordererer_url, {});
    channel.addOrdererer(Ordererer);
    targets.push(peer);
    return;
}).then(() => {
    tx_id = client.newTransactionID();
    console.log("Assigning transaction_id: ", tx_id._transaction_id);
    var request = {
        targets: targets,
        chaincodeId: options.chaincode_id,
        fcn: 'invoke',
        args: ['12'],
        chainId: options.channel_id,
        txId: tx_id
    };
    return channel.sendTransactionProposal(request);
}).then((results) => {
    var proposalResponses = results[0];
    var proposal = results[1];
    var header = results[2];
    let isProposalGood = false;
    if (proposalResponses && proposalResponses[0].response &&
        proposalResponses[0].response.status === 200) {
        isProposalGood = true;
        console.log('transaction proposal was good');
    } else {
        console.error('transaction proposal was bad');
    }
    if (isProposalGood) {
        console.log(util.format(
            'Successfully sent Proposal and received ProposalResponse: Status - %s, message - "%s", metadata - "%s", endorsement signature: %s', 
            proposalResponses[0].response.status, proposalResponses[0].response.message,
            proposalResponses[0].response.payload, proposalResponses[0].endorsement.signature));
        var request = {
            proposalResponses: proposalResponses,
             proposal: proposal,
            header: header
        };
         // set the transaction listener and set a timeout of 30sec
        // if the transaction did not get committed within the timeout period,
        // fail the test
        var transactionID = tx_id.getTransactionID();
        var eventPromises = [];
        let eh = client.newEventHub();
        //Then set EventHub, which is used to listen whether Transaction is written
        eh.setPeerAddr(options.event_url, {});
        eh.connect();
        let txPromise = new Promise((resolve, reject) => {
            let handle = setTimeout(() => {
                eh.disconnect();
                reject();
            }, 30000);
            //Register the processing method of the event with EventHub
            eh.registerTxEvent(transactionID, (tx, code) => {
                clearTimeout(handle);
                eh.unregisterTxEvent(transactionID);
                eh.disconnect();
                if (code !== 'VALID') {
                    console.error(
                        'The transaction was invalid, code = ' + code);
                    reject();
                 } else {
                    console.log(
                         'The transaction has been committed on peer ' +
                         eh._ep._endpoint.addr);
                    resolve();
                };
            });
        });
        eventPromises.push(txPromise);
        var sendPromise = channel.sendTransaction(request);
        return Promise.all([sendPromise].concat(eventPromises)).then((results) => {
            console.log(' event promise all complete and testing complete');
             return results[0]; // the first returned value is from the 'sendPromise' which is from the 'sendTransaction()' call
        }).catch((err) => {
            console.error(
                'Failed to send transaction and get notifications within the timeout period.'
            );
            return 'Failed to send transaction and get notifications within the timeout period.';
         });
    } else {
        console.error(
            'Failed to send Proposal or receive valid response. Response null or status is not 200. exiting...'
        );
        return 'Failed to send Proposal or receive valid response. Response null or status is not 200. exiting...';
    }
}, (err) => {
    console.error('Failed to send proposal due to error: ' + err.stack ? err.stack :
        err);
    return 'Failed to send proposal due to error: ' + err.stack ? err.stack :
        err;
}).then((response) => {
    if (response.status === 'SUCCESS') {
        console.log('Successfully sent transaction to the Ordererer.'); 
        return tx_id.getTransactionID();
    } else {
        console.error('Failed to Orderer the transaction. Error code: ' + response.status);
        return 'Failed to Orderer the transaction. Error code: ' + response.status;
    }
}, (err) => {
    console.error('Failed to send transaction due to error: ' + err.stack ? err
         .stack : err);
    return 'Failed to send transaction due to error: ' + err.stack ? err.stack :
        err;
});
```
