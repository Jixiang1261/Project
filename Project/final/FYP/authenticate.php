<body>
<?php 
  $db = mysqli_connect('localhost', 'root', '', 'CRS');
  if (isset($_POST['login'])) {
  	$username = $_POST['username'];
  	$password = $_POST['password'];
	$password1 = $_POST['cpassword'];

	if ($password != $password1){
	   $password_error = "Password are not same";
	}
    else{

    $pwdhash = md5($password);
    $pwdcheck = "SELECT * FROM users WHERE username = '$username' AND password = '$pwdhash'";
    $namecheck = "SELECT * FROM users WHERE username = '$username'";
    $result1 = mysqli_query($db, $pwdcheck);
    $result2 = mysqli_query($db, $namecheck);

    if (mysqli_num_rows($result2) > 0) {

        if (mysqli_num_rows($result1) > 0){
            session_start();
            $_SESSION['name'] = $username;
            $login_sus = "Login successful!!! <a href='profile.php' target='_self'>Click here proceed</a>";

  
        }
        else{
            $pass_wrong ="Password incorrect. Try Again";

        }

    }else{
        $user_wrong = "There is no the this Username!";
        }

  }
}
?>	  
</body>