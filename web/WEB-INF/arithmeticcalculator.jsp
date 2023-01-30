<%-- 
    Document   : arithmeticcalculator
    Created on : 29-Jan-2023, 9:14:48 PM
    Author     : darkn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
        <style>
        input[type="text"] {
        width: 100px;
        }
        </style>
    </head>
    <body>
        <form method="post" action="arithmetic">
        <h1>Arithmetic Calculator</h1>
        First : <input type ="text" name="firstnumber" value="${firstnumber}"> <Br>
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
