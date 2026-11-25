package epn.edu.ec.codequest;

import java.util.Scanner;
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
	//===================================Metodo1 crear vector de RU ,CREAR PREGUNTAS, PRESENTAR PREGUNTAS=======================
	public void rutaDeAprendizaje(String nivelEstudiante,Scanner sc) {
		
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
			
			// creacion del vector de preguntas usando la plantilla de la clase reto teorico 
						Reto_Teorico[] retosIntermedio = {
						        new Reto_Teorico("I-01", "if (x > 0 && x < 10)", "¿Cuándo se evalúa como verdadera esta condición compuesta?",
						            new String[]{"Cuando x está estrictamente entre 0 y 10", "Cuando x es menor que 0 o mayor que 10", "Solo cuando x vale 10"}, 'A', false),
						        new Reto_Teorico("I-02", "switch (dia) { case 1: case 2: System.out.println(\"Inicio\"); break; }", "¿Qué ocurre si dia vale 2?",
						            new String[]{"No imprime nada", "Imprime \"Inicio\" por agrupación de casos", "Lanza error de compilación"}, 'B', false),
						        new Reto_Teorico("I-03", "int i = 5; while (i > 0) { i -= 2; }", "¿Qué valores toma i en cada iteración?",
						            new String[]{"5, 4, 3, 2, 1", "0, 2, 4", "5, 3, 1"}, 'C', false),
						        new Reto_Teorico("I-04", "if (n % 2 == 0) ... else if (n > 0) ...", "Si n = 4, ¿qué ramas se ejecutan?",
						            new String[]{"Solo la rama if", "Ambas: if y else if", "Ninguna, va al else final"}, 'A', false),
						        new Reto_Teorico("I-05", "do { x++; } while (x < 0);", "Si x inicia en 5, ¿cuántas veces se ejecuta el bloque?",
						            new String[]{"0 veces", "1 vez", "5 veces"}, 'B', false),
						        new Reto_Teorico("I-06", "for (int i = 0; i < 5; i++) { if (i == 2) continue; System.out.print(i); }", "¿Qué se imprime en consola?",
						            new String[]{"01234", "01345", "0134"}, 'C', false),
						        new Reto_Teorico("I-07", "switch (opcion) { case \"A\": ... break; default: ... }", "¿Cuándo se ejecuta el bloque default?",
						            new String[]{"Cuando opcion no coincide con ningún case", "Siempre al final de cada ejecución", "Solo si opcion es null"}, 'A', false),
						        new Reto_Teorico("I-08", "for (int i = 10; i > 10; i--)", "¿Cuántas iteraciones realiza este bucle?",
						            new String[]{"10 iteraciones", "0 iteraciones", "Infinitas iteraciones"}, 'B', false),
						        new Reto_Teorico("I-09", "while (activo) { if (contador == 3) break; contador++; }", "¿Qué provoca la instrucción break dentro del while?",
						            new String[]{"Reinicia contador a 0", "Salta solo a la siguiente vuelta", "Termina el bucle while de inmediato"}, 'C', false),
						        new Reto_Teorico("I-10", "for (int f = 0; f < 2; f++) { for (int c = 0; c < 3; c++) { total++; } }", "Si total empieza en 0, ¿cuánto vale total al finalizar?",
						            new String[]{"6", "5", "2"}, 'A', false)
						    };
						
						// creamos un vector vacio donde vamos a guardar las respuestas 
						
						char[] respuestasUsuario= new char[retosIntermedio.length];
						
						for (int i=0; i< retosIntermedio.length; i++) {
							
							retosIntermedio[i].mostrarPregunta();
							
							System.out.println("Por favor ingrese su respuesta en letras MAYUSCULAS: ");
							
							respuestasUsuario[i]=Character.toUpperCase(sc.next().charAt(0));
							
							//elimiar el bufer 
							if(sc.hasNextLine()) {
								sc.nextLine();
							}
							
						}
						
						
						Reto_Teorico verificador = new Reto_Teorico();
						verificador.verificacionRespuesta(nivelEstudiante, respuestasUsuario);
			
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
