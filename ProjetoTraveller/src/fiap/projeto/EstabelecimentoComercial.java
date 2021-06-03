package fiap.projeto;

public class EstabelecimentoComercial {

	private String localizacao;
	private String linkCmChegar;
	private double notaAvaliacao;
	private String linkContato;
	private long telefoneContato;
	private String breveDescricao;

	public EstabelecimentoComercial() {
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getLinkCmChegar() {
		return linkCmChegar;
	}

	public void setLinkCmChegar(String linkCmChegar) {
		this.linkCmChegar = linkCmChegar;
	}

	public double getNotaAvaliacao() {
		return notaAvaliacao;
	}

	public void setNotaAvaliacao(double notaAvaliacao) {
		this.notaAvaliacao = notaAvaliacao;
	}

	public String getLinkContato() {
		return linkContato;
	}

	public void setLinkContato(String linkContato) {
		this.linkContato = linkContato;
	}

	public long getTelefoneContato() {
		return telefoneContato;
	}

	public void setTelefoneContato(long telefoneContato) {
		this.telefoneContato = telefoneContato;
	}

	public String getBreveDescricao() {
		return breveDescricao;
	}

	public void setBreveDescricao(String breveDescricao) {
		this.breveDescricao = breveDescricao;
	}

}
