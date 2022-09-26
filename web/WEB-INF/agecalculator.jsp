<%-- 
    Document   : agecalculator
    Created on : Sep 25, 2022, 7:43:09 PM
    Author     : Dont1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age calculator</title>
    </head>
    <body>
        <h1>Age calculator</h1>
        
        <form action="agecalculator" method="post">
            
            Enter your age: <input type="text" name="age"><br>
            <input type="submit" value="Age next birthday">
            
        </form>
        
        <p>${message}${errorMessage}</p>
        <a href="arithmeticcalculator">Arithmetic calculator</a>

    </body>
</html>
