<?php
  $db = mysqli_connect('localhost', 'root','', 'CRS');
  if (isset($_POST['finish'])) {
  	$orderid = $_POST['orderid'];

    $ordercheck = "SELECT * FROM orderdata WHERE orderid = '$orderid'";
    $runoc =  mysqli_query($db, $ordercheck);
    $finishorder = "UPDATE orderdata SET taken = 'Yes', payment = 'paid' WHERE orderid ='$orderid'";

    $test1 =  mysqli_query($db, $finishorder);

    echo "<a href='usercheck.php'>Back to User Check</a>";
  }

?>