<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
	<title>Title</title>
	<link rel="stylesheet" type="text/css" href="../static/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="../static/css/font-awesome.min.css">
	<script type="application/javascript" src="../static/js/jquery-3.5.1.min.js"></script>
	<script type="application/javascript" src="../static/js/bootstrap.min.js"></script>
	<script type="application/javascript">
		function openAuthModal(url) {
			//通过子页面调用父页面的JavaScript函数，可以通过对象parent
			parent.openModal("角色授权",url);
		}
	</script>
</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h1>角色信息列表</h1>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<a href="save">
						<button type="button">新增角色信息</button>
					</a>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<table class="table table-bordered table-hover">
						<thead>
						<tr>
							<th>序号</th>
							<th>角色名称</th>
							<th>状态</th>
							<th>操作</th>
						</tr>
						</thead>
						<tbody>
						<c:forEach var="role" items="${page.list}" varStatus="s">
							<tr>
								<td>${s.index + 1}</td>
								<td>${role.name}</td>
								<td>
									<c:choose>
										<c:when test="${role.status == 1}">
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
									<a href="javascript:update('${role.id}')" class="btn btn-waring btn-xs">
										<i class="fa fa-wrench"></i>&nbsp;
										修改
									</a>
									<c:choose>
										<c:when test="${role.status == 1}">
											<a href="javascript:changeStatus('${role.id}', '0')" class="btn btn-danger btn-xs">
												<i class="fa fa-minus-circle"></i>&nbsp;
												禁用
											</a>
										</c:when>
										<c:otherwise>
											<a href="javascript:changeStatus('${role.id}', '1')" class="btn btn-danger btn-xs">
												<i class="fa fa-check-circle"></i>&nbsp;
												启用
											</a>
										</c:otherwise>
									</c:choose>
									<a href="javascript:openAuthModal('menu/auth?id=${role.id}')" class="btn btn-info btn-xs">
										<i class="fa fa-hand-spock-o"></i>&nbsp;
										授权
									</a>
								</td>
							</tr>
						</c:forEach>
						</tbody>
						<tfoot>
							<tr>
								<td colspan="4" align="center">
									<ul class="pagination">
										<li><a href="index?pageNum=1">&laquo;&nbsp;首页</a></li>
										<c:choose>
											<c:when test="${page.pageNum == 1 }">
												<li><a href="#">上一页</a></li>
											</c:when>
											<c:otherwise>
												<li><a href="index?pageNum=${page.pageNum - 1 }">上一页</a></li>
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
												<li><a href="index?pageNum=${page.pageNum + 1 }">下一页</a></li>
											</c:otherwise>
										</c:choose>
										<li><a href="index?pageNum=${page.totalPage }">末页&nbsp;&raquo;</a></li>
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
