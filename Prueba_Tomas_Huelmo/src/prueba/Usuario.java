package prueba;
import mascota.Mascota;
public abstract class Usuario {
	public int manzanas;
	public int fideos;
	public int sushi;
	public int monedas;
	
	public Mascota mascota;
	
	public Usuario(int manzanas, int fideos, int sushi, int monedas,  Mascota mascota) {
		
		this.manzanas = manzanas;
		this.fideos = fideos;
		this.sushi = sushi;
		this.monedas = monedas;
		this.mascota = mascota;
		
	}
}
