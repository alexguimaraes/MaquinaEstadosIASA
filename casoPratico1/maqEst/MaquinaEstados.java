package casoPratico1.maqEst;

public class MaquinaEstados<EV> {
	private Estado<EV> estado;
	
	public MaquinaEstados(Estado<EV> estado) {
		this.estado = estado;
	}
	public Estado<EV> getEstado() {
		return this.estado;
	}
	//atualiza o estado
	public void processar(EV evento) {
		if(this.estado.processar(evento) != null) 
			this.estado = this.estado.processar(evento);
	}
	
}
