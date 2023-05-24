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
- Cadastro de funcionários(professores), alunos.
- Listagem de funcionários(professores), alunos e instituições.

# Requisitos Funcionais:
- O sistema vai realizar o cadastro dos funcionários e dos alunos que desejam procurar a instituição para cursar/trabalhar;
- Gerenciamento de professores: o sistema é capaz de gerenciar as informações pessoais e de contato dos professores;
- Ele permite que o usúario possa procurar as instituições da sua escolha por meio do curso;

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

# Como efetuar o teste:

## Para acessar o banco
- Acesse o banco de dados com o link: https://localhost:8080/console/login.jsp
- Email e senha(ambos): sa e conecte

## Script criar tabela no banco

CREATE TABLE CADASTRO {
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	nome  varchar(200),
	email varchar(200),
	senha varchar(200)
}

CREATE TABLE ALUNO {
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	nome  varchar(200),
	sexo varchar(200),
	dataNascimento varchar(200),
	estadoCivil varchar(200),
	cpf varchar(200),
	rg varchar(200),
	orgaoEmissor varchar(200),
	celular varchar(200),
	email varchar(200),
	endereco varchar(200),
	serie varchar(200),
	sala varchar(200),
	turma varchar(200),
	observacao varchar(200)
	
}

CREATE TABLE FUNCIONARIO {
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	nome  varchar(200),
	sexo varchar(200),
	dataNascimento varchar(200),
	estadoCivil varchar(200),
	cpf varchar(200),
	rg varchar(200),
	orgaoEmissor varchar(200),
	celular varchar(200),
	email varchar(200),
	endereco varchar(200),
	cargo varchar(200),
	graduacao varchar(200),
	conhecimento varchar(200),
	observacao varchar(200)
	
}

CREATE TABLE INSTITUICOES {
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	nome  varchar(200),
	curso varchar(200),
	localizacao varchar(200)
}



## Executando o projeto:
- Após a criação da tabela, executar o tomcat7:run na aba do maven, no intellij.
- Clicar no link http://localhost:8080 que vai aparecer no console e será direcionado para um navegador.
- Preencher os campos da tela.
- Após os campos preenchidos, clicar no botão "Cadastrar", nesta hora o cadastro será enviado ao banco e logo em seguida, todos os registros do banco vão aparecer.


Espero que goste!!



