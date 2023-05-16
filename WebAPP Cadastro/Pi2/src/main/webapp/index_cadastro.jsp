<html>
<body>
<h2>Create Usuarios</h2>

<form action="/create-cadastro" method="post">

    <label>Usuario</label> <br>
    <label>Nome:</label>
    <input type="text" name="nome" id="nome" value="${param.name}">
    <br>
    <label>Email:</label>
    <input type="text" name="email" id="email" value="${param.email}">
    <br>
    <label>Senha:</label>
    <input type="text" name="senha" id="senha" value="${param.senha}">
    <br>
    <input type="hidden" name="idCadastro" id="idCadastro" value="${param.idCadastro}">
    <br>
    <button type="submit">Save</button>

</form>

</body>
</html>