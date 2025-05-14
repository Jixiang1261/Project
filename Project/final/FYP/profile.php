<!DOCTYPE html>
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
      left: 50%;
      transform: translate(-50%, -50%);

}


.box{
  background-color: lightblue;
  border: 5px solid black;
  padding: 30px;
  margin: 20px;
  width: 60%;
  transform: translate(-50%, -50%);
  position: absolute;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  height: 100%;
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
  width: 100%;
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
  <a href="profile.php">Profile</a>
  <a href="computers/computerlocation.php">Reservation</a>
  <a href="order/order.php">Snacks & Drink</a>
  <a href="order/payment.php">Payment</a>
  <a href="logout.php">Log Out</a>
</div>

<div id="main">
  <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; Option</span>
</div>

<hr>

<div class= "bbox" >
<table >
  <tr class = "text">
    <th>User ID</th>
    <th><?php while ($row = mysqli_fetch_array($userid)) {echo $row[0];} ?></th>
  </tr>
</table>
<br>
<br>
<table>
  <tr class = "text">
    <th>Username</th>
    <th><?php echo "  $username " ?></th>
  </tr>
</table>
<br>
<br>
<table>
  <tr class = "text">
    <th>Email</th>
    <th><?php while ($row = mysqli_fetch_array($email)) {echo $row[0];} ?></th>
  </tr>
</table>
<br>
<br>
<table>
  <tr class = "text"> 
    <th>Phone</th>
    <th><?php while ($row = mysqli_fetch_array($phone)) {echo $row[0];} ?></th>
  </tr>
</table>
</div>



<?php

echo "<style>
  
td, th{
    text-align:center;
    padding: 8px;
    font-size:30px;
  }
  </style>";





echo "<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>";
echo "<div class='box-container'><table>";
echo "<tr>
       <td style='width: 7.5%'>Computer Name</td>
       <td style='width: 7.5%'>Reservation ID</td>
       <td style='width: 20%'>Date</td>
       <td style='width: 20%'>Start Time</td>
       <td style='width: 20%'>End Time</td>
       <td style='width: 10%'>Price(RM)</td>
       <td style='width: 10%'>Payment</td>
       <td style='width: 5%'>Booked</td>
   
 </tr>";
 


$read6 = "SELECT userid FROM users WHERE username = '$username'";
$userid1 = mysqli_query($db, $read6);  


$row = mysqli_fetch_array($userid1);

$cm11 = "SELECT * FROM computers WHERE userid = '$row[0]' ORDER BY computername ASC, date ASC, stime ASC";
$rcm11 = mysqli_query($db, $cm11);  




if (mysqli_num_rows($rcm11) > 0){
  while ($row = mysqli_fetch_array($rcm11)){
	echo "<tr>
        <td style='width: 7.5%'>$row[0]</td> 
	      <td style='width: 7.5%'>$row[6]</td>  
        <td style='width: 20%'>$row[1]</td>	
        <td style='width: 20%'>$row[2]</td>
        <td style='width: 20%'>$row[3]</td>	
        <td style='width: 10%'>$row[4]</td>	  
        <td style='width: 10%'>$row[5]</td>	 
        <td style='width: 5%'>$row[7]</td>	
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