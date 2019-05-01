create table historico (
	id SERIAL PRIMARY KEY,
	idmedicamento INTEGER REFERENCES Medicamentos(id),
	datahora TIMESTAMP,
	idpaciente INTEGER REFERENCES Pacientes(id),
	iddoenca INTEGER REFERENCES Doencas(id)
)