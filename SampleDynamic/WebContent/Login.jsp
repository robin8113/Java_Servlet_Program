<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login pageLo</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<center>
<form  action="/SampleDynamic/LoginServlet" method="post" class="form-control form1">
<h3 Style="color:red;">Welcome</h3>
<input type="text" placeholder="username" id="user" class="form-control rob" name="user">
<input type="Password" placeholder="Password" id="pass" class="form-control rob" name="pass">
<input type="submit" value="Submitt" class="btn btn-warning">
</center>
</form>
</div>
</body>
</html>