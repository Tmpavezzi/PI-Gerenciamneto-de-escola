CREATE TABLE CadastroAluno {
	idAluno  int primary key AUTOINCREMENT, 
	nome  varchar(200),
    sexo  varchar(200),
    datanascimento date,
    rg    int,
    celular  int,
    cpf   varchar(200),
    email varchar(200),
    datamatricula date,
    serie  varchar(200),
    sala   varchar(200),
    turma  varchar(200),
    observacoesAdacemicas varchar(200),
    logradouro varchar(200),
    numero varchar(200),
    complemento varchar(200),
    bairro varchar(200),
    cep varchar(10),
    uf  varchar(2),
    cidade varchar(10),
    pais varchar(20)
}

INSERT INTO CadastroAluno(nome, sexo, datanascimento, rg, celular, cpf, email, datamatricula, serie, sala, turma, observacoesAdacemicas, logradouro, numero, complemento, bairro, cep, uf, cidade, pais) 
VALUES("Ana", "feminino", 2022-02-02, "00.000.000-0", "11 9 9999-9999", "ana@gmail.com", 2023-02-10, "7 ano", "32", "Turma A", null, "rua da esquina", 21, "ap 1", "bairro do lado", "00000-000", "sp", "são paulo", "brasil");

SELECT * FROM CadastroAluno;

DELETE FROM CadastroAluno where idAluno = 1;