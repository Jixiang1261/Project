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

 $db = mysqli_connect('localhost', 'root', '', 'CRS');

  if (isset($_POST['confirmorder'])) {
    $username = $_POST['name'];

    $read1 = "SELECT userid FROM users WHERE username = '$username'";
    $userid = mysqli_query($db, $read1);  
    $row = mysqli_fetch_row($userid);

    $order = "SELECT * FROM orderdata WHERE userid = '$row[0]'";
  	$test1 = mysqli_query($db, $order);

    if (mysqli_num_rows($test1) > 0) {
        $paid = "UPDATE orderdata SET payment = 'paid' WHERE userid = '$row[0]'";
        $test1 = mysqli_query($db, $paid);
        echo"<div class = 'box'>
        <form method='post' action='payment.php' name= 'confirmorder' id='confirmorder_form'>
              <h1>Payment Succesfull</h1>
              <div class ='container'>
                  <button type='submit' name='confirmorder' id='confirmorder_btn' value='confirmorder' form='confirmorder_form' >Confirm Order Payment</button>
              </div>
              </div>";
            }
  
        else{
            $noorderpayment ="You have no any unpaid order <a href='payment.php' target='_self'>Click here to go back</a>";

        }
      }
    
      if (isset($_POST['confirmorder1'])) {
        $username = $_POST['name'];
    
        $read1 = "SELECT userid FROM users WHERE username = '$username'";
        $userid = mysqli_query($db, $read1);  
        $row = mysqli_fetch_row($userid);
    
        $cm11 = "SELECT * FROM computers WHERE userid = '$row[0]'";
        $cm11c = mysqli_query($db, $cm11);
    
        if (mysqli_num_rows($cm11c) > 0) {
            $paidcm11 = "UPDATE computers SET payment = 'paid' WHERE userid = '$row[0]'";
            $cm11r = mysqli_query($db, $paidcm11);
            echo"<div class = 'box'>
            <form method='post' action='payment.php' name= 'confirmorder' id='confirmorder_form'>
                  <h1>Payment Succesfull</h1>
                  <div class ='container'>
                      <button type='submit' name='confirmorder' id='confirmorder_btn' value='confirmorder' form='confirmorder_form' >Confirm Order Payment</button>
                  </div>
                  </div>";
        }
            else{
                $noorderpayment ="You have no any unpaid order <a href='payment.php' target='_self'>Click here to go back</a>";
    
            }
      }
?>	  

</body>
</html> 