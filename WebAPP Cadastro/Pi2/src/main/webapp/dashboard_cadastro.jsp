<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <title>Cadastro</title>
</head>
<body>
<div>
    <h1>Usuario</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Senha</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="cadastro" items="${list}">
            <tr>
                <td>${cadastro.idCadastro}</td>
                <td>${cadastro.nome}</td>
                <td>${cadastro.email}</td>
                <td>${cadastro.senha}</td>
                <td>
                    <form action="/delete-cadastro" method="post">
                        <input type="hidden" id="idCadastro" name="idCadastro" value="${cadastro.idCadastro}">
                        <button type="submit">Delete</button>
                        <span> | </span>
                        <a href="index.jsp?idCadastro=${cadastro.idFuncionario}
                                           &name=${cadastro.nome}
                                           &email=${cadastro.email}
                                           &senha=${cadastro.senha}
                        ">Update</a>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>