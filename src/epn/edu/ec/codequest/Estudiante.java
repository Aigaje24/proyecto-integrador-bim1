package epn.edu.ec.codequest;

import java.util.Scanner;

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
	//=============================================================================================
	public void evaluacionDiagnostica(Scanner sc) {
		
		
		String[] preguntas = {"Pregunta 1: ¿Qué tipo de dato usarías para guardar tu semestre actual como una variable de programación?\n1) double\n2) int\n3) String",
	            "Pregunta 2: ¿Qué tipo de lazo o bucle usarías para que el compilador lo ejecute al menos una vez?\n1) for\n2) while\n3) Do-While",
	            "Pregunta 3: ¿Con qué palabra reservada se crea un objeto en Java?\n1) class\n2) new\n3) make",
	            "Pregunta 4: ¿Cuál es la forma correcta de declarar y crear un arreglo de 5 enteros en Java?\n1) int[] notas = new int[5];\n2) int notas = new int(5);\n3) array<int> notas = [5];",
	            "Pregunta 5: ¿Qué clase y flujo estándar se usa comúnmente en consola para leer datos ingresados por el usuario?\n1) System.out con nextLine()\n2) Scanner con System.in\n3) Math con System.err",
	            "Pregunta 6: En una estructura switch, ¿qué palabra clave evita que el programa siga ejecutando los casos siguientes?\n1) stop\n2) return\n3) break",
	            "Pregunta 7: ¿Qué modificador de acceso oculta un atributo para que solo sea accesible dentro de su propia clase?\n1) public\n2) private\n3) default",
	            "Pregunta 8: Si int x = 10; ¿qué imprime System.out.println(x++);?\n1) 10\n2) 11\n3) Error de compilación",
	            "Pregunta 9: ¿Cuál es el índice del primer elemento en un arreglo en Java?\n1) 1\n2) 0\n3) -1",
	            "Pregunta 10: ¿Qué operador lógico representa una conjunción ('Y' lógica), donde ambas condiciones deben ser verdaderas?\n1) ||\n2) !\n3) &&"
	        };
		
		int[] recolectarR = new int [preguntas.length];
		
		for (int i=0; i<preguntas.length;i++) {
			
			System.out.println(preguntas[i]);
			System.out.println("Ingrese sus respuesta: ");
			recolectarR[i]=sc.nextInt();
			System.out.println(" ");
			
			
			}
		
		// eliminar el buffer
			if (sc.hasNextLine()) {
				sc.nextLine();	
		}
		
		procesar_Respuestas(recolectarR);
		
	}
	
//===========================================================================================================================================

	public void procesar_Respuestas(int [] respuestas) {
		int puntajeCalculado=0;
		
		int[] respuestasValidas= {2, 3, 2, 1, 2, 3, 2, 1, 2, 3};
		
		int total=Math.min(respuestas.length,respuestasValidas.length);
		
		
		for (int i=0; i< respuestasValidas.length;i++) {
			
			if (respuestas[i] == respuestasValidas[i]) {
				puntajeCalculado++;
				System.out.println("Pregunta "+(i+1)+" Respuesta Valida ^_^ ");
			}else {
				System.out.println("Respuesta invalida T_T ");
			}
			
		}
		
		
		this.puntajeAcumulado += puntajeCalculado;
		asignarNivelConocimiento(puntajeCalculado);
	}
	
	//=======================================================================================================================================
	
	public void asignarNivelConocimiento(int puntaje_Evaluacion) {
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
	

	public void mostrarPerfil() {
		System.out.println("=== PERFIL DEL ESTUDIANTE ===");
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Código: " + this.codigoUnico);
        System.out.println("Semestre: " + this.semestre);
        System.out.println("Puntaje Actual: " + this.puntajeAcumulado);
        System.out.println("Nivel actual: " + this.nivelConocimiento);
        System.out.println("=============================");
		
	}

	
	
	
	

}
