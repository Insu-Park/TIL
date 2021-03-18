<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%
	String id, pw, name;
  	if(session.getAttribute("name")==null){
		response.sendRedirect("login.html");
    }else{
    	id=(String)session.getAttribute("id");
		pw=(String)session.getAttribute("pw");
		name=(String)session.getAttribute("name");
    }
	String rate=(String)request.getAttribute("rate");
%>
<!DOCTYPE html>
<head>


  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>NSJG</title>

  <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="./css/star-rating.css" media="all" type="text/css"/>
  <link rel="stylesheet" href="./css/theme-krajee-fa.css" media="all" type="text/css"/>
  <link rel="stylesheet" href="./css/theme-krajee-svg.css" media="all" type="text/css"/>
  <link rel="stylesheet" href="./css/theme-krajee-uni.css" media="all" type="text/css"/>
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
  <script src="./js/star-rating.js" type="text/javascript"></script>

  
</head>

<body>
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
         
        
        </ul>
      </div>
    </div>
  </nav>
  <div class="container">
    <div class="row">
      <div class="col-lg-9">
        <br>
        <div class="row">
          <div class="col-lg-4 col-md-6 mb-4">
          <a href="rate"><img class="card-img-top" src="./image/01.jfif" alt="">
          
          </div>
          IU - 너랑 나
          <form action="main" method="post">
			<input type="hidden" name="key" value="ratesong">
          	<input name="rating" id="rate" class="rating" data-stars="5" data-step="0.1"/>
          	<input type="submit" value="제출">
		  </form>
        </div>
        <input name="rating2" value="<%=rate%>" id="kartik" class="rating" data-stars="5" data-step="0.1" data-size="xs">
        <script>
        $('#kartik').rating('refresh', {
            showClear:false, 
            disabled: !$('#kartik').attr('disabled')
        });
        </script>
        
      </div>
      <!-- /.col-lg-9 -->

    </div>
    <!-- /.row -->

  </div>

  <!-- Footer -->
  <footer class="py-5 bg-dark">
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; Your Website 2020</p>
    </div>
    <!-- /.container -->
  </footer>

  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>
