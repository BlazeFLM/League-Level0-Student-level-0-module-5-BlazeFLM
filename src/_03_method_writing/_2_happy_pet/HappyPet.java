package _03_method_writing._2_happy_pet;

import java.util.Random;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int hppylvl = 0;
	static Random ran = new Random();
	static int ranum = ran.nextInt(3);
	
	static String pet = JOptionPane.showInputDialog("What pet do you want to buy?");

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		// in class line 15
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 100; i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their
			// pet happy
			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "How are you going to make your " + pet + " happy today?",
					"Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Food", "Play", "Groom" },
					null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 0) {
				food();
				hppylvl++;
			} else if (task == 1) {
				play();
				hppylvl++;
			} else if (task == 2) {
				groom();
				hppylvl++;
			}

			// 6. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.
			if (hppylvl > 10) {
				JOptionPane.showMessageDialog(null, "You love your " + pet);
				break;
			}
		}
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	public static void food() {
		if (ranum == 0) {
			JOptionPane.showMessageDialog(null, "You fed your " + pet + " a banana");
		} else if (ranum == 1) {
			JOptionPane.showMessageDialog(null, "You fed your " + pet + " peanut butter");
		}
		

	}

	public static void play() {
		if (ranum == 0) {
			JOptionPane.showMessageDialog(null, "You took your " + pet + " to the park");
		} else if (ranum == 1) {
			JOptionPane.showMessageDialog(null, "You took your " + pet + " to the movies, somehow");
		} else if (ranum == 2) {
			JOptionPane.showMessageDialog(null, "You went to your friend's house with your " + pet);
		}
		
	}

	public static void groom() {
		JOptionPane.showMessageDialog(null, "You groomed your " + pet);
		
	}
}