<!DOCTYPE html>
<html lang="pt-br">
<%@ page contentType="text/html; charset=UTF-8" %>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="reset.css">
    <link rel="stylesheet" href="index_aluno.css">
    <title>Aluno</title>
</head>

<body>
<nav class="menu">
    <h1 class="titulo-menu">Sistema de Gerenciamento</h1>

    <ul class="principal">
        <li><a href="index_funcionario.jsp">Professores</a></li>
        <br>
        <li><a href="index_aluno.jsp">Alunos </a></li>
        <br>
        <li><a href="instituicao.html">Instituições</a> </li>
    </ul>

    <ul class="secundaria">
        <li> <a href="cadastro.html#paralogin"> Login</a></li>
        <br>
        <li> <a href="index.jsp#paracadastro"> Cadastro</a> </li>
    </ul>
</nav>

<div><h1 class="stud">Aluno</h1></div>

<main>
    <form class="informacao-pessoal" method="post" action="/create-aluno">
        <h1 class="infos-pess">INFORMAÇÕES PESSOAIS</h1>

        <label for="nome">Nome Completo:</label>
        <input class="input-padrao" type="text" name="nome" id="nome" value="${param.name}" required>

        <label for="sexo" class="sexo">Sexo:</label>
        <label for="Feminino"> <input type="radio" name="sexo" value="${param.sexo}" id="radio-feminino">Feminino</label>

        <label for="masculino"> <input type="radio" name="sexo" value="${param.sexo}" id="radio-masculino">Masculino</label>

        <br>
        <label for="dataNascimento">Data de Nascimento</label>
        <input type="date" name="dataNascimento" id="dataNascimento" class="input-padrao" value="${param.dataNascimento}">

        <label for="estadoCivil">Estado Civil:</label>
        <input class="input-padrao" type="text" id="estadoCivil" name="estadoCivil" value="${param.estadoCivil}" required>
        <br>

        <label for="cpf">CPF:</label>
        <input class="input-padrao" type="cpf" id="CPF" name="cpf" value="${param.cpf}" required>

        <label for="rg">RG:</label>
        <input type="rg" class="input-padrao" id="rg" name="rg" required value="${param.rg}">

        <label for="orgaoEmissor">Orgão Emissor:</label>
        <input class="input-padrao" type="text" id="orgaoEmissor" name="orgaoEmissor" value="${param.orgaoEmisor}" required>
        <br>

        <label for="celular">Celular:</label>
        <input class="input-padrao" type="telefone" id="celular" name="celular" value="${param.celular}" required>

        <label for="email">Email:</label>
        <input class="input-padrao" type="email" id="email" name="email" value="${param.email}" required>
        <br>

        <label for="endereco">Endereco:</label>
        <input class="input-padrao" type="text" id="endereco" name="endereco" value="${param.endereco}" required>


        <h1 class="infos-pess">INFORMAÇÕES ACADEMICAS</h1>
        <label for="serie">Série:</label>
        <input class="input-padrao" type="text" id="serie" name="serie" value="${param.serie}" required>

        <label for="sala">Sala:</label>
        <input class="input-padrao" type="text" id="sala" name="sala" value="${param.sala}" required>

        <label for="turma">Turma:</label>
        <input class="input-padrao" type="text" id="turma" name="turma" value="${param.turma}" required>
        <br>

        <h2 class="infos-pess">OBSERVAÇÕES ACADEMICAS</h2>

        <textarea class="area-texto" name="observacao" id="observacao" cols="120" rows="8" value="${param.observacao}"></textarea>

        <input type="hidden" id="idAluno" name="idAluno" value="${param.idAluno}">

        <input type="submit" value="Cadastrar" class="cads">
        <input type="submit" value="Cancelar" class="cancel">
    </form>
</main>
</body>

</html>