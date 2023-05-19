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
        <input type="text" id="nome" name="nome" class="input-padrao" required>

        <label for="sexo" class="sexo">Sexo:</label>
        <label for="Feminino"> <input type="radio" name="sexo" value="Feminino" id="radio-feminino">Feminino</label>

        <label for="masculino"> <input type="radio" name="sexo" value="masculino" id="radio-masculino">Masculino</label>

        <br>
        <label for="dataNascimento">Data de Nascimento</label>
        <input type="date" id="date" name="dataNascimento">

        <label for="estadoCivil">Estado Civil:</label>
        <input type="text" id="estadoCivil" name="estadoCivil" class="input-padrao" required>
        <br>

        <label for="cpf">CPF:</label>
        <input type="cpf" id="CPF" class="input-padrao" name="cpf" required placeholder="Digite o CPF">

        <label for="rg">RG:</label>
        <input type="rg" class="input-padrao" id="rg" name="rg" required placeholder="Digite o RG">

        <label for="orgaoEmisor">Orgão Emissor:</label>
        <input type="text" id="orgaoEmissor" name="orgaoEmissor" class="input-padrao" required>
        <br>

        <label for="celular">Celular:</label>
        <input type="telefone" id="celular" name="celular" class="input-padrao" required placeholder="(DDD)00000-0000">

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" class="input-padrao" required>
        <br>

        <label for="endereco">Endereco:</label>
        <input type="text" id="endereco" name="endereco" class="input-padrao" required>


        <h1 class="infos-pess">INFORMAÇÕES ACADEMICAS</h1>
        <label for="serie">Série:</label>
        <input type="text" id="serie" name="serie" class="input-padrao" required>

        <label for="sala">Sala:</label>
        <input type="text" id="sala" name="sala" class="input-padrao" required>

        <label for="turma">Turma:</label>
        <input type="text" id="turma" name="turma" class="input-padrao" required>
        <br>

        <h2 class="infos-pess">OBSERVAÇÕES ACADEMICAS</h2>

        <textarea class="area-texto" name="observacoes" id="" cols="120" rows="8" ></textarea>

        <input type="submit" value="Cadastrar" class="cads">
        <input type="submit" value="Cancelar" class="cancel">
    </form>
</main>
</body>

</html>