<div id="readme" class="Box-body readme blob js-code-block-container p-5 p-xl-6">
    <article class="markdown-body entry-content container-lg" itemprop="text"><h1><a id="user-content-Video transcoding callback" class="anchor" aria-hidden="true" href="#Video transcoding callback"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>Video transcoding callback</h1>
<h2><a id="user-content-Event type" class="anchor" aria-hidden="true" href="#Event type"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>Event type</h2>
<p>The completion of a video transcoding task will trigger StreamTranscodeComplete event.</p>
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
<td>taskId</td>
<td>Long</td>
<td>Task id</td>
</tr>
<tr>
<td>videoId</td>
<td>String</td>
<td>Video ID</td>
</tr>
<tr>
<td>title</td>
<td>String</td>
<td>Video title</td>
</tr>
<tr>
<td>fileUrl</td>
<td>String</td>
<td>Transcoded file address</td>
</tr>
<tr>
<td>format</td>
<td>String</td>
<td>Transcoded file format</td>
</tr>
<tr>
<td>size</td>
<td>Long</td>
<td>Transcoded file size in Byte</td>
</tr>
<tr>
<td>duration</td>
<td>Float</td>
<td>Transcoded video length in sec</td>
</tr>
<tr>
<td>fps</td>
<td>String</td>
<td>Transcoded video frame rate</td>
</tr>
<tr>
<td>bitrate</td>
<td>String</td>
<td>Transcoded video code rate</td>
</tr>
<tr>
<td>width</td>
<td>Integer</td>
<td>Transcoded video width in px</td>
</tr>
<tr>
<td>height</td>
<td>Integer</td>
<td>Transcoded video height in px</td>
</tr>
<tr>
<td>definition</td>
<td>String</td>
<td>Transcoded video definition specification</td>
</tr>
<tr>
<td>shotImages</td>
<td>Array(String)</td>
<td>Attached transcoding snapshot</td>
</tr>
<tr>
<td>status</td>
<td>String</td>
<td>Transcoding task status</td>
</tr>
<tr>
<td>errorCode</td>
<td>String</td>
<td>Error code. In the case of video transcoding error, the field represents the error code</td>
</tr>
<tr>
<td>errorMessage</td>
<td>String</td>
<td>Wrong message. In the case of video transcoding error, the field represents the error information</td>
</tr>
</tbody>
</table>
<h2><a id="user-content-Content example" class="anchor" aria-hidden="true" href="#Content example"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>Content example</h2>
<blockquote>
<p>Description:<br>
The Video on Demand only supports HTTP callback, so the callback content is HTTP POST Request Body</p>
</blockquote>
<div class="highlight highlight-source-json"><pre>{
  <span class="pl-s"><span class="pl-pds">"</span>bitrate<span class="pl-pds">"</span></span>: <span class="pl-s"><span class="pl-pds">"</span>969177<span class="pl-pds">"</span></span>,
  <span class="pl-s"><span class="pl-pds">"</span>definition<span class="pl-pds">"</span></span>: <span class="pl-s"><span class="pl-pds">"</span>HD<span class="pl-pds">"</span></span>,
  <span class="pl-s"><span class="pl-pds">"</span>duration<span class="pl-pds">"</span></span>: <span class="pl-c1">10.618</span>,
  <span class="pl-s"><span class="pl-pds">"</span>eventTime<span class="pl-pds">"</span></span>: <span class="pl-s"><span class="pl-pds">"</span>2020-07-28T10:04:51.465Z<span class="pl-pds">"</span></span>,
  <span class="pl-s"><span class="pl-pds">"</span>eventType<span class="pl-pds">"</span></span>: <span class="pl-s"><span class="pl-pds">"</span>StreamTranscodeComplete<span class="pl-pds">"</span></span>,
  <span class="pl-s"><span class="pl-pds">"</span>fileUrl<span class="pl-pds">"</span></span>: <span class="pl-s"><span class="pl-pds">"</span>https://s3.cn-north-1.jcloudcs.com/vod-storage-72757/vod/product/28373149/959/1a541c2f55024fae92741e53d604e8f0.mp4<span class="pl-pds">"</span></span>,
  <span class="pl-s"><span class="pl-pds">"</span>format<span class="pl-pds">"</span></span>: <span class="pl-s"><span class="pl-pds">"</span>mp4<span class="pl-pds">"</span></span>,
  <span class="pl-s"><span class="pl-pds">"</span>fps<span class="pl-pds">"</span></span>: <span class="pl-s"><span class="pl-pds">"</span>25.000<span class="pl-pds">"</span></span>,
  <span class="pl-s"><span class="pl-pds">"</span>height<span class="pl-pds">"</span></span>: <span class="pl-c1">1280</span>,
  <span class="pl-s"><span class="pl-pds">"</span>shotImages<span class="pl-pds">"</span></span>: [
    <span class="pl-s"><span class="pl-pds">"</span>https://s3.cn-north-1.jcloudcs.com/vod-storage-72757/img/2020/28102587/1/img1.jpg<span class="pl-pds">"</span></span>,
    <span class="pl-s"><span class="pl-pds">"</span>https://s3.cn-north-1.jcloudcs.com/vod-storage-72757/img/2020/28102587/1/img2.jpg<span class="pl-pds">"</span></span>,
    <span class="pl-s"><span class="pl-pds">"</span>https://s3.cn-north-1.jcloudcs.com/vod-storage-72757/img/2020/28102587/1/img3.jpg<span class="pl-pds">"</span></span>,
    <span class="pl-s"><span class="pl-pds">"</span>https://s3.cn-north-1.jcloudcs.com/vod-storage-72757/img/2020/28102587/1/img4.jpg<span class="pl-pds">"</span></span>,
    <span class="pl-s"><span class="pl-pds">"</span>https://s3.cn-north-1.jcloudcs.com/vod-storage-72757/img/2020/28102587/1/img5.jpg<span class="pl-pds">"</span></span>,
    <span class="pl-s"><span class="pl-pds">"</span>https://s3.cn-north-1.jcloudcs.com/vod-storage-72757/img/2020/28102587/1/img6.jpg<span class="pl-pds">"</span></span>,
    <span class="pl-s"><span class="pl-pds">"</span>https://s3.cn-north-1.jcloudcs.com/vod-storage-72757/img/2020/28102587/1/img7.jpg<span class="pl-pds">"</span></span>,
    <span class="pl-s"><span class="pl-pds">"</span>https://s3.cn-north-1.jcloudcs.com/vod-storage-72757/img/2020/28102587/1/img8.jpg<span class="pl-pds">"</span></span>
  ],
  <span class="pl-s"><span class="pl-pds">"</span>size<span class="pl-pds">"</span></span>: <span class="pl-c1">1370362</span>,
  <span class="pl-s"><span class="pl-pds">"</span>status<span class="pl-pds">"</span></span>: <span class="pl-s"><span class="pl-pds">"</span>success<span class="pl-pds">"</span></span>,
  <span class="pl-s"><span class="pl-pds">"</span>taskId<span class="pl-pds">"</span></span>: <span class="pl-c1">959</span>,
  <span class="pl-s"><span class="pl-pds">"</span>title<span class="pl-pds">"</span></span>: <span class="pl-s"><span class="pl-pds">"</span>1595930586758_filter-YiJianMeiHuamp4.mp4<span class="pl-pds">"</span></span>,
  <span class="pl-s"><span class="pl-pds">"</span>videoId<span class="pl-pds">"</span></span>: <span class="pl-s"><span class="pl-pds">"</span>e4b7e7d6-fe92-40b0-9870-fa10bb4d8ed5<span class="pl-pds">"</span></span>,
  <span class="pl-s"><span class="pl-pds">"</span>width<span class="pl-pds">"</span></span>: <span class="pl-c1">596</span>
}</pre></div>
</article>
  </div>
