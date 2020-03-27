<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
	<style>
	body{
		background: linear-gradient(28deg, rgba(5,0,36,1) 0%, rgba(0,212,255,1) 100%);
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		width: 100%;
		height: 100vh;
	}
	.container{
		min-width: 150px;
		margin: 10px;
		padding: 10px;
		background: rgba(0,212,255,1);
		border: 2px solid rgba(5,0,36,1);
	}
	</style>

	<title>Welcome page</title>

</head>



<body>
	<div class= "container">
		<span>Welcome : ${authorisation.login}</span>
	</div>
	<div class = "container">
		<span>Your password: ${authorisation.password}</span>
	</div>
</body>




</html>