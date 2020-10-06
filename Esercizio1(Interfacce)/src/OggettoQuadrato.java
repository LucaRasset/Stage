
public class OggettoQuadrato implements QuadratoCubo {

	private int n;
	
	public OggettoQuadrato(int n) {
		super();
		this.setN(n);
	}
	
	

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	@Override
	public int nuvoOggetto() {
		// TODO Auto-generated method stub
		return getN()*getN();
	}

	
}
