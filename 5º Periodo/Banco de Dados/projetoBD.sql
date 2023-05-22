-----------------------HOSPITAL------------------------
CREATE TABLE IF NOT EXISTS hospital(
	cnpj char(14),
	nome varchar(50)not null,
	endereco varchar(50) not null,
	cidade varchar(20)not null,
	macrorregiao varchar(20)not null,
	PRIMARY KEY(cnpj)
);

--INSERT INTO hospital (cnpj, nome, endereco, cidade, macrorregiao) 
--VALUES (23678123000198, 'Hospital A', 'Rua A', 'Cidade A', 'Macrorregião A');

--INSERT INTO hospital (cnpj, nome, endereco, cidade, macrorregiao) 
--VALUES (98765, 'Hospital B', 'Rua B', 'Cidade B', 'Macrorregião B')

--SELECT * FROM hospital

-----------------------PACIENTE------------------------
CREATE TABLE IF NOT EXISTS paciente(
	cpf char(11),
	rg Integer not null,
	endereco varchar(50) not null,
	nome varchar(50) not null,
	cidade varchar(30) not null,
	filiacao_pai varchar(30),
	filiacao_mae varchar(30) not null,
	numero_acompanhante char(11),
	PRIMARY KEY (cpf)
);

--INSERT INTO paciente (cpf, rg, endereco, nome, cidade, filiacao_pai, filiacao_mae, numero_acompanhante) 
--VALUES (12345678901, 123456789, 'Rua A', 'Paciente A', 'Cidade A', 'Pai A', 'Mãe A', '12345678901');

--INSERT INTO paciente (cpf, rg, endereco, nome, cidade, filiacao_pai, filiacao_mae, numero_acompanhante) 
--VALUES (12345678900, 987654321, 'Rua B', 'Paciente B', 'Cidade B', 'Pai B', 'Mãe B', '98765432109');

--SELECT * FROM paciente

------------------------LEITO-------------------------
CREATE TABLE IF NOT EXISTS leito(
	num_leito Integer,
	cnpj char(14), --chave estrangeira
	disponibilidade boolean not null,
	PRIMARY KEY (num_leito),
	FOREIGN KEY (cnpj) REFERENCES hospital(cnpj)
);

--INSERT INTO leito (num_leito, cnpj, disponibilidade) 
--VALUES (1, 23678123000198, true); 

--INSERT INTO leito (num_leito, cnpj, disponibilidade) 
--VALUES (2, 98765, false);

--SELECT * FROM leito

----------------------PROFISSIONAL-----------------------
CREATE TABLE IF NOT EXISTS profissional (
	id_profissional serial,
	nome varchar(50)not null,
	cpf char(11) not null UNIQUE,
	endereco varchar(50) not null,
	especialidade varchar(50) not null,
	dias_de_plantao Integer not null,
	tipo_profissional varchar(15) not null,
	PRIMARY KEY (id_profissional)
);

--INSERT INTO profissional (nome, cpf, endereco, especialidade, dias_de_plantao, tipo_profissional) 
--VALUES ('Profissional A', '11111111111', 'Rua L', 'Especialidade A', 5, 'Enfermeiro');

--INSERT INTO profissional (nome, cpf, endereco, especialidade, dias_de_plantao, tipo_profissional) 
--VALUES ('Profissional B', '22222222222', 'Rua M', 'Especialidade B', 4, 'Médico');

--SELECT * FROM profissional

----------------------ENFERMEIRO-----------------------
CREATE TABLE IF NOT EXISTS enfermeiro(
	id_profissional Integer,
	corem varchar(15) UNIQUE,
	PRIMARY KEY(id_profissional),
	FOREIGN KEY (id_profissional) REFERENCES profissional(id_profissional)
);

--INSERT INTO enfermeiro (id_profissional, corem)
--VALUES ((SELECT id_profissional FROM profissional WHERE cpf = '11111111111'), 'COREM12345');

--SELECT * FROM enfermeiro

----------------------MEDICO-----------------------
CREATE TABLE IF NOT EXISTS medico(
	id_profissional Integer,
	crm varchar(15) UNIQUE,
	PRIMARY KEY(id_profissional),
	FOREIGN KEY (id_profissional) REFERENCES profissional(id_profissional)
);

--INSERT INTO medico (id_profissional, crm)
--VALUES ((SELECT id_profissional FROM profissional WHERE cpf = '22222222222'), 'CRM12348');

--SELECT * FROM medico

