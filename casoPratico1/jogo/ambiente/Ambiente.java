package casoPratico1.jogo.ambiente;

import java.util.HashMap; 
import java.util.Map;
import java.util.Scanner;

public class Ambiente {
	private EventoAmb evento;
	private Map<String,EventoAmb> eventos;
	private Scanner sc;

	
	public Ambiente() {
     	sc = new Scanner(System.in);
		eventos = new HashMap<String, EventoAmb>();
		eventos.put("s", EventoAmb.SILENCIO);
		eventos.put("r", EventoAmb.RUIDO);
		eventos.put("d", EventoAmb.DERROTA);
		eventos.put("f", EventoAmb.FUGA);
		eventos.put("t", EventoAmb.TERMINAR);
		eventos.put("i", EventoAmb.INIMIGO);
		eventos.put("v", EventoAmb.VITORIA);
		
	}
	public EventoAmb getEvento() {
		return evento;
	}
	public void evoluir() {
		evento = gerarEvento();
		mostrar();
	}
	private EventoAmb gerarEvento() {
		System.out.print("Estado: ");
		String comando = sc.next();
		evento = eventos.get(comando);
		return evento;
	}
	private void mostrar() {
		if(evento != null) System.out.printf("Evento: %s\n", evento);
	}
}
