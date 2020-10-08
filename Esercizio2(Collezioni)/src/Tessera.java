
import java.util.Scanner;
public class Tessera {
Scanner tastiera = new Scanner (System.in);


private int codice;
private double credito;


public Tessera(int codice, double credito) {
		super();
		this.codice = codice;
		this.credito = credito;
		

	}

public int getCodice() {
	return codice;
}
public void setCodice(int codice) {
	this.codice = codice;
}
public double getCredito() {
	return credito;
}
public void setCredito(double credito) {
	this.credito = credito;
}









}
