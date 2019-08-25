package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		//create the pet as an  object / class / that has a method (?)
		VirtualPet steve = new VirtualPet();
		
		
		//say hello, start program
		//game loop
		//while pet is alive, this loop happens.
		//every time this loop happens, you get a chance to interact. This is one cycle.
		//print a menu every loop, and give options. 
		//user input. Do something.
		//virtual-pet.tick() is called to represent the passage of time. 
	
		while ((steve.hunger < 20) && (steve.thirst < 20) && (steve.boredom < 20)) {
			System.out.println("Say hello to Steve the Sloth!");
			System.out.println("Hunger: " + steve.hunger);
			System.out.println("Thirst: " + steve.thirst);
			System.out.println("Boredom: " + steve.boredom);
			System.out.println("");
			System.out.println("What do you want to do?");
			System.out.println("1. Feed Steve");
			System.out.println("2. Water Steve");
			System.out.println("3. Climb around with Steve");
			
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
			  default:   
			}
			steve.tick();
		}
		System.out.println("Steve has died.");
	

		
		
		
		
		
		
	
	}
}


//VirtualPetApp class
//Create a main method that…
//implements a game loop.
//asks for user input.
//writes output to the console.