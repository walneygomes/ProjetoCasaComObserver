
public class FactoryCasa {
	public C�modosCasa obterLocal(int lo) {
		C�modosCasa local = null;

		if (lo == 0) {
			local = new Sala();

		} else if (lo == 1) {
			local = new Banheiro();
		}
		return local;
	}

}
