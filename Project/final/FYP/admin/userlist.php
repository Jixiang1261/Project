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
      width: 30%;
      position: absolute;
      top: 30%;
      left: 25%;
      transform: translate(-50%, -50%);

}

.bbox1{
  background-color: lightblue;
      border: 5px solid black;
      padding: 30px;
      margin: 20px;
      width: 30%;
      position: absolute;
      top: 75%;
      left: 25%;
      transform: translate(-50%, -50%);

}

.bbox2{
  background-color: lightblue;
      border: 5px solid black;
      padding: 30px;
      margin: 20px;
      width: 30%;
      position: absolute;
      top: 75%;
      left: 75%;
      transform: translate(-50%, -50%);

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
  float: left;
  margin-right: 2%;
  margin-left: 2%;
}

td, th:first-child{
  border: 5px solid black;
  text-align: middle;
  padding: 8px;
  width:30%;
}

td, tr{
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


</style>
</head>
<body>
<?php 
 error_reporting(0);
 session_start();
 if(!$_SESSION['name1']) {
     echo "You haven't login";
     exit();
 }
  else{
      $username = $_SESSION['name1'];
      $db = mysqli_connect('localhost', 'root', '', 'CRS');
      $read1 = "SELECT email FROM admin1 WHERE username = '$username'";
      $read2 = "SELECT phone FROM admin1 WHERE username = '$username'";
      $read3 = "SELECT gender FROM admin1 WHERE username = '$username'";
      $read4 = "SELECT userid FROM admin1 WHERE username = '$username'";
      $email = mysqli_query($db, $read1);  
      $phone = mysqli_query($db, $read2);  
      $gender = mysqli_query($db, $read3);  
      $userid = mysqli_query($db, $read4);  
  } 
 ?>

<div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a href="adminprofile.php">Profile</a>
  <a href="../admincomputers/admincomputerlocation.php">Reservation</a>
  <a href="adminstock.php">Stock</a>
  <a href="usercheck.php">User Check</a>
  <a href="userlist.php">User List</a>
  <a href="adminlogout.php">Log Out</a>
</div>
<div id="main">
  <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; Option</span>
</div>


<?php
    $usercheck = "SELECT * FROM users";
    $user = mysqli_query($db, $usercheck);



    if (mysqli_num_rows($user) > 0) {

      echo "<div class='box-container'><table>";
        echo "<tr>
               <td style='width: 20%'>User ID</td>
               <td style='width: 20%'>Username</td>
               <td style='width: 20%'>Gender</td>
               <td style='width: 20%'>Email</td>
               <td style='width: 20%'>Phone</td>
         </tr>";
         while( $row12 = mysqli_fetch_row($user)){
          echo "<tr>
          <td style='width: 20%'>$row12[0]</td>
          <td style='width: 20%'>$row12[1]</td>
          <td style='width: 20%'>$row12[2]</td>
          <td style='width: 20%'>$row12[3]</td>
          <td style='width: 20%'>$row12[4]</td>
               </tr>";
        ;
}}
  
  else{
    $id_wrong ="There is no Any User ";


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