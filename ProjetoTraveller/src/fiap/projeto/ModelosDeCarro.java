package fiap.projeto;

public class ModelosDeCarro {
	
	private String nomeCarro;
	private String marca;
	private String modeloCarroceria;
	private String cor;
	private int qtPortas;
	private int ano;
	private String linkFoto;
	private String tipoCambio;
	public ModelosDeCarro () {}
	
	public String getNomeCarro() {
		return nomeCarro;
	}
	public void setNomeCarro(String nomeCarro) {
		this.nomeCarro = nomeCarro;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModeloCarroceria() {
		return modeloCarroceria;
	}
	public void setModeloCarroceria(String modeloCarroceria) {
		this.modeloCarroceria = modeloCarroceria;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getQtPortas() {
		return qtPortas;
	}
	public void setQtPortas(int qtPortas) {
		this.qtPortas = qtPortas;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getLinkFoto() {
		return linkFoto;
	}
	public void setLinkFoto(String linkFoto) {
		this.linkFoto = linkFoto;
	}
	
	public String getTipoCambio() {
		return tipoCambio;
	}
	public void setTipoCambio(String tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
	
}
