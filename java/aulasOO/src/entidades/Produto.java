package entidades;

public class Produto {
	public String descri��o;
	public String codigo;
	public double valor;
	
	public Produto(String descri��o, String codigo,double valor) {
		this.codigo = codigo;
		this.descri��o = descri��o;
		this.valor = valor;
	}

	public Produto(String descri��o, String codigo) {
		this.codigo = codigo;
		this.descri��o = descri��o;
	}

	public Produto(String descri��o) {
		this.descri��o = descri��o;
	}

	public Produto() {
		super();
	}
	
}
