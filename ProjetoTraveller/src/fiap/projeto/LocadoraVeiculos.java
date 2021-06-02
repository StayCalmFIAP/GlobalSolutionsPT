package fiap.projeto;

import java.util.ArrayList;

public class LocadoraVeiculos extends EstabelecimentoComercial {
	
	private String nomeLocadora;
	private String linkImagem;
	private String modelosDisponiveis;
	ArrayList<ModelosDeCarro> listaCarros = new ArrayList<ModelosDeCarro>();
	
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
	// (String nomeCarro,String marca,String modeloCarroceria, String cor,int qtPortas,int ano,String linkFoto,String tipoCambio)
	
	public void novoCarro(String nomeCarro,String marca,String modeloCarroceria, String cor,int qtPortas,int ano,String linkFoto,String tipoCambio) {
		
		ModelosDeCarro Carro = new ModelosDeCarro(nomeCarro,marca,modeloCarroceria,cor,qtPortas,ano,linkFoto,tipoCambio);
		listaCarros.add(Carro);
		
		
	}
	
	public void mostarCarros() {
		for (int i= 0 ; i < listaCarros.size(); i++) {
			ModelosDeCarro car = listaCarros.get(i);
			System.out.println(car.getNomeCarro());
		}
	}

	
	

	
	

}
