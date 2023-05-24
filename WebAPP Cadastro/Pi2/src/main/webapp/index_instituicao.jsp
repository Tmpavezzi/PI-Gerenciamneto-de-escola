<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="reset.css">
    <link rel="stylesheet" href="index_instituicao.css">
    <link rel="stylesheet" href="index_aluno.css">
    <title>Buscar</title>
</head>

<body>
    <nav class="menu">

        <h1 class="titulo-menu">Sistema de Gerenciamento</h1>

        <ul class="principal">

            <li><a href="index_funcionario.jsp">Professores</a></li>

            <br>

            <li><a href="index_aluno.jsp">Alunos </a></li>

            <br>

            <li><a href="index_instituicao.jsp">Instituições</a> </li>

        </ul>

        <ul class="secundaria">

            <li> <a href="index.jsp"> Login</a></li>

            <br>

            <li> <a href="index_cadastro.jsp"> Cadastro</a> </li>

            <br>



        </ul>
    </nav>

    <main>
        <form id="buscar" action="find-all-instituicao" method="post">
            <h1 class="busca">BUSCA</h1>

            <div class="teste">
                <div class="esquerda">
                    <h3>Cursos:</h3>
                    <input class="campo-busca" id="busca" name="busca" type="text" placeholder="Search" >
                    <input type="submit" value="OK" class="btn-busca"  >
                </div>



                </div>
            </div>

            <br>
            <br>

            <div class="buttons-">

                <input type="submit" value="Voltar ao Inicio" class="voltar">
                <input type="submit" value="Selecionar" class="select">

            </div>

        </form>
    </main>

