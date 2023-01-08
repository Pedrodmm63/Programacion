package robot;

public class Robot {

	public String name;
	public int puntosVida;
	public int ataque;
	public int defensa;
	
	public Robot (String name, int puntosVida, int ataque, int defensa) {
		
		this.name = name;
		this.puntosVida = puntosVida;
		this.ataque = (int) (Math.random()*100);
		this.defensa = (int) (Math.random()*100);
		
		
	}
	
	
	
	
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
