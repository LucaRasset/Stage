
public class TestGarage {
public static void main (String[]args) {


Garage garage = new Garage();

Motocycle veicolo1 = new Motocycle("AY61834","Honda","x6z",true,678);
Motocycle veicolo2 = new Motocycle("AA42886","Suzuki","o6z",false,876);
Car veicolo3 = new Car("DZ005AH","Ford","Focus",false,"SUV");
Car veicolo4 = new Car("DZ005GY","Renault","Clio",true,"utilitaria");




if(veicolo1.isGuasta() == false)
	System.out.println("Il veicolo è funzionante il costo della riparazione è " + garage.repair(veicolo1));
else 
	System.out.println("Il costo della riparazione è " + garage.repair(veicolo1));

if(veicolo2.isGuasta() == false)
	System.out.println("Il veicolo è funzionante il costo della riparazione è " + garage.repair(veicolo2));
else 
	System.out.println("Il costo della riparazione è " + garage.repair(veicolo2));

if(veicolo3.isGuasta() == false)
	System.out.println("Il veicolo è funzionante il costo della riparazione è " + garage.repair(veicolo3));
else 
	System.out.println("Il costo della riparazione è " + garage.repair(veicolo3));


if(veicolo4.isGuasta() == false)
	System.out.println("Il veicolo è funzionante il costo della riparazione è " + garage.repair(veicolo4));
else 
	System.out.println("Il costo della riparazione è " + garage.repair(veicolo4));

}}
