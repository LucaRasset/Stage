
public class NonAlimentari extends Prodotti {
	
	private String materiale;
	
	public NonAlimentari(String codiceBarre, String descrizione,double prezzo,String materiale) {
		super(codiceBarre,descrizione,prezzo);
		this.materiale = materiale;
	}

	public String getMateriale() {
		return materiale;
	}

	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}

	
	public void applicaSconto() {
		double prezzo1 = 0;
		if(getMateriale().equalsIgnoreCase("Plastica") || materiale.equalsIgnoreCase("Carta") || materiale.equalsIgnoreCase("Vetro"))
		prezzo1 = super.getPrezzo() - (10*super.getPrezzo())/100;
		else
			prezzo1= super.getPrezzo();
			super.setPrezzo(prezzo1);}
}
