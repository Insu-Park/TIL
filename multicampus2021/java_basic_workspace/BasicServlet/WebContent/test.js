
$(document).ready(function (){
	$('#loginBtn').click(function(){
		
		var id=$('#id').val();
		var pw=$('#pw').val();
		alert(id+":"+pw);
		
		$.ajax({
			type:"GET",
			url:"http://localhost:8181/BasicServlet/main",
			dataTpye:"text",
			async: true,  
			data:{
				id:$('#id').val(),
				pw:$('#pw').val()
			},
			success:function(data, status){
				alert("Data: " + data + "님 login ok\nStatus: " + status);
			}
		});

	});
});