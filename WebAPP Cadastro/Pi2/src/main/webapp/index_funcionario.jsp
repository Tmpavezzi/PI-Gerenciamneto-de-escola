<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <%@ page contentType="text/html; charset=UTF-8" %>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="reset.css">
    <link rel="stylesheet" href="index_funcionario.css">
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

        <li><a href="instituicao.html">Instituições</a> </li>

    </ul>

    <ul class="secundaria">

        <li> <a href="#paralogin"> Login</a></li>

        <br>

        <li> <a href="index.jsp"> Cadastro</a> </li>

    </ul>
</nav>
<div><h1 class="prof">Professor</h1></div>
<main>
    <form class="informacao-pessoal"method="post" action="/create-funcionario">
        <br>
        <h1 class="infos-pess">INFORMAÇÕES PESSOAIS</h1>

        <label for="nomecompleto">Nome Completo:</label>
        <input type="text" id="nomecompleto" name ="nomecompleto" class="input-padrao" required>

        <label for="sexo">Sexo:</label>
        <label for="Feminino"> <input type="radio" name="sexo" value="Feminino" id="sexo">Feminino</label>

        <label for="masculino"> <input type="radio" name="sexo" value="masculino" id="sexo">Masculino</label>

        <br>
        <label for="datanescimento">Data de Nascimento</label>
        <input type="date" id="date" name ="date">

        <label for="estadoCivil">Estado Civil:</label>
        <input type="text" id="estadoCivil" name ="estadoCivil" class="input-padrao" required>
        <br>

        <label for="cpf">CPF:</label>
        <input type="cpf" id="CPF"name ="CPF" class="input-padrao" required placeholder="Digite o CPF">

        <label for="rg">RG:</label>
        <input type="rg"name ="rg" class="input-padrao" required placeholder="Digite o RG">

        <label for="orgaoemisor">Orgão Emissor:</label>
        <input type="text" id="orgaoemisor" name ="orgaoemisor"class="input-padrao" required>
        <br>

        <label for="telefone">Celular:</label>
        <input type="telefone" id="celular" name ="celular" class="input-padrao" required placeholder="(DDD)00000-0000">

        <label for="email">Email:</label>
        <input type="email" id="email" name ="email" class="input-padrao" required>

        <br>
        <label for="endereco">Endereco:</label>
        <input type="text" id="endereco" name ="endereco" class="input-padrao" required>


            <h1 class="infos-pess">INFORMAÇÕES COMPLEMENTARES</h1>
            <label for="cargo">Cargo:</label>
            <input type="text" id="cargo" name="cargo" class="input-padrao" required>

            <label for="graduacao">Graduação:</label>
            <input type="text" id="graduacao" name="graduacao" class="input-padrao" required>

            <br>
            <label for="conhecimento">Área do Conhecimento:</label>
            <input type="text" id="conhecimento" name="conhecimento" class="input-padrao" required>

            <h2 class="infos-pess">OBSERVAÇÕES</h2>

            <textarea name="observacoes" id="" cols="100" rows="8" class="area-texto"></textarea>

        <input type="submit" value="Cadastrar" class="cads">
        <input type="submit" value="Cancelar" class="cancel">
    </form>
</main>
</body>
</html>