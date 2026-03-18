package ejercicios07.intermedios;

import ejercicios07.dataset.Dataset;

public class Main {

	public static void main(String[] args) {

		
		

	}
	
	//Contar cuántos pedidos están en estado "PENDIENTE".
	public static long ejercicio11() {
		return Dataset.getPedidos().stream()
			.filter(p -> p.getEstado().equals("PENDIENTE"))
			.count();
	}
	
	//Comprobar si existe algún producto sin stock (devuelve boolean).
	public static boolean ejercicio12() {
		return Dataset.getProductos().stream()
				.anyMatch(p -> p.getStock() == 0);
	}
	
	//Comprobar si todos los empleados ganan más de 1000 (devuelve boolean).
	public static boolean ejercicio3() {
		return Dataset.getEmpleados().stream()
				.allMatch(e -> e.getSalario() > 1000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
