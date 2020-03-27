<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<head>
	
	<title>Authorisation Form</title>

	<style>
	body{
		background: linear-gradient(28deg, rgba(5,0,36,1) 0%, rgba(0,212,255,1) 100%);
		display: flex;
		justify-content: center;
		align-items: center;
		width: 100%;
		height: 100vh;
	}
	.container{
		padding: 20px;
		background: #fff;
	}
	.input-container{
		padding-bottom: 10px;
	}
	.label{
		margin-bottom: 5px;
		color: rgba(5,0,36,1);
	}
	.input{
		border: 2px solid rgba(0,212,255,1);
	}
	.error{
		color: #cc0000;
	}
	.submit-button{
		display: block;
		margin: auto;
		background: rgba(0,212,255,1);
		padding: 10px;
		transition: all 0.3s ease;
		width: 100px;
		text-decoration: none;
	}
	.submit-button:hover{
		background: rgba(5,0,36,1);
		color: rgba(0,212,255,1);
	}
	</style>

</head>

<body>

<div class= "container">
	<form:form action="welcForm" modelAttribute="authorisation">
	<div class="input-container">
		<span class = "label">Login</span>
		<div>
			<form:input path="login" class = "input"/>
			<form:errors path="login" class="error" />
		</div>
		
	</div>

	<div class = "input-container">	
		<span class= "label">Password</span>
		<div>
			<form:input path="password" class = "input" /> 
			<form:errors path="password" class="error" />
		</div>
	</div>	
	
		
	
		
		<input type="submit" value="Submit" class = "submit-button"/>
	
	</form:form>
</div>
</body>


</html>