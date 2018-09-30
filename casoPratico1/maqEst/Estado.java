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
	//maqEst é uma máquina de estados que funciona independentemente 
	//do programa por isso é um tipo genérico
	//não importa o tipo do objecto com que a máquina de estados trabalha
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