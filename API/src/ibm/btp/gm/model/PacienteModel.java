package ibm.btp.gm.model;

public class PacienteModel {

	public PacienteModel() {
	}

	public PacienteModel(int id, String nome, String genero, int doenca_1, int doenca_2, int doenca_3,
			int medicamento_1, int medicamento_2, int medicamento_3) {
		this.id = id;
		this.nome = nome;
		this.genero = genero;
		this.doenca_1 = doenca_1;
		this.doenca_2 = doenca_2;
		this.doenca_3 = doenca_3;
		this.medicamento_1 = medicamento_1;
		this.medicamento_2 = medicamento_2;
		this.medicamento_3 = medicamento_3;
	}

	private int id;

	private String nome;

	private String genero;
	private int doenca_1;
	private int doenca_2;
	private int doenca_3;
	private int medicamento_1;
	private int medicamento_2;
	private int medicamento_3;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDoenca_1() {
		return doenca_1;
	}

	public void setDoenca_1(int doenca_1) {
		this.doenca_1 = doenca_1;
	}

	public int getDoenca_2() {
		return doenca_2;
	}

	public void setDoenca_2(int doenca_2) {
		this.doenca_2 = doenca_2;
	}

	public int getDoenca_3() {
		return doenca_3;
	}

	public void setDoenca_3(int doenca_3) {
		this.doenca_3 = doenca_3;
	}

	public int getMedicamento_1() {
		return medicamento_1;
	}

	public void setMedicamento_1(int medicamento_1) {
		this.medicamento_1 = medicamento_1;
	}

	public int getMedicamento_2() {
		return medicamento_2;
	}

	public void setMedicamento_2(int medicamento_2) {
		this.medicamento_2 = medicamento_2;
	}

	public int getMedicamento_3() {
		return medicamento_3;
	}

	public void setMedicamento_3(int medicamento_3) {
		this.medicamento_3 = medicamento_3;
	}

}
