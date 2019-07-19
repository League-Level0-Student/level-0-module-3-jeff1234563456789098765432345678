//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot Shiv = new Robot();
		// 3. Ask the user what color they would like the robot to draw
		String r = JOptionPane.showInputDialog(null,
				"What type of color do you want the S.H.I.V to draw!? The colors are, Red,Blue Green");
		// 5. Use an if/else statement to set the pen color that the user requested
		if (r.equals("Red")) {
			Shiv.setPenColor(225, 0, 0);
		}
		if (r.equals("Green")) {
			Shiv.setPenColor(68, 0, 0);
		}

		if (r.equals("Blue")) {
			Shiv.setPenColor(255, 0, 0);

			// 6. If the user doesn’t enter anything, choose a random color
		} else {
			Shiv.setRandomPenColor();
		}
		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

		// 4. Set the pen width to 10
		Shiv.setPenWidth(10);
		// 2. Make the robot draw a shape (this will take more than one line of code)
		Shiv.penDown();

		Shiv.move(100);
		Shiv.turn(90);
		Shiv.move(100);
		Shiv.turn(90);
		Shiv.move(100);
		Shiv.turn(90);
		Shiv.move(100);
		Shiv.turn(90);

	}
}
