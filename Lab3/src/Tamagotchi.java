import java.util.HashMap;
public class Tamagotchi {
	private String name="Bob";
	private int birthday=260303;
	private int hunger = 0;
	private int happy = 5;
	private int tired = 0;
	private int clean= 10;
	private String sleep="";
	private String hungry="";
	private String cleaness="";
	private String happiness="";

	Tamagotchi(){

	}

	 HashMap getMood() {
		if(tired== 10) {
			sleep="Asleep";
			}else if(tired>=8) {
				sleep ="Tired";
				}else {sleep="Awake";}

		if(hunger>=7) {
			hungry = "hungry";

			}else{
				hungry="Not hungry";}
		
		if(clean<=3) {
			cleaness="Dirty";
			
			}else {
				cleaness="Clean";
		}
		
		if(happy>=8) {
			happiness = "Happy";
			}else if(happy<=4) {
				happiness="Okay";
				
				}else {
					happiness="Sad";
				}
		HashMap<String, String> tomStatus = new HashMap<String, String>();
		tomStatus.put("Tiredness",sleep);
		tomStatus.put("Hunger",hungry);
		tomStatus.put("Cleaness",cleaness);
		tomStatus.put("Happiness",happiness);
		return tomStatus;
	}

	String getname() {
		return name;
	}

	int getBirthday() {
		return birthday;
	}

	int getHunger() {
		return hunger;
	}

	int getHappy() {
		return happy;
	}

	int getTired() {
		return tired;
	}

	void hungerUp() {
		if(hunger==10) {
			hunger=10;
		}else if(hunger==0) {
			hunger=0;
		}else {
		hunger++;
		}
	}

	void hungerDown() {
		if(hunger==10) {
			hunger=10;
		}else if(hunger==0) {
			hunger=0;
		}else {
		hunger--;
		}
	}

	void happyUp() {
		if(happy==10) {
			happy=10;
		}else if(happy==0) {
			happy=0;
		}else {
			happy++;
		}
	}

	void happyDown() {
		if(happy==10) {
			happy=10;
		}else if(happy==0) {
			happy=0;
		}else {
			happy--;
		}
	}

	void tiredUp() {
		if(tired==10) {
			tired=10;
		}else if(tired==0) {
			tired=0;
		}else {
			tired++;
		}
	}

	void tiredDown() {
		if(tired==10) {
			tired=10;
		}else if(tired==0) {
			tired=0;
		}else {
			tired--;
		}
	}

	int getClean() {
		return clean;
	}


	void clean() {
		clean= 10;
	}

	void pet() {
		happyUp();
		happyUp();
		happyUp();
		happyUp();
		happyUp();
	}

	void feed() {
		hungerDown();
		hungerDown();
		hungerDown();
		hungerDown();
		hungerDown();

	}

	void walk() {
		happyUp();
		happyUp();
		happyUp();
		tiredUp();
		tiredUp();
	}






}