----------------------HISTORICO-----------------------
CREATE TABLE IF NOT EXISTS historico(
	id_historico serial,
	cpf char(11) not null UNIQUE, --chave estrangeira
	id_profissional serial,  --chave estrangeira
	status varchar(500) not null,
	PRIMARY KEY (id_historico),
	FOREIGN KEY (cpf) REFERENCES paciente(cpf),
	FOREIGN KEY (id_profissional) REFERENCES profissional(id_profissional)
);

--INSERT INTO historico (cpf, id_profissional, status)
--VALUES (12345678901, 1, 'Paciente em observação');

--SELECT * FROM historico

----------------------ALERGIA-----------------------
CREATE TABLE IF NOT EXISTS alergia(
	codigo_alergia Integer,
	cpf char(11) not null,  --chave estrangeira
	nome varchar(100) not null,
	descricao varchar(500) not null,
	grau varchar(20) not null,
	PRIMARY KEY (codigo_alergia),
	FOREIGN KEY (cpf) REFERENCES paciente(cpf)
);

--INSERT INTO alergia (codigo_alergia, cpf, nome, descricao, grau) 
--VALUES (1, '12345678901', 'Alergia A', 'Descrição A', 'Leve');

--INSERT INTO alergia (codigo_alergia, cpf, nome, descricao, grau) 
--VALUES (2, '12345678900', 'Alergia B', 'Descrição B', 'Moderado');

--INSERT INTO alergia (codigo_alergia, cpf, nome, descricao, grau) 
--VALUES (3, '12345678900', 'Alergia C', 'Descrição C', 'Intenso');

--SELECT * FROM alergia

----------------------SINTOMA-----------------------
CREATE TABLE IF NOT EXISTS sintoma(
	id_sintoma serial,
	cpf char(11) not null, --chave estrangeira
	nome varchar(100) not null,
	descricao varchar(500) not null,
	PRIMARY KEY(id_sintoma),
	FOREIGN KEY (cpf) REFERENCES paciente(cpf)
);

--INSERT INTO sintoma (cpf, nome, descricao)
--VALUES (12345678901, 'Febre', 'Temperatura corporal acima de 38°C');

--INSERT INTO sintoma (cpf, nome, descricao)
--VALUES (12345678901, 'tosse', 'Tosse seca e constante');

--SELECT * FROM sintoma

----------------------SINAL-----------------------
CREATE TABLE IF NOT EXISTS sinal(
	numeracao_sinal serial,
	id_historico Integer UNIQUE, --chave estrangeira
	batimentos Integer not null,
	nivel_consciencia Varchar(100) not null,
	febre boolean,
	nivel_oxigenacao varchar(50),
	nivel_dor varchar(50) not null,
	observacao varchar (500),
	respiracao varchar (200) not null,
	data_sinal timestamp not null,
	PRIMARY KEY(numeracao_sinal),
	FOREIGN KEY (id_historico) REFERENCES historico(id_historico)
);

--INSERT INTO sinal (numeracao_sinal, id_historico, batimentos, nivel_consciencia, febre, nivel_oxigenacao, nivel_dor, observacao, respiracao, data_sinal)
--VALUES (1, 2, 80, 'Consciente', true, 'Normal', 'Leve', 'Sem observações', 'Normal', '2023-05-20 14:30:00');

--SELECT * FROM sinal

----------------------MEDICACAO-----------------------
CREATE TABLE IF NOT EXISTS medicacao (
  codigo_medicacao SERIAL,
  quantidade INTEGER NOT NULL,
  tipo VARCHAR(100) NOT NULL,
  inicio DATE NOT NULL,
  horario TIMESTAMP NOT NULL,
  fim DATE NOT NULL,
  nome VARCHAR(100) NOT NULL,
  data DATE NOT NULL,
  
  CONSTRAINT medicacao_pk PRIMARY KEY (codigo_medicacao)
);

--INSERT INTO medicacao (quantidade, tipo, inicio, horario, fim, nome, data)
--VALUES (10, 'Comprimido', '2023-05-20', '2023-05-20 08:00:00', '2023-05-30', 'Paracetamol', '2023-02-10');

--SELECT * FROM medicacao

----------------------TRATAMENTO-----------------------
CREATE TABLE IF NOT EXISTS tratamento (
  id_tratamento SERIAL,
  cpf char(11) not null, --chave estrangeira
  id_profissional SERIAL UNIQUE, --chave estrangeira
  data_fim DATE NOT NULL,
  data_inicio DATE NOT NULL,
  descricao VARCHAR(500) NOT NULL,
  tipo VARCHAR(300) NOT NULL,
  
  CONSTRAINT tratamento_pk PRIMARY KEY (id_tratamento),
  CONSTRAINT tratamento_cpf_fk FOREIGN KEY (cpf) REFERENCES paciente(cpf),
  CONSTRAINT tratamento_profissional_fk FOREIGN KEY (id_profissional) REFERENCES profissional(id_profissional)
);

