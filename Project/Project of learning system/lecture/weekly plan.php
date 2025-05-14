<html>
<head>
<style>
body {
        background-color: #F3EBF6;
    }   
    
.title{
	
		font-size:50px;
		font-weight:bold;
		padding:10px;
		text-align:center;
		margin-top:0px;
		
}

.topnav {
  background-color: Black;
  overflow: hidden;
}

.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #04AA6D;
  color: Black;
}



.active,
	.faq-page:hover {
    background-color: #F9F9F9;
}



a {
        text-shadow: 0px 0px 3px rgba(117, 117, 117, 0.12);
        color: #E1BEE7;
        text-decoration: none
    }
.dropdown {
  float: left;
  overflow: hidden;
}


.dropdown .dropbtn {
  font-size: 17px;
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit; 
  margin: 0; 
}


.navbar a:hover, .dropdown:hover .dropbtn {
  background-color: red;
}


.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}


.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {
  background-color: #ddd;
}


.dropdown:hover .dropdown-content {
  display: block;
}

		   table {
		     border: 1px solid black;
             font-family: arial, sans-serif;
		     margin: 50px 50px ; 
           }	
		   
		   td, th{
	    	 border: 1px solid black;
			 font-size: 30px;
             text-align: middle;
             padding: 8px;
           }
			
           .center {
             margin-left: auto;
             margin-right: auto;
            }

  a:active{color:black; font-family:verdana; text-decoration:none}
  a:visited{color:green; font-family:verdana; text-decoration:none}
  a:link{color:red; font-family:verdana; text-decoration:none}
  a:hover{color:blue; font-family:verdana; text-decoration:underline}	
</style>
</head>

<body>
  <div class = "title">
  CHILDREN LANGUAGE LEARNING SYSTEM
  <div class="topnav">
  <a href="index.html">Dashboard</a>
  <div class="dropdown">
    <button class="dropbtn">Lecture Plan
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="lecture notes.php ">Lecture Notes</a>
      <a href="lecture videos.php">Lecture Videos</a>
    </div>
  </div>
  
  <a  class="active" href="weekly plan.php">Weekly Plan</a>
  <a href="quiz.php">Quiz</a>
  <a href="logout.php">Log Out</a>
</div>         
             
    </div>
	        <table class="center" style="width:60%;text-align: center;">
            <tr style="color:black">
                <th colspan="2">Weekly Plan</th>
            </tr>
            
            <tr style="color:black">
                <th>Week 1</th>
                <th>Week 2</th>
            </tr>
            
            <tr style="color:blue">
                <td >Find the letter in alphabet (uppercase)</td>
                <td>Fill in the blanks with correct grammar</td>
                
            </tr>

            <tr style="color:blue">
                <td>Find the letter in alphabet (lowercase)</td>
                <td>Fill in the blanks with correct vocabulary</td>
            </tr>
            
            <tr style="color:blue">
                <td>Find the name of the picture</td>
                <td></td>
            </tr>
        </table>

        













</body>

</html>

