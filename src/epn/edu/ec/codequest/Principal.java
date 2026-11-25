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
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("                         Bienvenido a CodeQuest                       ");
		System.out.println("----------------------------------------------------------------------");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("====> Pon a prueba tu lógica y descubre tu ruta de aprendizaje!! <===");
		System.out.println(" ");
		System.out.println(" ");

		// Vamos a crear un perfil usando la clase 1
		
		System.out.println("Por favor ingrese su nombre: ");
		String nombre= sc.nextLine();
		
		System.out.println("Por favor ingrese su Codigo Unico: ");
		String codigoUnico= sc.nextLine();
		
		System.out.println("Por favor ingrese su correo electronico: ");
		String correo= sc.nextLine();
		
		System.out.println("Por favor ingrese el semestre en el que se encuentra: ");
		int Semestre= sc.nextInt();
		sc.nextLine();
		
		
		Estudiante Alumno1=new Estudiante(nombre,codigoUnico,correo,Semestre,0);
		
		// Iniciando Prueba Diagnostica antes de presentar el perfil
		System.out.println("\n--- INICIANDO EVALUACIÓN DIAGNÓSTICA ---");
        System.out.println("Responde ingresando el número de la opción correcta:\n");
        System.out.println(" ");
        
        
       
        
        //============================METODO PARA LA PD=========================
		
        Alumno1.evaluacionDiagnostica(sc);
	
		Alumno1.mostrarPerfil();
		
	//======================================================================================
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
