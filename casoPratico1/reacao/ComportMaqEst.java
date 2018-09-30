package casoPratico1.reacao;

import java.util.HashMap;
import java.util.Map;

import casoPratico1.maqEst.Estado;
import casoPratico1.maqEst.MaquinaEstados;

public abstract class ComportMaqEst implements Comportamento {
	
	private MaquinaEstados<Estimulo> maqEst;
	private Map<Estado<Estimulo>, Comportamento> comportamentos;
	
	public ComportMaqEst() {
		comportamentos = new HashMap<Estado<Estimulo>, Comportamento>();
		maqEst = iniciar();
	}
	
	public Estado<Estimulo> getEstado() {
		return maqEst.getEstado();
	}
	
	protected abstract MaquinaEstados<Estimulo> iniciar();
	 
	 public Accao activar(Estimulo estimulo) {
		 Comportamento comport = comportamentos.get(getEstado());
		 Accao resposta = null;
		 if(comport != null) resposta = comport.activar(estimulo);
		 maqEst.processar(estimulo);
		 return resposta;
	 }
	 
	 public ComportMaqEst comport(Estado<Estimulo> estado, Comportamento comport) {
		// comportamento dado o estado actual e estimulo recebido
		 comportamentos.put(estado, comport);
		 return this;
		 
	 }
}
