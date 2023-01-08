package robot;

import java.util.concurrent.TimeUnit;

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
	
	public void  Luchar(Robot Terminator) throws InterruptedException {
		
		//Hacer un bucle para que mientras tengan vida se siga haciendo todo lo de dentro
		while (puntosVida > 0 && Terminator.puntosVida > 0) {
			
			//Sacas un numero aleatorio para que sea el ataque que va a hacer
			int Ataque1 = (int) (Math.random()*101);
			
			//Si el ataque es mayor que la defensa y el ambos tienen puntos de vida empieza la lucha
			if (Ataque1 > Terminator.defensa && this.puntosVida > 0 && Terminator.puntosVida > 0)  {
				
				TimeUnit.SECONDS.sleep(3);
				//System.out.println(Ataque1);
						
				if (Terminator.puntosVida < Ataque1)  {
					
					Ataque1 = Terminator.puntosVida;
					
				}
				
				Terminator.puntosVida -= Ataque1;
				//System.out.println(puntosVida);
			}
			
			else if (Ataque1 <= Terminator.defensa && this.puntosVida > 0 && Terminator.puntosVida > 0) {

			}
			
			
		
			int Ataque2 = (int) (Math.random()*101);
			
			if (Ataque2 > this.defensa && this.puntosVida > 0 && Terminator.puntosVida > 0)  {
				
				TimeUnit.SECONDS.sleep(3);
				//System.out.println(Ataque2);
						
				if (this.puntosVida < Ataque2)  {
					
					Ataque2 = this.puntosVida;
				}
				
				this.puntosVida -= Ataque2;
				//System.out.println(puntosVida);
				
			}
			
			else if (Ataque2 <= this.defensa && this.puntosVida > 0 && Terminator.puntosVida > 0) {

			}
		}
		
		if (this.puntosVida <= 0) {
			
			System.out.println(name + " Perdió");
		}
		
		if (Terminator.puntosVida <= 0) {
			
			System.out.println(Terminator + " Perdió");
		}
		
	}	
	 
	
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
				+ "]" ;
	}
	
	
	
	
	
	
	
}
