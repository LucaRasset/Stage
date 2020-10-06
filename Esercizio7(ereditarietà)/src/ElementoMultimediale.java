
public class ElementoMultimediale {
 
	private String titolo;
	private boolean riproducibile;
	private int durata;

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public ElementoMultimediale(String titolo,int durata) {
		this.titolo = titolo;
		this.durata = durata;
		if(durata > 0)
			this.riproducibile =true;
		else 
			this.riproducibile = false;
		
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public boolean isRiproducibile() {
		return riproducibile;
	}

	public void setRiproducibile(boolean riproducibile) {
		this.riproducibile = riproducibile;
	}
}
