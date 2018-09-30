package casoPratico1.jogo.ambiente;

import casoPratico1.reacao.Accao;

public enum AccaoAmb implements Accao{
	PATRULHAR,
	APROXIMAR,
	AVISAR,
	DEFENDER,
	ATACAR,
	PROCURAR,
	INICIAR;
	
//	@Override
	public void executar() {
		System.out.printf("Accao: %s\n", this);
	}
}
