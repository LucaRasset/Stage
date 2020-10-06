
public class Employee extends Person{

	
private int annoAssunzione;
private int stipendio;


public int getAnnoAssunzione() {
	return annoAssunzione;
}
public void setAnnoAssunzione(int annoAssunzione) {
	this.annoAssunzione = annoAssunzione;
}
public int getStipendio() {
	return stipendio;
}
public void setStipendio(int stipendio) {
	this.stipendio = stipendio;
}


public Employee(String surname, String name, String taxCode, String city,int annoAssunzione,int stipendio) {
	super(surname, name, taxCode, city);
	this.annoAssunzione = annoAssunzione;
	this.stipendio = stipendio;
	// TODO Auto-generated constructor stub
}




public boolean gainsMore(Employee dipendente) {
	if(this.getStipendio() < dipendente.getStipendio())
		return false;
	else
		return true;
}
@Override

public String toString() {
	// TODO Auto-generated method stub
	return super.toString() + " annoAssunzione = " + annoAssunzione + " stipendio = " + stipendio;
}



}
