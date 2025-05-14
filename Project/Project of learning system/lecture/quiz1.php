<!DOCTYPE html>
<html>
<head>
        <title>Quiz 1 Result</title>
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
	  echo("<h1>Q1) Fill in the blank : BCD_FGH</h1>");
	  echo("<h1>Answer : E</h1>");
	  if($an1=="right"){
		  echo("<h3>You are correct</h3>");
	  }
	  elseif($an1=="wrong1"){
		  echo("<h2>You are wrong, your answer : H</h2>");
	  }
	  elseif($an1=="wrong2"){
		  echo("<h2>You are wrong, your answer : I</h2>");
	  }
	  else{
		  echo("<h2>You are wrong, your answer : A</h2>");
	  }
	  echo("<hr>");
	  
	  //Q2 ans
	  echo("<h1>Q2) Fill in the blank : HIJ_LMN</h1>");
	  echo("<h1>Answer : K</h1>");
	  if($an2=="right"){
		  echo("<h3>You are correct</h3>");
	  }
	  elseif($an2=="wrong1"){
		  echo("<h2>You are wrong, your answer : Z</h2>");
	  }
	  elseif($an2=="wrong2"){
		  echo("<h2>You are wrong, your answer : B</h2>");
	  }
	  else{
		  echo("<h2>You are wrong, your answer : T</h2>");
	  }
	  echo("<hr>");
		  
	  //Q3 ans
	  echo("<h1>Q3) Fill in the blank : _PQRSTUV</h1>");
	  echo("<h1>Answer : O</h1>");
	  if($an3=="right"){
		  echo("<h3>You are correct</h3>");
	  }
	  elseif($an3=="wrong1"){
		  echo("<h2>You are wrong, your answer : H</h2>");
	  }
	  elseif($an3=="wrong2"){
		  echo("<h2>You are wrong, your answer : I</h2>");
	  }
	  else{
		  echo("<h2>You are wrong, your answer : A</h2>");
	  }
	  echo("<hr>");
	  
	  //Q4 ans
	  echo("<h1>Q4) Fill in the blank : STUVWXY_</h1>");
	  echo("<h1>Answer : Z</h1>");
	  if($an4=="right"){
		  echo("<h3>You are correct</h3>");
	  }
	  elseif($an4=="wrong1"){
		  echo("<h2>You are wrong, your answer : P</h2>");
	  }
	  elseif($an4=="wrong2"){
		  echo("<h2>You are wrong, your answer : G</h2>");
	  }
	  else{
		  echo("<h2>You are wrong, your answer : A</h2>");
	  }
	  echo("<hr>");
	  
	  //Q5 ans
	  echo("<h1>Q5) Fill in the blank : _BCDEFG</h1>");
	  echo("<h1>Answer : A</h1>");
	  if($an5=="right"){
		  echo("<h3>You are correct</h3>");
	  }
	  elseif($an5=="wrong1"){
		  echo("<h2>You are wrong, your answer : E</h2>");
	  }
	  elseif($an5=="wrong2"){
		  echo("<h2>You are wrong, your answer : H</h2>");
	  }
	  else{
		  echo("<h2>You are wrong, your answer : I</h2>");
	  }
	  echo("<hr>");
	  ?>
    <a href="quiz.php"><h1>Back to Quiz Page</h1></a>
</body>

</html>