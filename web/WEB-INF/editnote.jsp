<%-- 
    Document   : editnote
    Created on : Sep 19, 2019, 4:10:53 PM
    Author     : 795347
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <form action="note" method="post">
        <b>Title: </b>
        <input type="text" value="${title}"><br>
        <b>Contents:</b><br>
        <textarea rows="4" cols="50">${contents}</textarea><br>
        <input type="submit" value="Save">
        </form>
        <a href="note">View</a>
    </body>
</html>
