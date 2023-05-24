<!DOCTYPE html>
<html lang="en">
<%@ page contentType="text/html; charset=UTF-8" %>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="reset.css">
    <link rel="stylesheet" href="index.css">
    <title>Cadastro</title>
</head>
<body>
    <nav class="menu">
        <h1 class="titulo-menu">Sistema de Gerenciamento</h1>

        <ul class="principal">
            <li><a href="index_funcionario.jsp">Professores</a></li>
            <br>
            <li><a href="index_aluno.jsp">Aluno </a></li>
            <br>
            <li><a href="index_instituicao.jsp">Instituições</a></li>
        </ul>

        <ul class="secundaria">
            <li> <a href="#index.jsp">Login</a></li>
            <br>
            <li> <a href="index_cadastro.jsp">Cadastro</a> </li>
        </ul>
    </nav>

    <div class="container" >
        <a class="links" id="paracadastro"></a>
        <a class="links" id="paralogin"></a>

        <div class="content">
        <!--FORMULÁRIO DE LOGIN-->
            <div id="login">
                <form method="post" action="/create-cadastro">
                    <h1 class="titulo-cad">Login</h1>
                    <p>
                        <label for="email_login">Seu e-mail</label>
                        <input id="email_login" name="email_login" required="required" type="text" placeholder="seuemail@dominio.com"/>
                    </p>

                    <p>
                        <label for="senha_login">Sua senha</label>
                        <input id="senha_login" name="senha_login" required="required" type="password"  />
                    </p>

                    <p>
                        <input type="checkbox" name="manterlogado" id="manterlogado" value="" />
                        <label for="manterlogado">Manter-me logado</label>
                    </p>

                    <p>
                        <input type="submit" value="Logar" />
                    </p>

                    <p class="link">Ainda não tem conta?<a href="#paracadastro">Cadastre-se</a></p>
                </form>
            </div>

            <!--FORMULÁRIO DE CADASTRO-->
            <div id="cadastro">
                <form method="post" action="/create-cadastro">
                    <h1 class="titulo-cad">Cadastro</h1>
                    <p>
                        <label for="nome">Seu nome</label>
                        <input type="text" id="nome" name="nome" required="required" value="${cadastro.nome}" />
                    </p>

                    <p>
                        <label for="email">Seu e-mail</label>
                        <input id="email" name="email" required="required" type="email" value="${cadastro.email}" placeholder="seuemail@dominio.com"/>
                    </p>

                    <p>
                        <label for="senha">Sua senha</label>
                        <input id="senha" name="senha" required="required" type="password" value="${cadastro.senha}" >
                    </p>

                    <input type="hidden" id="idCadastro" name="idCadastro" value="${param.idCadastro}">

                    <p>
                        <input type="submit" value="Cadastrar"/>
                    </p>
                        <p class="link">Já tem conta?<a href="#paralogin"> Ir para Login </a></p>
                </form>
            </div>
        </div>
    </div>
</body>
</html>