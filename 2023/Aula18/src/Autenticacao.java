
public class Autenticacao {
	
	public void autenticaUsuario(Autenticavel auth, String id) {
		if(auth.login(id)) {
			System.out.println("Usuário autenticado");
		}else {
			System.out.println("ERRO ao autenticar o usuário");
		}
	}
}