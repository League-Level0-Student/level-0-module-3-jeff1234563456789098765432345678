package _16_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedient_robot {
	static Robot Shiv = new Robot();

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog(null, "What shape do you want? Circle,Square,Triangle");
		String b = JOptionPane.showInputDialog("What color would you like your shape to be? (Blue or Red Don't question how many color choices I have >=()");
		if (b.equals("Blue")) {
			Shiv.setPenColor(Color.blue);
		}
		if (b.equals("Red")) {
			Shiv.setPenColor(Color.red);
		}
		if (a.equals("Circle")) {
			drawCircle();
		}

		if (a.equals("Square")) {
			drawsquare();
		}

	
	if (a.equals("Triangle")) {
		drawTriangle();
	}}

	public static void drawsquare() {

		Shiv.show();
		Shiv.setSpeed(100);

		Shiv.penDown();
		Shiv.move(100);
		Shiv.turn(90);
		Shiv.move(100);
		Shiv.turn(90);
		Shiv.move(100);
		Shiv.turn(90);
		Shiv.move(100);

	}

	public static void drawTriangle() {

		Shiv.show();
		Shiv.setSpeed(100);

		Shiv.penDown();
		Shiv.move(100);
		Shiv.turn(120);
		Shiv.move(100);
		Shiv.turn(120);
		Shiv.move(100);
		
	}

	public static void drawCircle() {
		for (int i = 0; i < 361; i++) {

			Shiv.show();
			Shiv.setSpeed(100);
			Shiv.penDown();
			Shiv.move(1);
			Shiv.turn(1);

		}
		
	}
}
