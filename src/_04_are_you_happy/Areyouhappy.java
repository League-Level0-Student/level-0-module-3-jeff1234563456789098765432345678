package _04_are_you_happy;

import javax.swing.JOptionPane;

public class Areyouhappy {
	public static void main(String[] args) {
		String b=JOptionPane.showInputDialog("Are you happy?");
		if (b.equals("yes")) { 
		JOptionPane.showMessageDialog(null, "Keep doing whatever your doing");
		
		}
		String a = "";
		if(b.equals("no")) {
				 a=JOptionPane.showInputDialog("do you want to be happy?");
				
				
				 
		}
		if (a.equals("no")) { 
			JOptionPane.showMessageDialog(null, "Keep doing whatever your doing");
		}
			if(a.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			}
			
	}
}
