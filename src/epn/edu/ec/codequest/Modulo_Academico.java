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
	//Metodo1
	public void rutaDeAprendizaje(String nivelEstudiante, Scanner sc) {
		
		System.out.println("\n===== Iniciando Ruta de aprendizaje CodeQuest====");
		System.out.println("");
		System.out.println("Modulo Actual: "+this.tituloModulo);
		
		switch(nivelEstudiante) {
		case "Principiante":
			System.out.println("Cargando el Modulo De nivel Basico.........");
			System.out.println("");
			System.out.println("Temas a evaluar: Preguntas teoricas definición de variables, arreglos, modos de impresión de texto y el uso del Scanner.");
			Reto_Teorico[] retosBasicos = {
				    new Reto_Teorico("B-01", "int edad = 18;", "¿Qué representa esta definición de variable?",
				        new String[]{"Declara un entero e inicializa su valor", "Crea un arreglo de 18 posiciones", "Lee un número desde teclado"}, 'A', false),
				    new Reto_Teorico("B-02", "double precio; // sin asignar valor", "¿Qué describe mejor el estado de esta variable?",
				        new String[]{"Ya está inicializada en 0.0 por el usuario", "Está declarada, pero aún no inicializada", "Es una constante que no puede cambiar"}, 'B', false),
				    new Reto_Teorico("B-03", "boolean esEstudiante = true;", "¿Qué tipo de dato es y qué almacena?",
				        new String[]{"Texto con la palabra true", "Decimal de precisión simple", "Valor lógico verdadero o falso"}, 'C', false),
				    new Reto_Teorico("B-04", "int[] notas = new int[5];", "¿Qué representa esta estructura en Java?",
				        new String[]{"Un arreglo para 5 enteros (índices 0 a 4)", "Una variable simple que vale 5", "Un método para imprimir 5 veces"}, 'A', false),
				    new Reto_Teorico("B-05", "String[] dias = {\"Lun\", \"Mar\", \"Mie\"};", "¿Cuál es el índice del primer elemento del arreglo?",
				        new String[]{"Índice 1", "Índice 0", "Índice 3"}, 'B', false),
				    new Reto_Teorico("B-06", "notas[2] = 10;", "¿Qué ocurre con esta instrucción sobre el arreglo?",
				        new String[]{"Borra las demás posiciones del arreglo", "Cambia el tamaño total del arreglo a 2", "Asigna el valor 10 en la tercera posición"}, 'C', false),
				    new Reto_Teorico("B-07", "System.out.print(\"Hola \");", "¿Cómo se comporta este modo de impresión?",
				        new String[]{"Imprime y deja el cursor en la misma línea", "Imprime y añade un salto de línea automático", "Limpia la consola antes de mostrar texto"}, 'A', false),
				    new Reto_Teorico("B-08", "System.out.println(\"Línea 1\\nLínea 2\");", "¿Qué efecto produce el salto de línea en la salida?",
				        new String[]{"Imprime todo pegado en una sola línea", "Separa el texto en distintas líneas", "Convierte el texto en un arreglo de caracteres"}, 'B', false),
				    new Reto_Teorico("B-09", "Scanner sc = new Scanner(System.in);", "¿Para qué se utiliza este objeto en consola?",
				        new String[]{"Para mostrar mensajes con colores", "Para crear arreglos dinámicos", "Para leer datos ingresados por el usuario"}, 'C', false),
				    new Reto_Teorico("B-10", "int dato = sc.nextInt();", "¿Qué hace esta llamada con Scanner?",
				        new String[]{"Lee un número entero ingresado por teclado", "Lee una oración completa con espacios", "Cierra el flujo de entrada del programa"}, 'A', false)
				};
				    //vector de respuestas del usuario  
			char[] respuestasUsuario = new char[retosBasicos.length];
			
			//for
			for(int i=0;i < retosBasicos.length;i++) {
				retosBasicos[i].mostrarPregunta();
				System.out.println("Tu respuesta (A, B o C): ");
				respuestasUsuario[i] = Character.toUpperCase(sc.next().charAt(0));
				if (sc.hasNextLine()) {
	                sc.nextLine();
	            }
	            System.out.println();
				
			}
				
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
			
			
			Reto_Teorico[] retosAvanzados = {
				    new Reto_Teorico("A-01", "int x = 5; System.out.println(x++ + ++x);", "¿Qué imprime esta expresión de lectura de código?",
				        new String[]{"12", "11", "10"}, 'A', false),
				    new Reto_Teorico("A-02", "String s1 = \"EPN\"; String s2 = new String(\"EPN\");", "¿Qué evalúa 's1 == s2' frente a 's1.equals(s2)'?",
				        new String[]{"Ambos devuelven true", "== compara referencia; equals compara contenido", "s1 == s2 lanza excepción"}, 'B', false),
				    new Reto_Teorico("A-03", "for (int i = 0; i < n; i++) { for (int j = i + 1; j < n; j++) { ... } }", "¿Cuál es el orden de complejidad temporal de estos bucles anidados?",
				        new String[]{"O(n)", "O(log n)", "O(n^2)"}, 'C', false),
				    new Reto_Teorico("A-04", "Teoría rápida: encapsulamiento en POO", "¿Cuál es el beneficio principal de ocultar atributos y exponer getters/setters?",
				        new String[]{"Proteger y validar el estado interno del objeto", "Hacer que todos los métodos sean estáticos", "Evitar usar constructores en la clase"}, 'A', false),
				    new Reto_Teorico("A-05", "int[] a = {2, 4, 6}; int[] b = a; b[1] = 99;", "¿Qué valor tiene 'a[1]' tras modificar 'b[1]'?",
				        new String[]{"4", "99", "0"}, 'B', false),
				    new Reto_Teorico("A-06", "Algoritmo: buscar el segundo mayor en un arreglo sin ordenarlo", "¿Qué requiere para manejar duplicados y números negativos correctamente?",
				        new String[]{"Ordenar siempre el arreglo con un sort", "Usar solo un contador sin comparar valores", "Rastrear primero y segundo mayor con valores iniciales adecuados"}, 'C', false),
				    new Reto_Teorico("A-07", "if (condA && metodoPesado())", "¿Qué sucede si 'condA' es false en Java?",
				        new String[]{"Por cortocircuito, no evalúa metodoPesado()", "Evalúa metodoPesado() y luego ignora condA", "Genera un error de compilación"}, 'A', false),
				    new Reto_Teorico("A-08", "Teoría rápida: sobrecarga vs. sobrescritura de métodos", "¿Qué caracteriza a la sobrescritura (@Override) en herencia?",
				        new String[]{"Mismo nombre pero distintos parámetros en la misma clase", "Redefinir en una subclase un método heredado con igual firma", "Cambiar el tipo de retorno sin importar los parámetros"}, 'B', false),
				    new Reto_Teorico("A-09", "Algoritmo: detectar si un arreglo tiene elementos repetidos", "¿Cuál es la estrategia más directa si no usas estructuras extras?",
				        new String[]{"Sumar todos los elementos y dividir para n", "Invertir el arreglo en el mismo espacio", "Comparar cada elemento con los que van después usando dos bucles"}, 'C', false),
				    new Reto_Teorico("A-10", "int i = 0; while (i < 5) { if (i == 2) { i++; continue; } System.out.print(i); i++; }", "¿Cuál es la salida exacta de este código?",
				        new String[]{"0134", "01234", "013"}, 'A', false)
				};
			 respuestasUsuario = new char[retosAvanzados.length];// vector para almacenar las repuestas del usuario en el modo avanzado
			 for(int i=0; i<retosAvanzados.length; i++) {
				 retosAvanzados[i].mostrarPregunta();
				 System.out.println("Tu respuesta (A, B o C): ");
				 respuestasUsuario[i] = Character.toUpperCase(sc.next().charAt(0));
				 if (sc.hasNextLine()) {
		                sc.nextLine();
		            }
		            System.out.println();
				 	 
			 }
			
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
