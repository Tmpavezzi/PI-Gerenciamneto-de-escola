<html>
<body>
<h2>Create Funcionarios</h2>

<form action="/create-funcionario" method="post">

    <label>Funcionarios</label> <br>
    <label>Nome</label>
    <input type="text" name="nome" id="nome" value="${param.name}">
    <br>
    <label>Sexo</label>
    <input type="text" name="sexo" id="sexo" value="${param.sexo}">
    <br>
    <label>Data Nascimento</label>
    <input type="text" name="dataNascimento" id="dataNascimento" value="${param.dataNascimento}">
    <br>
    <label>Estado Civil</label>
    <input type="text" name="estadoCivil" id="estadoCivil" value="${param.estadoCivil}">
    <br>
    <label>CPF</label>
    <input type="text" name="cpf" id="cpf" value="${param.cpf}">
    <br>
    <label>RG</label>
    <input type="text" name="rg" id="rg" value="${param.rg}">
    <br>
    <label>Orgao Emissor</label>
    <input type="text" name="orgaoEmissor" id="orgaoEmissor" value="${param.orgaoEmissor}">
    <br>
    <label>Celular</label>
    <input type="text" name="celular" id="celular" value="${param.celular}">
    <br>
    <label>Email</label>
    <input type="text" name="email" id="email" value="${param.email}">
    <br>
    <label>Endereco</label>
    <input type="text" name="endereco" id="endereco" value="${param.endereco}">
    <br>
    <label>Cargo</label>
    <input type="text" name="cargo" id="cargo" value="${param.cargo}">
    <br>
    <label>Graduacao</label>
    <input type="text" name="graduacao" id="graduacao" value="${param.graduacao}">
    <br>
    <label>Conhecimento</label>
    <input type="text" name="conhecimento" id="conhecimento" value="${param.conhecimento}">
    <br>
    <label>Observacao</label>
    <input type="text" name="observacao" id="observacao" value="${param.observacao}">
    <br>
    <input type="hidden" name="idFuncionario" id="idFuncionario" value="${param.idFuncionario}">
    <br>
    <button type="submit">Save</button>

</form>

</body>
</html>