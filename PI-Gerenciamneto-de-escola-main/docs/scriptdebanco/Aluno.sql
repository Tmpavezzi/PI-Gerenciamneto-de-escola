CREATE TABLE ALUNO (
    idAluno INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(200),
    sexo VARCHAR(200),
    dataNascimento VARCHAR(200),
    estadoCivil VARCHAR(200),
    cpf VARCHAR(200),
    rg VARCHAR(200),
    orgaoEmissor VARCHAR(200),
    celular VARCHAR(200),
    email VARCHAR(200),
    endereco VARCHAR(200),
    serie VARCHAR(200),
    sala VARCHAR(200),
    turma VARCHAR(200),
    observacao VARCHAR(200)
);

INSERT INTO ALUNO (nome, sexo, dataNascimento, estadoCivil, cpf, rg, orgaoEmissor, celular, email, endereco, serie, sala, turma, observacao)
VALUES ('Maria Silva', 'Feminino', '1995-08-10','Solteiro','12345678900','9876543','SSP/SP','999999999','maria.silva@example.com','Rua das Flores, 123', '9º ano', 'A', 'Turma A1', 'Observação sobre o aluno');


SELECT * FROM ALUNO;

DELETE FROM ALUNO where idAluno = 1;