# Deploy Windows Deployment and Service

Here’s an example of Windows application that is created with a Service and a Deployment and exposes port 80 providing external web access.

```
apiVersion: v1
kind: Service
metadata:
  name: win-webserver
  labels:
    app: win-webserver
spec:
  ports:
    # the port that this service should serve on
    - port: 80
      targetPort: 80
  selector:
    app: win-webserver
  type: LoadBalancer
---
apiVersion: apps/v1
kind: DaemonSet
metadata:
  labels:
    app: win-webserver
  name: win-webserver
spec:
  selector:
    matchLabels:
      app: win-webserver
  template:
    metadata:
      labels:
        app: win-webserver
      name: win-webserver
    spec:
      containers:
      - name: windowswebserver
        image: mcr.microsoft.com/windows/servercore:ltsc2019
        command:
        - powershell.exe
        - -command
        - "<#code used from https://gist.github.com/wagnerandrade/5424431#> ; $$listener = New-Object System.Net.HttpListener ; $$listener.Prefixes.Add('http://*:80/') ; $$listener.Start() ; $$callerCounts = @{} ; Write-Host('Listening at http://*:80/') ; while ($$listener.IsListening) { ;$$context = $$listener.GetContext() ;$$requestUrl = $$context.Request.Url ;$$clientIP = $$context.Request.RemoteEndPoint.Address ;$$response = $$context.Response ;Write-Host '' ;Write-Host('> {0}' -f $$requestUrl) ;  ;$$count = 1 ;$$k=$$callerCounts.Get_Item($$clientIP) ;if ($$k -ne $$null) { $$count += $$k } ;$$callerCounts.Set_Item($$clientIP, $$count) ;$$ip=(Get-NetAdapter | Get-NetIpAddress); $$header='<html><body><H1>Windows Container Web Server</H1>' ;$$callerCountsString='' ;$$callerCounts.Keys | % { $$callerCountsString+='<p>IP {0} callerCount {1} ' -f $$ip[1].IPAddress,$$callerCounts.Item($$_) } ;$$footer='</body></html>' ;$$content='{0}{1}{2}' -f $$header,$$callerCountsString,$$footer ;Write-Output $$content ;$$buffer = [System.Text.Encoding]::UTF8.GetBytes($$content) ;$$response.ContentLength64 = $$buffer.Length ;$$response.OutputStream.Write($$buffer, 0, $$buffer.Length) ;$$response.Close() ;$$responseStatus = $$response.StatusCode ;Write-Host('< {0}' -f $$responseStatus)  } ; "
      nodeSelector:
        beta.kubernetes.io/os: windows
      tolerations:
      - key: "os"
        operator: "Equal"
        value: "Win1809"
        effect: "NoSchedule"

```

1. Create a yaml file
Create a file named win.yaml, and copy the contents in the above file to win.yaml

2. Create an application
```
kubectl create -f win.yaml
```

3. Verify the application
```
kubectl get pods
NAME                  READY   STATUS    RESTARTS   AGE
win-webserver-fnvpw   1/1     Running   0          62m
win-webserver-z8hms   1/1     Running   0          62m
```
```
kubectl get service
NAME            TYPE           CLUSTER-IP     EXTERNAL-IP                PORT(S)        AGE
kubernetes      ClusterIP      10.96.0.1      <none>                     443/TCP        21h
win-webserver   LoadBalancer   10.96.57.246   10.0.48.4,114.67.125.233   80:32094/TCP   62m
```

Visit http://114.67.125.233 and see the "Windows Container Web Server" page.

