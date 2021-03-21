<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" import="java.util.ArrayList"%>

<%
	String id, pw, name;
	ArrayList<String> list=(ArrayList<String>)request.getAttribute("list");
	if(list==null){
		list = new ArrayList<String>();
		for(int i=0; i<6; i++)
			list.add("0");
	}
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
      <a class="navbar-brand" href="song">음악 추천 사이트</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="song">Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <%
          	if(session.getAttribute("name")==null){%>
          		<li class="nav-item">
                	<a class="nav-link" href="login_resist_form.html">Login / Register</a>
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
          <a href="song" class="list-group-item">곡 평가</a>
          <a href="./help.html" class="list-group-item">문의하기</a>
        </div>

      </div>
      <!-- /.col-lg-3 -->

      <div class="col-lg-9">

        <br>

        <div class="row">

          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="rate"><img class="card-img-top" src="./image/01.jfif" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">IU - 너랑 나</a>
                </h4>
                <h5>Last Fantasy</h5>
              </div>
              <div class="card-footer">
                <%= list.get(0)%>/5.0
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="./image/02.jfif" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">IU - 분홍신</a>
                </h4>
                <h5>Modern Times</h5>

              </div>
              <div class="card-footer">
                <%= list.get(1)%>/5.0
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="./image/03.jfif" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">OH MY GIRL - 살짝 설렜어(Nonstop)</a>
                </h4>
                <h5>NONSTOP</h5>

              </div>
              <div class="card-footer">
                <%= list.get(2)%>/5.0
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="./image/04.jfif" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">IU - Palette</a>
                </h4>
                <h5>Palette</h5>

              </div>
              <div class="card-footer">
                <%= list.get(3)%>/5.0
              </div>
            </div>
          </div>
          
          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="./image/05.jfif" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">OH MY GIRL - 비밀정원</a>
                </h4>
                <h5>비밀정원</h5>

              </div>
              <div class="card-footer">
                <%= list.get(4)%>/5.0
              </div>
            </div>
          </div>

		
          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="./image/06.jfif" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">OH MY GIRL - BUNGEE</a>
                </h4>
                <h5>Fall in love</h5>

              </div>
              <div class="card-footer">
                <%= list.get(5)%>/5.0
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
