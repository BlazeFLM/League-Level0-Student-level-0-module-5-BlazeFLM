package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Algorithms {
	public static void main(String[] args) {
		String user = JOptionPane.showInputDialog("Give me a number.");
		boolean prime = true;
		int userInt = Integer.parseInt(user);
		for (int i = 2; i < userInt / 2; i++) {
			if (userInt % i == 0) {
				prime = false;
			}

		}
			if(prime) {
				JOptionPane.showMessageDialog(null, "is Prime");
			} else {
				JOptionPane.showMessageDialog(null,"Not Prime");
			}
		
	}
}
