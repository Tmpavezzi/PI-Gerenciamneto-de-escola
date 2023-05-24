<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <%@ page contentType="text/html; charset=UTF-8" %>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="reset.css">
    <link rel="stylesheet" href="index_funcionario.css">
    <link rel="stylesheet" href="index_cadastro.css">

    <title>Professor</title>
</head>

<body>
<nav class="menu">
    <h1 class="titulo-menu">Sistema de Gerenciamento</h1>

    <ul class="principal">

        <li><a href="index_funcionario.jsp">Professores</a> </li>

        <br>

        <li><a href="index_aluno.jsp">Alunos </a></li>

        <br>

        <li><a href="index_instituicao.jsp">Instituições</a> </li>

    </ul>

    <ul class="secundaria">

        <li> <a href="index.jsp"> Login</a></li>

        <br>

        <li> <a href="index_cadastro.jsp"> Cadastro</a> </li>

    </ul>
</nav>
<div><h1 class="prof">Professor</h1></div>
<main>
    <form class="informacao-pessoal" method="post" action="/create-funcionario">
        <br>
        <h1 class="infos-pess">INFORMAÇÕES PESSOAIS</h1>

        <label for="nome">Nome Completo:</label>
        <input type="text" id="nome" name ="nome" class="input-padrao" value="${funcionario.nome}" required>

        <label for="sexo">Sexo:</label>
        <input type="radio" name="sexo" value="Feminino" id="sexo" value="${funcionario.sexo}">Feminino</label>
        <input type="radio" name="sexo" value="masculino" id="sexo" value="${funcionario.sexo}">Masculino</label>

        <br>
        <label for="dataNascimento">Data de Nascimento</label>
        <input type="date" id="dataNascimento" name ="dataNascimento" value="${funcionario.dataNascimento}">

        <label for="estadoCivil">Estado Civil:</label>
        <input type="text" id="estadoCivil" name ="estadoCivil" class="input-padrao" value="${funcionario.estadoCivil}" required>
        <br>

        <label for="cpf">CPF:</label>
        <input type="cpf" id="cpf"name ="cpf" class="input-padrao" value="${funcionario.cpf}" required placeholder="Digite o CPF">

        <label for="rg">RG:</label>
        <input type="rg" id="rg" name="rg" class="input-padrao" value="${funcionario.rg}" required placeholder="Digite o RG">

        <label for="orgaoEmissor">Orgão Emissor:</label>
        <input type="text" id="orgaoEmissor" name="orgaoEmissor"class="input-padrao" value="${funcionario.orgaoEmissor}" required>
        <br>

        <label for="celular">Celular:</label>
        <input type="telefone" id="celular" name ="celular" class="input-padrao" value="${funcionario.celular}" required placeholder="(DDD)00000-0000">

        <label for="email">Email:</label>
        <input type="email" id="email" name ="email" class="input-padrao" value="${funcionario.email}" required>

        <br>
        <label for="endereco">Endereco:</label>
        <input type="text" id="endereco" name ="endereco" class="input-padrao" value="${funcionario.endereco}" required>


        <h1 class="infos-pess">INFORMAÇÕES COMPLEMENTARES</h1>
        <label for="cargo">Cargo:</label>
        <input type="text" id="cargo" name="cargo" class="input-padrao" value="${funcionario.cargo}" required>

        <label for="graduacao">Graduação:</label>
        <input type="text" id="graduacao" name="graduacao" class="input-padrao" value="${funcionario.graduacao}" required>

        <br>
        <label for="conhecimento">Área do Conhecimento:</label>
        <input type="text" id="conhecimento" name="conhecimento" class="input-padrao"  value="${funcionario.conhecimento}"required>

        <h2 class="infos-pess">OBSERVAÇÕES</h2>

        <textarea name="observacao" id="observacao" cols="100" rows="8" class="area-texto" value="${funcionario.observacao}"></textarea>

        <input type="submit" value="Cadastrar" class="cads">
        <input type="submit" value="Cancelar" class="cancel">
    </form>
</main>
</body>
</html>