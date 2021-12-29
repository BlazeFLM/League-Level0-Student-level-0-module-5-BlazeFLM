package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot rob = new Robot();

	public static void main(String[] args) {
		rob.setSpeed(100);
		rob.setX(350);
		rob.setY(350);
		drawSquare();
		drawTriangle();
	}

	public static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			rob.penDown();
			rob.move(100);
			rob.turn(90);
			
		}
	}
	public static void drawTriangle() {
		for(int i = 0; i < 3; i++) {
			rob.penDown();
			rob.move(100);
			rob.turn(60);
		}
	}
	
}