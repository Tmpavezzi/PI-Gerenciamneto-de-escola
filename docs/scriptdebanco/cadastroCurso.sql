CREATE TABLE CadastroCurso {
	idCurso  int primary key AUTOINCREMENT, 
	nome  varchar(200),
    cargaHoraria   varchar(200),
    conteudo   varchar(200), 
    turma   varchar(200),
    sala    varchar(200),
    periodo  varchar(200)
}

INSERT INTO CadastroCurso(nome, cargaHoraria, conteudo, turma, sala, periodo) 
VALUES("TADS", "30 horas", "redes de computadores", "Turma A", "Sala 1", "noturno");

SELECT * FROM CadastroCurso;

DELETE FROM CadastroCurso where idCurso = 1;
