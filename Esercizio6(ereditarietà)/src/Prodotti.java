import java.text.ParseException;

public class Prodotti {

	private String codiceBarre;
	private String descrizione;
	private double prezzo;
	
	
	public String getCodiceABarre() {
		return codiceBarre;
	}
	public void setCodiceABarre(String codiceABarre) {
		this.codiceBarre = codiceABarre;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public Prodotti(String codiceBarre, String descrizione,double prezzo) {
		this.codiceBarre = codiceBarre;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}
	
	public void applicaSconto()  {
		double prezzoScontato;
		prezzoScontato = (5 * getPrezzo())/100;
		setPrezzo(prezzoScontato);
	}
	@Override
	public String toString() {
		return "codiceBarre = " + codiceBarre + ", descrizione = " + descrizione + ", prezzo = " + prezzo ;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codiceBarre == null) ? 0 : codiceBarre.hashCode());
		result = prime * result + ((descrizione == null) ? 0 : descrizione.hashCode());
		long temp;
		temp = Double.doubleToLongBits(prezzo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prodotti other = (Prodotti) obj;
		if (codiceBarre == null) {
			if (other.codiceBarre != null)
				return false;
		} else if (!codiceBarre.equals(other.codiceBarre))
			return false;
		if (descrizione == null) {
			if (other.descrizione != null)
				return false;
		} else if (!descrizione.equals(other.descrizione))
			return false;
		if (Double.doubleToLongBits(prezzo) != Double.doubleToLongBits(other.prezzo))
			return false;
		return true;
	}
	
	
}
