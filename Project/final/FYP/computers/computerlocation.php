<!DOCTYPE html>
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


.bbox{
  background-color: lightblue;
      border: 5px solid black;
      padding: 30px;
      margin: 20px;
      width: 65%;
      position: absolute;
      top: 60%;
      left: 50%;
      transform: translate(-50%, -50%);

}

.figure-container {
      display: flex;
      flex-wrap: wrap;
    }

</style>

<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">


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
      $username = $_SESSION['name'];
     $db = mysqli_connect('localhost', 'root', '', 'CRS');
     $read1 = "SELECT email FROM users WHERE username = '$username'";
     $read2 = "SELECT phone FROM users WHERE username = '$username'";
     $read3 = "SELECT gender FROM users WHERE username = '$username'";
     $read4 = "SELECT userid FROM users WHERE username = '$username'";
     $email = mysqli_query($db, $read1);  
     $phone = mysqli_query($db, $read2);  
     $gender = mysqli_query($db, $read3);  
     $userid = mysqli_query($db, $read4);  
      
     
     
     $read = "SELECT * FROM users WHERE username = '$username'";
     $result1 = mysqli_query($db, $read);  
      }
?>

<div id="mySidenav" class="sidenav">
<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a href="../profile.php">Profile</a>
  <a href="computerlocation.php">Reservation</a>
  <a href="../order/order.php">Snacks & Drink</a>
  <a href="../order/payment.php">Payment & Record</a>
  <a href="../logout.php">Log Out</a>
</div>

<div class = bbox>
<div class="figure-container">
  <figure>
   <a href="cm11.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM11</figcaption>
  </figure>

  <figure>
   <i class="material-icons" style="font-size:48px;color:rgba(255, 255, 255, 0.0)">computer</i></a>
  </figure>

  <figure>
   <a href="cm21.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM21</figcaption>
  </figure>
  <figure>
   <a href="cm31.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM31</figcaption>
  </figure>

  <figure>
   <i class="material-icons" style="font-size:48px;color:rgba(255, 255, 255, 0.0)">computer</i></a>
  </figure>

  <figure>
   <a href="cm41.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM41</figcaption>
  </figure> 
  <figure>
   <a href="cm51.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM51</figcaption>
  </figure>

  <figure>
   <i class="material-icons" style="font-size:48px;color:rgba(255, 255, 255, 0.0)">computer</i></a>
  </figure>

  <figure>
   <a href="cm61.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM61</figcaption>
  </figure>
  </div>


<!-------------------Second Row----------------------->
  <div class="figure-container">
<figure>
   <a href="cm12.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM12</figcaption>
</figure>

  <figure>
   <i class="material-icons" style="font-size:48px;color:rgba(255, 255, 255, 0.0)">computer</i></a>
  </figure>


  <figure>
   <a href="cm22.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM22</figcaption>
  </figure>
  <figure>
   <a href="cm32.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM32</figcaption>
  </figure>

  <figure>
   <i class="material-icons" style="font-size:48px;color:rgba(255, 255, 255, 0.0)">computer</i></a>
  </figure>

  <figure>
   <a href="cm42.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM42</figcaption>
  </figure> 
  <figure>
   <a href="cm52.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM52</figcaption>
  </figure>
    
  <figure>
   <i class="material-icons" style="font-size:48px;color:rgba(255, 255, 255, 0.0)">computer</i></a>
  </figure>

  <figure>
   <a href="cm62.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM62</figcaption>
  </figure>
  </div>

  <!-------------------Third Row----------------------->

  <div class="figure-container">
<figure>
   <a href="cm13.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM13</figcaption>
