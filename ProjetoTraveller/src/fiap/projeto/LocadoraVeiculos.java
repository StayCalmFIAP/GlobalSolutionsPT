package fiap.projeto;

import java.util.ArrayList;

public class LocadoraVeiculos extends EstabelecimentoComercial {

	private String nomeLocadora;
	private String linkImagem;
	ArrayList<ModelosDeCarro> listaCarros = new ArrayList<ModelosDeCarro>();

	public LocadoraVeiculos() {
	}

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

	// (String nomeCarro,String marca,String modeloCarroceria, String cor,int
	// qtPortas,int ano,String linkFoto,String tipoCambio)

	public void novoCarro(String nomeCarro, String marca, String modeloCarroceria, String cor, int qtPortas,
			String linkFoto, String tipoCambio) {

		ModelosDeCarro Carro = new ModelosDeCarro(nomeCarro, marca, modeloCarroceria, cor, qtPortas, linkFoto,
				tipoCambio);
		listaCarros.add(Carro);

	}

	// metodo que printa modelos disponivies para alguel
	public void modelosDisponiveis() {
		System.out.println("Modelos disponiveis:  ");
		System.out.println("-----------------------------");
		for (int i = 0; i < listaCarros.size(); i++) {
			ModelosDeCarro car = listaCarros.get(i);
			System.out.println("Carro: " + car.getNomeCarro());
			System.out.println("Marca " + car.getMarca());
			System.out.println("Cor " + car.getCor());
			System.out.println(car.getQtPortas() + "portas");
			System.out.println("Foto " + car.getLinkFoto());
			System.out.println("Câmbio " + car.getTipoCambio());
			System.out.println("-----------------------------");

		}
	}

	// metodo que printa informacoes
	public void printInformacoes() {
		System.out.println("Nome da locadora:" + this.nomeLocadora);
		System.out.println("Localização: " + this.getLocalizacao());
		System.out.println("Como chegar: " + this.getLinkCmChegar());
		System.out.println(this.getNotaAvaliacao() + " Esrtrelas");
		System.out.println("Website para contato: " + this.getLinkContato());
		System.out.println("Telefone para contato: " + this.getTelefoneContato());
		System.out.println("Descrição: " + this.getBreveDescricao());
		System.out.println("Imagem: " + this.getLinkImagem());
	}

}
