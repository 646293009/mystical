<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
	<!--http://localhost:8080/express/user/login-->
	<link rel="stylesheet" type="text/css" href="../static/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="../static/css/font-awesome.min.css">
	<script type="application/javascript"  src="../static/js/jquery-3.5.1.min.js"></script>
	<script type="application/javascript"  src="../static/js/bootstrap.min.js"></script>
	<script type="application/javascript">
		$(function () {
			//通过隐藏域，获得falg的值
			var href =location.href;
			//截取对应的请求参数：http://localhost:8080/mystical/user/login?flag=...
			var index =href.lastIndexOf("=");
			if (index>-1){
				//此时的请求是携带参数的，截取参数
				var flag =href.substring(index+1,href.length);
				if (flag=="empty"){
					alert("请联系管理员填写手机号码和登录密码")
				}else
				 if (flag=="password"){
					alert("请联系管理员修改密码")
				}
				else if (flag=="user"){
					 alert("当前用户未添加，请联系管理员")

					}else if (flag=="status"){
					alert("该用户处于禁用无法登陆")
				 }
				 }
		})
	</script>
</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h1>欢迎登录快递管理平台</h1>
					<input type="hidden" id="" value="${flag}"/>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<form action="login" method="post">
						<table>
							<tr>
								<td align="right">
									<i class="fa fa-mobile-phone"></i>&nbsp;
									手机号码：
								</td>
								<td>
									<input type="text" name="cellphone" class="form-control" style="width: 300px" placeholder="请填写手机号码">
								</td>
							</tr>
							<tr>
								<td align="right">
									<i class="fa fa-lock"></i>&nbsp;
									登录密码：
								</td>
								<td>
									<input type="password" name="password" class="form-control" style="width: 300px" placeholder="请填写登录密码">
								</td>
							</tr>
							<tr>
								<td colspan="2" align="right">
									<button type="submit" class="btn btn-success btn-sm" >
									<i class="fa fa-sign-in "></i>&nbsp;
										登录
									</button>
								</td>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>
