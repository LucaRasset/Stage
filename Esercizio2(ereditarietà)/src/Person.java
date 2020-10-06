
public class Person {

	private String surname;
	private String name;
	private String taxCode;
	private String city;
	
	public Person() {
		super();
	}
	
	public Person(String surname,String name,String taxCode,String city) {
		this.surname = surname;
		this.setName(name);
		this.setTaxCode(taxCode);
		this.setCity(city);
	}


public String getSurname() {
	return this.surname;
}

public void setSurname(String surname) {
    this.surname = surname;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getTaxCode() {
	return taxCode;
}

public void setTaxCode(String taxCode) {
	this.taxCode = taxCode;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}


public int bornYear(String taxCode) {
	String anno;
	anno = taxCode.substring(6,8);
	
	int numero;
	numero = Integer.parseInt(anno);
	return numero;
	
}

@Override
public String toString() {
	return "surname = " + surname + ", name = " + name + ", taxCode = " + taxCode + ", city = " + city ;
}




}
