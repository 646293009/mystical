<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
	<head>
		<title>Title</title>
		<link rel="stylesheet" type="text/css" href="../static/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="../static/css/font-awesome.min.css">
		<script type="application/javascript" src="../static/js/jquery-3.5.1.min.js"></script>
		<script type="application/javascript" src="../static/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h1>用户信息列表</h1>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<button type="button">新增用户信息</button>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<table class="table table-bordered table-hover">
						<thead>
						<tr>
							<th>序号</th>
							<th>名字</th>
							<th>电话号码</th>
							<th>密码</th>
							<th>身份证号码</th>
							<th>用户头像</th>
							<th>状态</th>
							<th>操作</th>
						</tr>
						</thead>
						<tbody>
						<c:forEach var="user" items="${page.list}" varStatus="s">
							<tr>
								<td>${s.index + 1}</td>
								<td>${user.name}</td>
								<td>${user.cellphone}</td>
								<td>${user.password}</td>
								<td>${user.idCard}</td>
								<td>${user.avatar}</td>
								<td>
									<c:choose>
										<c:when test="${user.status == 1}">
											<a href="#" class="btn-success">
												<i class="fa fa-thumbs-up"></i>&nbsp;
												启用
											</a>
										</c:when>
										<c:otherwise>
											<a href="#" class="btn-danger">
												<i class="fa fa-thumbs-down"></i>&nbsp;
												禁用
											</a>
										</c:otherwise>
									</c:choose>
								</td>
								<td>
									<a href="javascript:update('${user.id}')" class="btn btn-waring btn-xs">
										<i class="fa fa-wrench"></i>&nbsp;
										修改
									</a>
									<c:choose>
										<c:when test="${user.status == 1}">
											<a href="javascript:changeStatus('${user.id}', '0')" class="btn btn-danger btn-xs">
												<i class="fa fa-minus-circle"></i>&nbsp;
												禁用
											</a>
										</c:when>
										<c:otherwise>
											<a href="javascript:changeStatus('${user.id}', '1')" class="btn btn-danger btn-xs">
												<i class="fa fa-check-circle"></i>&nbsp;
												启用
											</a>
										</c:otherwise>
									</c:choose>
									<a href="javascript:auth('${user.id}', '1')" class="btn btn-info btn-xs">
										<i class="fa fa-hand-spock-o"></i>&nbsp;
										授权
									</a>
									<a href="#">
										<i class="fa fa-trash-o"></i>
										删除
									</a>
									<a href="#">
										<i class="fa fa-share-alt-square"></i>
										详情
									</a>
								</td>
							</tr>
						</c:forEach>
						</tbody>
						<tfoot>
							<tr>
								<td colspan="8" align="center">
									<ul class="pagination">
										<li><a href="users?pageNum=1">&laquo;&nbsp;首页</a></li>
										<c:choose>
											<c:when test="${page.pageNum == 1 }">
												<li><a href="#">上一页</a></li>
											</c:when>
											<c:otherwise>
												<li><a href="users?pageNum=${page.pageNum - 1 }">上一页</a></li>
											</c:otherwise>
										</c:choose>
										<li>
											<a href="#">
												共查询获得 ${page.totalSize } 条数据，
												分为 ${page.totalPage } 页显示，
												当前是第 ${page.pageNum } 页
											</a>
										</li>
										<c:choose>
											<c:when test="${page.pageNum == page.totalPage }">
												<li><a href="#">下一页</a></li>
											</c:when>
											<c:otherwise>
												<li><a href="users?pageNum=${page.pageNum + 1 }">下一页</a></li>
											</c:otherwise>
										</c:choose>
										<li><a href="users?pageNum=${page.totalPage }">末页&nbsp;&raquo;</a></li>
									</ul>
								</td>
							</tr>
						</tfoot>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>
