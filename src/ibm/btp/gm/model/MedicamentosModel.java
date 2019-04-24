package ibm.btp.gm.model;

/**
 * @author ThiagodaCruzMiranda
 * 
 * Class MedicamentoModel
 *
 */
public class MedicamentosModel {
	
	private int id;
	private String nome;
	private String indicacao;
	private boolean manha;
	private boolean tarde;
	private boolean noite;
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
	public String getIndicacao() {
		return indicacao;
	}
	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}
	public boolean isManha() {
		return manha;
	}
	public void setManha(boolean manha) {
		this.manha = manha;
	}
	public boolean isTarde() {
		return tarde;
	}
	public void setTarde(boolean tarde) {
		this.tarde = tarde;
	}
	public boolean isNoite() {
		return noite;
	}
	public void setNoite(boolean noite) {
		this.noite = noite;
	}
	
	
	
	

}
