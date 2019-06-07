
public class FactoryCasa {
	public CômodosCasa obterLocal(int lo) {
		CômodosCasa local = null;

		if (lo == 0) {
			local = new Sala();

		} else if (lo == 1) {
			local = new Banheiro();
		}
		return local;
	}

}
