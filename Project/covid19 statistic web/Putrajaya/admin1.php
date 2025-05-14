<!DOCTYPE html>
<html>
<head>
      <title>Checking</title>
	  <style>
	  		 h2 {
		     text-align: center;
			 font-size: 60px;
			 color:black;
            }
			
			 h1 {
		     text-align: center;
			 font-size: 40px;
			 color:blue;
            }
	  </style>
</head>

<body>
      <?php
   
    //get data to insert
    $name = $_POST['name'];
    $password = $_POST['password'];
	
    //check
	if($name == "admin123" && $password == "123456"){
		echo "<h1>Welcome ADMIN</h1>";
		echo "<a href='Putrajaya - Copy.php'><h1>Back with Admin permission</h1></a>";
	}
	else{
		echo "<h1>Wrong input!!! Try again.</h1>";
	    echo "<a href='Putrajaya.php'><h1>Back to Putrajaya</h1></a>";
	}
   ?>
   
</body>

</html>