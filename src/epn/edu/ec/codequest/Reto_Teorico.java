package epn.edu.ec.codequest;

public class Reto_Teorico {
	
        private String idReto;
		private String fragmentoCodigo;
		private String preguntaAnalisis;
		private String [] opcionesRespuesta;
		private char respuestaCorrecta;
		private boolean estadoCompleto;
		
		
		
		
	public Reto_Teorico(String idReto, String fragmentoCodigo, String preguntaAnalisis, String[] opcionesRespuesta,
				char respuesta, boolean estadoCompleto) {
			super();
			this.idReto = idReto;
			this.fragmentoCodigo = fragmentoCodigo;
			this.preguntaAnalisis = preguntaAnalisis;
			this.opcionesRespuesta = opcionesRespuesta;
			this.respuestaCorrecta = respuesta;
			this.estadoCompleto = estadoCompleto;
		}

	
	
// GETTERS Y SETERS 	

public String getIdReto() {
		return idReto;
	}





	public void setIdReto(String idReto) {
		this.idReto = idReto;
	}





	public String getFragmentoCodigo() {
		return fragmentoCodigo;
	}





	public void setFragmentoCodigo(String fragmentoCodigo) {
		this.fragmentoCodigo = fragmentoCodigo;
	}





	public String getPreguntaAnalisis() {
		return preguntaAnalisis;
	}





	public void setPreguntaAnalisis(String preguntaAnalisis) {
		this.preguntaAnalisis = preguntaAnalisis;
	}





	public String[] getOpcionesRespuesta() {
		return opcionesRespuesta;
	}





	public void setOpcionesRespuesta(String[] opcionesRespuesta) {
		this.opcionesRespuesta = opcionesRespuesta;
	}





	





	public boolean isEstadoCompleto() {
		return estadoCompleto;
	}





	public void setEstadoCompleto(boolean estadoCompleto) {
		this.estadoCompleto = estadoCompleto;
	}




	public void mostrarEnunciado() {
		
		
	}

	// Metodo1
	public void mostrarPregunta() {
        System.out.println("\n=== RETO TEÓRICO [" + this.idReto + "] ===");
        System.out.println("Pregunta: " + this.preguntaAnalisis + "\n");
        System.out.println("\n" + this.fragmentoCodigo + "\n");
        
        char letra = 'A';
        
        // Aplicacion de for-each para presentar las preguntas sin repetir tanto codig0
        for (String opcion : this.opcionesRespuesta) {
            System.out.println(letra + ")" + opcion);
            letra++; 
        }
        
    
        
    }
	
	// Metodo 2
        
        public boolean verificacionRespuesta(char opcionElegida) {
        	
        	opcionElegida = Character.toUpperCase(opcionElegida);
        	
        	if (opcionElegida == this.respuestaCorrecta) {
        		this.estadoCompleto=true;
        		System.out.println("Respuesta correcta: ");
        		return true;
        	}
        	else {
        		System.out.println("Respuesta incorrecta: ");
        		return false;
        		
        	}
		
        	
        }
	// METODOS 
	public Reto_Teorico() {
	
		// TODO Auto-generated constructor stub
	}

}
