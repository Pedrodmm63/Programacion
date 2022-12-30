package robot;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Robot robot1 = new Robot();
		
		robot1.name = "Terminator";
		robot1.puntosVida = 100;
		robot1.ataque = 30;
		robot1.defensa = 90;
		
		Robot robot2 = new Robot();
		
		robot2.name = "Cerberus";
		robot2.puntosVida = 100;
		robot2.ataque = 60;
		robot2.defensa = 48;
		
		System.out.println(robot1);
		
		System.out.println(robot2);
		
	}

}
