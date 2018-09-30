package casoPratico1.jogo.personagem.comport;

import casoPratico1.jogo.ambiente.EventoAmb;
import casoPratico1.maqEst.Estado;
import casoPratico1.maqEst.MaquinaEstados;
import casoPratico1.reacao.ComportMaqEst;
import casoPratico1.reacao.Estimulo;

public class ComportPersonagem extends ComportMaqEst{
	Estado<Estimulo> patrulha;
	Estado<Estimulo> inspeccao;
	Estado<Estimulo> defesa;
	Estado<Estimulo> combate;
	//implementa o metodo abstrato referente ao ComportMaqEst
	@Override
	protected MaquinaEstados<Estimulo> iniciar(){
		patrulha = new Estado<Estimulo>("patrulha");
		inspeccao = new Estado<Estimulo>("inspeccao");
		defesa = new Estado<Estimulo>("defesa");
		combate = new Estado<Estimulo>("combate");
		//afeta diretamente o objecto (o mapa das transicoes)
		patrulha
			.transicao(EventoAmb.INIMIGO, defesa)
			.transicao(EventoAmb.RUIDO, inspeccao);
		
		inspeccao
			.transicao(EventoAmb.INIMIGO, defesa)
			.transicao(EventoAmb.SILENCIO, patrulha);
		
		defesa	
			.transicao(EventoAmb.FUGA, inspeccao)
			.transicao(EventoAmb.INIMIGO, combate);
		
		combate
		    .transicao(EventoAmb.DERROTA, patrulha)
			.transicao(EventoAmb.VITORIA, patrulha)
			.transicao(EventoAmb.FUGA, patrulha);
			
		//cria os comportamentos referentes aos estados
		comport(patrulha, new Patrulhar());
		comport(inspeccao, new Inspeccionar());
		comport(defesa, new Defender());
		comport(combate, new Combater());
		//inicia o P com o estado patrulha
		return new MaquinaEstados<Estimulo>(patrulha);
	}
}
