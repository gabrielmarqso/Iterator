package iterator;

public class MostraPerfil {
	
	public static void main(String[] args) {
		PerfilFacebook [] perfisFacebook = new PerfilFacebook[3];

		perfisFacebook[0] = new PerfilFacebook("Gabriel Marques", "Masculino", "Goiania");
		perfisFacebook[1] = new PerfilFacebook("Yasmin Castro",  "Feminino", "Goiania");
		perfisFacebook[2] = new PerfilFacebook("Sanderson ", "Masculino", "Goiania");
		
		Iterator facebookIterator = new FacebookIterator(perfisFacebook);
		
		while(facebookIterator.hasNext()) {
			PerfilFacebook perfil = (PerfilFacebook)facebookIterator.next();
			System.out.println("Nome: " + perfil.nome + " - Sexo: " + perfil.sexo + " - Cidade: " + perfil.cidade);
		}
		
	}
	
}
