<html>
<head>
	<link rel="stylesheet" href="css/register.css">
	<link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<link rel="stylesheet">
<title>Register</title>
</head>
<body>

<div class="main">
    <p class="register" align="center">Register</p>
    <form class="form2" method="post" action= "register.php">
	  <input class="firstname" type="text" name="firstname" align="center" placeholder="First Name" required>
	  <input class="lastname" type="text" name="lastname" align="center" placeholder="Last Name" required>
	  <input class="ic" type="text" name="ic" align="center" placeholder="IC/Passport" required>
      <input class="un " type="text" name="username" align="center" placeholder="Username" required>
      <input class="pass" type="password" name="password" align="center" placeholder="Password" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
  title="Must contain at least one  number and one uppercase and lowercase letter, and at least 8 or more characters"> 
	  <input class="phoneno" type="tel" name="phoneno" align="center" placeholder="012-3456789" pattern="[0-9]{3}-[0-9]{7}" title = "XXX-XXXXXXX"required>
	  <input class="email" type="email" name="email" align="center" placeholder="abc@gmail.com" required>
	  
	  
      <input class="submit" type="submit" name="register" value="Register" align="center" a href ="index.html" >
	  
      
            
                
    </div>

</body>
</html>

<?php 
$conn = mysqli_connect('localhost', 'root', '','');
mysqli_select_db($conn,"children");

if ($conn->connect_error) {
  die("Connection failed: " . $conn->connect_error);
}

$username = $_POST['username'];
$password = $_POST['password'];

$sql = "INSERT INTO user (id,username,password)VALUES(0,'$username','$password')";

$select = mysqli_query($conn, "SELECT * FROM user WHERE username = '".$_POST['username']."'");
if(mysqli_num_rows($select)) 
	{
			echo ("<script LANGUAGE='JavaScript'>
				window.alert('Email already exists');
				window.location.href='index.html';
				</script>");
    
	}
else
	{
		if ($conn->query($sql) === TRUE) 
			{
				echo ("<script LANGUAGE='JavaScript'>
				window.alert('Register Successfull');
				window.location.href='index.html';
				</script>");
			  
			} 
		else 
			{
			echo "Error: " . $sql . "<br>" . $conn->error;
			}

		$conn->close();
	}
?>



