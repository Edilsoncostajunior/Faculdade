CREATE TABLE public.cliente (
	CGC VARCHAR(30),
	nome VARCHAR(30) NOT NULL,
	endereco VARCHAR(50),
	telefone_Para_Contato VARCHAR(30),
	CONSTRAINT cliente_PK PRIMARY KEY (CGC)
);

CREATE TABLE public.peca (
	UPC VARCHAR(30),
	descricao VARCHAR(30),
	numInterno INTEGER NOT NULL,
	CONSTRAINT peca_pk PRIMARY KEY (UPC)
);

CREATE TABLE public.ordemDeCompra (
	numero INTEGER,
	dataCompra DATE NOT NULL,
	idCliente VARCHAR(30),
	CONSTRAINT id_compra PRIMARY KEY (numero),
	CONSTRAINT idCliente_fk FOREIGN KEY (idCliente) REFERENCES cliente (CGC)
);

CREATE TABLE public.entrega (
	numero INTEGER,
	dataEntrega DATE NOT NULL,
	idCompra INTEGER,
	CONSTRAINT id_entrega PRIMARY KEY (numero),
	CONSTRAINT idcompra_fk FOREIGN KEY (idCompra) REFERENCES ordemDeCompra (numero)
);

CREATE TABLE public.itensDaEntrega (
	idEntrega INTEGER,
	idPeca VARCHAR(30),
	quantidade INTEGER NOT NULL,
	CONSTRAINT identrega_idPeca_pk PRIMARY KEY (idEntrega, idPeca),
	CONSTRAINT idEntrega_fk FOREIGN KEY (idEntrega) REFERENCES entrega (numero),
	CONSTRAINT idPeca_fk FOREIGN KEY (idPeca) REFERENCES peca (UPC)
);

CREATE TABLE public.receptaculo (
	corredor INTEGER,
	numero INTEGER,
	CONSTRAINT corredor_numero_pk PRIMARY KEY (corredor, numero)
);

CREATE TABLE public.estocagem (
	corredor INTEGER,
	numero INTEGER,
	idPeca VARCHAR(30),
	quantidade INTEGER NOT NULL,
	CONSTRAINT idReceptaculo_idPeca_pk PRIMARY KEY (corredor, numero, idPeca),
    CONSTRAINT idReceptaculo_fk FOREIGN KEY (corredor, numero) REFERENCES receptaculo(corredor, numero),
	CONSTRAINT idPeca_fk FOREIGN KEY (idPeca) REFERENCES peca (UPC)
);

CREATE TABLE public.pedido (
	numero INTEGER,
	dataPedido DATE NOT NULL,
	idCliente VARCHAR(30),
	constraint idPedido_pk PRIMARY KEY(numero),
	constraint idCliente_fk FOREIGN KEY(idCliente) REFERENCES cliente(CGC)
);

CREATE TABLE public.itenDePedido (
	idPedido INTEGER,
	idPeca VARCHAR(30),
	quantidade INTEGER NOT NULL,
	constraint idPedido_fk FOREIGN KEY(idPedido) REFERENCES pedido(numero),
	constraint idPeca_fk FOREIGN KEY(idPeca) REFERENCES peca(UPC),
	constraint idItenDePedido_pk PRIMARY KEY(idPedido, idPeca)
);

CREATE TABLE public.busca (
	idPedido INTEGER,
	idPeca VARCHAR(30),
	corredorReceptaculo INTEGER,
	numeroReceptaculo INTEGER,
	quantidade INTEGER NOT NULL,
	constraint idBusca_pk PRIMARY KEY(corredorReceptaculo, numeroReceptaculo, idPeca, idPedido),
	constraint idReceptaculo_fk FOREIGN KEY(corredorReceptaculo, numeroReceptaculo) REFERENCES receptaculo(corredor, numero),
	constraint idPeca_fk FOREIGN KEY(idPeca) REFERENCES peca(UPC),
	constraint idPedido_fk FOREIGN KEY(idPedido) REFERENCES pedido(numero)
);


CREATE INDEX idxClienteNome ON cliente(nome);
CREATE INDEX idxPeçasNumInterno ON peca(numInterno);
CREATE INDEX idxPedidoDataPedido ON pedido(dataPedido);