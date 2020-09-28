<%-- 
    Document   : viewnote
    Created on : Sep 28, 2020, 11:05:34 AM
    Author     : 760483
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        
        <span style="font-weight: bold">
            Title:
        </span>
        ${readNote["title"]}
        
        <p style="font-weight:bold">Contents:</p>
        ${readNote["content"]}
        <br>
        <a href="./note?edit">Edit</a>
        
    </body>
</html>
