create table Medicamentos (
	id SERIAL PRIMARY KEY,
	nome VARCHAR(50),
	indicacao VARCHAR(20),
	manha BOOLEAN,
	tarde BOOLEAN,
	noite BOOLEAN
)

Exemplo:
INSERT INTO Medicamentos
(nome, indicacao, manha, tarde, noite)
VALUES
('Remedio teste', 'tres vezes ao dia', true, false, true)