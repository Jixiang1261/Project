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
	  echo("<h1>Q1)<img src='apple.jpg' alt='apple'width='200' height='200'></h1>");
	  echo("<h1>Answer : apple</h1>");
	  if($an1=="right"){
		  echo("<h3>You are correct</h3>");
	  }
	  elseif($an1=="wrong1"){
		  echo("<h2>You are wrong, your answer : tree</h2>");
	  }
	  elseif($an1=="wrong2"){
		  echo("<h2>You are wrong, your answer : pen</h2>");
	  }
	  else{
		  echo("<h2>You are wrong, your answer : book</h2>");
	  }
	  echo("<hr>");
	  
	  //Q2 ans
	  echo("<h1>Q2)<img src='tree.jpg' alt='tree'width='200' height='200'></h1>");
	  echo("<h1>Answer : tree</h1>");
	  if($an2=="right"){
		  echo("<h3>You are correct</h3>");
	  }
	  elseif($an2=="wrong1"){
		  echo("<h2>You are wrong, your answer : apple</h2>");
	  }
	  elseif($an2=="wrong2"){
		  echo("<h2>You are wrong, your answer : pen</h2>");
	  }
	  else{
		  echo("<h2>You are wrong, your answer : book</h2>");
	  }
	  echo("<hr>");
		  
	  //Q3 ans
	  echo("<h1>Q3)<img src='pen.jpg' alt='pen'width='200' height='200'></h1>");
	  echo("<h1>Answer : pen</h1>");
	  if($an3=="right"){
		  echo("<h3>You are correct</h3>");
	  }
	  elseif($an3=="wrong1"){
		  echo("<h2>You are wrong, your answer : apple</h2>");
	  }
	  elseif($an3=="wrong2"){
		  echo("<h2>You are wrong, your answer : tree</h2>");
	  }
	  else{
		  echo("<h2>You are wrong, your answer : book</h2>");
	  }
	  echo("<hr>");
	  
	  //Q4 ans
	  echo("<h1>Q4)<img src='book.jpg' alt='book'width='200' height='200'></h1>");
	  echo("<h1>Answer : book</h1>");
	  if($an4=="right"){
		  echo("<h3>You are correct</h3>");
	  }
	  elseif($an4=="wrong1"){
		  echo("<h2>You are wrong, your answer : apple</h2>");
	  }
	  elseif($an4=="wrong2"){
		  echo("<h2>You are wrong, your answer : tree</h2>");
	  }
	  else{
		  echo("<h2>You are wrong, your answer : pen</h2>");
	  }
	  echo("<hr>");
	  
	  ?>
    <a href="quiz.php"><h1>Back to Quiz Page</h1></a>
</body>

</html>