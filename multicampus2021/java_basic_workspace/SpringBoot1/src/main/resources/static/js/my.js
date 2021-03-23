$(document).ready(function(){
	$("#loginBtn").click(function(){
		$.post("home.jes"
				,{}
				,function(data, status){
					console.log(data);
					$("#msgDiv").html(data);
				})
	});
});