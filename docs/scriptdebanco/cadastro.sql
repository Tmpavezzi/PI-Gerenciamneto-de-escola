CREATE TABLE Cadastro {
	idcadastro  int primary key AUTOINCREMENT, 
	nome  varchar(200),
	email varchar(200),
	senha varchar(200)
}

INSERT INTO Cadastro(nome, email, senha) 
VALUES("cadastroum", "cadastro@gmail.com", "123@cadastro");

SELECT * FROM Cadastro;

DELETE FROM Cadastro where idcadastro = 1;
