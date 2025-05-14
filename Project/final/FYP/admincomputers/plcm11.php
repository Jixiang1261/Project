<body>
<?php 
  $db = mysqli_connect('localhost', 'root', '', 'CRS');

  if (isset($_POST['add'])) {
  	$date = $_POST['date'];
    $time = $_POST['time'];
    $price = $_POST['price'];
    $com = $_POST['comname'];
    $s='00';
    $m='00';
    $d=mktime($time, $m, $s);
    $formatted_time= date("h:i:sa", $d);

    $time1 = $time + 1;
    $d1=mktime( $time1, $m, $s);
    $formatted_time1= date("h:i:sa", $d1);

	$sql_u = "SELECT * FROM computers WHERE computername = '$com' AND date='$date' AND stime='$formatted_time'";
	$test_u = mysqli_query($db, $sql_u);

  
	 if (mysqli_num_rows($test_u) > 0) {
		  $time_error = "The reservation time is already exist!!"; 	
	 }
  	else{
           $query = "INSERT INTO computers (computername, date, stime, etime, price, payment, booked) 
      	    	  VALUES ('$com','$date','$formatted_time','$formatted_time1','$price','unpaid', 'No')";
           $results = mysqli_query($db, $query);

  	}
  }

  if (isset($_POST['create'])) {
  	$date = $_POST['date3'];
    $time = $_POST['time3'];
    $time1 = $_POST['time4'];
    $price = $_POST['price'];
    $com = $_POST['comname'];
    if($time1 > $time){
    $loop = $time1+1 - $time; 
    $s='00';
    $m='00';
    $d=mktime($time, $m, $s);
    $formatted_time= date("h:i:sa", $d);

    $time1 = $time + 1;
    $d1=mktime( $time1, $m, $s);
    $formatted_time1= date("h:i:sa", $d1);

    while($loop >0){
	$sql_u = "SELECT * FROM computers WHERE computername = '$com' AND date='$date' AND stime='$formatted_time'";
	$test_u = mysqli_query($db, $sql_u);

	 if (mysqli_num_rows($test_u) > 0) {
		  $time2_error = "Some reservation time is already exist!!"; 	
	 }
  	else{
           $query = "INSERT INTO computers (computername, date, stime, etime, price, payment, booked) 
      	    	  VALUES ('$com','$date','$formatted_time','$formatted_time1','$price','unpaid', 'No')";
           $results = mysqli_query($db, $query);

  	
  }    
  $s='00';
  $m='00';
  $time = $time +1;
  $d=mktime($time, $m, $s);
  $formatted_time= date("h:i:sa", $d);

  $time1 = $time + 1;
  $d1=mktime( $time1, $m, $s);
  $formatted_time1= date("h:i:sa", $d1);

  $loop =$loop -1;
  }
}
else{
  $time1_error = "The first time cannot bigger or same with the last time!!"; 
}
}
  if (isset($_POST['delete1'])) {
    $com = $_POST['comname'];
  $date1 = $_POST['date1'];
  $query = "DELETE FROM computers WHERE computername = '$com' AND date='$date1'";
  $results = mysqli_query($db, $query);

  }

  if (isset($_POST['delete2'])) {
    $com = $_POST['comname'];
    $date = $_POST['date2'];
    $time = $_POST['time1'];
    $s='00';
    $m='00';
    $d=mktime($time, $m, $s);
    $formatted_time= date("h:i:sa", $d);

    $query = "DELETE FROM computers WHERE computername = '$com' AND date='$date' AND stime = '$formatted_time'";
    $results = mysqli_query($db, $query);
  
    }
?>	  
</body>