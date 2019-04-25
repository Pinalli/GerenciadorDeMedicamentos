package ibm.btp.gm.model;

public class DoencaModel {
	
	private int id;
	private String nome;
	private String descricao;
	private boolean agressividade;
	
	public  DoencaModel(int id, String nome, String descricao, boolean agre) {
		this.agressividade = agre;
		this.descricao = descricao;
		this.id = id;
		this.nome = nome;
		
	}
	
	public  DoencaModel() {
		
	}
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isAgressividade() {
		return agressividade;
	}
	public void setAgressividade(boolean agressividade) {
		this.agressividade = agressividade;
	}
	
	
	
}
