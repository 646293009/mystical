<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
	<title>Title</title>
	<link rel="stylesheet" type="text/css" href="static/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="static/css/font-awesome.min.css">
	<script type="application/javascript" src="static/js/jquery-3.5.1.min.js"></script>
	<script type="application/javascript" src="static/js/bootstrap.min.js"></script>
	<script type="application/javascript">
		function openFrame(url) {
			//使用 url 拼接iFrame 标签
			 var iframe="<iframe src='" + url + "' width='100%' height='100%' style='border:0px;'></iframe>";
			//找到对应的div 将 iframe 作为子节点进行插入
			//alert(url);
			$("#frameZone").html(iframe);
		}
	</script>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-md-12">
			<nav class="navbar navbar-default" role="navigation">
				<div class="container-fluid">
					<div class="navbar-header">
						<a class="navbar-brand" href="#">名称待定</a>
					</div>
					<div>
						<!--向左对齐-->
						<ul class="nav navbar-nav navbar-left">
							<c:forEach var="menu" items="${menuList }">
								<li class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown">
										<i class="${menu.icon}"></i>
											${menu.name}
										<b class="caret"></b>
									</a>
									<ul class="dropdown-menu">
										<c:forEach var="child" items="${menu.childrenMenus}">
											<li><a href="javascript:openFrame('${child.url}');">${child.name}</a></li>
										</c:forEach>
									</ul>
								</li>
							</c:forEach>
						</ul>
						<!--向右对齐-->
						<ul class="nav navbar-nav navbar-right">
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">
									欢迎：
									<i class="fa fa-user"></i>
									${sessionScope.user.name}
								</a>
							</li>
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">
									<i class="fa fa-sign-out"></i>
									退出系统
								</a>
							</li>
						</ul>
					</div>
				</div>
			</nav>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12" id="frameZone">

		</div>
	</div>
</div>
</body>
</html>
