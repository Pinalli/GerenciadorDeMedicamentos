create table Pacientes (
	id SERIAL PRIMARY KEY,
	nome VARCHAR(50),
	genero VARCHAR(20),
	doenca_1 INTEGER REFERENCES Doencas (id),
	medicamento_1 INTEGER REFERENCES Medicamentos (id),
	doenca_2 INTEGER REFERENCES Doencas (id),
	medicamento_2 INTEGER REFERENCES Medicamentos (id),
	doenca_3 INTEGER REFERENCES Doencas (id),
	medicamento_3 INTEGER REFERENCES Medicamentos (id)
)