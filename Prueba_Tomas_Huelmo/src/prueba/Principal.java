package prueba;
import mascota.Mascota;
import mascota.Koi;
import mascota.Nimmo;
import mascota.Mecca;

public class Principal {

	public static void main(String[] args) {
		String[] personajes = {"Nimmo", "Mecca", "Koi"};
		String[] menu = {"Bañar", "Comer", "Dormir", "Jugar", "Comprar", "Salir"};
		System.out.println("--Seleccione una mascota:--");
		for(int i = 0; i< personajes.length; i++) {
			System.out.println(i+1 + "."+ personajes[i]);
		}
		int opciones = Recursos.ingresarEntero(1,personajes.length);
		Mascota m = null;
		
		switch(opciones) {
		case 1:
			m= new Nimmo();
			break;
		case 2:
			m= new Mecca();
			break;
		
		case 3:
		m= new Koi();
		break;
		
		}
		Jugador j = new Jugador(m);
		boolean salir = false;
		do {
			for (int i = 0; i < menu.length; i++) {
				System.out.println(i+1 + "."+ menu[i]);
			}
			int opcionesMenu = Recursos.ingresarEntero(1,menu.length);
			
				switch (opcionesMenu) {
				case 1:
					m.bañarse();
					mostrarEstadisticas(m);
					break;
				
				case 2:
					m.comer(j);
					mostrarEstadisticas(m);
					break;
				
				case 3:
					m.dormir();
					mostrarEstadisticas(m);
					break;
				
				case 4:
					m.jugar(j);
					break;
					
				case 5:
					comprar(j);
					break;
				case 6:
					salir = true;
					break;
				}
		}while(!salir);
		
		

	}
	public static void mostrarEstadisticas(Mascota m) {
		System.out.println("Tu mascota es:"+ m.getNombre());
		System.out.println("Este es su estado: "+" Felicidad:" + m.getFelicidad() + "\n"+ "Suciedad:"
		+ m.getSuciedad()+ "\n"+ "Sueño: "+ m.getSueño() + "\n"+ "Hambre: "+ m.getHambre());
		
	}
	
	public static void comprar(Jugador j) {
		System.out.println("Tus monedas son : "+j.monedas);
		System.out.println("Productos : ");
		System.out.println("Manzana : $1 ");
		System.out.println("Fideos : $5 ");
		System.out.println("Sushi : $10 ");
		int opcionesCompra = Recursos.ingresarEntero(1,3);
		switch(opcionesCompra) {
		case 1:
			j.manzanas ++;
			j.monedas--;
			break;
		case 2:
			j.fideos ++;
			j.monedas-=5;
			break;
		case 3:
			j.sushi ++;
			j.monedas-=10;
			break;
		}
	}

}



