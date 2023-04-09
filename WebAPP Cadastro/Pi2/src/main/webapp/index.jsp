<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="reset.css">
    <link rel="stylesheet" href="index.css">
    <title>Funcionarios</title>
</head>
<body>
    <nav class="menu">

        <h1 class="titulo-menu">Sistema de Gerenciamento</h1>

        <ul class="principal">

            <li>Funcionarios</li>

            <br>

            <li>Alunos</li>

            <br>

            <li>Instituições</li>

        </ul>

        <ul class="secundaria">

            <li> <a href="#paralogin"> Login</a></li>

            <br>

            <li> <a href="#paracadastro"> Cadastro</a> </li>

        </ul>

    </nav>


<div class="container" >
    <a class="links" id="paracadastro"></a>
    <a class="links" id="paralogin"></a>

    <div class="content">
      <!--FORMULÁRIO DE LOGIN-->
      <div id="login">
        <form method="post" action="">
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

          <p class="link">
            Ainda não tem conta?
            <a href="#paracadastro">Cadastre-se</a>
          </p>
        </form>
      </div>

      <!--FORMULÁRIO DE CADASTRO-->
      <div id="cadastro">
        <form method="post" action="">
          <h1 class="titulo-cad">Cadastro</h1>

          <p>
            <label for="nome_cad">Seu nome</label>
            <input id="nome_cad" name="nome_cad" required="required" type="text" placeholder="Seu nome" />
          </p>

          <p>
            <label for="email_cad">Seu e-mail</label>
            <input id="email_cad" name="email_cad" required="required" type="email" placeholder="seuemail@dominio.com"/>
          </p>

          <p>
            <label for="senha_cad">Sua senha</label>
            <input id="senha_cad" name="senha_cad" required="required" type="password" >
          </p>

          <p>
            <input type="submit" value="Cadastrar"/>
          </p>

          <p class="link">
            Já tem conta?
            <a href="#paralogin"> Ir para Login </a>
          </p>
        </form>
      </div>
    </div>
  </div>
</body>
</html>