
public class TestEmployee {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
Employee dipendente1 = new Employee("Rossi","Mario","RSSMRA80A01C933H","Como",2000,1400);
Employee dipendente2 = new Employee("Colombo","Maria","CLMMRA80A41F205X","Milano",2006,1500);
Employee dipendente3 = new Employee("Brambilla","Antonio","BRMNTN80A01L682E","Varese",2002,1200);

System.out.println("Dipendente1 : " + dipendente1.toString());
System.out.println("Dipendente2 : " + dipendente2.toString());
System.out.println("Dipendente3 : " + dipendente3.toString());

Employee [] array = {dipendente1,dipendente2,dipendente3};

for(int i =0;i<array.length-1;i++){
	  int min;
	  min = i;
	  for(int j= i+1;j<array.length;j++){
	  if(array[j].gainsMore(array[min]) == false){
	  min = j;}}
	  if(min != i){
	    Employee nuovo = array[min];
	    array[min] = array[i];
	    array[i] = nuovo;}
	  }		
System.out.println("Gli impiegati per ordine di stipendio sono : ");
	for(int i = 0; i<array.length;i++)
		System.out.print(array[i].getSurname() + " ");}

	

	
	
}
