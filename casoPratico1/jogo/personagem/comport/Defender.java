package casoPratico1.jogo.personagem.comport;

import casoPratico1.reacao.ComportHierarq;
import casoPratico1.reacao.Comportamento;
import casoPratico1.jogo.ambiente.AccaoAmb;
import casoPratico1.jogo.ambiente.EventoAmb;
import casoPratico1.reacao.Reaccao;

public class Defender extends ComportHierarq{
	public Defender() {
		super(new Comportamento[]{new Reaccao(EventoAmb.INIMIGO, AccaoAmb.DEFENDER)});
	}
}
