<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

  <center>
  <form  action="/SampleDynamic/RegisterServlet" method="post" class="form-control form1">

 <input type="text" placeholder="username" id="user" name="usern" class="form-control rob"   >
 <p id="pname"></p>
<input type="Password" placeholder="Password" id="pass" name="passn" class="form-control rob"   >
 <p id="upass"></p>
<input type="Password" placeholder="Password" id="pass1" name="upassn" class="form-control rob"   >
<p id="upass1"></p>
<input type="text" placeholder="Robin@123" id="eml" name="emln" class="form-control rob"  >
<p id="udate"></p>
<input type="date" placeholder="dob" id="dob" name="dobn" class="form-control rob"  >

<input type="submit" value="Submitt" class="btn btn-warning">
<p>Already a member click <a href="Login.jsp" >Login</a> For Login to your account</p>
</form>
</center>
</body>

</body>
</html>