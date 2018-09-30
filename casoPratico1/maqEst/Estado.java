package casoPratico1.maqEst;

import java.util.HashMap;
import java.util.Map;

public class Estado<EV> {
	private String nome;
	private Map<EV, Estado<EV>> transicoes;
	
	public Estado(String nome){
		 this.nome = nome;
		 transicoes = new HashMap<EV, Estado<EV>>();
	}
	public String getNome() {
		return this.nome;
	}
	//maqEst � uma m�quina de estados que funciona independentemente 
	//do programa por isso � um tipo gen�rico
	//n�o importa o tipo do objecto com que a m�quina de estados trabalha
	public Estado<EV> transicao(EV evento, Estado<EV> estado) {
		transicoes.put(evento, estado);
		return this;	
	}
	public Estado<EV> processar(EV evento) {
		return transicoes.get(evento);
	}
	public String toString() {
		return getNome();
	}
}