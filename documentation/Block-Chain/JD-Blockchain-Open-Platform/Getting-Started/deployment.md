# One-click Deployment
  
The Hyperledger network consists of Peer and Orderer service nodes of mutual identity recognition belonging to different organizations. The one-click deployment of Hyperledger network can be implemented through BaaS platform. You can deploy the Hyperledger network through setting the network deployment parameters and then clicking **Deploy** on the page of "One-click Deployment" of Hyperledger.

Enter "One-click Deployment" page via "Block Chain.Hyperledger" menu ->"Hyperledger" interface ->**One-click Deployment** button. The example configuration of network deployment is shown as the Figure for Examples of Network Deployment Attribute Configuration. For parameter description, see the Table for Network Deployment Configuration Attribute Description:
![图片](../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/image001.png)
Figure - Figure for Examples of Network Deployment Attribute Configuration


<table class="tg">
  <tr>
    <th class="tg-0pky"><br>&nbsp;&nbsp;Parameter Name<br>&nbsp;&nbsp;</th>
    <th class="tg-0lax"><br>&nbsp;&nbsp;Parameter Value<br>&nbsp;&nbsp;</th>
    <th class="tg-0pky"><br>&nbsp;&nbsp;Parameter Description<br>&nbsp;&nbsp;</th>
  </tr>
  <tr>
    <td class="tg-0pky"><br>&nbsp;&nbsp;Basic Information<br>&nbsp;&nbsp;</td>
    <td class="tg-0lax" colspan="2"><br>&nbsp;&nbsp;Endorsement (Peer) Organization Included in Fabric Network. <br>&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td class="tg-0pky"><br>&nbsp;&nbsp;Block Chain Name<br>&nbsp;&nbsp;</td>
    <td class="tg-0lax"><br>&nbsp;&nbsp;myfabric<br>&nbsp;&nbsp;</td>
    <td class="tg-0pky"><br>&nbsp;&nbsp;Fabric Network Identifier Name. <br>&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td class="tg-0pky"><br>&nbsp;&nbsp;Version Number<br>&nbsp;&nbsp;</td>
    <td class="tg-0lax"><br>&nbsp;&nbsp;1.0.0<br>&nbsp;&nbsp;</td>
    <td class="tg-0pky"><br>&nbsp;&nbsp;Fabric Software Version Number Used in Fabric Network. <br>&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td class="tg-0pky"><br>&nbsp;&nbsp;Domain<br>&nbsp;&nbsp;</td>
    <td class="tg-0lax"><br>&nbsp;&nbsp;baas.jd.com<br>&nbsp;&nbsp;</td>
    <td class="tg-0pky"><br>&nbsp;&nbsp;Fabric Network External Access Domain. <br>&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td class="tg-0pky"><br>&nbsp;&nbsp;Persistent Volume<br>&nbsp;&nbsp;</td>
    <td class="tg-0lax"><br>&nbsp;&nbsp;gluster-heketi-2w7jw<br>&nbsp;&nbsp;</td>
    <td class="tg-0pky"><br>&nbsp;&nbsp;Kubernetes Persistent Volume Types Used in Fabric Network. <br>&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td class="tg-0pky"><br>&nbsp;&nbsp;Organization List<br>&nbsp;&nbsp;</td>
    <td class="tg-0lax" colspan="2"><br>&nbsp;&nbsp;Peer Organization Included in Fabric Network. <br>&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td class="tg-0lax"><br>&nbsp;&nbsp;Organization Name<br>&nbsp;&nbsp;</td>
    <td class="tg-0lax"><br>&nbsp;&nbsp;org0<br>&nbsp;&nbsp;</td>
    <td class="tg-0lax"><br>&nbsp;&nbsp;Unique Identifier Name of Peer Organization in Fabric Network. Peer organization can only contain lowercase English letters and numbers, and it must start with English letters. <br>&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td class="tg-0lax"><br>&nbsp;&nbsp;Node Count<br>&nbsp;&nbsp;</td>
    <td class="tg-0lax"><br>&nbsp;&nbsp;1<br>&nbsp;&nbsp;</td>
    <td class="tg-0lax"><br>&nbsp;&nbsp;Peer Count Owned by Organization. <br>&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td class="tg-0lax"><br>&nbsp;&nbsp;User Count<br>&nbsp;&nbsp;</td>
    <td class="tg-0lax"><br>&nbsp;&nbsp;1<br>&nbsp;&nbsp;</td>
    <td class="tg-0lax"><br>&nbsp;&nbsp;User Count Participating in Organization. <br>&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td class="tg-0lax" colspan="3"><br>&nbsp;&nbsp;Additional Components<br>&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td class="tg-0lax"><br>&nbsp;&nbsp;Block Chain Browser<br>&nbsp;&nbsp;</td>
    <td class="tg-0lax"><br>&nbsp;&nbsp;Yes<br>&nbsp;&nbsp;</td>
    <td class="tg-0lax"><br>&nbsp;&nbsp;Fabric Block Chain Browser. <br>&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td class="tg-0lax"><br>&nbsp;&nbsp;Example Program<br>&nbsp;&nbsp;</td>
    <td class="tg-0lax"><br>&nbsp;&nbsp;No<br>&nbsp;&nbsp;</td>
    <td class="tg-0lax"><br>&nbsp;&nbsp;marble Example Program. <br>&nbsp;&nbsp;</td>
  </tr>
</table>

Table - Table for Network Deployment Configuration Attribute Description

