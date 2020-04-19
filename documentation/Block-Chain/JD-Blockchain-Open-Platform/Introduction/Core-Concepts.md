# Core Concepts

Concepts and interpretations for JD Blockchain Open Platform are listed below for reference.
- Network: Fabric, block chain network where all ledgers/channels, organizations shall be built.
- Organization: According to network nodes accessing and using ledger in a block chain, one alliance (or one block chain network) has multiple organizations (members) and one organization can have multiple Peers. Each JD Cloud Account has only one corresponding organization name on BaaS Platform.
- Contract/Chain code: Namely chaincode, code logic running on block chain and automatically executing under certain conditions, which is an important approach for users to use block chain to implement business logic. Based on the characteristics of block chain, the running result of the intelligent contract is credible and cannot be forged and altered.
- Node: There are two kinds of nodes in Fabric, i.e. peer and orderer.
- Channel/Ledger: Channel refers to private block chain built on a block chain network for the purpose of implementing isolation and confidentiality of data. Every channel is a logic block chain. Peer added into a channel is visible for transactions in this channel. A same node can be added into multiple channels.
- Consensus: The method and process for reaching a consistency among data at different nodes.
- Certificate:
    * Identity Certificate: Certification Organization/Node Identity
    * Node Certificate: Exclusively owned by fabric to verify node types
