create table Medicamentos (
	id SERIAL PRIMARY KEY,
	nome VARCHAR(50),
	indicacao VARCHAR(20),
	manha BOOLEAN,
	tarde BOOLEAN,
	noite BOOLEAN
)
