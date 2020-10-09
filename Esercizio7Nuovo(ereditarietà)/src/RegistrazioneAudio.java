import java.util.Scanner;
public class RegistrazioneAudio extends ElementoMultimediale {
Scanner tastiera =  new Scanner(System.in);
private	int volume;
	
	public RegistrazioneAudio (String titolo,int durata,int volume) {
		super(titolo,durata);
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
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

public void play() {
	String stringa;
	stringa = super.getTitolo();
	for(int i = 0;i<super.getDurata();i++) {
		for(int j = 0;j< getVolume();j++) {
		stringa = stringa + "!";
		System.out.println(stringa);
	}


}
}







}
