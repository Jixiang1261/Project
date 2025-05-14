<body>
<?php 
  $db = mysqli_connect('localhost', 'root', '', 'CRS');
  if (isset($_POST['register'])) {
  	$username = $_POST['username'];
  	$email = $_POST['email'];
  	$password = $_POST['password'];
	$password1 = $_POST['cpassword'];
	$phone = $_POST['phone'];
	$gender = $_POST['gender'];

	if ($password != $password1){
	   $password_error = "Password are not same";
	}
    else{

		$sql_u = "SELECT * FROM users WHERE username='$username'";
		$sql_e = "SELECT * FROM users WHERE email='$email'";
	    $sql1_u = "SELECT * FROM admin1 WHERE username='$username'";
		$sql1_e = "SELECT * FROM admin1 WHERE email='$email'";
		$test_u = mysqli_query($db, $sql_u);
		$test_e = mysqli_query($db, $sql_e);
	    $test1_u = mysqli_query($db, $sql1_u);
		$test1_e = mysqli_query($db, $sql1_e);
  
	 if (mysqli_num_rows($test_u) > 0) {
		  $name_error = "Username already taken"; 	
	 }
	 else if(mysqli_num_rows($test1_u) > 0) {
	      $name_error = "Username already taken"; 	
	 }
	 else if(mysqli_num_rows($test_e) > 0){
		  $email_error = "Email already taken"; 	
	 }
	 else if(mysqli_num_rows($test1_e) > 0){
	      $email_error = "Email already taken"; 	
	 }
  	else{
           $query = "INSERT INTO admin1 (username, gender, email, phone, password) 
      	    	  VALUES ('$username','$gender','$email','$phone','".md5($password)."')";
           $results = mysqli_query($db, $query);
           echo 'Registered Successful!';
		   echo "  ";
		   echo "<a href='adminlogin.php'>Click here proceed Login</a>"; 
		   exit();
  	}

  }
}
?>	  
</body>