<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <title>Professor</title>
</head>
<body>
<div>
    <h1>Instituicoes</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Curso</th>
            <th>Localizacao</th>

        </tr>
        <c:forEach var="instituicao" items="${lista}">
            <tr>
                <td>${instituicao.id}</td>
                <td>${instituicao.nome}</td>
                <td>${instituicao.curso}</td>
                <td>${instituicao.localizacao}</td>

            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>