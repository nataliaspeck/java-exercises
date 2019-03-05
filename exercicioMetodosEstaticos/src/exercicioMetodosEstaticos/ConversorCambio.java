package exercicioMetodosEstaticos;

public class ConversorCambio {
	
	public static double IOF = 0.06;
	
	public static double cambio(double cotacao, double compraDolar) {
		return compraDolar * cotacao * (1.0 + IOF); 
	}	
}
