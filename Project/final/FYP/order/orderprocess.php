<body>
<?php 

     $db = mysqli_connect('localhost', 'root', '', 'CRS');


    if(isset($_POST['order'])) {
    $username = $_POST['name'];


    $quantity = $_POST['quantity'];
    $stockid = $_POST['sid'];
    $read4 = "SELECT userid FROM users WHERE username = '$username'";
    $stocktest = "SELECT * FROM stock WHERE stockid = '$stockid'";
    $userid = mysqli_query($db, $read4);  
    $test = mysqli_query($db, $stocktest);  


    
	    
        if(mysqli_num_rows($test) > 0){
            $row = mysqli_fetch_row($userid);
            $row1 = mysqli_fetch_row($test);
            $total = $quantity * $row1[2];
            $query = "INSERT INTO orderdata (userid, stockid, stockname, price, quantity, payment, taken) 
            VALUES ('$row[0]','$row1[0]','$row1[1]','$total','$quantity', 'unpaid', 'No')";
            $results = mysqli_query($db, $query);
            $done = "Order Added!!";

        } 
  	else{
        $id_error = "There is no Stock with this ID!!";
  	}
  
}


if(isset($_POST['cancel'])) {
  $username = $_POST['name'];


  $orderid = $_POST['cid'];
  $read4 = "SELECT userid FROM users WHERE username = '$username'";
  $ordertest = "SELECT * FROM orderdata WHERE orderid = '$orderid'";
  $userid = mysqli_query($db, $read4);  
  $test = mysqli_query($db, $ordertest);  

  
    
  if(mysqli_num_rows($test) > 0){
        $row = (mysqli_fetch_row($test));
        if($row[6] == 'unpaid'){
          $query ="DELETE FROM orderdata WHERE orderid='$orderid'";
          $results = mysqli_query($db, $query);
          $cancel = "Order Cancled!!";

      } 
      else{
         $cancel = "Order Cannot be Cancel because it was paid!!";

      }
    }
  else{
      $id1_error = "There is no Order with this ID!!";
  }

}
?>	  
</body>