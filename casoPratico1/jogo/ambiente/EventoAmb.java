package casoPratico1.jogo.ambiente;

import casoPratico1.reacao.Estimulo;

public enum EventoAmb implements Estimulo {
	SILENCIO,
	RUIDO,
	INIMIGO,
	FUGA,
	VITORIA,
	DERROTA,
	TERMINAR
}
