<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 25, 2022, 7:43:31 PM
    Author     : Dont1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic calculator</title>
    </head>
    <body>
        <h1>Arithmetic calculator</h1>
        <form action="arithmeticcalculator" method="post">
            
            First: <input type="text" name ="first"><br>
            Second: <input type="text" name ="second"><br>
            
            <input type="submit" name ="submit" value="+">
            <input type="submit" name ="submit" value="-">
            <input type="submit" name ="submit" value="*">
            <input type="submit" name ="submit" value="%">
            
        
            
        </form>
        
        <p>${result}</p>
        <a href="agecalculator">Age calculator</a>
        
    </body>
</html>
