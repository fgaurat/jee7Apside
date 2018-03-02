<%-- 
    Document   : main
    Created on : 28 févr. 2018, 14:33:06
    Author     : fgaurat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">


    </head>
    <body>
        <div class="container">
            <div class="col-md-offset-4 col-md-4">
                
                <form action="auth" method="post">
                 <div class="form-group">
                   <label for="exampleInputEmail1">Login</label>
                   <input type="text" class="form-control" id="login" name="login" placeholder="Login">
                 </div>

                 <div class="form-group">
                   <label for="exampleInputPassword1">Password</label>
                   <input type="password" class="form-control" id="exampleInputPassword1" name="password" placeholder="Password">
                 </div>
                 
                    <button type="submit" class="btn btn-block btn-primary">Submit</button>
                 
               </form>        
            </div>
        </div>        
    </body>
</html>
