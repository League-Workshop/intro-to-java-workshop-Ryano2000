package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
Robot steve = new Robot();
	void go() {
		// 4. Make the robot move as fast as possible
steve.setSpeed(10);
		// 5. Set the pen width to 5
steve.setPenWidth(5);
steve.penDown();
		// 6. Use a for loop to repeat steps #7 to #8, four times...
for (int b=0;b<4;b++){
			// 7. Set the pen color to random
	steve.setRandomPenColor();
			// 1. Call the drawSquare() method
	drawSquare();		
	// 8. Turn the robot 90 degrees to the right
	steve.turn(90);
	
}
	}
	
	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
			for (int i=0;i<4;i++) {
		steve.move(100);
		steve.turn(90);
			}
		//JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



