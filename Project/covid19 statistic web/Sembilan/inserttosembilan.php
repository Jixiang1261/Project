<!DOCTYPE html>
<html>
<head>
      <title>Insert data to Negeri Sembilan</title>
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
    //i connect to database
	$cont = mysqli_connect('localhost', 'root', '');
	
	//ii check
	if(!$cont){
		  echo("error");
	}
	
	//select database
	if(!(mysqli_select_db($cont, "malaysia"))){
		  echo("error2");
	}
	
    //get data to insert
    extract($_POST);	
    
	//insert 
	$query = "INSERT INTO sembilan VALUES('$datetime', $deathcases, $confirmedcases, $hospitaladmission)";
	
	//run the command and store in the result
	if(!($result = mysqli_query($cont, $query))){
		  echo("Failed to insert");
	}

	//disconnect
	mysqli_close($cont);
	
   ?>
    <h2>Insert Sucess</h2>
    <a href="Sembilan - Copy.php"><h1>Back to Negeri Sembilan Status</h1></a>
</body>

</html>