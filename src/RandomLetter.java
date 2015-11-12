
public class RandomLetter {

	public static void main(String[] args) {
			
			char letter = RandomLetter();
			System.out.print("This code will generate a random character from A to Z, everytime the user runs the code. \n"); //Welcome Statement
			System.out.println(letter);
			
		}
	
	//There are 26 letters in total but as we know that Java excludes the upper limit. Therefore we need to add one at the end to complete 26 letters.
		
		public static char RandomLetter(){ //Upper case Letters
			
			int Initial = 65; // Declaring the initial value i.e. 55
			
			// Although 90 - 65 = 25, but there are 26 letters in total, to complete all 26 letters we do :-
			
			int Final = 90 - 65 + 1 ;	//Declaring final value. The difference between two is 25, to complete the 26 letters we add one in the end. 

			char letterRandom = (char)(Initial + Math.random()*(Final));
			
			return letterRandom; 	//returns the random letter
			
		}
}
		

