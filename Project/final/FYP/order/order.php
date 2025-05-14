<!DOCTYPE html>
<?php include('orderprocess.php') ?>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>

  
body {
  font-family: "Lato", sans-serif;
  background-color: lightgrey;
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
      left: 40%;
      transform: translate(-50%, -50%);

}

.bbox1{
  background-color: lightblue;
      border: 5px solid black;
      padding: 30px;
      margin: 20px;
      width: 15%;
      position: absolute;
      top: 30%;
      left: 80%;
      transform: translate(-50%, -50%);

}


.box{
  background-color: lightblue;
      border: 5px solid black;
      padding: 30px;
      margin: 20px;
      width: 30%;
      position: absolute;
      top: 30%;
      left: 70%;
      transform: translate(-50%, -50%);

}


.box1{
  background-color: lightblue;
      border: 5px solid black;
      padding: 30px;
      margin: 20px;
      width: 30%;
      position: absolute;
      top: 60%;
      left: 70%;
      transform: translate(-50%, -50%);

}
.table-container {
  position: absolute;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  height: 100%;
}

.text{
    font-size: 30px;
    font-weight: bold;

 }

 table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 45%;
  line-height: 200%;
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

input {
  padding: 10px;
  border: 1px solid black;
  width: 50%;
}

button {
  padding: 10px;
  border: 1px solid black;
  width: 20%;
}


hr {
  color: sienna;
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

<div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a href="../profile.php">Profile</a>
  <a href="../computers/computerlocation.php">Reservation</a>
  <a href="order.php">Snacks & Drink</a>
  <a href="payment.php">Payment</a>
  <a href="../logout.php">Log Out</a>
</div>

<div id="main">
  <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; Option</span>
</div>
<hr>


<div class = "box">
<form method="post" action="order.php" name= "orderform" id="order_form">
  	<h1>Order</h1>
    <?php echo "<input type='text' name='name' value='$username' hidden>";  ?>


    <div <?php if (isset($id_error)): ?> class="form_error" <?php endif ?> >
     <input type="number" name="sid" placeholder="Stock ID" required>
		<?php if (isset($id_error)): ?>
      	<span><?php echo $id_error; ?></span>
      <?php endif ?>

  	</div>

    <div>
      <input type="number" name="quantity" placeholder="Quantity (Max20)" min=1 max=20 required>
  	</div>


  	<div <?php if (isset($id_error)): ?> class="form_error" <?php endif ?>>
  		<button type="submit" name="order" id="order_btn" value="order" form="order_form" >Order</button>
      <?php if (isset($done)): ?>
      	<span><?php echo $done; ?></span>
        <?php endif ?>
  	</div>
</form>
</div>



<div class = "box1">
<form method="post" action="order.php" name= "cancelform" id="cancel_form">
  	<h1>Order Cancel</h1>
    <?php echo "<input type='text' name='name' value='$username' hidden>";  ?>


    <div <?php if (isset($id1_error)): ?> class="form_error" <?php endif ?> >
     <input type="number" name="cid" placeholder="Stock ID" required>
		<?php if (isset($id1_error)): ?>
      	<span><?php echo $id1_error; ?></span>
      <?php endif ?>

  	</div>


  	<div <?php if (isset($cancel)): ?> class="form_error" <?php endif ?>>
  		<button type="submit" name="cancel" id="cancel_btn" value="cancel" form="cancel_form" >Cancel</button>
      <?php if (isset($cancel)): ?>
      	<span><?php echo $cancel; ?></span>
        <?php endif ?>
  	</div>
</form>
</div>






























<?php
echo "<style>

  td, th{
    text-align:center;
    padding: 8px;
    font-size:30px;
  }
  </style>";



echo "<div class='box-container'><table>";
echo "<tr>
       <td style='width: 30%; font-weight:bold'>Stock ID</td>
       <td style='width: 40%; font-weight:bold'>Stock Name</td>
       <td style='width: 30%; font-weight:bold'>Price(RM)</td>
 </tr>";

 $read1 = "SELECT * FROM stock";
 $result2 = mysqli_query($db, $read1); 


if (mysqli_num_rows($result2) > 0){
  while ($row = mysqli_fetch_array($result2)){
	echo "<tr>
        <td style='width: 30%'>$row[0]</td>
        <td style='width: 40%'>$row[1]</td>
        <td style='width: 30%'>$row[2]</td>
	     </tr>";
  };
}


echo  "</div>";
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