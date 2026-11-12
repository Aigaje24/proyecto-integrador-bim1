package epn.edu.ec.codequest;

public class Evaluacion {
	    
	    private int intentos;
		private double tiempoSolucion;

		
		
	public Evaluacion(int intentos, double tiempoSolucion) {
			super();
			this.intentos = intentos;
			this.tiempoSolucion = tiempoSolucion;
		}

	// GETERS Y SETERS 

public int getIntentos() {
		return intentos;
	}



	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}




	public double getTiempoSolucion() {
		return tiempoSolucion;
	}




	public void setTiempoSolucion(double tiempoSolucion) {
		this.tiempoSolucion = tiempoSolucion;
	}


	public void repostefinal (String nivelEstudiante, int aciertosTotales) {
		System.out.println("        REPORTE DE EVALUACIÓN CODEQUEST      ");
        System.out.println("\n=============================================");
        System.out.println("Nivel de la prueba: " + nivelEstudiante);
        System.out.println("Aciertos conseguidos: " + aciertosTotales);
        System.out.println("Intentos utilizados: " + this.intentos);
        System.out.println("Tiempo invertido: " + this.tiempoSolucion + " minutos");
        System.out.println("---------------------------------------------");
        System.out.println("RETROALIMENTACIÓN:");}



	
	public void generarReporteFinal(String nivelEstudiante, int aciertosTotales) {
	
        switch(nivelEstudiante) {
        
        case "Basico":// caso de respuestas solo basico 
        	
        	if (aciertosTotales >= 3) {
                System.out.println("Excelente base teórica, Comprendes bien cómo funcionan las variables y el Scanner.");
                System.out.println("Estás listo para avanzar a los retos lógicos.");
        	}else {
        		
        	}
        	
        	break;
        	
        case "Intermedio":// caso de respuestas solo intermedio 
        	
        	if (aciertosTotales >= 3) {
                System.out.println("Excelente base intermedia, Comprendes bien cómo funcionan los lazos y condicionales .");
                
        	}else {
        		System.out.println("Lastimosamente no dominas aun el funcionamiento de lasos y condicionales, esto requiere tiempo y logica de programacion ");
        	}
        	
        	
        	break;
        	
        case "Avanzado":// caso de respuestas solo avanzado
        	
        	if (aciertosTotales >= 3 && this.tiempoSolucion <5) {
                System.out.println("Análisis rápido y certero tienes respuestas correctas y la velocidad de lectura de un programador.");
                
        	}else {
        		System.out.println("Lastimosamente no dominas aun la lectura de codigo o te exedes del tiempo estimado para este nivel, mejor suerte la proxima ");
        	}
        	
        	
        	
        	break;
        
        }
        
        
        
		
	}
	
	// METODOS 
	public Evaluacion() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
