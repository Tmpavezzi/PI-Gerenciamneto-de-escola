CREATE TABLE FUNCIONARIO (
    idFuncionario INTEGER PRIMARY KEY AUTOINCREMENT,
    nome VARCHAR(200),
    sexo VARCHAR(200),
    datanascimento VARCHAR(200),
    estadoCivil VARCHAR(200),
    cpf VARCHAR(200),
    rg VARCHAR(200),
    orgaoEmissor VARCHAR(200),
    celular VARCHAR(200),
    email VARCHAR(200),
    endereco VARCHAR(200),
    cargo VARCHAR(200),
    graduacao VARCHAR(200),
    conhecimento VARCHAR(200),
    observacao VARCHAR(200)
);

INSERT INTO FUNCIONARIO (nome, sexo, datanascimento, estadoCivil, cpf, rg, orgaoEmissor,
    celular, email, endereco, cargo, graduacao, conhecimento, observacao) 
VALUES ('João Silva', 'Masculino', '1990-05-15', 'Solteiro', '12345678900', '1234567', 'SSP/SP','999999999', 'joao.silva@example.com', 'Rua das Flores, 123', 'Analista', 'Bacharel', 'Java', 'Observação sobre o funcionário');


SELECT * FROM FUNCIONARIO;

DELETE FROM FUNCIONARIO where idFuncionario = 1;
