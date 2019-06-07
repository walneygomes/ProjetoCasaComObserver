import java.util.ArrayList;

public class PortaProxy extends CômodosCasa {

	private String email = "admin";
	private String senha = "admin";
	private FactoryCasa factory = new FactoryCasa();
	CômodosCasa comodo;
	private static int andando = 0;

	ArrayList<Policia> policias = new ArrayList<Policia>();

	public PortaProxy(Chave chave) {
		if ((chave.getEmail().equals(this.email) && senha.equals(this.senha))) {
			System.out.println("Acesso a casA");
			comodo = factory.obterLocal(andando);
			this.andando++;

		} else {
			System.out.println("negado");
			addPolicia(new PoliciaRota());

			this.notificarPoliciasAlerta();

		}
	}

	public void addPolicia(Policia policia) {

		policias.add(policia);

	}

	private void notificarPoliciasAlerta() {
		for (Policia p : policias) {
			p.add(true);
			p.policia();
		}
		System.out.print("SE FURGIR É PIOR");
	}

	@Override
	public void abrirPorta() throws ArgumentoInvalidoException {
		if (this.comodo != null) {
			comodo.abrirPorta();
		} else {
			throw new ArgumentoInvalidoException();
		}
	}

	@Override
	public void local() {
		// TODO Auto-generated method stub
		comodo.local();
	}

	@Override
	public void andar() {
		// TODO Auto-generated method stub

		if (factory.obterLocal(andando) == null) {
			voltar();
			this.comodo = factory.obterLocal(andando);

		}

		else {
			this.comodo = factory.obterLocal(andando);

		}
	}

	private void voltar() {
		this.andando--;
		andar();
	}

}
