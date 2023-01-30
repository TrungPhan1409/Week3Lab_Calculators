<%-- 
    Document   : agecalculator
    Created on : 29-Jan-2023, 5:12:01 PM
    Author     : darkn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <form method="post" action="age">
        <h1><b>Age Calculator</b></h1>
        Enter your age: <input type="text" name="age" > <br>
        <input type="submit" value="Age next birthday"> <br>
            </form>
        <p>${message}</p>
        <a href="arithmetic" >Arithmetic Calculator</a>
    </body>
    
</html>
