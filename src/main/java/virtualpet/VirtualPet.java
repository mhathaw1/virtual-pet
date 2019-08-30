package virtualpet;

//fields information about the class
public class VirtualPet {
	int hunger = 0;
	int thirst = 0;
	int boredom = 0;
	
	public void tick() {
		hunger += 1;
		thirst += 1;
		boredom += 1;
		}
		
	public void feed() {
		System.out.println("You fed Steve some noms!");
		if (hunger > 2) {
			hunger -= 3;
		}	else if (hunger < 3){
				hunger = -1;
		}
	}

	public void water() {
		System.out.println("You gave Steve a drink!");
		if (thirst > 2) {
			thirst -= 3;
		} else if (thirst < 3) {
			thirst = -1;
		}
	}
	
	public void play() {
		System.out.println("You climbed trees with Steve.");
		if (boredom > 2) {
			boredom -= 3;
		} else if (boredom < 3) {
			boredom = -1;
		}
	}
	
	//This isn't meant to do anything :)
	public void chill() {
		System.out.println("You let Steve chill in his tree.");
	}
	
}

