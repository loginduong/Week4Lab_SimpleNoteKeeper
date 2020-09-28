<%-- 
    Document   : editnote
    Created on : Sep 28, 2020, 11:05:43 AM
    Author     : 760483
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Note Editor</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form>
        <label>Title:
            <input type="text" name="editTitle" value="${readNote["title"]}">
        </label><br/>
        <label>Content:
            <textarea name="editContent">${readNote["content"]}</textarea>
        </label>
        </form>
         
         
    </body>
</html>
