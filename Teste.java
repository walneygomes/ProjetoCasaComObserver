
public class Teste {

	public static void main(String[] args) throws ArgumentoInvalidoException {
		Chave chave = new Chave();
		chave.setSenha("admin");
		chave.setEmail("354");

		Pessoa pessoa = new Pessoa(chave);
		pessoa.abrirPorta();
	 


		

	}
}
