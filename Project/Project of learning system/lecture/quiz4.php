<!DOCTYPE html>
<html>
<head>
        <title>Quiz 4 Result</title>
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
	  echo("<h1>Q1) Change the word to past tense : I (play) games </h1>");
	  echo("<h1>Answer : played</h1>");
	  if($an1=="played"){
		  echo("<h3>You are correct</h3>");
	  }
	  else{
		  echo("<h2>You are wrong, your answer : $an1</h2>");
	  }
	  echo("<hr>");
	  
	  //Q2 ans
	  echo("<h1>Q2) Change the word to past tense : I (sleep) at 10 o'clock yesterday");
	  echo("<h1>Answer : slept</h1>");
	  if($an2=="slept"){
		  echo("<h3>You are correct</h3>");
	  }
	  else{
		  echo("<h2>You are wrong, your answer : $an2</h2>");
	  }
	  echo("<hr>");
		  
	  //Q3 ans
	  echo("<h1>Q3) Change the word to past tense : I (eat) a piece of bread just now</h1>");
	  echo("<h1>Answer : ate</h1>");
	  if($an3=="ate"){
		  echo("<h3>You are correct</h3>");
	  }
	  else{
		  echo("<h2>You are wrong, your answer : $an3</h2>");
	  }
	  echo("<hr>");
	  
	  //Q4 ans
	  echo("<h1>Q4) Change the word to past tense : You (are) 5 years old last year</h1>");
	  echo("<h1>Answer : were</h1>");
	  if($an4=="were"){
		  echo("<h3>You are correct</h3>");
	  }
	  else{
		  echo("<h2>You are wrong, your answer : $an4</h2>");
	  }
	  echo("<hr>");
	  
	  //Q5 ans
	  echo("<h1>Q5) Change the word to past tense : We (go) to school yesterday</h1>");
	  echo("<h1>Answer : went</h1>");
	  if($an5=="went"){
		  echo("<h3>You are correct</h3>");
	  }
	  else{
		  echo("<h2>You are wrong, your answer : $an5</h2>");
	  }
	  echo("<hr>");
	  ?>
    <a href="quiz.php"><h1>Back to Quiz Page</h1></a>
</body>

</html>