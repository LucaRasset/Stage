
public abstract class Lancio {

public void LancioDado() {
	
	int[]dado = new int[6];
	int indice = 0;
	for(int i = 1;i<dado.length +1;i++) {
		dado[indice]=i;
		indice++;
	}
	int b = (int)(Math.random()*6);
	System.out.println("E' uscito " + dado[b]);
}


public void LancioMoneta() {
	
	String[] moneta = new String[2];
	moneta[0] = "Testa";
	moneta[1]= "Croce";
	int a = (int)(Math.random()*2);
	System.out.println("E' uscito " + moneta[a]);
}

}
