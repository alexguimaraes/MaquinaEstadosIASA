package casoPratico1.jogo;

import casoPratico1.jogo.ambiente.Ambiente;
import casoPratico1.jogo.ambiente.EventoAmb;
import casoPratico1.jogo.personagem.Personagem;

public class Jogo {
	
	private static Ambiente ambiente;
	private static Personagem personagem;
	private static EventoAmb evento;	
	
	public static void main(String[] args) {
		//instancia dois objectos
		ambiente = new Ambiente();
		personagem = new Personagem(ambiente);
		//ciclo do jogo
		executar();
	}
	public static void executar() {
		do {	
			//"inicia" o funcionamento dos objectos
			personagem.executar();
			ambiente.evoluir();
			evento = ambiente.getEvento();
		}while(evento != EventoAmb.TERMINAR);
	}
}
