import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Alimentari extends Prodotti {

private String dataScadenza;

public Alimentari(String codiceBarre, String descrizione,double prezzo,String dataScadenza) {
	super(codiceBarre,descrizione,prezzo);
	this.setDataScadenza(dataScadenza);
}

public String getDataScadenza() {
	return dataScadenza;
}

public void setDataScadenza(String dataScadenza) {
	this.dataScadenza = dataScadenza;
}


public void applicaSconto()   {
	SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
	Date oggi = new Date();
	Date dataScadenza = null;
	
	try {
		dataScadenza = sdf.parse(getDataScadenza());
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	double prezzo1 = 0;

	
	if(dataScadenza.getTime()-oggi.getTime()  < 864000000)
		prezzo1 = super.getPrezzo() - (20*super.getPrezzo())/100;
	else
		prezzo1 = super.getPrezzo();
	super.setPrezzo(prezzo1);


}}
