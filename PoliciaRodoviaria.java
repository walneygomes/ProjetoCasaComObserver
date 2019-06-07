
public class PoliciaRodoviaria extends Policia {
	private boolean notificao;

	public void add(boolean status) {
		this.notificao = status;
	}

	public void policia() {
		System.out.println("Policia rodoviaria caminho NOTIFICADA ");
	}

}
