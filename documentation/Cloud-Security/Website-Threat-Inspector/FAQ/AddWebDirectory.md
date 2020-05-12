# Questions on Addition of Verification Files to web Directory

### 1. How to add verification files of subdomain assets to web directory?

Before scanning your subdomain assets, you are required to verify your subdomain assets. You need to upload the downloaded asset verification files to the corresponding asset root directory in the website, namely: the directory at the same level of asset home page index file of the website.

As the server differs from users, the location for uploading files is different. Please refer to the following method to complete uploading of verification files.

#### (1) Common server types

| Server type       | Root directory                                              |
| ---------------- | --------------------------------------------------- |
| IIS server type    | Default location: "C:\inetpub\wwwroot", subject to the actual situation  |
| Tomcat server type | Tomcat deployment address/webapps/ROOT/                      |
| Apache server type | Default location: "/var/www/html", subject to the actual situation       |
| Nginx server type  | Default location: /usr/share/nginx/html, subject to the actual situation |

#### (2) Steps for adding verification files to web directory

- Log in to the server used by the website.

  > In case of non-root user, execute su -root command after login to switch to root user.

- Find the root directory of the server used by the website, namely the directory at the same level of the "index" file.

- Save the verification files in the directory corresponding to the server type

> For example:
>
> - Enter the root directory of the server used by the website: cd /var/www/html
> - Create a file with the same name of the verification file in the same domain: vi e930ba264c664fd98ebdd4531d0a5e9d.txt
> - Enter the edit mode: i, paste the prepared verification file content to here.
> - Save and exit the edit mode: Press "Esc" to exit edit, enter :wq, save and exit.
> - View whether the verification file is uploaded: ll
>
> ![](../../../../image/Website-Threat-Inspector/wts-addweb-02.png)
>
> - Enter your website asset in the browser
>
>   "http://test.example.com/e930ba264c664fd98ebdd4531d0a5e9d.txt"
>
>   Access and verify whether the verification file is uploaded. If the access is successful, the file is uploaded.
