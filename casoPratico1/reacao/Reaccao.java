package casoPratico1.reacao;

public class Reaccao implements Comportamento{
	
	private Estimulo estimulo;
	private Accao resposta;
	
	public Reaccao(Estimulo estimulo, Accao resposta) {
		this.estimulo = estimulo;
		this.resposta = resposta;
	}
	
	public Accao activar(Estimulo estimulo) {		
		if (this.estimulo.equals(estimulo))
			return resposta;
		return null;
	}
}
