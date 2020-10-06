
public abstract class Volume {
 
	private double altezza;
	private double area;
	
	
	public Volume(double area,double altezza) {
		this.area = area;
		this.altezza = altezza;
	}
	
public double calcolaVolume(double area , double altezza) {
	double volume = area * altezza;
	return volume;

}





@Override
public String toString() {
	return "Volume = " + calcolaVolume(area,altezza);
}






	
}
