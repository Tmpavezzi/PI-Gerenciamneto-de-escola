CREATE TABLE GerenciamentoEscola {
	idescola  int primary key AUTOINCREMENT, 
	nome  varchar(200),
	email varchar(200),
	senha varchar(200)
}

INSERT INTO GerenciamentoEscola(nome, email, senha) 
VALUES("Escola Senac", "senac@gmail.com", "123@senac");

SELECT * FROM GerenciamentoEscola;

DELETE FROM GerenciamentoEscola where idescola = 1;

