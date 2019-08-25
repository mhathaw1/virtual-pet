package virtualpet;

//fields information about the class
public class VirtualPet {
	int hunger = 0;
	int thirst = 0;
	int boredom = 0;
	
	
	//getters & setters return information about a class's fields

	public void tick() {
		hunger += 1;
		thirst += 1;
		boredom += 1;
		}
	
	//methods / constructors that tell how a class is made
	
	public void feed() {
		System.out.println("You fed Steve some noms!");
		if (hunger > 2) {
			hunger -= 3;
		}	else if (hunger < 3){
				hunger = 0;
			}
		}
	}

	public void water() {
		System.out.println("You gave Steve a drink!");
		thirst -= 3;
	}
	
	public void play() {
		System.out.println("You climbed trees with Steve.");
		boredom -= 3;
	}
	
	}




//VirtualPet class
//Create a tick() method that represents the passage of time.
//Create at least three instance variables (aka attributes aka properties aka fields).
//Create at least three methods (messages you send to your pet).