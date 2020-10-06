
public class Car extends Vehicle {
	
	private String tipologia;

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
	
public Car(String targa,String marca,String modello, boolean guasta,String tipologia) {
	super(targa,marca,modello,guasta);
	this.tipologia = tipologia;
}

}
