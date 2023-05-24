# Tema: Gerenciamento de Escolas

[PROJETO INTEGRADOR III - Turma B]

# Integrantes: 
- Barbara Barbosa
- Heloisa Hodnik
- Carolina Coimbra
- Kaick Fontes
- Jairo Santos
- Thiago Pavezzi

# Funcionalidades:
- Cadastro de funcionários e alunos;
- Documentações de informações referente a cada funcionário;
- Cadastro de Instituições

# Requisitos Funcionais:

- O sistema vai realizar o cadastro dos funcionários e dos alunos que desejam procurar a instituição para cursar/trabalhar;
- Gerenciamento de professores: o sistema é capaz de gerenciar as informações pessoais e de contato dos professores;
- Ele permite que o usúario posso procurar as instituições da sua escolha;

# Requisitos não Funcionais:

- Sistema só funcionará no Windows;
- Fácil ultilização para o usúario, pois terá botões indicando diretamente o comando, garantindo uma ótima usabilidade do sistema;
- Ele integrado ja diretamente, é garantido que estará disponivel sempre que precisar, tornando-o confiável;
- Por ser um sistema relativamente simples, funciona facilmente de qualquer aparelho, garantindo um ótimo desempenho;
- Cada usúario terá seu login, assim possibilitando estar fiscalizando qualquer infração, como vazamento de informações, podendo assim identificar o mesmo e garantindo a segurança;

# Diagrama de entidades
![imagem diagrama de entidades](/docs/diagrama-de-entidades.PNG).

# Telas do Sistema (link)
(https://www.figma.com/file/WD7YUdQJ93JcfXTMKqgkno/Gerenciamento-Escolar?node-id=1%3A2&t=pAc6zUJuB21LUEED-1)

# Passos para usabilidade do sistema

- Roda o projeto, e pegue o link gerado no terminal (https://localhost:8080) e abrir o link no browser
- Preenche as informações e clique no botão cadastrar.

## Para acessar o banco

- Acesse o banco de dados com o link: https://localhost:8080/console/login.jsp
- Email e senha(ambos): sa e conecte

## Script para acesso ao banco

CREATE TABLE PI {
	Nome  varchar(200) primary key,
	Email varchar(200),
	Senha varchar(200)
}

INSERT INTO PI(Nome, Email, Senha) 
VALUES("cadastroum", "cadastro@gmail.com", "123@cadastro");

SELECT * FROM PI;

DELETE FROM PI where Nome = "Enoque" ;

Espero que goste!!



