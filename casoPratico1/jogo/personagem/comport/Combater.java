package casoPratico1.jogo.personagem.comport;

import casoPratico1.jogo.ambiente.AccaoAmb;
import casoPratico1.jogo.ambiente.EventoAmb;
import casoPratico1.reacao.ComportHierarq;
import casoPratico1.reacao.Comportamento;
import casoPratico1.reacao.Reaccao;

public class Combater extends ComportHierarq{
	//sao os comportamentos referentes aos estados
	public Combater() {
		//o estado explica os comportamentos do P, o seu conjunto de reaccoes 
		//(dado um estimulo qual é a resposta)
		super(new Comportamento[]{new Reaccao(EventoAmb.DERROTA, AccaoAmb.INICIAR), 
								  new Reaccao(EventoAmb.INIMIGO, AccaoAmb.ATACAR)});
	}
}
