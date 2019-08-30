package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		VirtualPet steve = new VirtualPet();
		
		System.out.println("Say hello to Steve the Sloth!");
		
		while ((steve.hunger < 20) && (steve.thirst < 20) && (steve.boredom < 20)) {
			
			System.out.println("Hunger: " + steve.hunger);
			System.out.println("Thirst: " + steve.thirst);
			System.out.println("Boredom: " + steve.boredom);
			System.out.println("");
			System.out.println("What do you want to do?");
			System.out.println("1. Feed Steve");
			System.out.println("2. Water Steve");
			System.out.println("3. Climb around with Steve");
			System.out.println("4. Leave Steve alone.");
			
			int menuSelection = input.nextInt();
			
			switch(menuSelection) {
				case 1:
					steve.feed();
			    break;
				case 2:
					steve.water();
			    break;
				case 3: 
					steve.play();
				break;
				case 4:
					steve.chill();
				break;
			  default:   
			}
			steve.tick();
		}
		System.out.println("Steve has died. You should have taken better care of him. You're a monster. ");
	
	}
}

