package fiap.projeto;

public class Hospedagem extends EstabelecimentoComercial {
	
	private String nomeHospedagem;
	private int numeroQuartos;
	private int quartosDisponiveis;
	private String linkFotos;
	private boolean temWifi;
	private boolean temPiscina;
	private boolean podePet;
	public Hospedagem () {}
	
	public String getNomeHospedagem() {
		return nomeHospedagem;
	}
	public void setNomeHospedagem(String nomeHospedagem) {
		this.nomeHospedagem = nomeHospedagem;
	}
	
	public int getNumeroQuartos() {
		return numeroQuartos;
	}
	public void setNumeroQuartos(int numeroQuartos) {
		this.numeroQuartos = numeroQuartos;
	}
	
	public int getQuartosDisponiveis() {
		return quartosDisponiveis;
	}
	public void setQuartosDisponiveis(int quartosDisponiveis) {
		this.quartosDisponiveis = quartosDisponiveis;
	}
	
	public String getLinkFotos() {
		return linkFotos;
	}
	public void setLinkFotos(String linkFotos) {
		this.linkFotos = linkFotos;
	}
	
	public boolean isTemWifi() {
		return temWifi;
	}
	public void setTemWifi(boolean temWifi) {
		this.temWifi = temWifi;
	}
	
	public boolean isTemPiscina() {
		return temPiscina;
	}
	public void setTemPiscina(boolean temPiscina) {
		this.temPiscina = temPiscina;
	}
	
	public boolean isPodePet() {
		return podePet;
	}
	public void setPodePet(boolean podePet) {
		this.podePet = podePet;
	}
	
}