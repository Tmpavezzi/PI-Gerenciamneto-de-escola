<html>
<body>
<h2>Create Aluno</h2>

<form action="/create-aluno" method="post">

    <label>Alunos</label> <br>
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
    <label>Serie:</label>
    <input type="text" name="serie" id="serie" value="${param.serie}">
    <br>
    <label>Sala:</label>
    <input type="text" name="sala" id="sala" value="${param.sala}">
    <br>
    <label>Turma:</label>
    <input type="text" name="turma" id="turma" value="${param.turma}">
    <br>
    <label>Observacao:</label>
    <input type="text" name="observacao" id="observacao" value="${param.observacao}">
    <br>
    <input type="hidden" name="idAluno" id="idAluno" value="${param.idAluno}">
    <br>
    <button type="submit">Save</button>
</form>

</body>
</html>