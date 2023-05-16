<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <title>Funcionarios</title>
</head>
<body>
<div>
    <h1>Funcionarios</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Sexo</th>
            <th>Data Nasc.</th>
            <th>Estado Civil</th>
            <th>CPF</th>
            <th>RG</th>
            <th>Orgao Emissor</th>
            <th>Celular</th>
            <th>Email</th>
            <th>Endereco</th>
            <th>Cargo</th>
            <th>Graduacao</th>
            <th>Conhecimento</th>
            <th>Observacao</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="funcionario" items="${list}">
            <tr>
                <td>${funcionario.idFuncionario}</td>
                <td>${funcionario.nome}</td>
                <td>${funcionario.sexo}</td>
                <td>${funcionario.dataNascimento}</td>
                <td>${funcionario.estadoCivil}</td>
                <td>${funcionario.cpf}</td>
                <td>${funcionario.rg}</td>
                <td>${funcionario.orgaoEmissor}</td>
                <td>${funcionario.celular}</td>
                <td>${funcionario.email}</td>
                <td>${funcionario.endereco}</td>
                <td>${funcionario.cargo}</td>
                <td>${funcionario.graduacao}</td>
                <td>${funcionario.conhecimento}</td>
                <td>${funcionario.observacao}</td>
                <td>
                    <form action="/delete-funcionario" method="post">
                        <input type="hidden" id="idFuncionario" name="idFuncionario" value="${funcionario.idFuncionario}">
                        <button type="submit">Delete</button>
                        <span> | </span>
                        <a href="index.jsp?idFuncionario=${funcionario.idFuncionario}
                                           &name=${funcionario.nome}
                                           &sexo=${funcionario.sexo}
                                           &dataNascimento=${funcionario.dataNascimento}
                                           &estadoCivil=${funcionario.estadoCivil}
                                           &cpf=${funcionario.cpf}
                                           &rg=${funcionario.rg}
                                           &orgaoEmissor=${funcionario.orgaoEmissor}
                                           &celular=${funcionario.celular}
                                           &email=${funcionario.email}
                                           &endereco=${funcionario.endereco}
                                           &cargo=${funcionario.cargo}
                                           &graduacao=${funcionario.graduacao}
                                           &conhecimento=${funcionario.conhecimento}
                                           &observacao=${funcionario.observacao}
                        ">Update</a>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>