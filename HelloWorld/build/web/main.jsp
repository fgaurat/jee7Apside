<%-- 
    Document   : main
    Created on : 28 févr. 2018, 15:25:11
    Author     : fgaurat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">        
        
        
        <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
        <script src="main.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean class="com.dmr.helloworld.jpaentity.Users" id="user" scope="session"/>
        <h1>Hello <jsp:getProperty name="user" property="login"></jsp:getProperty></h1>
        <hr>
                <form id="addProjectForm">
                 <div class="form-group">
                   <label for="exampleInputEmail1">Project name</label>
                   <input type="text" class="form-control" id="project-name" name="project-name" placeholder="project-name">
                 </div>
                 
                 <button type="submit" class="btn btn-block btn-primary">Submit</button>
                 
               </form>     
        <hr>
        <table class="table" id="tblProjects">
            <thead>
                <tr>
                    <th>#</th>
                    <th>name</th>
                    <th>actions</th>
                </tr>
            </thead>
            <tbody>
                
                
            </tbody>
            
        </table>
        
    </body>
</html>
