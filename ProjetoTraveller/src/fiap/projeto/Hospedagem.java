package fiap.projeto;

import java.util.ArrayList;

public class Hospedagem extends EstabelecimentoComercial {

	private String nomeHospedagem;
	private int numeroQuartos;
	private String linkFotos;
	private boolean temWifi;
	private boolean temPiscina;
	private boolean podePet;
	private ArrayList<Quarto> listaQuartos = new ArrayList<Quarto>();

	public Hospedagem() {
	}

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

	// (int coidgo,String linkImg,String dscr,double preco,String categoria)
	public void novoQuarto(int coidgo, String linkImg, String dscr, double preco, String categoria) {
		Quarto qrt = new Quarto(coidgo, linkImg, dscr, preco, categoria);
		listaQuartos.add(qrt);
	}

	// metodo quer printa quartos disponiveis
	public void quartosDisponiveis() {
		System.out.println("Quartos disponiveis:  ");
		System.out.println("-----------------------------");
		for (int i = 0; i < listaQuartos.size(); i++) {
			Quarto qrta = listaQuartos.get(i);
			System.out.println("Codigo do quarto: " + qrta.getCodigoQuarto());
			System.out.println("Foto do quarto: " + qrta.getLinkImgQuarto());
			System.out.println("Descrição do quarto: " + qrta.getDescricaoCategoria());
			System.out.println("Preço: " + qrta.getPrecoQuarto() + " R$ o dia");
			System.out.println("Categoria: " + qrta.getCategoriaQuarto());
			System.out.println("-----------------------------");
		}
		

	}

	// meteodo que printa informações
	public void printInformacoes() {
		System.out.println("Nome da hospedagem:" + this.nomeHospedagem);
		System.out.println("Localização: " + this.getLocalizacao());
		System.out.println("Como chegar: " + this.getLinkCmChegar());
		System.out.println(this.getNotaAvaliacao() + " Esrtrelas");
		System.out.println("Website para contato: " + this.getLinkContato());
		System.out.println("Telefone para contato: " + this.getTelefoneContato());
		System.out.println("Descrição: " + this.getBreveDescricao());
		System.out.println(this.getNumeroQuartos() + " apartamentos");
		System.out.println("Fotos " + this.getLinkFotos());
		System.out.println("Tem WiFi: " + this.isTemWifi());
		System.out.println("Tem pscina: " + this.isTemPiscina());
		System.out.println("Pode pet: " + this.isPodePet());
		System.out.println("-----------------------------");

	}

}
