create table Historico (
	id SERIAL PRIMARY KEY,
	medicamento INTEGER REFERENCES Medicamentos(id),
	hora TIMESTAMP,
	dia DATE,
	id_paciente INTEGER REFERENCES Pacientes(id),
	doenca INTEGER REFERENCES Doencas(id)
)