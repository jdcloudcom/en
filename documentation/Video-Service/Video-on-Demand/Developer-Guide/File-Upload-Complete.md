<div id="readme" class="Box-body readme blob js-code-block-container p-5 p-xl-6">
    <article class="markdown-body entry-content container-lg" itemprop="text"><h1><a id="user-content-File uploading callback" class="anchor" aria-hidden="true" href="#File uploading callback"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>File uploading callback</h1>
<h2><a id="user-content-Event type" class="anchor" aria-hidden="true" href="#Event type"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>Event type</h2>
<p>After the video files are uploaded to the media resource space, FileUploadComplete event will be triggered.</p>
<h2><a id="user-content-Callback content" class="anchor" aria-hidden="true" href="#Callback content"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>Callback content</h2>
<table>
<thead>
<tr>
<th>Field name</th>
<th>Field type</th>
<th>Field description</th>
</tr>
</thead>
<tbody>
<tr>
<td>eventType</td>
<td>String</td>
<td>Event type, of which the specific value is FileUploadComplete</td>
</tr>
<tr>
<td>eventTime</td>
<td>String</td>
<td>Event time, represented with the character string of UTC time in the format of yyyy-MM-ddTHH:mm:ssZ</td>
</tr>
<tr>
<td>videoId</td>
<td>String</td>
<td>Video ID</td>
</tr>
<tr>
<td>fileUrl</td>
<td>String</td>
<td>File address</td>
</tr>
<tr>
<td>size</td>
<td>Long</td>
<td>File size</td>
</tr>
</tbody>
</table>
<h2><a id="user-content-Content example" class="anchor" aria-hidden="true" href="#Content example"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>Content example</h2>
<blockquote>
<p>Description:<br>
The Video on Demand only supports HTTP callback, so the callback content is HTTP POST Request Body</p>
</blockquote>
<div class="highlight highlight-source-json"><pre>{
    <span class="pl-s"><span class="pl-pds">"</span>eventTime<span class="pl-pds">"</span></span>: <span class="pl-s"><span class="pl-pds">"</span>2020-07-28T09:58:27.707Z<span class="pl-pds">"</span></span>,
    <span class="pl-s"><span class="pl-pds">"</span>eventType<span class="pl-pds">"</span></span>: <span class="pl-s"><span class="pl-pds">"</span>FileUploadComplete<span class="pl-pds">"</span></span>,
    <span class="pl-s"><span class="pl-pds">"</span>fileUrl<span class="pl-pds">"</span></span>: <span class="pl-s"><span class="pl-pds">"</span>https://s3.cn-north-1.jcloudcs.com/vod-storage-272769/source/2020/20200728/422/317bd090-c4cb-4a3e-b2da-2881bf541295.mp4<span class="pl-pds">"</span></span>,
    <span class="pl-s"><span class="pl-pds">"</span>size<span class="pl-pds">"</span></span>: <span class="pl-c1">5874985</span>,
    <span class="pl-s"><span class="pl-pds">"</span>videoId<span class="pl-pds">"</span></span>: <span class="pl-s"><span class="pl-pds">"</span>38b0eca4-ac76-4de6-b5bc-467e4cd09cbd<span class="pl-pds">"</span></span>
}</pre></div>
</article>
  </div>
