<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
</head>
<body>
<div>
    <h1>Lista Cadastro</h1>
    <table>
        <tr>
            <th>id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Senha</th>
        </tr>
        <c:forEach var="funcionario" items="${lista}">
            <tr>
               <td>${funcionario.id}</td>
                <td>${funcionario.name}</td>
                <td>${funcionario.email}</td>
                <td>${funcionario.senha}</td>
                <td>
                <form action="/delete-pi" method="post">
                                       <input type="hidden" id="id" name="id" value="${funcionario.id}">
                                       <button type="submit">Delete</button>
                                       <span>|</span>
                                       <a href="index.jsp?id=${funcionario.id}&name=${funcionario.name}&email=${funcionario.email}&senha=${funcionario.senha}">upadate</a>
                                   </form>
                                   </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>