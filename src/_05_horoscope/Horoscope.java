package _05_horoscope;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		
		String b=JOptionPane.showInputDialog("What is your star sign?");
		if (b.equals("Aries")) { 
			JOptionPane.showMessageDialog(null, "Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
			
	}
	{ if (b.equals("Taurus")) {
		JOptionPane.showMessageDialog(null, "Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
	}
	{ if (b.equals("Gemini")) {
		JOptionPane.showMessageDialog(null, "Cerebral, chatty, loves learning and education, charming, and adventurous.");
	}
	 else {
		JOptionPane.showMessageDialog(null, "Thats not a star sign!");
	}
}}}}
