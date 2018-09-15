package excepciones;

import java.io.IOException;

public class App {

	public static void main(String[] args) {
	
	App aplicacion = new App();
	aplicacion.mostrar();
		
		

	}

	public void mostrar(){
		
	try {
		throw new Exception("HOla IOException");
	} catch (Exception  e) {
		System.out.println(e);
	}	
		
	}
	
	
	
	
}
