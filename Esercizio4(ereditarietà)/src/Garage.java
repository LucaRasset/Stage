
public class Garage {



public double repair(Car macchina) {
	double costo = 0;
	
	 if(macchina.isGuasta() == true) { 
		macchina.setGuasta(false);
		if(macchina.getTipologia().equalsIgnoreCase("suv"))
			costo = 123;
		else if(macchina.getTipologia().equalsIgnoreCase("station wegon"))
			costo = 118;
		else if(macchina.getTipologia().equalsIgnoreCase("utilitaria"))
			costo = 100;}
	 return costo;

	 
	 }
		
public double repair(Motocycle moto) {
	double costo = 0;
	
	 if(moto.isGuasta() == true) { 
		moto.setGuasta(false);
		costo = 150;}
	 return costo;

	 
	 } 
	 
	 
}

