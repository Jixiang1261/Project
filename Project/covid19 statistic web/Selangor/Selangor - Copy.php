<!DOCTYPE html>
<html>
<head>
     <title>Selangor</title>
     <style type=text/css>
      .bold {
		  font-weight: bold;
		  font-size: 20px;
		  }
		  
	  .other{
		  font-size: 20px;
		  }
	  
	  table, th, td {
      border: 3px solid black;
      }
	  
	   h1 {
	   font-size: 60px;
	   color:blue;
       }
	  
	   h2 {
	   font-size: 30px;
	   color:blue;
       }
	   
       #myChart {
       position: absolute;
       left: 50%;
       top: 5%;
	   }

       #myChart1 {
       position: absolute;
       left: 50%;
       top: 40%;
	   }

       #myChart2 {
       position: absolute;
       left: 50%;
       top: 75%;
	   }

     </style>
	 <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.4/Chart.js"></script>
</head>

<body>
   <?php
    //connect to database
	$cont = mysqli_connect('localhost', 'root', '');
	
   	//ii check
	if(!$cont){
		  echo("error");
	}
	
	//select database
	if(!(mysqli_select_db($cont, "malaysia"))){
		  echo("error2");
	}
	
	//select all
   $query = "SELECT * FROM selangor";
   
   	if(!($result = mysqli_query($cont, $query))){
		  echo("Failed to run command");
	}
	echo "<h1>The Status of Selangor</h1>";
		echo "<table>";
		echo "<tr>
	         <td style='text-align:center' class=\"bold\">Date:</td>
	         <td style='text-align:center' class=\"bold\">Death Cases:</td>
			 <td style='text-align:center' class=\"bold\">Confirmed Cases:</td>
			 <td style='text-align:center' class=\"bold\">Hospital Admission:</td>
		 </tr>";
    while ($row = mysqli_fetch_row($result)){
	
	$row[3]=str_replace("<br>","\n",$row[3]);

		 
	echo "<tr>
	      <td style='text-align:center' class=\"other\">$row[0]</td>  
          <td style='text-align:center' class=\"other\">$row[1]</td>	
          <td style='text-align:center' class=\"other\">$row[2]</td>
          <td style='text-align:center' class=\"other\">$row[3]</td>		  
	     </tr>";
		 

    } 
	echo "</table>";
	mysqli_close($cont);
   ?>
   
   <a href="getselangor.html"><h2>Insert new data</h2></a>
   <a href="selangordate.html"><h2>Delete a data</h2></a>
   <a href="..\west.html"><h2>Back to West Malaysia</h2></a>
    <a href="..\index.html"><h2>Back to Main Page</h2></a>

<canvas id="myChart" style="width:100%;max-width:600px"></canvas>
<canvas id="myChart1" style="width:100%;max-width:600px"></canvas>
<canvas id="myChart2" style="width:100%;max-width:600px"></canvas>
<script>
  var xValues = ["2022-03-16", "2022-03-17", "2022-03-18", "2022-03-19", "2022-03-20", "2022-03-21", "2022-03-22"];
  var yValues = [21, 6, 7, 16, 10, 7, 9];
  var barColors = "red";

  new Chart("myChart", {
    type: "bar",
    data: {
    labels: xValues,
    datasets: [{
      backgroundColor: barColors,
      data: yValues
    }]},
    options: {
    legend: {display: false},
    title: {display: true,
     text: "Death Cases in Selangor:"
 }}});

  var xValues = ["2022-03-16", "2022-03-17", "2022-03-18", "2022-03-19", "2022-03-20", "2022-03-21", "2022-03-22"];
  var yValues = [7561, 7558, 7430, 7366, 6761, 6941, 7452];
  var barColors = "blue";

  new Chart("myChart1", {
    type: "bar",
    data: {
    labels: xValues,
    datasets: [{
      backgroundColor: barColors,
      data: yValues
    }]},
    options: {
    legend: {display: false},
    title: {display: true,
     text: "Confirmed Cases in Selangor:"
 }}});

  var xValues = ["2022-03-16", "2022-03-17", "2022-03-18", "2022-03-19", "2022-03-20", "2022-03-21", "2022-03-22"];
  var yValues = [447, 431, 455, 361, 332, 322, 350];
  var barColors = "green";

  new Chart("myChart2", {
    type: "bar",
    data: {
    labels: xValues,
    datasets: [{
      backgroundColor: barColors,
      data: yValues
    }]},
    options: {
    legend: {display: false},
    title: {display: true,
     text: "Hospital Admission in Selangor:"
 }}});

</script>
</body>

</html>