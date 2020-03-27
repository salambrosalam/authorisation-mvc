<!DOCTYPE html>
<html>
<head>


<style>
	body{
		background: linear-gradient(28deg, rgba(5,0,36,1) 0%, rgba(0,212,255,1) 100%);
		display: flex;
		justify-content: center;
		align-items: center;
		width: 100%;
		height: 100vh;
		font-family: Arial;
		
	}
	.container{
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		text-align: center;
		width: 60%;
		padding: 10px;
		border: 1px solid #000;
		background-color: #FFF;	

	}
	.enter-button{
		display: block;
		margin: auto;
		background: rgba(0,212,255,1);
		padding: 10px;
		transition: all 0.3s ease;
		width: 100px;
		text-decoration: none;
	}
	.enter-button:hover{
		background: rgba(5,0,36,1);
		color: rgba(0,212,255,1);
	}
	
	
</style>

</head>
<body>
<div class = "container">
	
	<h2>Start Page</h2>

<a href="authorisation/regForm" class="enter-button">Enter</a>

</div>


</html>