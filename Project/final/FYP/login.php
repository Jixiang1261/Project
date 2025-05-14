<?php include('authenticate.php') ?>
<html>

<head>
  <title>Login</title>
  <link rel="stylesheet" href="css/style.css">
</head>

<body>
  <form method="post" action="login.php" id="register_form">
  	<h1>Login</h1>


  	<div <?php if (isset($name_error)): ?> class="form_error" <?php endif ?> >
      <input type="text" name="username" placeholder="Username" required>
	  <?php if (isset($name_error)): ?>
	  	<span><?php echo $name_error; ?></span>
	  <?php endif ?>
  	</div>

  	<div>
  		<input type="password"  placeholder="Password" name="password" required>
  	</div>

	<div <?php if (isset($password_error)): ?> class="form_error" <?php endif ?> >
  		<input type="password"  placeholder="Confirm Password" name="cpassword" required>
		<?php if (isset($password_error)): ?>
      	<span><?php echo $password_error; ?></span>
      <?php endif ?>
  	</div>



  	<div>
  		<button type="submit" name="login" id="reg_btn">Login</button>
  	</div>

	  <div>

        <?php if (isset($login_sus)): ?>
	        <span><?php echo $login_sus; ?></span>
        <?php endif ?>
        <?php if (isset($pass_wrong)): ?>
	        <span><?php echo $pass_wrong; ?></span>
        <?php endif ?>
        <?php if (isset($user_wrong)): ?>
	        <span><?php echo $user_wrong; ?></span>
        <?php endif ?>


</div>
  </form>
 </body>
</html>
