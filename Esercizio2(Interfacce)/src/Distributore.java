import java.util.Scanner;
public class Distributore implements Comparable {
Scanner tastiera = new Scanner (System.in);
	private String città;
	private String proprietario;
	private int capacità;
	private double benzinaRimasta;

	public Distributore(String città, String proprietario, int capacità, int benzinaRimasta) {
		super();
		this.città = città;
		this.proprietario = proprietario;
		this.capacità = capacità;
		this.benzinaRimasta = benzinaRimasta;
	}

	public String getCittà() {
		return città;
	}

	public void setCittà(String città) {
		this.città = città;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public int getCapacità() {
		return capacità;
	}

	public void setCapacità(int capacità) {
		this.capacità = capacità;
	}

	public double getBenzinaRimasta() {
		return benzinaRimasta;
	}

	public void setBenzinaRimasta(double benzinaRimasta) {
		this.benzinaRimasta = benzinaRimasta;
	}
public void erogazione(int soldi) {
	double costoBenzina = 1.389;
	double benzinaErogata = soldi/costoBenzina;
	setBenzinaRimasta(benzinaRimasta-benzinaErogata);
}

public int incasso(double prezzoBenzina) {
return (int) (prezzoBenzina * (capacità - benzinaRimasta));	
}

@Override
public void comparazione(Distributore distributore1) {
	// TODO Auto-generated method stub
	double prezzoBenzina;
	System.out.println("Inserisci il prezzo attuale della benzina");
	prezzoBenzina = tastiera.nextDouble();
	if(this.getCapacità() > distributore1.getCapacità()) 
		System.out.println("Il distributore 1 ha una capacità maggiore del distributore 2 " + this.getCapacità() + " litri");
		else
		System.out.println("Il distributore 2 ha una capacità maggiore del distributore 1 " + distributore1.getCapacità() + " litri");
	int incasso1;
	int incasso2 ;
incasso1 = (int)this.incasso(prezzoBenzina);
incasso2 = (int)distributore1.incasso(prezzoBenzina);
if(incasso1 > incasso2)
	System.out.println("Il distributore 1 ha incassato più del distributore 2 " + incasso1);
else if(incasso2>incasso1)
	System.out.println("Il distributore 2 ha incassato più del distributore 1 " + incasso2);
else
	System.out.println("L'incasso dei due distributori è uguale");




}
}




