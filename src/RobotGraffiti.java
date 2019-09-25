import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot jelly = new Robot();
		jelly.penDown();
		jelly.setSpeed(10);
		jelly.move(250);
		jelly.turn(90);
		for(int i = 0;i <90;i++) {
			jelly.move(4);
			jelly.turn(2);
			
			
			
			
			
			
		}
		
		
		
		
		
		
		//jelly.move(50);
		//jelly.move(30);
		//jelly.turn(15);
		//jelly.move(56);

	}
}
