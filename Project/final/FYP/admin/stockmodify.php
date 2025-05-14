<body>
<?php 
  $db = mysqli_connect('localhost', 'root', '', 'CRS');

  if (isset($_POST['add'])) {
    $name = $_POST['name'];
    $price = $_POST['price'];


	$sql_u = "SELECT * FROM stock WHERE stockname = '$name'";
	$test_u = mysqli_query($db, $sql_u);

  
	 if (mysqli_num_rows($test_u) > 0) {
		  $name_error = "The Stock is already exist!!"; 	
	 }
  	else{
           $query = "INSERT INTO stock (stockname, stockprice) 
      	    	  VALUES ('$name','$price')";
           $results = mysqli_query($db, $query);



  	}
  }


  if (isset($_POST['del'])) {
  $name1 = $_POST['name1'];

  $sql_s = "SELECT * FROM stock WHERE stockname = '$name1'";
  $test_s = mysqli_query($db, $sql_s);

  if (mysqli_num_rows($test_s) == 0) {
    $name1_error = "The Stock is NOT exist!!"; 	
     }
    else{
        $query1 = "DELETE FROM stock WHERE stockname = '$name1'";
        $results1 = mysqli_query($db, $query1);
  }

  }
?>	  
</body>