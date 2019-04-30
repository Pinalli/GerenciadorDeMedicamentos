package ibm.btp.gm.model;

import java.sql.Timestamp;

public class HistoricoModel {

	private Integer id; 
	private Integer idMedicamento;
	private Integer idDoenca;
	private Integer idPaciente;
	private Timestamp dataHora;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdMedicamento() {
		return idMedicamento;
	}
	public void setIdMedicamento(Integer idMedicamento) {
		this.idMedicamento = idMedicamento;
	}
	public Integer getIdDoenca() {
		return idDoenca;
	}
	public void setIdDoenca(Integer idDoenca) {
		this.idDoenca = idDoenca;
	}
	public Integer getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}
	public Timestamp getDataHora() {
		return dataHora;
	}
	public void setDataHora(Timestamp data) {
		this.dataHora = data;
	}
	
}