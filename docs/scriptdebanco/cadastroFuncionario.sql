CREATE TABLE CadastroFuncionario {
	idFuncionario  int primary key AUTOINCREMENT, 
    nome  varchar(200),
    sexo  varchar(200),
    datanascimento date,
    cpf   varchar(200),
    rg    int,
    orgaoEmissor  varchar(200),
    celular  int,
    email varchar(200),
    formacaoAcademica ,
    curriculo  varchar(200),
    experienciasAdacemicas varchar(200),
    logradouro varchar(200),
    numero varchar(200),
    complemento varchar(200),
    bairro varchar(200),
    cep varchar(10),
    uf  varchar(2),
    cidade varchar(10),
    pais varchar(20)
}

INSERT INTO CadastroFuncionario(nome, sexo, datanascimento, cpf, rg, orgaoEmissor, celular, email, formacaoAcademica, curriculo, experienciasAdacemicas, logradouro, numero, complemento, bairro, cep, uf, cidade, pais) 
VALUES("Funcionario Amanda", "feminino", 2022-10-10, "000.000.000-00", "00.000.000-0", "ssp", 11 9 9999-9999, "Secretaria@gmail.com", "linkedin.com/amanda", "Secretaria", "rua da esquina", 21, "ap 1", "bairro do lado", "00000-000", "sp", "são paulo", "brasil");

SELECT * FROM CadastroFuncionario;

DELETE FROM CadastroFuncionario where idFuncionaria = 1;
