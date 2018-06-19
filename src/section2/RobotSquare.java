package section2;

import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {
public static void main(String[] args) {
	Robot steve = new Robot();
	steve.setSpeed(500);
	steve.sparkle();
	steve.penDown();
	for (int i=0;i<4;i++) {
		steve.move(100);
		steve.turn(90);
	}
}
}
