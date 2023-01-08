package robot;

public class Start {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Robot robot1 = new Robot("Terminator");
		
		Robot robot2 = new Robot("Cerberus");
	
		System.out.println(robot1);
		
		System.out.println(robot2);
		
		robot1.Luchar(robot2);
		
	}

	
}
