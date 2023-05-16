CREATE TABLE CADASTRO (
    idCadastro INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(200),
    email VARCHAR(200),
    senha VARCHAR(200),
);

INSERT INTO CADASTRO (nome, email, senha) 
VALUES ('João Silva', 'joao.silva@example.com', 'senha123');

SELECT * FROM CADASTRO;

DELETE FROM CADASTRO where idCadastro = 1;