</figure>

  <figure>
   <i class="material-icons" style="font-size:48px;color:rgba(255, 255, 255, 0.0)">computer</i></a>
  </figure>


  <figure>
   <a href="cm23.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM23</figcaption>
  </figure>
  <figure>
   <a href="cm33.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM33</figcaption>
  </figure>

  <figure>
   <i class="material-icons" style="font-size:48px;color:rgba(255, 255, 255, 0.0)">computer</i></a>
  </figure>

  <figure>
   <a href="cm43.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM43</figcaption>
  </figure> 
  <figure>
   <a href="cm53.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM53</figcaption>
  </figure>
    
  <figure>
   <i class="material-icons" style="font-size:48px;color:rgba(255, 255, 255, 0.0)">computer</i></a>
  </figure>

  <figure>
   <a href="cm63.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM63</figcaption>
  </figure>
  </div>

   <!-------------------Fourth Row----------------------->


  <div class="figure-container">
  <figure>
   <a href="cm14.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM14</figcaption>
  </figure>

  <figure>
   <i class="material-icons" style="font-size:48px;color:rgba(255, 255, 255, 0.0)">computer</i></a>
  </figure>

  <figure>
   <a href="cm24.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM24</figcaption>
  </figure>
  <figure>
   <a href="cm34.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM34</figcaption>
  </figure>

  <figure>
   <i class="material-icons" style="font-size:48px;color:rgba(255, 255, 255, 0.0)">computer</i></a>
  </figure>

  <figure>
   <a href="cm44.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM44</figcaption>
  </figure> 
  <figure>
   <a href="cm54.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM54</figcaption>
  </figure>

  <figure>
   <i class="material-icons" style="font-size:48px;color:rgba(255, 255, 255, 0.0)">computer</i></a>
  </figure>

  <figure>
   <a href="cm64.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM64</figcaption>
  </figure>
  </div>

  <!-------------------Fifth Row----------------------->

  <div class="figure-container">
  <figure>
   <a href="cm15.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM15</figcaption>
  </figure>

  <figure>
   <i class="material-icons" style="font-size:48px;color:rgba(255, 255, 255, 0.0)">computer</i></a>
  </figure>

  <figure>
   <a href="cm25.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM25</figcaption>
  </figure>
  <figure>
   <a href="cm35.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM35</figcaption>
  </figure>

  <figure>
   <i class="material-icons" style="font-size:48px;color:rgba(255, 255, 255, 0.0)">computer</i></a>
  </figure>

  <figure>
   <a href="cm45.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM45</figcaption>
  </figure> 
  <figure>
   <a href="cm55.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM55</figcaption>
  </figure>

  <figure>
   <i class="material-icons" style="font-size:48px;color:rgba(255, 255, 255, 0.0)">computer</i></a>
  </figure>

  <figure>
   <a href="cm65.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM65</figcaption>
  </figure>
  </div>

    <!-------------------Sixth Row----------------------->


  <div class="figure-container">
  <figure>
   <a href="cm16.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM16</figcaption>
  </figure>

  <figure>
   <i class="material-icons" style="font-size:48px;color:rgba(255, 255, 255, 0.0)">computer</i></a>
  </figure>

  <figure>
   <a href="cm26.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM26</figcaption>
  </figure>
  <figure>
   <a href="cm36.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM36</figcaption>
  </figure>

  <figure>
   <i class="material-icons" style="font-size:48px;color:rgba(255, 255, 255, 0.0)">computer</i></a>
  </figure>

  <figure>
   <a href="cm46.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM46</figcaption>
  </figure> 
  <figure>
   <a href="cm56.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM56</figcaption>
  </figure>

  <figure>
   <i class="material-icons" style="font-size:48px;color:rgba(255, 255, 255, 0.0)">computer</i></a>
  </figure>

  <figure>
   <a href="cm66.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM66</figcaption>
  </figure>
  </div>

      <!-------------------Seventh Row----------------------->

  <div class="figure-container">
  <figure>
   <a href="cm17.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM17</figcaption>
  </figure>

  <figure>
   <i class="material-icons" style="font-size:48px;color:rgba(255, 255, 255, 0.0)">computer</i></a>
  </figure>

  <figure>
   <a href="cm27.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM27</figcaption>
  </figure>
  <figure>
   <a href="cm37.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM37</figcaption>
  </figure>

  <figure>
   <i class="material-icons" style="font-size:48px;color:rgba(255, 255, 255, 0.0)">computer</i></a>
  </figure>

  <figure>
   <a href="cm47.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM47</figcaption>
  </figure> 
  <figure>
   <a href="cm57.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM57</figcaption>
  </figure>

  <figure>
   <i class="material-icons" style="font-size:48px;color:rgba(255, 255, 255, 0.0)">computer</i></a>
  </figure>

  <figure>
   <a href="cm67.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM67</figcaption>
  </figure>
  </div>

<!-------------------Eighth Row----------------------->

  <div class="figure-container">
  <figure>
   <a href="cm18.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM18</figcaption>
  </figure>

  <figure>
   <i class="material-icons" style="font-size:48px;color:rgba(255, 255, 255, 0.0)">computer</i></a>
  </figure>

  <figure>
   <a href="cm28.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM28</figcaption>
  </figure>
  <figure>
   <a href="cm38.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM38</figcaption>
  </figure>

  <figure>
   <i class="material-icons" style="font-size:48px;color:rgba(255, 255, 255, 0.0)">computer</i></a>
  </figure>

  <figure>
   <a href="cm48.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM48</figcaption>
  </figure> 
  <figure>
   <a href="cm58.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM58</figcaption>
  </figure>

  <figure>
   <i class="material-icons" style="font-size:48px;color:rgba(255, 255, 255, 0.0)">computer</i></a>
  </figure>

  <figure>
   <a href="cm68.php" ><i class="material-icons" style="font-size:48px;color:red">computer</i></a>
   <figcaption>CM68</figcaption>
  </figure>
  </div>

  

</div>
<?php


?>



<div id="main">
  <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; Option</span>
</div>



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