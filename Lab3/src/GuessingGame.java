
public class GuessingGame {
	public int guessesR = 10;
	public boolean over = false;
	public boolean won= false;
	public int correctNumber;
	
	
	GuessingGame(int correctNumber){
		correctNumber=this.correctNumber;
		
	}
	
	public int getGuessesRemaining() {
		return guessesR;
	}
	
	public void makeGuess(int number) {
		if(guessesR !=0 && over==false && won==false && number==correctNumber) {
			guessesR--;
			won=true;
			System.out.println("You guess correclty! The number was "+correctNumber+"!");	
		}else if(guessesR !=0 && over==false && won==false && number!=correctNumber && number<correctNumber ) {
			System.out.println("Your guess was to low!");
			guessesR--;	
			System.out.println("Guesses remaining:"+this.getGuessesRemaining());
			System.out.println("");
		}else if(guessesR !=0 && over==false && won==false && number!=correctNumber && number>correctNumber ) {
			guessesR--;
			System.out.println("Your guess was too high!");
			System.out.println("Guesses remaining:"+this.getGuessesRemaining());
			System.out.println("");
		}else if(guessesR ==0 ) {
			over=true;
			System.out.println("Game over your ran out of guesses");
		}else if(over==false ) {
			System.out.println("The game is over!You ran out of guesses in the previous turn!");
		}else if (won= true) {
			System.out.println("You already won the game man start a new you damn try hard.");
		}else if(number >100) {
			System.out.println("You can only guess between 1-100!");
		}else if(number <0) {
			System.out.println("You can only guess between 1-100!");
		}
	}
	
	
}
