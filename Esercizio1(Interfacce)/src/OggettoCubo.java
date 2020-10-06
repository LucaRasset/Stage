
public class OggettoCubo implements QuadratoCubo {

	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public OggettoCubo(int n) {
		super();
		this.n = n;
	}
	


@Override
public int nuvoOggetto() {
	// TODO Auto-generated method stub
	return getN()*getN()*getN();
}

}
