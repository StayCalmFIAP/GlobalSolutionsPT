package fiap.projeto;

public class EstabelecimentoComercial {
	public EstabelecimentoComercial () {}
	private String localizacao;
	private String linkCmChegar;
	private int notaAvaliacao;
	private String linkContato;
	private int telefoneContato;
	private String breveDescricao;
	
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
	
	public int getNotaAvaliacao() {
		return notaAvaliacao;
	}
	public void setNotaAvaliacao(int notaAvaliacao) {
		this.notaAvaliacao = notaAvaliacao;
	}
	
	public String getLinkContato() {
		return linkContato;
	}
	public void setLinkContato(String linkContato) {
		this.linkContato = linkContato;
	}
	
	public int getTelefoneContato() {
		return telefoneContato;
	}
	public void setTelefoneContato(int telefoneContato) {
		this.telefoneContato = telefoneContato;
	}
	
	public String getBreveDescricao() {
		return breveDescricao;
	}
	public void setBreveDescricao(String breveDescricao) {
		this.breveDescricao = breveDescricao;
	}
	
}
