package mascota;
import prueba.Jugador;
import prueba.Recursos;


public abstract class Mascota implements Acciones {
	private String nombre;
	
	public int Sueño;
	public int Felicidad;
	public int Fuciedad;
	public int Hambre;
	public int Suciedad;
	
	private Tipo tipo;
	
	public Mascota (String nombre, int Suciedad, int Hambre, int Sueño, int Felicidad, Tipo tipo) {
		this.nombre = nombre;
		this.Suciedad = Suciedad;
		this.Hambre = Hambre;
		this.Sueño = Sueño;
		this.Felicidad = Felicidad; 
		this.tipo = tipo;
	}
	
	public int getSuciedad() {
		return Suciedad;
	}
	
	public int getHambre() {
		return Hambre;
	}
	
	public int getSueño() {
		return Sueño;
	}
	
	public int getFelicidad() {
		return Felicidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Tipo getTipo() {
		return tipo;
	}
	@Override
	public void bañarse() {
		switch (this.tipo) {
		case AGUA:
			this.Suciedad -=90;
			if(this.Suciedad <= 0) {
				this.Suciedad=0;
			}
			break;
		case FUEGO:
			this.Suciedad -=50;
			if(this.Suciedad <= 0) {
				this.Suciedad=0;
			}
			break;
		case AIRE:
			this.Suciedad -=70;
			if(this.Suciedad <= 0) {
				this.Suciedad=0;
			}
			break;
		}
		this.Hambre += 5;
		if(Hambre>=100) {
			this.Hambre = 100;
		}
		this.Felicidad -=7;
	}
	
	public void comer(Jugador j) {
		System.out.println("Elige uno de estas opciones:");
		System.out.println("Manzanas:" +j.manzanas);
		System.out.println("Fideos:" +j.fideos);
		System.out.println("Sushi:" +j.sushi);
		int opcComer = Recursos.ingresarEntero(1,3);
		switch (opcComer) {
		case 1:
			if(j.manzanas == 0) {
				System.out.println("No tienes mas manzanas");
			} else {
				j.manzanas --;
				this.Hambre -= 15;
				if(this.Hambre<=0) {
					this.Hambre = 0;
				}
			}
			break;
		case 2:
			if(j.fideos == 0) {
				System.out.println("No tienes mas fideos");
			}else {
				j.fideos --;
				this.Hambre -=15;
				if(this.Hambre<=0) {
					this.Hambre = 0;
				}
			}
			break;
		case 3:
			if(j.manzanas == 0) {
				System.out.println("No tienes mas sushi");
			} else {
				j.sushi --;
				this.Hambre -= 15;
				if(this.Hambre<=0) {
					this.Hambre = 0;
				}
			}
			break;
		}
		this.Suciedad += 5;
		if(Suciedad >= 100) {
			this.Suciedad = 100;
		}
		this.Sueño +=7;
		if(Sueño >= 100) {
			this.Sueño = 100;
		}
	}
	
	public void dormir() {
		this.Sueño -= 100;
		if(this.Sueño<=0) {
			this.Sueño = 0;
		}
	}
	
	
	public void jugar(Jugador j) {
		System.out.println("Elige Cara o Seca");
		System.out.println("1. Cara");
		System.out.println("2. Seca");
		int opcMonedas = Recursos.ingresarEntero(1,2);
		Monedas lado = Monedas.tirarMoneda();
		if(opcMonedas == 1) {
			if(Monedas.CARA==lado) {
				j.monedas +=3;
			}
		}
		if(opcMonedas == 2) {
			if(Monedas.SECA == lado) {
				j.monedas +=3;
			}
		}
		
		this.Felicidad += 15;
		if(this.Felicidad >= 100) {
			this.Felicidad = 100;
		}
		this.Suciedad += 5;
		if(Suciedad >=100) {
			this.Suciedad = 100;
		}
		this.Sueño += 5;
		if(Sueño >= 100) {
			this.Sueño = 100;
		}
		this.Hambre +=7;
		if(Hambre >= 100) {
			this.Hambre = 100;
		}
		
	}
	
}







