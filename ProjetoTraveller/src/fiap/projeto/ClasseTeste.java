package fiap.projeto;

public class ClasseTeste {

	public static void main(String[] args) {
		//criando locadora
		LocadoraVeiculos unidas = new LocadoraVeiculos();
		//setando infromacoes nos deivdos atributos
		unidas.setLocalizacao("R. Maria Prestes Maia, 745 - Vila Guilherme, São Paulo - SP, 02047-000");
		unidas.setLinkCmChegar("shorturl.at/lnxOQ");
		unidas.setNotaAvaliacao(4.5);
		unidas.setLinkContato("https://www.unidas.com.br/");
		unidas.setTelefoneContato(0+800121121);
		unidas.setBreveDescricao("A Unidas é uma das maiores empresas especializada em aluguel de carros em todo o Brasil");
		unidas.setNomeLocadora("Unidas");
		unidas.setLinkImagem("https://www.mercadoeeventos.com.br/wp-content/uploads/2020/09/Unidas_Aluguel_de_Carros_RAC_13.jpg");
		//usando metodo para criar carro na locadora
		// (String nomeCarro,String marca,String modeloCarroceria, String cor,int qtPortas,int ano,String linkFoto,String tipoCambio)
		unidas.novoCarro("Argo", "Fiat", "Hatchback", "Preta", 4, "https://www.unidas.com.br/media/3757/fiat-argo.png", "Manual");
		unidas.novoCarro("Logan", "Renault", "Sedan", "Prata", 4, "https://www.unidas.com.br/media/3766/renault-logani.png", "Manual");
		
		unidas.printInformacoes();
		
		unidas.modelosDisponiveis();
		
		System.out.println("----------------Hospedagem---------------------");
		
		
		
		
		
		
	}

}
