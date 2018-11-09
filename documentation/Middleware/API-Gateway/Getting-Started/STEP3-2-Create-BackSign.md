# Backend Service Signature


Currently, the API gateway configures security protection settings for you, providing two security measures: Backend signature key pair and traffic control policy. This paper will introduce the backend signature.

The key pair of backend signature adopts JD Cloud User AK/SK(Access Key/Access Key Secret), which will protect your backend through verification of backend signature when the gateway requests your real backend.

After you associate the JD Cloud User AK/SK key pair to the API group, when the gateway requests the API under this group, this AK/SK will be added and showed, then your backend will verify the identity of the gateway through checking the string of signature.


## Operational Steps

- [Description of steps for backend signature configuration](../Operation-Guide/Create-Domain/Create-Domain.md)

  
