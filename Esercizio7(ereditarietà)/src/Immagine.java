import java.util.Scanner;
public class Immagine extends ElementoMultimediale {
Scanner tastiera = new Scanner(System.in);
	private int luminosità;

	public int getLuminosità() {
		return luminosità;
	}

	public void setLuminosità(int luminosità) {
		this.luminosità = luminosità;
	}

public Immagine(String titolo,int durata,int luminosità) {
	super(titolo,durata);
	this.luminosità = luminosità;
}


public void show() {
	String stringa;
	stringa = super.getTitolo();
	for(int i = 0;i<getLuminosità();i++) {
		stringa = stringa + "*";
	System.out.println(stringa);}
}


public void brighter() {
	System.out.println("Di quanto vuoi alzare la luminosità?");
	int alza = tastiera.nextInt();
	setLuminosità(getLuminosità()+alza);
}

public void darker() {
	System.out.println("Di quanto vuoi abbassare la luminosità?");
	int abbassa = tastiera.nextInt();
	setLuminosità(getLuminosità()- abbassa);
	
}

}
