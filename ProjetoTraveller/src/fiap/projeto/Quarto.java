package fiap.projeto;

public class Quarto{
	
	private int codigoQuarto;
	private String linkImgQuarto;
	private String descricaoCategoria;
	private double precoQuarto;
	private String categoriaQuarto;
	public Quarto () {}
	public Quarto (int codigo,String linkImg,String dscr,double preco,String categoria) {
	this.codigoQuarto = codigo;
	this.linkImgQuarto = linkImg;
	this.descricaoCategoria = dscr;
	this.precoQuarto = preco;
	this.categoriaQuarto = categoria;
	
	}
	public int getCodigoQuarto() {
		return codigoQuarto;
	}
	public void setCodigoQuarto(int codigoQuarto) {
		this.codigoQuarto = codigoQuarto;
	}
	
	public String getLinkImgQuarto() {
		return linkImgQuarto;
	}
	public void setLinkImgQuarto(String linkImgQuarto) {
		this.linkImgQuarto = linkImgQuarto;
	}
	
	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}
	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}
	
	public double getPrecoQuarto() {
		return precoQuarto;
	}
	public void setPrecoQuarto(double precoQuarto) {
		this.precoQuarto = precoQuarto;
	}
	
	public String getCategoriaQuarto() {
		return categoriaQuarto;
	}
	public void setCategoriaQuarto(String categoriaQuarto) {
		this.categoriaQuarto = categoriaQuarto;
	}
	
	

}
