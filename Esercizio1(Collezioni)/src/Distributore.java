import java.util.ArrayList;
import java.util.List;

public class Distributore {
	
	private List<Bevanda> distributore;
	
	public Distributore() {
		
		
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


}
