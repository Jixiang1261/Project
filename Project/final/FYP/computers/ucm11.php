<body>
<?php 

     $db = mysqli_connect('localhost', 'root', '', 'CRS');

  if (isset($_POST['book'])) {
    $username = $_POST['name'];
    $com = $_POST['comname'];

    $read4 = "SELECT userid FROM users WHERE username = '$username'";
    $userid = mysqli_query($db, $read4);  


    $id = $_POST['id'];
	$sql_u = "SELECT * FROM computers WHERE reservationid = '$id' AND computername = '$com'";
	$test_u = mysqli_query($db, $sql_u);

  if (mysqli_num_rows($test_u) > 0){
    while ($row = mysqli_fetch_row($test_u)){
	    
        if($row[7] == "Yes"){
          $id_error = "This reservation is already BOOKED !!";

        } 
  	else{
          $row = mysqli_fetch_array($userid);
          $query = "UPDATE computers SET userid = '$row[0]' WHERE reservationid = '$id'";
          $query1 = "UPDATE computers SET booked = 'Yes' WHERE reservationid = '$id'";
          $results = mysqli_query($db, $query);
          $results1 = mysqli_query($db, $query1);

  	}
  }
}
else{
  $id_error = "There is no reservation with this ID !!";
}

  }


if (isset($_POST['cancel'])) {
  $username = $_POST['name'];
  $com = $_POST['comname'];

  $read4 = "SELECT userid FROM users WHERE username = '$username'";
  $userid = mysqli_query($db, $read4);  


  $id = $_POST['id'];
  $sql_u = "SELECT * FROM computers WHERE reservationid = '$id' AND computername = '$com'";
  $test_u = mysqli_query($db, $sql_u);
  $row1 = mysqli_fetch_row($userid);

  if((mysqli_num_rows($test_u) > 0)){
  while ($row = mysqli_fetch_row($test_u)){
    
      if($row[7] == "No"){
        $id1_error = "This reservation is NOT BOOKED !!";

      } 
      elseif($row[7] == "Yes" && $row[8] != $row1[0]){
        $id1_error = "You are not the user that Book this reservation.";
      }
      elseif($row[7] == "Yes" && $row[8] == $row1[0] && $row[5] == 'paid'){
        $id1_error = "You CANNOT cancel the reservation that is paid.";
      }
  else{
        $row = mysqli_fetch_array($userid);
        $query = "UPDATE computers SET userid = NULL WHERE reservationid = '$id'";
        $query1 = "UPDATE computers SET booked = 'No' WHERE reservationid = '$id'";
        $results = mysqli_query($db, $query);
        $results1 = mysqli_query($db, $query1);

  }
}}
else{
  $id1_error = "This reservation is NOT available !!";
}
}
?>	  
</body>