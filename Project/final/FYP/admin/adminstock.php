<!DOCTYPE html>
<?php include('stockmodify.php') ?>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>

body {
  font-family: "Lato", sans-serif;
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

.box{
  background-color: lightblue;
      border: 5px solid black;
      padding: 30px;
      margin: 20px;
      width: 25%;
      position: absolute;
      top: 25%;
      left: 30%;
      transform: translate(-50%, -50%);

}

.box1{
  background-color: lightblue;
      border: 5px solid black;
      padding: 30px;
      margin: 20px;
      width: 25%;
      position: absolute;
      top: 25%;
      left: 70%;
      transform: translate(-50%, -50%);

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
     $read = "SELECT * FROM users WHERE username = '$username'";
     $result1 = mysqli_query($db, $read);  


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


<div class="box-container">
<div class = "box">
<form method="post" action="adminstock.php" name= "addform" id="add_form">
  	<h1>Add Stock</h1>

    <div <?php if (isset($name_error)): ?> class="form_error" <?php endif ?> >
     <input type="name" name="name" placeholder="Name" required>
		<?php if (isset($name_error)): ?>
      	<span><?php echo $name_error; ?></span>
      <?php endif ?>
  	</div>
    
    <div>
      <input type="float" name="price" placeholder="Price" required>
  	</div>


  	<div>
  		<button type="submit" name="add" id="add_btn" value="add" form="add_form" >Add</button>
  	</div>
</form>
</div>

<div class = "box1">
<form method="post" action="adminstock.php" name= "delform" id="del_form">
  	<h1>Delete Stock</h1>

    <div <?php if (isset($name1_error)): ?> class="form_error" <?php endif ?> >
     <input type="name" name="name1" placeholder="Name" required>
		<?php if (isset($name1_error)): ?>
      	<span><?php echo $name1_error; ?></span>
      <?php endif ?>
  	</div>


  	<div>
  		<button type="submit" name="del" id="del_btn" value="del" form="del_form" >Delete</button>
  	</div>
</form>
</div>
</div>


<?php
echo "<hr>";
echo "<style>

  td, th{
    text-align:center;
    padding: 8px;
    font-size:30px;
  }
  </style>";


echo "<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><hr><br><br>";

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