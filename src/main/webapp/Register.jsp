<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> ]Registration Form</h2>
	<form action="regForm" method="post">
		Name: <input type="text" name="name"/><br><br>
		E-Mail: <input type="email" name="email"/><br><br>
		Gender: <input type="radio" name="gender"/>Male <input type="radio" name="gender1"/>Female <br><br>
		Password: <input type="password" name="password"/><br><br>
		City: <select>
				<option>Bengaluru</option>
				<option>Hyderabad</option>
				<option>Mumbai</option>
				<option>Chennai</option>
				<option>Gurgaom</option>
				<option>Trivendrum</option>
			</select>
		<input type="submit" value="Register"/>
	</form>
</body>
</html>