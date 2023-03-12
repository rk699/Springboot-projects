<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

	<div class="container">
		<table class="  table table-striped">
			<caption>Your todos are </caption>
			<thead>
				<tr>
				<th>ID</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is it Done?</th>
					<th>Update?</th>
					<th>Delete?</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
					<td>${todo.id}</td>
						<td>${todo.desc}</td>
						<td><fmt:formatDate pattern="dd/MM/yyyy" value="${todo.targetDate}" /></td>
						<td>${todo.done}</td>
						<td><a type="button" class="btn btn-success"
							href="/update-todo?id=${todo.id}">Update</a></td>
						<td><a type="button" class="btn btn-warning" 
						     href="/delete-todo?id=${todo.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div> <a class="btn btn-primary" href="/add-todo">Add a Todo</a></div>

		</div>
<%@ include file="common/footer.jspf" %>