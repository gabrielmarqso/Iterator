package iterator;

public class FacebookIterator implements Iterator{

	PerfilFacebook[] perfis;
	int posicao = 0;
	
	
	public FacebookIterator(PerfilFacebook[] perfis) {
		this.perfis = perfis;
	}

	@Override
	public boolean hasNext() {
		if (posicao >= perfis.length || perfis[posicao] == null) {
			return false;
		}else {
			return true;
		}
		
	}

	@Override
	public Object next() {
		PerfilFacebook perfilFacebook = perfis[posicao];
		posicao++;
		return perfilFacebook;
	}

	
}
