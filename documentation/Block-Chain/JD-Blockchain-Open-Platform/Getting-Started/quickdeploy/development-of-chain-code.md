# Develop Chain Code
The chain code can been seen as an intelligent contract in Hyperledger, which is often used to process business logic of which network members have reached mutual recognition. Any search for and modification to ledger data shall be implemented by calling chain codes. The Hyperledger chain code in nature is a program implementing API stipulation. Current developing languages support Golang.

## Development Environment
It is necessary to prepare the development environment as below when using Golang to develop chain codes:
1.	Install and configure Go, 1.10.X and higher versions are recommended;
2.	Get Hyper ledge Fabric 1.0.0 source code on GitHub and add it to GOPATH;
3.	Install and configure IDE, GoLand is recommended.

## Chain Code APIs
All chain codes are required to implement Chaincode APIs. The API statement is shown as below. In respect of calling chain code APIs methods of Peer in transactions, Init method is called in chain code instantiate and upgrade transactions so that the chain code will execute necessary initialization operations. Invoke method is used in invoke transactions to process transaction proposal contents, modify and read ledger data.
  
 ```
// Chaincode interface must be implemented by all chaincodes. The fabric runs
   // the transactions by calling these functions as specified.
type Chaincode interface {
   // Init is called during Instantiate transaction after the chaincode container
   // has been established for the first time, allowing the chaincode to
   // initialize its internal data
   Init(stub ChaincodeStubInterface) pb.Response
   // Invoke is called to update or query the ledger in a proposal transaction.
   // Updated state variables are not committed to the ledger until the
   // transaction is committed.
   Invoke(stub ChaincodeStubInterface) pb.Response
}
```

Table - Table for Chain Code API Statement

Another important API in chain code APIs is Chaincode StubInterface. Chain codes communicate with Hyperledger through this API, such as obtaining invoke parameters, operation user information, transaction information, operating ledger, calling other chain codes, etc.

The chain code needs to contain the main method and in the main method, call Start function in shim. to enable the chain code. In starting chain code, the communication with Peer is connected to implement interaction with Peer.

## Chain Code Instance

```
func (t *SimpleChaincode) Init(stub shim.ChaincodeStubInterface) pb.Response {
   var err error
   _, args := stub.GetFunctionAndParameters()
   if len(args) != 1 {
      return shim.Error("Incorrect number of arguments. Expecting 2")
   }
   if _, err = strconv.Atoi(args[0]);  err != nil {
      return shim.Error("Expecting integer value for asset holding")
   }
   if err := stub.PutState(Name, []byte(args[0])); err != nil {
      return shim.Error(fmt.Sprintf("fail to put state: %v", err))
   }
   return shim.Success(nil)
}
```

```
func (t *SimpleChaincode) Invoke(stub shim.ChaincodeStubInterface) pb.Response {
   function, args := stub.GetFunctionAndParameters()
   switch function {
   case "invoke":
      return t.invoke(stub, args)
   case "query":
      return t.query(stub, args)
   default:
      return shim.Error("not support function")
   }
}
func (t *SimpleChaincode) invoke(stub shim.ChaincodeStubInterface, args []string) pb.Response {
   if len(args) != 1 {
      return shim.Error("Incorrect number of arguments. Expecting 1")
   }
   change, err :=  strconv.Atoi(args[0])
   if err != nil {
      return shim.Error("Expecting integer value for asset holding")
   }
   if state, err := stub.GetState(Name); err != nil {
      return shim.Error("fail to read asset state")
   }  else if value, err := strconv.Atoi(string(state)); err != nil {
      return shim.Error("fail to parse asset holding")
   } else if err := stub.PutState(Name,[]byte(strconv.Itoa(value + change))); err != nil{
      return shim.Error("fail to change asset holding")
   } else {
      return shim.Success(nil)
   }
}
```

```
func (t *SimpleChaincode) query(stub shim.ChaincodeStubInterface, args []string) pb.Response {
   if state, err := stub.GetState(Name); err != nil {
      return shim.Error("fail to read asset state")
   }  else if _, err := strconv.Atoi(string(state)); err != nil {
      return shim.Error("fail to parse asset holding")
   } else {
      return shim.Success(state)
   }
}
```

```
func main() {
   err := shim.Start(new(SimpleChaincode))
   if err != nil {
      fmt.Printf("Error starting Simple chaincode: %v\n", err)
   }
}
```
