<%-- 
    Document   : arithmeticcalculator
    Created on : 30-Jan-2023, 1:14:48 AM
    Author     : darkn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <form method="post" action="arithmetic">
        <h1>Arithmetic Calculator</h1>
        First : <input type ="text" name="firstnumber" value="${firstnumber}"> <br>
        Second : <input type="text" name="secondnumber" value="${secondnumber}"> <br>
        <input type ="submit" name="submit" value="+">
        <input type ="submit" name="submit" value="-">
        <input type ="submit" name="submit" value="*">
        <input type ="submit" name="submit" value="%"> <br>
        </form>
        
        <p>Result : ${message} </p>
        
        <a href="age" >Age Calculator</a>
    </body>
</html>
