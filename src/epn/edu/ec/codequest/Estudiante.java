package epn.edu.ec.codequest;

public class Estudiante {
	
	
	    private String Nombre;
		private String codigoUnico;
		private String correoInstitucional;
		private int semestre;
	    private int puntajeAcumulado;
	    private String nivelConocimiento;
	    
	

	public Estudiante(String nombre, String codigoUnico, String correoInstitucional, int semestre,
				int puntajeAcumulado) {
			super();
			this.Nombre = nombre;
			this.codigoUnico = codigoUnico;
			this.correoInstitucional = correoInstitucional;
			this.semestre = semestre;
			this.puntajeAcumulado = puntajeAcumulado;
		    this.nivelConocimiento= "Pendiente de diagnóstico";
		}

// GETERS Y SETERS 
	public String getNivelConocimiento() {
	    return nivelConocimiento;
	}

public String getNombre() {
		return Nombre;
	}



	public void setNombre(String nombre) {
		Nombre = nombre;
	}



	public String getCodigoUnico() {
		return codigoUnico;
	}



	public void setCodigoUnico(String codigoUnico) {
		this.codigoUnico = codigoUnico;
	}



	public String getCorreoInstitucional() {
		return correoInstitucional;
	}


	
	public void setCorreoInstitucional(String correoInstitucional) {
		this.correoInstitucional = correoInstitucional;
	}



	public int getSemestre() {
		return semestre;
	}




	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}





	public int getPuntajeAcumulado() {
		return puntajeAcumulado;
	}




	public void setPuntajeAcumulado(int puntajeAcumulado) {
		this.puntajeAcumulado = puntajeAcumulado;
	}
	
	// METODOS PARA EVALUACION DEL PROGRAMA 
	
	public void evaluacionDiagnostica(int puntaje_Evaluacion) {
	if (puntaje_Evaluacion <5) {
		
		this.nivelConocimiento = "Principiante";
		System.out.println("Feliciades estas en el nivel basico de conocimiento! (Requiere refuerzo Teorico)");
	
	} else if (puntaje_Evaluacion >=5 && puntaje_Evaluacion <8) {
		this.nivelConocimiento = "Intermedio";
		System.out.println("Feliciades estas en el nivel Intermedio de conocimiento! (Apto para retos lógicos)");
	
	} else if (puntaje_Evaluacion >=8) {
		this.nivelConocimiento = "Avanzado";
		System.out.println("Feliciades estas en el nivel Intermedio de conocimiento!(Apto para retos lógicos y Teoricos rapidos ) ");
		}
	
	System.out.println("Nivel asignado: " + this.nivelConocimiento);
	System.out.println("-----------------------------------------------------------------");
	
	}// fin de metodo1

	//Metodo para respuestas de la prueba diagnostica
	public void procesar_Respuestas(int resp1, int resp2, int resp3) {
		int puntajeCalculado=0;
		
		if (resp1==3) {
			puntajeCalculado+=3;
		};
		if (resp2==3) {
			puntajeCalculado+=3;
		};
		
		if (resp3==2) {
			puntajeCalculado+=5;
		};
		
		this.evaluacionDiagnostica(puntajeCalculado);
		
		
	}


	
	public void mostrarPerfil() {
		System.out.println("=== PERFIL DEL ESTUDIANTE ===");
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Código: " + this.codigoUnico);
        System.out.println("Semestre: " + this.semestre);
        System.out.println("Puntaje Actual: " + this.puntajeAcumulado);
        System.out.println("Nivel actual: " + this.nivelConocimiento);
        System.out.println("=============================");
		
	}
	//prueba del github

	
	
	
	

}