--INSERT INTO tratamento (cpf, id_profissional, data_fim, data_inicio, descricao, tipo)
--VALUES (12345678901, 2, '2023-05-30', '2023-05-20', 'Tratamento para febre', 'Medicamentoso');

--SELECT * FROM tratamento

----------------------EXAME-----------------------
CREATE TABLE IF NOT EXISTS Exame (
  codigo_exame SERIAL,
  id_profissional SERIAL not null, --chave estrangeira
  cpf char(11) not null, --chave estrangeira
  nome VARCHAR(100) NOT NULL,
  tipo VARCHAR(80) NOT NULL,
  local_exame VARCHAR(100) NOT NULL,
  classificacao VARCHAR(60) NOT NULL,
  
  CONSTRAINT exame_pk PRIMARY KEY (codigo_exame),
  CONSTRAINT tratamento_cpf_fk FOREIGN KEY (cpf) REFERENCES Paciente(cpf),
  CONSTRAINT tratamento_profissional_fk FOREIGN KEY (id_profissional) REFERENCES Profissional(id_profissional)
);

--INSERT INTO Exame (id_profissional, cpf, nome, tipo, local_exame, classificacao)
--VALUES (2, 12345678901, 'Exame de sangue', 'Laboratorial', 'Laboratório X', 'Rotina');

--INSERT INTO Exame (id_profissional, cpf, nome, tipo, local_exame, classificacao)
--VALUES (2, 12345678900, 'Exame de sangue', 'Laboratorial', 'Laboratório X', 'Rotina');

--SELECT * FROM exame

----------------------USUARIO-----------------------
CREATE TABLE IF NOT EXISTS Usuario (
  cpf_usuario char(11) NOT NULL UNIQUE,
  nome VARCHAR(100) NOT NULL,
  senha VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL,
  nivel_acesso VARCHAR(100) NOT NULL,
  data_entrada DATE NOT NULL,
  data_saida DATE NOT NULL,
  
  CONSTRAINT usuario_pk PRIMARY KEY (cpf_usuario)
);

--INSERT INTO Usuario (cpf_usuario, nome, senha, email, nivel_acesso, data_entrada, data_saida)
--VALUES (22222222222, 'Usuário Médico', '123456', 'medico@teste.com', 'Médico', '2023-05-20', '2023-05-21');


--INSERT INTO Usuario (cpf_usuario, nome, senha, email, nivel_acesso, data_entrada, data_saida)
--VALUES (11111111111, 'Usuário enfermeiro', '123456', 'enfermeiro@teste.com', 'enfermeiro', '2023-05-20', '2023-05-21');

--SELECT * FROM usuario

----------------------PERMISSAO-----------------------
CREATE TABLE IF NOT EXISTS Permissao (
  id_permissao SERIAL,
  cpf_usuario char(11) not null UNIQUE,
  nome_permissao VARCHAR(100) NOT NULL,
  descricao VARCHAR(500) NOT NULL,

  CONSTRAINT permissao_pk PRIMARY KEY (id_permissao),
  FOREIGN KEY (cpf_usuario) REFERENCES usuario(cpf_usuario) 
);

--INSERT INTO Permissao (cpf_usuario, nome_permissao, descricao)
--VALUES ('22222222222','Acesso médico', 'Permite visualizar informações dos pacientes');

--INSERT INTO Permissao (cpf_usuario, nome_permissao, descricao)
--VALUES ('11111111111','Acesso enfermeiro', 'Permite visualizar informações dos pacientes');

--SELECT * FROM permissao

----------------------PROFISSIONAL_USUARIO-----------------------
CREATE TABLE IF NOT EXISTS Profisional_Usuario (
  id_profissional Integer,
  cpf_usuario varchar(11),
  
  CONSTRAINT profisional_usuario_pk PRIMARY KEY (id_profissional, cpf_usuario),
  CONSTRAINT profisional_usuario_id_fk FOREIGN KEY (id_profissional) REFERENCES Profissional(id_profissional),
  CONSTRAINT profisional_usuario_cpf_fk FOREIGN KEY (cpf_usuario) REFERENCES Usuario(cpf_usuario)
);

--INSERT INTO Profisional_Usuario(id_profissional, cpf_usuario)
--VALUES ((SELECT id_profissional FROM profissional WHERE cpf = '11111111111'), (SELECT cpf_usuario FROM usuario WHERE cpf_usuario = '11111111111'));

