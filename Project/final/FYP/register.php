<?php include('process.php') ?>
<html>

<head>
  <title>Register</title>
  <link rel="stylesheet" href="css/style.css">
</head>

<body>
  <form method="post" action="register.php" id="register_form">
  	<h1>Register</h1>


  	<div <?php if (isset($name_error)): ?> class="form_error" <?php endif ?> >
      <input type="text" name="username" placeholder="Username" required>
	  <?php if (isset($name_error)): ?>
	  	<span><?php echo $name_error; ?></span>
	  <?php endif ?>
  	</div>

	<div>
  		<input type="radio" name="gender" value="Male" required>
		<label for="html">Male</label>
		<input type="radio"  name="gender" value="Female">
		<label for="html">Female</label>
		<input type="radio"  name="gender" value="PNTS">
		<label for="html">Prefer Not To Say</label>
  	</div>

  	<div <?php if (isset($email_error)): ?> class="form_error" <?php endif ?> >
      <input type="email" name="email" placeholder="Email" required>
      <?php if (isset($email_error)): ?>
      	<span><?php echo $email_error; ?></span>
      <?php endif ?>
  	</div>

	<div>
	<input type="tel" id="phone" placeholder="Phone.No= XXX-XXXX-XXX" name="phone" pattern="[0-9]{3}-[0-9]{4}-[0-9]{3}" required>
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
  		<button type="submit" name="register" id="reg_btn">Register</button>
  	</div>
	  <h2>Already have an account?<a href= 'login.php'> Login here</a></h2>
  </form>

 </body>
</html>
