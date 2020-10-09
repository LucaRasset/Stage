import java.util.Scanner;
public class Filmato extends ElementoMultimediale {

private int volume ;
private int luminosity;
Scanner tastiera = new Scanner (System.in);

public Filmato(String titolo,int durata,int volume,int luminosity) {
super(titolo,durata);
this.volume = volume;
this.luminosity = luminosity;}
	
	
	
	
	public int getLuminosity() {
	return luminosity;
}
public void setLuminosity(int luminosity) {
	this.luminosity = luminosity;
}
public int getVolume() {
	return volume;
}
public void setVolume(int volume) {
	this.volume = volume;
}

public void play() {
	String stringa;
	stringa = super.getTitolo();
	for(int i = 0; i<super.getDurata();i++) {
		for(int k= 0;k<getVolume();k++) {
		stringa = stringa + "!";
		System.out.println(stringa);}}
	for(int j = 0; j<getLuminosity();j++) {
		for(int h = 0;h<getLuminosity();h++) {
	
		stringa = stringa + "*";
		System.out.println(stringa);
	}}
	
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

public void weaker() {
	System.out.println("Di quanto vuoi abbassare il volume ?");
	int abbassa = tastiera.nextInt();
	setVolume(getVolume()- abbassa);
}

public void louder() {
	System.out.println("Di quanto vuoi alzare il volume ?");
	int alza = tastiera.nextInt();
	setVolume(getVolume() + alza);
}



}
