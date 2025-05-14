<!DOCTYPE html>
<?php include('ucm11.php') ?>
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

.text{
    font-size: 30px;
    font-weight: bold;
}

.box {
	  background-color: #f2f2f2;
      border: 20px solid black;
      padding: 30px;
      margin: 20px;
      width: 25%;
      position: absolute;
      top: 20%;
      left: 25%;
      transform: translate(-50%, -50%);
}
.box1 {
	  background-color: #f2f2f2;
      border: 20px solid black;
      padding: 30px;
      margin: 20px;
      width: 25%;
      position: absolute;
      top: 20%;
      left: 75%;
      transform: translate(-50%, -50%);
}
.bbox{
  background-color: lightblue;
      border: 5px solid black;
      padding: 30px;
      margin: 20px;
      width: 40%;
      position: absolute;
      top: 30%;
      left: 50%;
      transform: translate(-50%, -50%);

}
.container {
  display: flex;
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

     
     $read5 = "SELECT computerid FROM computers";
     $read7 = "SELECT price FROM computers";
     $read8 = "SELECT userid FROM computers";
     $comid = mysqli_query($db, $read5);  
     $price = mysqli_query($db, $read7);  
     $userid = mysqli_query($db, $read8);  

     $read9 = "SELECT * FROM computers WHERE computername = 'cm27' ORDER BY date, stime";
     $cm11 = mysqli_query($db, $read9);  
?>

<div id="mySidenav" class="sidenav">
<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a href="../profile.php">Profile</a>
  <a href="computerlocation.php">Reservation</a>
  <a href="../order/order.php">Snacks & Drink</a>
  <a href="../order/payment.php">Payment & Record</a>
  <a href="../logout.php">Log Out</a>
</div>

<div id="main">
  <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; Option</span>
</div>

<div class = "box">
<form method="post" action="cm27.php" name= "bookaform" id="book_form">
  	<h1>Book Reservation</h1>


    <?php echo "<input type='text' name='name' value='$username' hidden>";  ?>
    <input type='text' name='comname' value='cm27' hidden>

    <div <?php if (isset($id_error)): ?> class="form_error" <?php endif ?> >
  		<input type="number"  placeholder="ID of Reservation" name="id" required>
		<?php if (isset($id_error)): ?>
      	<span><?php echo $id_error; ?></span>
      <?php endif ?>
  	</div>


  	<div>
  		<button type="submit" name="book" id="add_btn" value="book" form="book_form">Add</button>
  	</div>
</form>
    </div>


<div class = "box1">
<form method="post" action="cm27.php" name= "cancelform" id="cancel_form">
  	<h1>Cancel Reservation</h1>


    <?php echo "<input type='text' name='name' value='$username' hidden>";  ?>
    <input type='text' name='comname' value='cm27' hidden>

    <div <?php if (isset($id1_error)): ?> class="form_error" <?php endif ?> >
  		<input type="number"  placeholder="ID of Reservation" name="id" required>
		<?php if (isset($id1_error)): ?>
      	<span><?php echo $id1_error; ?></span>
      <?php endif ?>
  	</div>

  	<div>
  		<button type="submit" name="cancel" id="add_btn" value="cancel" form="cancel_form">Add</button>
  	</div>
</form>
</div>
</div>

<?php

echo '<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 80%;
    line-height: 200%;
    margin-left: auto;
    margin-right: auto;
  }

td, th:first-child{
    border: 5px solid black;
    padding: 8px;
    width:30%;
    text-align:center;
    font-weight:bold;
    font-size: 50px;
}
  
td, th{
    border: 5px solid black;
    text-align:center;
    padding: 8px;
    font-size:30px;
  }

th:nth-child(1), td:nth-child(1) {
  width: 10%;
}
th:nth-child(2), td:nth-child(2) {
  width: 35%;
}
th:nth-child(3), td:nth-child(3) {
  width: 20%;
}
th:nth-child(4), td:nth-child(4) {
  width: 20%;
}


</style>';
echo "<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>";
echo "<table>";
echo "<tr>
       <td>Computer Name</td>
       <td>Reservtion ID</td>
         <td>Date</td>
       <td>Start Time</td>
         <td>End Time</td>
   <td>Price(RM)</td>
         <td>Booked</td>
   <td>UserID Booked</td>
 </tr>";
while ($row = mysqli_fetch_row($cm11)){


 
echo "<tr>
    <td>$row[0]</td>  
    <td>$row[6]</td>
      <td>$row[1]</td>
      <td>$row[2]</td>	
      <td>$row[3]</td>	  
      <td>$row[4]</td>	 
      <td>$row[7]</td>	
      <td>$row[8]</td>	
   </tr>";
 

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