import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Distributore {
	
	private List<Bevanda> distributore;
	private Map<Integer,Colonna> colonne;
	
	public Distributore() {
		
		colonne = new HashMap<Integer,Colonna>();
		distributore = new ArrayList<Bevanda>();
	}


	public List<Bevanda> getDistributore() {
		return distributore;
	}

	public void setDistributore(ArrayList<Bevanda> distributore) {
		this.distributore = distributore;
	}


public void aggiungiBevanda(Bevanda bevanda) {
	
	distributore.add(bevanda);
	
}
public double getPrice(char codice) throws BevandaNonValida{
	boolean presente = false;
	double prezzo = 0;
	for(int i = 0;i<distributore.size();i++) {
		if(distributore.get(i).getCodice() == codice) {
			presente = true;
	     prezzo=distributore.get(i).getPrezzo();}
	}	
	if(presente == false)
		throw new BevandaNonValida("Il codice della bevanda non esiste");
return prezzo;}

public String getName(char codice) throws BevandaNonValida {
	String nome = "";
	
	boolean presente = false;
	for(int i = 0;i<distributore.size();i++) {
		if(distributore.get(i).getCodice() == codice) {
			presente = true;
	     nome  = distributore.get(i).getNome();}
	}	
	
	if(presente == false)
		throw new BevandaNonValida("Il codice della bevanda non esiste");
return nome;}



public void aggiornaColonna(int numeroColonna,String tipoBevanda,int numeroLattine) {
	Colonna colonna = new Colonna(tipoBevanda,numeroLattine);
	colonne.put(numeroColonna,colonna);
}


public int lattineDisponibili(char codice) throws BevandaNonValida {
	String tipo = getName(codice);
	int numeroLattine = 0;
	for(int i = 1;i<colonne.size()+1;i++) {
		if(colonne.get(i).getTipo().equalsIgnoreCase(tipo))
			numeroLattine = numeroLattine + colonne.get(i).getNumeroLattine();}
	
	
	
	return numeroLattine;
	
}

}
