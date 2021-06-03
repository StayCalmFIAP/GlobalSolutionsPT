package fiap.projeto;

public class ClasseTeste {

	public static void main(String[] args) {
		// criando locadora
		LocadoraVeiculos unidas = new LocadoraVeiculos();
		// setando infromacoes nos deivdos atributos
		unidas.setLocalizacao("R. Maria Prestes Maia, 745 - Vila Guilherme, São Paulo - SP, 02047-000");
		unidas.setLinkCmChegar("shorturl.at/lnxOQ");
		unidas.setNotaAvaliacao(4.5);
		unidas.setLinkContato("https://www.unidas.com.br/");
		unidas.setTelefoneContato(0 + 800121121);
		unidas.setBreveDescricao(
				"A Unidas é uma das maiores empresas especializada em aluguel de carros em todo o Brasil");
		unidas.setNomeLocadora("Unidas");
		unidas.setLinkImagem(
				"https://www.mercadoeeventos.com.br/wp-content/uploads/2020/09/Unidas_Aluguel_de_Carros_RAC_13.jpg");
		// usando metodo para criar carro na locadora
		// (String nomeCarro,String marca,String modeloCarroceria, String cor,int
		// qtPortas,int ano,String linkFoto,String tipoCambio)
		unidas.novoCarro("Argo", "Fiat", "Hatchback", "Preta", 4, "https://www.unidas.com.br/media/3757/fiat-argo.png",
				"Manual");
		unidas.novoCarro("Logan", "Renault", "Sedan", "Prata", 4,
				"https://www.unidas.com.br/media/3766/renault-logani.png", "Manual");

		unidas.printInformacoes();

		unidas.modelosDisponiveis();

		System.out.println("----------------Hospedagem---------------------");

		// criando hospedatem

		Hospedagem bourbon = new Hospedagem();
		bourbon.setLocalizacao("Av. Ibirapuera, 2927");
		bourbon.setLinkCmChegar("shorturl.at/bkwCT");
		bourbon.setNotaAvaliacao(3);
		bourbon.setLinkContato("https://www.bourbon.com.br/hotel/bourbon-convention-ibirapuera-hotel/");
		bourbon.setTelefoneContato(1150912330);
		bourbon.setBreveDescricao(
				"O Bourbon Ibirapuera Convention Hotel oferece facilidades para quem busca conforto e comodidade, atendimento de qualidade e serviços completos.");
		bourbon.setNomeHospedagem("O Bourbon Ibirapuera Convention Hotel");
		bourbon.setNumeroQuartos(656);
		bourbon.setLinkFotos(
				"https://www.bourbon.com.br/wp-content/uploads/2014/10/bourbon-ibirapuera-fachada-2-2.jpg");
		bourbon.setTemWifi(true);
		bourbon.setTemPiscina(false);
		bourbon.setPodePet(false);
		// criando um quarto no hotel
		// (int coidgo,String linkImg,String dscr,double preco,String categoria)
		bourbon.novoQuarto(256,
				"https://myreservations.omnibees.com/Handlers/ImageLoader.ashx?sz=400x275&imageID=215284.jpg",
				"Possui 40 m² e conta com uma cama de casal (King-Size), 1 banheiros, ar-condicionado com controle individual, TV a cabo, sofá de um ou dois lugares, estação de trabalho, secador de cabelos, cofre digital e Wi-Fi cortesia.",
				256, "Executive");
		bourbon.novoQuarto(155,
				"https://myreservations.omnibees.com/Handlers/ImageLoader.ashx?sz=400x275&imageID=215250.jpg",
				"Possui 40 m² e conta com uma cama de casal (King-Size), 1 banheiro com tamanho diferenciado, ar-condicionado com controle individual, TV a cabo, estação de trabalho, secador de cabelos, cofre digital e Wi-Fi cortesia.",
				297, "Suite Deluxe");

	}

}
