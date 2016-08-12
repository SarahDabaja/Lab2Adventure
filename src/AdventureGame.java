import java.util.Scanner;

public class AdventureGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
			System.out.println("Welcome to the Great Pyramid");
			System.out.print("What name has the Sun God given you?");
			String name = scan.nextLine();
			System.out.println(name + ", would you like to explore the treasures of the pyramid?");
			String playChoice = scan.nextLine();
			if (playChoice.equalsIgnoreCase("yes")) {
				System.out.println("Let us begin!");
			}
			if (playChoice.equalsIgnoreCase("no")) {
				System.out.println("You weren't worthy of the treasures anyway, fool!");
			}
			do {
			System.out.println("The Sun God demands you choose equipment for your journey into the pyramid.");
			System.out.println("Choose flashlight, weapon or fancy hat");
			String itemChoice = scan.nextLine();
			if (itemChoice.equalsIgnoreCase("flashlight")) {
				System.out.println("You enter the pyramid and turn on the flashlight, which helps you avoid the trap door underfoot.");
				System.out.println("You have the option to turn left, right or straight, choose wisely.");
				String directionChoice = scan.nextLine();
				if (directionChoice.equalsIgnoreCase("left")) {
					System.out.println("You stumble over a trip wire which encloses you in the pyramid for eternity.");
					System.out.println("Game Over");

				} else if (directionChoice.equalsIgnoreCase("right")) {
					System.out.println("Only the Sun God can be right, YOU LOSE!");
					System.out.println("Game Over");

				} else if (directionChoice.equalsIgnoreCase("straight")) {
					System.out.println("After following a twisting corridor for hours you find a glorious gleaming hold of artifacts!!");
					System.out.println("You win!");
				}
			}
			if (itemChoice.equalsIgnoreCase("weapon")) {
				System.out.println("Which weapon will you choose?");
				System.out.println("Knife, flamethower, or crowbar");
				String weaponChoice = scan.nextLine();
				if (weaponChoice.equalsIgnoreCase("Knife")) {
					System.out.println("What good is a knife going to do you, if you can't see what's in front of you??");
					
				} else if (weaponChoice.equalsIgnoreCase("flamethrower")) {
					System.out.println("You accidently hit the switch, burning yourself and all the treasure to a crisp. ");
					System.out.println("Game Over");

				} else if (weaponChoice.equalsIgnoreCase("crowbar")) {
					System.out.println("You notice a box outside the entrance of the pyramid, you pry it open using your crowbar.");
					System.out.println("The box contains tools for a torch, and a set of directions to light the torch");
					System.out.println("Will you: follow directions or just light the torch?");
					String torchChoice = scan.nextLine();
					if (torchChoice.equalsIgnoreCase("follow directions")) {
						System.out.println("You successfully light the torch and make your way into the pyramid.");
						System.out.println("Once you stumble upon the treasure, you realize the Sun God is heartless and he smights you for discovering his treasure!");
						System.out.println("Game Over");

					} else if (torchChoice.equalsIgnoreCase("just light the torch")) {
						System.out.println("You set yourself on fire!");
						System.out.println("Game Over");
					}
				}
			}
			if (itemChoice.equalsIgnoreCase("fancy hat")) {
				System.out.println("You enter the pyramid and fall directly into a pit of snakes.");
				System.out.println("Did I mention the Sun God dislikes fancy hat wearing Indiana Jones types?");
				System.out.println("Game Over");
			} 
			System.out.println("Would you like to face the Sun God again? (yes or no)");
			
		} while (scan.nextLine().equalsIgnoreCase("yes"));
		scan.close();
		System.out.println("Thanks for playing!");
	}

}
