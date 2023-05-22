create table departamento.departamento (
	id_depto	integer,
	nome		varchar(30) not null,
	CONSTRAINT departamento_pk PRIMARY KEY(id_depto)
);

INSERT INTO departamento.departamento (id_depto, nome) VALUES (1,'vendas');

SELECT *
FROM departamento.departamento;

create table departamento.pessoa (
	id_pessoa	integer,
	nome		varchar(30) not null,
	cpf			varchar(11),
	trabalha_dpto	integer,
	CONSTRAINT pessoa_pk PRIMARY KEY(id_pessoa),
	CONSTRAINT departamento_fk FOREIGN KEY (trabalha_dpto) 
				REFERENCES departamento.departamento (id_depto)
);

ALTER TABLE departamento.pessoa ADD COLUMN salario numeric(10,2) default 1000.00;
ALTER TABLE departamento.pessoa DROP COLUMN salario;
ALTER TABLE departamento.pessoa ADD CONSTRAINT cpf_unico unique(cpf);
ALTER TABLE departamento.pessoa ADD CONSTRAINT check_salario CHECK (salario >= 1000.00);

INSERT INTO departamento.pessoa (id_pessoa, nome, cpf, trabalha_dpto) 
	VALUES (1, 'Fábio', '0000000000', 1);
INSERT INTO departamento.pessoa (id_pessoa, nome, cpf, trabalha_dpto) 
	VALUES (2, 'Renan', '111111111', 1);
INSERT INTO departamento.pessoa (id_pessoa, nome, cpf, trabalha_dpto) 
	VALUES (3, 'Thiago', '22222222222', 1);
INSERT INTO departamento.pessoa ( nome, cpf, trabalha_dpto, salario) 
	VALUES ( 'Boss', '22222222222', 1, 5000.00);
INSERT INTO departamento.pessoa ( nome, cpf, trabalha_dpto, salario) 
	VALUES ( 'Boss2', '22222222222', 1, 5000.00);
	
DELETE FROM departamento.pessoa WHERE nome = 'Fábio';
DELETE FROM departamento.departamento WHERE id_depto = 1;
	
UPDATE departamento.pessoa SET salario = 900.00 WHERE id_pessoa = 4;

select * from departamento.pessoa order by nome desc;
