/**
 * 
 */
package epn.edu.ec.codequest;

import java.util.Scanner;
import java.util.Locale;



public class Principal {


	public Principal() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		
		// codigo para iniciar el Acanner 
		
		Scanner sc= new Scanner(System.in);
		System.out.println("-----------------------------------------");
		System.out.println("           Bienvenido a CodeQuest        ");
		System.out.println("-----------------------------------------");

		// Vamos a crear un perfil usando la clase 1
		
		Estudiante Alumno1=new Estudiante("Anderson Quilumbquin","202420870","anderson.quilumbaquin@epn.edu.ec",4,0);
		
		// Iniciando Prueba Diagnostica antes de presentar el perfil
		System.out.println("\n--- INICIANDO EVALUACIÓN DIAGNÓSTICA ---");
        System.out.println("Responde ingresando el número de la opción correcta:\n");
        System.out.println(" ");
        System.out.println("Pregunta 1: ¿Qué tipo de dato usarías para guardar tu semestre actual como una variable de programacion?");
        System.out.println("1) double\n 2) int\n 3) String");
        System.out.print("Tu respuesta: ");
        int respuesta1= sc.nextInt();
        System.out.println(" ");
        System.out.println("Pregunta 2: ¿Qué tipo de Lazo o bucle usarias para que el copilador lo ejecute almenos una vez?");
        System.out.println("1) for \n 2) while\n 3) Do-While");
        System.out.print("Tu respuesta: ");
        int respuesta2= sc.nextInt();
        System.out.println(" ");
        System.out.println("Pregunta 3: ¿Con qué palabra reservada se crea un objeto en Java?");
        System.out.println("1) class \n 2) new\n 3) make");
        System.out.print("Tu respuesta: ");
        int respuesta3= sc.nextInt();
		
		Alumno1.procesar_Respuestas(respuesta1,respuesta2,respuesta3);
		
		Alumno1.mostrarPerfil();
		
	
		// a continuacion el modulo academico 
		Modulo_Academico modulo1= new Modulo_Academico("Fundamentos de Programación Estructurada","Las variables son como recipientes de cocina...");
		
		// llamamos a los modulos 
		
		modulo1.rutaDeAprendizaje(Alumno1.getNivelConocimiento());
		modulo1.retos(Alumno1.getNivelConocimiento());
		
		Reto_Teorico reto1=new Reto_Teorico("1", "For(int i=0:i<5:i++)", "El bucle presenta un comportamiento? ", new String[]{"Ascencion", "Disminucion", "No hace nada "},
				'A', false);
		 reto1.mostrarPregunta();
		 // para ingresar con scanner variables tipo char no nos sirve el primer codigo usamos el siguiente 
		 
		 java.util.Scanner entradaModulo = new java.util.Scanner(System.in);
		 
		 
		 
		 System.out.println("Por favor Ingresa tu respuesta (A, B o C):");
		 char respuesta= entradaModulo.next().charAt(0);;
		 
		 reto1.verificacionRespuesta(respuesta);
		
		// considerando que es solo un peque;o avance no lo hacemos tan complejo todavia 
		 
		 // Al ser un dise;o basico de nuestro programa aun no se consideran las respuestas devido a que la idea es a travez de la erencia trabajar con mas respuestas con mas alumnos con mas preguntas etc 
		 // la retroalimentacion aun no esta definida debido a que esta se basa en las defiiciencias de conocimiento de temas de la progranacion en Java 
		 
		
		
	}
	
	
      
}
