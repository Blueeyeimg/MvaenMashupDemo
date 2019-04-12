<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <meta http-equiv="Cache-Control" content="no-siteapp">
    <meta http-equiv="Cache-Control" content="no-transform ">
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
</head>
<body>
<div>
    <form action="Hello" method="POST">
        <input type="text" name = "keyword"/>
        <input type="submit" name="submit" value="提交">
    </form>
</div>
<div class="cont">
    <p style="font-size:18px; line-height:22px; height:22px; "  target="_blank"><b id = "0">
        <%= request.getAttribute("title") %>
    </b></p>
    <p ><a id = "1"><%= request.getAttribute("dynasty") %></a><span>：</span><a id = "2"><%= request.getAttribute("author") %></a></p>
    <div id="3">
        <%= request.getAttribute("text") %>
    </div>
</div>
<img src=<%= request.getAttribute("url") %> width="490" height="382.2" style="top: 135px; left: 0px; width: 490px; height: 382.2px; cursor: pointer;" log-rightclick="p=5.102">
</body>
</html>
