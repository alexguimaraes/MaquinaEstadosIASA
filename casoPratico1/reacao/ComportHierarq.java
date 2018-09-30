 package casoPratico1.reacao;

public class ComportHierarq implements Comportamento{
	
	private Comportamento[] comportamentos;
	
	public ComportHierarq(Comportamento[] comportamentos) {
		this.comportamentos = comportamentos;
	}
	//Hierarquia é definida pela ordem no array
	public Accao activar(Estimulo estimulo) {
		int size = comportamentos.length;
		for(int i = 0; i < size; i++) {
			if(comportamentos[i].activar(estimulo) != null) 
				return comportamentos[i].activar(estimulo);
		}
		return null;
	}
}
