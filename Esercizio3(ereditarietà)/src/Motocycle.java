
public class Motocycle extends Vehicle{
	private int cilindrata;

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	
public Motocycle(String targa,String marca,String modello, boolean guasta,int cilindrata) {
	super(targa,marca,modello,guasta);
	this.cilindrata = cilindrata;
}
}
