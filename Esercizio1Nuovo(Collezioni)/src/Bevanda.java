
public class Bevanda {


	private char codice;
	private String nome;
	private double prezzo;
	
	
	public char getCodice() {
		return codice;
	}
	public void setCodice(char codice) {
		this.codice = codice;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public Bevanda(char codice, String nome, double prezzo) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.prezzo = prezzo;
	}




}
