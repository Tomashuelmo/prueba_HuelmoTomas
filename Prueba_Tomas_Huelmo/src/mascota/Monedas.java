package mascota;

import prueba.Recursos;

public enum Monedas{
	CARA, SECA;
	
	public static Monedas tirarMoneda() {
		int num = Recursos.r.nextInt(2);
		num ++;
		if(num == 1) {
			return CARA;
		}else {
			return SECA;
		}
		
	} 
}
