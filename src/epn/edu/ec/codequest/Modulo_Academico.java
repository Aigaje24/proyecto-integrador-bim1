package epn.edu.ec.codequest;

public class Modulo_Academico {
	    
	    private String tituloModulo;
		private String  analogiaCotidiana;
		
		

	public Modulo_Academico(String tituloModulo, String analogiaCotidiana) {
			super();
			this.tituloModulo = tituloModulo;
			this.analogiaCotidiana = analogiaCotidiana;
		}

// GETERS Y SETERS 
	public String getTituloModulo() {
		return tituloModulo;
	}

	public void setTituloModulo(String tituloModulo) {
		this.tituloModulo = tituloModulo;
	}

	public String getAnalogiaCotidiana() {
		return analogiaCotidiana;
	}

	public void setAnalogiaCotidiana(String analogiaCotidiana) {
		this.analogiaCotidiana = analogiaCotidiana;
	}
	
	
	
// METODOS 
	//Metodo1
	public void rutaDeAprendizaje(String nivelEstudiante) {
		
		System.out.println("\n===== Iniciando Ruta de aprendizaje CodeQuest====");
		System.out.println("");
		System.out.println("Modulo Actual: "+this.tituloModulo);
		
		switch(nivelEstudiante) {
		case "Principiante":
			System.out.println("Cargando el Modulo De nivel Basico.........");
			System.out.println("");
			System.out.println("Temas a evaluar: Preguntas teoricas definición de variables, arreglos, modos de impresión de texto y el uso del Scanner.");
			break;	
			
		case "Intermedio":
			System.out.println("Cargando el Modulo De nivel Intermedio.........");
			System.out.println("");
			System.out.println("Temas a evaluar: Preguntas teoricas uso de condicionales (if, switch) y lazos repetitivos (while, for, do-while) . ");
			break;
			
		case "Avanzado":
			System.out.println("Cargando el Modulo De nivel avanzado.........");
			System.out.println("");
			System.out.println("Temas a evaluar:Lectura de código, preguntas teóricas rápidas y lógica algorítmica compleja. ");
			break;
		}
		
		
	}//
	
	
	//Metodo2
	
	public void retos(String nivelEstudiante) {
		
		switch(nivelEstudiante) {
		case "Basico":
			System.out.println("Preguntas de nivel basico ");
			System.out.println(" ANALOGÍA COTIDIANA:");
			// ingresamos aqui el apartado de los retos teoricos 
			
			break;
			
		case "Intermedio":
			System.out.println("Preguntas de nivel avanzado");
			System.out.println(" ANALOGÍA COTIDIANA:");
			// ingresamos aqui el apartado de los retos teoricos 
			
			break;
		case "Avanzado":
			System.out.println("Preguntas");
			System.out.println(" ANALOGÍA COTIDIANA:");
			// ingresamos aqui el apartado de los retos teoricos 
			
			break;
		}
		
	}
	
	
	
	
	
	public Modulo_Academico() {
		
		// TODO Auto-generated constructor stub
	}

	

}
