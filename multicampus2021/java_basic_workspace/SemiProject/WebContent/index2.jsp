<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%
	String id, pw, name;	
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
  <link href="css/shop-homepage.css" rel="stylesheet">

</head>

<body>

  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="#">음악 추천 사이트</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="index.jsp">Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <%
          	if(session.getAttribute("name")==null){%>
          		<li class="nav-item">
                	<a class="nav-link" href="login.html">Login</a>
              	</li>
              	<li class="nav-item">
                	<a class="nav-link" href="join.html">Join</a>
              	</li>
            <% }else{
            	id=(String)session.getAttribute("id");
        		pw=(String)session.getAttribute("pw");
        		name=(String)session.getAttribute("name");
        	%>
            	<li class="nav-item active">
      				<a class="nav-link" href="#"><%=name %>님 환영합니다!</a>
      			</li>
            	<li class="nav-item">
            		
            		<a class="nav-link" href="logout.jsp">Logout</a>
          		</li>
          	<% 	
            }
          %>
          
        </ul>
      </div>
    </div>
  </nav>

  <!-- Page Content -->
  <div class="container">

    <div class="row">

      <div class="col-lg-3">

        <h1 class="my-4">NOSAJAEGI</h1>
        <div class="list-group">
          <a href="index.jsp" class="list-group-item">곡 평가</a>
          <a href="index2.jsp" class="list-group-item">가수 평가</a>
          <a href="./help.html" class="list-group-item">문의하기</a>
        </div>

      </div>
      <!-- /.col-lg-3 -->

      <div class="col-lg-9">

        <br>

        <div class="row">

          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="./image/01.jfif" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">IU</a>
                </h4>

              </div>
              <div class="card-footer">
                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
              </div>
            </div>
          </div>


          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="./image/03.jfif" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">OH MY GIRL</a>
                </h4>

              </div>
              <div class="card-footer">
                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
              </div>
            </div>
          </div>

        </div>
        <!-- /.row -->

      </div>
      <!-- /.col-lg-9 -->

    </div>
    <!-- /.row -->

  </div>
  <!-- /.container -->

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
