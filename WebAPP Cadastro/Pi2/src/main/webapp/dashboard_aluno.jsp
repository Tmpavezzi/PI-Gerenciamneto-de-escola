<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <title>Aluno</title>
</head>
<body>
<div>
    <h1>Aluno</h1>
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
            <th>Serie</th>
            <th>Sala</th>
            <th>Turma</th>
            <th>Observacao</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="aluno" items="${list}">
            <tr>
                <td>${aluno.idAluno}</td>
                <td>${aluno.nome}</td>
                <td>${aluno.sexo}</td>
                <td>${aluno.dataNascimento}</td>
                <td>${aluno.estadoCivil}</td>
                <td>${aluno.cpf}</td>
                <td>${aluno.rg}</td>
                <td>${aluno.orgaoEmissor}</td>
                <td>${aluno.celular}</td>
                <td>${aluno.email}</td>
                <td>${aluno.endereco}</td>
                <td>${aluno.serie}</td>
                <td>${aluno.sala}</td>
                <td>${aluno.turma}</td>
                <td>${aluno.observacao}</td>
                <td>
                    <form action="/delete-aluno" method="post">
                        <input type="hidden" id="idAluno" name="idAluno" value="${aluno.idAluno}">
                        <button type="submit">Delete</button>
                        <span> | </span>
                        <a href="index_aluno.jsp?idAluno=${aluno.idAluno}
                                           &name=${aluno.nome}
                                           &sexo=${aluno.sexo}
                                           &dataNascimento=${aluno.dataNascimento}
                                           &estadoCivil=${aluno.estadoCivil}
                                           &cpf=${aluno.cpf}
                                           &rg=${aluno.rg}
                                           &orgaoEmissor=${aluno.orgaoEmissor}
                                           &celular=${aluno.celular}
                                           &email=${aluno.email}
                                           &endereco=${aluno.endereco}
                                           &serie=${aluno.serie}
                                           &sala=${aluno.sala}
                                           &turma=${aluno.turma}
                                           &observacao=${aluno.observacao}
                        ">Update</a>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>