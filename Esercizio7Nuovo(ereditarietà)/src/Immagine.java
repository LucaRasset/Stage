import java.util.Scanner;
public class Immagine extends ElementoMultimediale {
Scanner tastiera = new Scanner(System.in);
	private int luminosity;

	public int getLuminosity() {
		return luminosity;
	}

	public void setLuminosity(int luminosità) {
		this.luminosity = luminosità;
	}

public Immagine(String titolo,int durata,int luminosità) {
	super(titolo,durata);
	this.luminosity = luminosità;
}


public void show() {
	String stringa;
	stringa = super.getTitolo();
	for(int i = 0;i<getLuminosity();i++) {
		stringa = stringa + "*";
	System.out.println(stringa);}
}


public void brighter() {
	System.out.println("Di quanto vuoi alzare la luminosità?");
	int alza = tastiera.nextInt();
	setLuminosity(getLuminosity()+alza);
}

public void darker() {
	System.out.println("Di quanto vuoi abbassare la luminosità?");
	int abbassa = tastiera.nextInt();
	setLuminosity(getLuminosity()- abbassa);
	
}

}
