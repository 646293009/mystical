<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<title>Title</title>
	</head>
	<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">logo</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<form action="saveRole" method="post">
					<table>
						<tr>
							<td>
								<i class="fa fa-user"></i>&nbsp;
								角色：
							</td>
							<td>
								<input type="text" name="name" class="form-control" value="${emp.name}"style="width:300px" placeholder="请添加角色"/>
							</td>
						</tr>
						<tr>
							<td align="right">
								<i class="fa fa-user"></i>&nbsp;
								状态：
							</td>
							<td>
								<input type="text" class="form-control" style="width:300px" placeholder="请填写状态0-禁用，1-启用"/>
							</td>
						</tr>
						<tr colspan="2" align="right">
							<td>
								<button type="submit" class="btn btn-success btn-sm">
									<i class="fa fa-save"></i>&nbsp;
									保存
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
