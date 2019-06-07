
public class Pessoa {
	Chave chave;
	CômodosCasa porta;

	public Pessoa(Chave chave) {
		this.chave = new Chave();
		this.porta = new PortaProxy(chave);

	}

	public void abrirPorta() throws ArgumentoInvalidoException {
		porta.abrirPorta();
		

	}

	public void local() {
		// TODO Auto-generated method stub
		porta.local();
		

	}

	public void andar() {
		// TODO Auto-generated method stub
		this.porta.andar();

	}

}
