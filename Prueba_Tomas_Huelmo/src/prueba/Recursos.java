package prueba;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public abstract class Recursos {
	public static Scanner s = new Scanner(System.in);
	public static Random r = new Random();
	public static int ingresarEntero(int min, int max) {
		
		int opc=0;
		boolean error = false;
		do {
			error = false;
			try {
				opc = s.nextInt();
				if((opc<min)||(opc>max)) {
					System.out.println("Error, ingrese un numero del"+ min+ "al"+ max);
					error = true;
				}
				s.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Error, dato mal ingresado");
				error = true;
				s.nextLine();
			}
		}while(error);
		
		return opc;
	}
	
	/*public static float ingresarFloat(Scanner s, float min, float max) {
		
		float opc=0;
		boolean error = false;
		
		do {
			error = false;
			try {
				opc = s.nextFloat();
				if((opc<min)||(opc>max)) {
					System.out.println("Error, debe ingresar un numero del"+ min + "al"+ max);
					error = true;
				}
					s.nextLine();
				}catch (InputMismatchException e) {
					System.out.println("Error. dato mal ingresado");
					error = true;
					s.nextLine();
				}
			}while(error);
		
		return opc;
	}
	*/
	
	
}
