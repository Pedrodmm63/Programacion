package robot;

public class Robot {

	//Creas todos los atributos
	public String name;
	public int puntosVida;
	public int ataque;
	public int defensa;
	
	//Creas el constructor parametrizado con los puntos de vida al 100 por defecto y un math.random para el ataque y la defensa
	public Robot (String name) {
		
		this.name = name;
		this.puntosVida = 100;
		this.ataque = (int) (Math.random()*21);
		this.defensa = (int) (Math.random()*101);
		
		
	}
	/*
	public void  Luchar() {
		
		while (puntosVida >= 0) {
			
			if (ataque > defensa)  {
				
				puntosVida = puntosVida - ataque;
				
			}
			
			else if (ataque < defensa ) {
				
			}
		}
	}	
	 */
	
	//creas los getters y setters y el toString de todos los atributos
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPuntosVida() {
		return puntosVida;
	}
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	@Override
	public String toString() {
		return "Robot [name=" + name + ", puntosVida=" + puntosVida + ", ataque=" + ataque + ", defensa=" + defensa
				+ "]";
	}
	
	
	
	
	
	
}
