package fiap.projeto;

public class ModelosDeCarro {

	private String nomeCarro;
	private String marca;
	private String modeloCarroceria;
	private String cor;
	private int qtPortas;
	private String linkFoto;
	private String tipoCambio;

	public ModelosDeCarro() {
	}

	public ModelosDeCarro(String nomeCarro, String marca, String modeloCarroceria, String cor, int qtPortas,
			String linkFoto, String tipoCambio) {
		this.nomeCarro = nomeCarro;
		this.marca = marca;
		this.modeloCarroceria = modeloCarroceria;
		this.cor = cor;
		this.qtPortas = qtPortas;
		this.linkFoto = linkFoto;
		this.tipoCambio = tipoCambio;

	}

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
