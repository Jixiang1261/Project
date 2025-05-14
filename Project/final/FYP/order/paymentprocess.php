<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>

  
body {
  font-family: "Lato", sans-serif;
  background-color: lightgrey;
}

h1, h2{
    text-align: center;
}
.sidenav {
  height: 100%;
  width: 0;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #111;
  overflow-x: hidden;
  transition: 0.5s;
  padding-top: 60px;
}

.sidenav a {
  padding: 8px 8px 8px 32px;
  text-decoration: none;
  font-size: 25px;
  color: #818181;
  display: block;
  transition: 0.3s;
}

.sidenav a:hover {
  color: #f1f1f1;
}

.sidenav .closebtn {
  position: absolute;
  top: 0;
  right: 25px;
  font-size: 36px;
  margin-left: 50px;
}

#main {
  transition: margin-left .5s;
  padding: 16px;
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}

.bbox{
  background-color: lightblue;
      border: 5px solid black;
      padding: 30px;
      margin: 20px;
      width: 60%;
      position: absolute;
      top: 30%;
      left: 35%;
      transform: translate(-50%, -50%);

}


.box{
  background-color: lightblue;
      border: 5px solid black;
      padding: 30px;
      margin: 20px;
      width: 20%;
      position: absolute;
      top: 30%;
      left: 50%;
      transform: translate(-50%, -50%);
    
}

.container {
  display: flex;
  justify-content: center;
  align-items: center;
}

.text{
    font-size: 30px;
    font-weight: bold;

 }

 table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 40%;
  line-height: 200%;
  float: left;
  margin-right: 5%;
  margin-left: 5%;
}


td, th:first-child{
  border: 5px solid black;
  text-align: middle;
  padding: 8px;
  width:30%;
}

td, th{
  border: 5px solid black;
  text-align: middle;
  padding: 8px;

}

tr:nth-child(odd) {
  background-color: #dddddd;

}

hr {
  color: sienna;
}

button {
  padding: 10px;
  border: 1px solid black;
  width: 50%;
  position: center;
}

</style>
</head>
<body>
<?php
error_reporting(0);
session_start();
if(!$_SESSION['name']) {
    echo "You haven't login";
    exit();
}
 else{
$username =$_SESSION['name'];
$db = mysqli_connect('localhost', 'root', '', 'CRS');
$read1 = "SELECT email FROM users WHERE username = '$username'";
$read2 = "SELECT phone FROM users WHERE username = '$username'";
$read3 = "SELECT gender FROM users WHERE username = '$username'";
$read4 = "SELECT userid FROM users WHERE username = '$username'";
$email = mysqli_query($db, $read1);  
$phone = mysqli_query($db, $read2);  
$gender = mysqli_query($db, $read3);  
$userid = mysqli_query($db, $read4);  
 }

?>

<?php 

 $db = mysqli_connect('localhost', 'root', '', 'CRS');

  if (isset($_POST['paymentorder'])) {
    $username = $_POST['name'];

    $read1 = "SELECT userid FROM users WHERE username = '$username'";
    $userid = mysqli_query($db, $read1);  
    $row = mysqli_fetch_row($userid);

    $order = "SELECT * FROM orderdata WHERE userid = '$row[0]' AND payment = 'unpaid'";
	$test1 = mysqli_query($db, $order);

    if (mysqli_num_rows($test1) > 0) {
            $total = 0;
            while ($row1 = mysqli_fetch_row($test1)) {
                $total += $row1[4];
            }
           echo"<div class = 'box'>
           <form method='post' action='confirmorder.php' name= 'confirmorder' id='confirmorder_form'>
                 <h1>Payment for Order</h1>
                 <h1>This ONLY SAMPLE</h1>
                 <h2>You have ".mysqli_num_rows($test1)." orders</h2>
                 <h2>Total Payment is RM $total </h2>
                 <div class ='container'>
                 <input type='text' name='name' value='$username' hidden>;
                     <button type='submit' name='confirmorder' id='confirmorder_btn' value='confirmorder' form='confirmorder_form' >Confirm Order Payment</button>
                 </div>
                 </div>
                 </form>";
 
           

  
        }
        else{
          echo"<div class = 'box'>
          <form method='post' action='payment.php' name= 'payment' id='payment'>
                <h1>You have no unpaid order</h1>
                <div class ='container'>
                    <button type='submit' name='payment' id='payment' value='payment' form='payment' >Back to Payment</button>
                </div>
                </div>
                </form>";
        }

    }
	

    if (isset($_POST['paymentres'])) {
      $username = $_POST['name1'];
  
      $read1 = "SELECT userid FROM users WHERE username = '$username'";
      $userid = mysqli_query($db, $read1);  
      $row = mysqli_fetch_row($userid);
  
     $res11 = "SELECT * FROM computers WHERE userid = '$row[0]' AND payment = 'unpaid'";
     $test11 = mysqli_query($db, $res11);

      if (mysqli_num_rows($test11) > 0) {
              $total = 0;
              while ($row1 = mysqli_fetch_row($test11)) {
                  $total += $row1[4];
              }
              
            $totalres = mysqli_num_rows($test11);

             echo"<div class = 'box'>
             <form method='post' action='confirmorder.php' name= 'confirmorder' id='confirmorder1_form'>
                   <h1>Payment for Order</h1>
                   <h1>This ONLY SAMPLE</h1>
                   <h2>You have ".$totalres." Reservation</h2>
                   <h2>Total Payment is RM $total </h2>
                   <div class ='container'>
                   <input type='text' name='name' value='$username' hidden>;
                       <button type='submit' name='confirmorder1' id='confirmorder1_btn' value='confirmorder1' form='confirmorder1_form' >Confirm Order Payment</button>
                   </div>
                   </div>
                   </form>";
   
             
  
    
          }
          else{
            echo"<div class = 'box'>
            <form method='post' action='payment.php' name= 'payment' id='payment'>
                  <h1>You have no unpaid Reservation</h1>
                  <div class ='container'>
                      <button type='submit' name='payment' id='payment' value='payment' form='payment' >Back to Payment</button>
                  </div>
                  </div>
                  </form>";
          }
  
      }
?>	  



<script>
function openNav() {
  document.getElementById("mySidenav").style.width = "250px";
  document.getElementById("main").style.marginLeft = "250px";
}

function closeNav() {
  document.getElementById("mySidenav").style.width = "0";
  document.getElementById("main").style.marginLeft= "0";
}
</script>
   
</body>
</html> 