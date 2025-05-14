<!DOCTYPE html>
<html>
<head>
        <title>Quiz 3 Result</title>
		<style>
		 .title h1 {
             text-align: center;
             font-size: 100px;
             font-weight: 700; 
			 color:black;
             text-transform: uppercase;
			 border-bottom: double
		    }
         h1 {
		  font-weight: bold;
		  font-size: 30px;
		  }
			
		 h2 {
		  font-weight: bold;
		  font-size: 30px;
		  color: red;
		  }
		 
		 h3 {
		  font-weight: bold;
		  font-size: 30px;
		  color: lightgreen;
		  }
		  
		</style>
</head>
<body>
       <div class="title">           
	     <h1>Result</h1>
	   </div>
   
      <?php
	  extract($_POST);
	  //Q1 ans
	  echo("<h1>Q1) Fill in the blank :  I have ___ pen</h1>");
	  echo("<h1>Answer : a</h1>");
	  if($an1=="right"){
		  echo("<h3>You are correct</h3>");
	  }
	  else{
		  echo("<h2>You are wrong, your answer : an</h2>");
	  }
	  echo("<hr>");
	  
	  //Q2 ans
	  echo("<h1>Q2) Fill in the blank : I ___ a student</h1>");
	  echo("<h1>Answer : am</h1>");
	  if($an2=="right"){
		  echo("<h3>You are correct</h3>");
	  }
	  elseif($an2=="wrong1"){
		  echo("<h2>You are wrong, your answer : is</h2>");
	  }
	  else{
		  echo("<h2>You are wrong, your answer : are</h2>");
	  }
	  echo("<hr>");
		  
	  //Q3 ans
	  echo("<h1>Q3) Fill in the blank : You ___ a boy</h1>");
	  echo("<h1>Answer : are</h1>");
	  if($an3=="right"){
		  echo("<h3>You are correct</h3>");
	  }
	  elseif($an3=="wrong1"){
		  echo("<h2>You are wrong, your answer : is</h2>");
	  }
	  else{
		  echo("<h2>You are wrong, your answer : am</h2>");
	  }
	  echo("<hr>");
	  
	  //Q4 ans
	  echo("<h1>Q4) Fill in the blank : You have ___ umbrella</h1>");
	  echo("<h1>Answer : an</h1>");
	  if($an4=="right"){
		  echo("<h3>You are correct</h3>");
	  }
	  else{
		  echo("<h2>You are wrong, your answer : a</h2>");
	  }
	  echo("<hr>");
	  
	  //Q5 ans
	  echo("<h1>Q5) Fill in the blank : We ____ family</h1>");
	  echo("<h1>Answer : are</h1>");
	  if($an5=="right"){
		  echo("<h3>You are correct</h3>");
	  }
	  elseif($an5=="wrong1"){
		  echo("<h2>You are wrong, your answer : is</h2>");
	  }
	  else{
		  echo("<h2>You are wrong, your answer : am</h2>");
	  }
	  echo("<hr>");
	  ?>
    <a href="quiz.php"><h1>Back to Quiz Page</h1></a>
</body>

</html>