--INSERT INTO Profisional_Usuario(id_profissional, cpf_usuario)
--VALUES ((SELECT id_profissional FROM profissional WHERE cpf = '22222222222'), (SELECT cpf_usuario FROM usuario WHERE cpf_usuario = '22222222222'));

--SELECT * FROM Profisional_Usuario

----------------------USUARIO_PERMISSAO-----------------------
CREATE TABLE IF NOT EXISTS usuario_permissao(
	cpf_usuario char(11) UNIQUE,
	id_permissao Integer UNIQUE,
	
	PRIMARY KEY (cpf_usuario, id_permissao),
	FOREIGN KEY (cpf_usuario) REFERENCES Usuario(cpf_usuario),
	FOREIGN KEY (id_permissao) REFERENCES permissao(id_permissao)
);

--INSERT INTO usuario_permissao(cpf_usuario, id_permissao)
--VALUES ((SELECT cpf_usuario FROM usuario WHERE cpf_usuario = '22222222222'), (SELECT id_permissao FROM permissao WHERE id_permissao = 2));

--INSERT INTO usuario_permissao(cpf_usuario, id_permissao)
--VALUES ((SELECT cpf_usuario FROM usuario WHERE cpf_usuario = '11111111111'), (SELECT id_permissao FROM permissao WHERE id_permissao = 3));

--SELECT * FROM usuario_permissao

----------------------PACIENTE_ALERGIA-----------------------
CREATE TABLE IF NOT EXISTS paciente_alergia(
	cpf char(11),
	codigo_alergia INTEGER,
	PRIMARY KEY(cpf, codigo_alergia),
	FOREIGN KEY(codigo_alergia) REFERENCES alergia(codigo_alergia),
	FOREIGN KEY(cpf) REFERENCES paciente(cpf)
);

--INSERT INTO paciente_alergia(cpf, codigo_alergia)
--VALUES ((SELECT cpf FROM paciente WHERE cpf = '12345678901'), (SELECT codigo_alergia FROM alergia WHERE codigo_alergia = 1));

--INSERT INTO paciente_alergia(cpf, codigo_alergia)
--VALUES ((SELECT cpf FROM paciente WHERE cpf = '12345678900'), (SELECT codigo_alergia FROM alergia WHERE codigo_alergia = 2));

--INSERT INTO paciente_alergia(cpf, codigo_alergia)
--VALUES ((SELECT cpf FROM paciente WHERE cpf = '12345678900'), (SELECT codigo_alergia FROM alergia WHERE codigo_alergia = 3));

--SELECT * FROM paciente_alergia

----------------------PACIENTE_SINTOMA-----------------------
CREATE TABLE IF NOT EXISTS paciente_sintoma(
	cpf char(11),
	id_sintoma Integer,
	PRIMARY KEY(cpf,id_sintoma),
	FOREIGN KEY(id_sintoma) REFERENCES sintoma(id_sintoma),
	FOREIGN KEY(cpf) REFERENCES paciente(cpf)
);

--INSERT INTO paciente_sintoma(cpf, id_sintoma)
--VALUES ((SELECT cpf FROM paciente WHERE cpf = '12345678901'), (SELECT id_sintoma FROM sintoma WHERE id_sintoma = 1));

--INSERT INTO paciente_sintoma(cpf, id_sintoma)
--VALUES ((SELECT cpf FROM paciente WHERE cpf = '12345678901'), (SELECT id_sintoma FROM sintoma WHERE id_sintoma = 2));

--INSERT INTO paciente_sintoma(cpf, id_sintoma)
--VALUES ((SELECT cpf FROM paciente WHERE cpf = '12345678900'), (SELECT id_sintoma FROM sintoma WHERE id_sintoma = 1));

--SELECT * FROM paciente_sintoma

----------------------HISTORICO_SINAL-----------------------
CREATE TABLE IF NOT EXISTS historico_sinal(
	id_historico Integer,
	numeracao_sinal Integer UNIQUE, --chave estrangeira
	PRIMARY KEY(id_historico, numeracao_sinal),
	FOREIGN KEY(id_historico) REFERENCES historico(id_historico),
	FOREIGN KEY(numeracao_sinal) REFERENCES sinal(numeracao_sinal)
);

--INSERT INTO historico_sinal(id_historico, numeracao_sinal)
--VALUES ((SELECT id_historico FROM historico WHERE id_historico = 2), (SELECT numeracao_sinal FROM sinal WHERE numeracao_sinal = 1));

--SELECT * FROM historico_sinal

