package fiap.projeto;

public class LocadoraVeiculos extends EstabelecimentoComercial {
	
	private String nomeLocadora;
	private String linkImagem;
	private String modelosDisponiveis;
	public LocadoraVeiculos () {}
	
	public String getNomeLocadora() {
		return nomeLocadora;
	}
	public void setNomeLocadora(String nomeLocadora) {
		this.nomeLocadora = nomeLocadora;
	}
	
	public String getLinkImagem() {
		return linkImagem;
	}
	public void setLinkImagem(String linkImagem) {
		this.linkImagem = linkImagem;
	}
	
	public String getModelosDisponiveis() {
		return modelosDisponiveis;
	}
	public void setModelosDisponiveis(String modelosDisponiveis) {
		this.modelosDisponiveis = modelosDisponiveis;
	}

}
