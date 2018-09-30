package casoPratico1.jogo.personagem;

import casoPratico1.jogo.ambiente.Ambiente;
import casoPratico1.jogo.personagem.comport.ComportPersonagem;
import casoPratico1.reacao.Accao;
import casoPratico1.reacao.Estimulo;

public class Personagem {
	private ComportPersonagem comport;
	private Ambiente ambiente;
	
	public Personagem(Ambiente ambiente) {
		this.ambiente = ambiente;
		comport = new ComportPersonagem();
	}
	public void executar() {
		//estimulo é um eventoAmb percepcionado pelo personagem
		Estimulo estimulo = percepcionar();
		//resposta é o comportamento do P no estado em que se encontra
		//dado um certo estimulo
		//estimulos iguais em estados != podem originar respostas !=
		Accao resposta = processar(estimulo);	
		actuar(resposta);
		mostrar();
	}
	//interpretação do P ao ambiente
	private Estimulo percepcionar() {
		return ambiente.getEvento();
	}
	//resposta do P dado ao que interpretou
	private Accao processar(Estimulo estimulo) {
		return comport.activar(estimulo);
	}
	private void actuar(Accao accao) {
		if(accao!=null)
			accao.executar();
	}
	private void mostrar() {
		System.out.printf("Estado: %s\n", comport.getEstado());
	}
}