----------------------PROFISSIONAL_HISTORICO-----------------------
CREATE TABLE IF NOT EXISTS profissional_historico(
	id_historico Integer,
	id_profissional Integer UNIQUE, --chave estrangeira
	PRIMARY KEY(id_historico, id_profissional),
	FOREIGN KEY(id_historico) REFERENCES historico(id_historico),
	FOREIGN KEY(id_profissional) REFERENCES profissional(id_profissional)
);

--INSERT INTO profissional_historico(id_historico, id_profissional)
--VALUES ((SELECT id_historico FROM historico WHERE id_historico = 2), (SELECT id_profissional FROM profissional WHERE id_profissional = 1));

--INSERT INTO profissional_historico(id_historico, id_profissional)
--VALUES ((SELECT id_historico FROM historico WHERE id_historico = 2), (SELECT id_profissional FROM profissional WHERE id_profissional = 2));

--SELECT * FROM profissional_historico

----------------------PROFISSIONAL_TRATAMENTO-----------------------
CREATE TABLE IF NOT EXISTS profissional_tratamento(
	id_tratamento Integer,
	id_profissional Integer UNIQUE, --chave estrangeira
	PRIMARY KEY(id_tratamento, id_profissional),
	FOREIGN KEY(id_tratamento) REFERENCES tratamento(id_tratamento),
	FOREIGN KEY(id_profissional) REFERENCES profissional(id_profissional)
);

--INSERT INTO profissional_tratamento(id_tratamento, id_profissional)
--VALUES ((SELECT id_tratamento FROM tratamento WHERE id_tratamento = 1), (SELECT id_profissional FROM profissional WHERE id_profissional = 1));

--INSERT INTO profissional_tratamento(id_tratamento, id_profissional)
--VALUES ((SELECT id_tratamento FROM tratamento WHERE id_tratamento = 1), (SELECT id_profissional FROM profissional WHERE id_profissional = 2));

--SELECT * FROM profissional_tratamento

----------------------TRATAMENTO_MEDICACAO-----------------------
CREATE TABLE IF NOT EXISTS tratamento_medicacao(
	id_tratamento Integer,
	codigo_medicacao Integer UNIQUE, --chave estrangeira
	PRIMARY KEY(id_tratamento, codigo_medicacao),
	FOREIGN KEY(id_tratamento) REFERENCES tratamento(id_tratamento),
	FOREIGN KEY(codigo_medicacao) REFERENCES medicacao(codigo_medicacao)
);

--INSERT INTO tratamento_medicacao(id_tratamento, codigo_medicacao)
--VALUES ((SELECT id_tratamento FROM tratamento WHERE id_tratamento = 1), (SELECT codigo_medicacao FROM medicacao WHERE codigo_medicacao = 1));

--SELECT * FROM tratamento_medicacao

----------------------HOSPITAL_USUARIO-----------------------
CREATE TABLE IF NOT EXISTS hospital_usuario(
	cnpj char(14),
	cpf_usuario char(11),
	horario_entrada TIME NOT NULL,
	horario_saida TIME NOT NULL,
	PRIMARY KEY(cnpj, cpf_usuario),
	FOREIGN KEY(cnpj) REFERENCES hospital(cnpj),
	FOREIGN KEY(cpf_usuario) REFERENCES usuario(cpf_usuario)
);

--INSERT INTO hospital_usuario(cnpj, cpf_usuario, horario_entrada, horario_saida)
--VALUES ((SELECT cnpj FROM hospital WHERE cnpj = '23678123000198'), (SELECT cpf_usuario FROM usuario WHERE cpf_usuario = '22222222222'), '14:30:00', '16:33:00');

--INSERT INTO hospital_usuario(cnpj, cpf_usuario, horario_entrada, horario_saida)
--VALUES ((SELECT cnpj FROM hospital WHERE cnpj = '23678123000198'), (SELECT cpf_usuario FROM usuario WHERE cpf_usuario = '11111111111'), '11:30:00', '12:33:00');

--SELECT * FROM hospital_usuario

----------------------LEITO_PACIENTE-----------------------
CREATE TABLE IF NOT EXISTS leito_paciente(
	num_leito INTEGER,
	cpf char(11),
	data_entrada DATE NOT NULL,
	data_saida DATE NOT NULL,
	PRIMARY KEY(num_leito, cpf),
	FOREIGN KEY(num_leito) REFERENCES leito(num_leito),
	FOREIGN KEY(cpf) REFERENCES paciente(cpf)
);

--INSERT INTO leito_paciente(num_leito, cpf, data_entrada, data_saida)
--VALUES ((SELECT num_leito FROM leito WHERE num_leito = 2), (SELECT cpf FROM paciente WHERE cpf = '12345678901'), '2023-01-02', '2023-01-03');

--SELECT * FROM leito_paciente