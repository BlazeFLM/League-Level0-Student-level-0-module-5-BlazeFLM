package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot rob = new Robot();

	public static void main(String[] args) {
		rob.setSpeed(100);
		rob.setX(350);
		rob.setY(350);
		String ans = JOptionPane.showInputDialog("What shape do you want to draw? Triangle, square, or circle?");
		String clr = "";
		if (ans.equalsIgnoreCase("circle")) {
			clr = JOptionPane.showInputDialog("What color? Red or Blue?");
			if (clr.equalsIgnoreCase("Blue")) {
				rob.setPenColor(0, 0, 255);
				drawCircle();
			} else {
				rob.setPenColor(255, 0, 0);
				drawCircle();
			}
		} else if (ans.equalsIgnoreCase("triangle")) {
			clr = JOptionPane.showInputDialog("What color? Red or Blue?");
			if (clr.equalsIgnoreCase("Blue")) {
				rob.setPenColor(0, 0, 255);
				drawTriangle();
			} else {
				rob.setPenColor(255, 0, 0);
				drawTriangle();
			}
		} else if (ans.equalsIgnoreCase("square")) {
			clr = JOptionPane.showInputDialog("What color? Red or Blue?");
			if (clr.equalsIgnoreCase("Blue")) {
				rob.setPenColor(0, 0, 255);
				drawSquare();
			} else {
				rob.setPenColor(255, 0, 0);
				drawSquare();
			}
		} else {
			JOptionPane.showMessageDialog(null, "We don't have that here.");
		}

	}

	public static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			rob.penDown();
			rob.move(100);
			rob.turn(90);

		}
	}

	public static void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			rob.penDown();
			rob.move(100);
			rob.turn(120);
		}
	}

	public static void drawCircle() {
		for (int i = 0; i < 30; i++) {
			rob.penDown();
			rob.move(i);
			rob.turn(i);
		}
	}

}