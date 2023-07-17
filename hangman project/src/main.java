import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		char Word[];
		String guess;
		String word;
		char c;
		boolean go = false;
		
		printHangman();
		
		word ="apple";
		Word = new char[word.length()];
		
		twoLines();
		
		for (int i=0; i<Word.length; i++) {
			Word[i] = '-';
			System.out.print(Word[i]);
		}
		
		


		System.out.println();
		
		
		//Game starts here
		do {
			
			System.out.println("Guess a letter: ");
			guess = scan.next();
			c = guess.charAt(0);
			
			//checking if word is correct
			for (int i=0; i<Word.length; i++) {
				
				if(word.charAt(i) == c) {
					Word[i] = c;
					System.out.print(Word[i]);	
				}
				else {
					System.out.print(Word[i]);
					
				}
				
			}
			System.out.println();
			
			go = checkWrongGuess(c, Word, word, go);
			checkWin(Word);
			
		} while(go == true);
		
		twoLines();
		firstError();
		System.out.println("***There is no " + c + " in the word***");
		twoLines();
		
		//second error
		do {
			System.out.println("Guess a letter: ");
			guess = scan.next();
			c = guess.charAt(0);
			
			//checking if word is correct
			for (int i=0; i<Word.length; i++) {
				
				if(word.charAt(i) == c) {
					Word[i] = c;
					System.out.print(Word[i]);	
				}
				else {
					System.out.print(Word[i]);
					
				}
				
			}
			System.out.println();
			
			go = checkWrongGuess(c, Word, word, go);
			checkWin(Word);
			
		} while(go == true);
		
		twoLines();
		secondError();
		System.out.println("***There is no " + c + " in the word***");
		twoLines();
		
		
		do {
			System.out.println("Guess a letter: ");
			guess = scan.next();
			c = guess.charAt(0);
			
			//checking if word is correct
			for (int i=0; i<Word.length; i++) {
				
				if(word.charAt(i) == c) {
					Word[i] = c;
					System.out.print(Word[i]);	
				}
				else {
					System.out.print(Word[i]);
					
				}
				
			}
			System.out.println();
			
			go = checkWrongGuess(c, Word, word, go);
			checkWin(Word);
			
		} while(go == true);
		
		twoLines();
		thirdError();
		System.out.println("***There is no " + c + " in the word***");
		twoLines();
		
		//third error
		do {
			System.out.println("Guess a letter: ");
			guess = scan.next();
			c = guess.charAt(0);
			
			//checking if word is correct
			for (int i=0; i<Word.length; i++) {
				
				if(word.charAt(i) == c) {
					Word[i] = c;
					System.out.print(Word[i]);	
				}
				else {
					System.out.print(Word[i]);
					
				}
				
			}
			System.out.println();
			
			go = checkWrongGuess(c, Word, word, go);
			checkWin(Word);
			
		} while(go == true);
		
		twoLines();
		fourthError();
		System.out.println("***There is no " + c + " in the word***");
		twoLines();
		
		//4th error
		do {
			System.out.println("Guess a letter: ");
			guess = scan.next();
			c = guess.charAt(0);
			
			//checking if word is correct
			for (int i=0; i<Word.length; i++) {
				
				if(word.charAt(i) == c) {
					Word[i] = c;
					System.out.print(Word[i]);	
				}
				else {
					System.out.print(Word[i]);
					
				}
				
			}
			System.out.println();
			
			go = checkWrongGuess(c, Word, word, go);
			checkWin(Word);
			
		} while(go == true);
		
		twoLines();
		fifthError();
		System.out.println("***There is no " + c + " in the word***");
		twoLines();
		
		//6th error
		do {
			System.out.println("Guess a letter: ");
			guess = scan.next();
			c = guess.charAt(0);
			
			//checking if word is correct
			for (int i=0; i<Word.length; i++) {
				
				if(word.charAt(i) == c) {
					Word[i] = c;
					System.out.print(Word[i]);	
				}
				else {
					System.out.print(Word[i]);
					
				}
				
			}
			System.out.println();
			
			go = checkWrongGuess(c, Word, word, go);
			checkWin(Word);
			
		} while(go == true);
		
		twoLines();
		sixthError();
		System.out.println("***There is no " + c + " in the word***");
		twoLines();
		System.out.println("You lost all your lives...GAME OVER");
		System.exit(0);
	}
	
	public static void twoLines() {
		System.out.println();
		System.out.println();
	

	}
	
	public static boolean checkWrongGuess(char a, char [] b, String g, boolean f) {
		
		for (int i=0; i<b.length; i++) {
			
			if (g.charAt(i) == a) {
				f = true;
				break;
			}
			else {
				f = false;
			}
			
		}
		
		return f;
	}
	
	public static void firstError() {
		System.out.println(" ------");
		System.out.println(" |    |");
		System.out.println(" |  (+_+)");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println("---");
	}
	
	public static void secondError() {
		System.out.println(" ------");
		System.out.println(" |    |");
		System.out.println(" |  (+_+)");
		System.out.println(" |    |");
		System.out.println(" |    |");
		System.out.println(" |    |");
		System.out.println(" |");
		System.out.println("---");
	}
	
	public static void thirdError() {
		System.out.println(" ------");
		System.out.println(" |    |");
		System.out.println(" |  (+_+)");
		System.out.println(" |    |");
		System.out.println(" |   /|");
		System.out.println(" |    |");
		System.out.println(" |");
		System.out.println("---");
	}
	
	public static void fourthError() {
		System.out.println(" ------");
		System.out.println(" |    |");
		System.out.println(" |  (+_+)");
		System.out.println(" |    |");
		System.out.println(" |   /|\\");
		System.out.println(" |    |");
		System.out.println(" |");
		System.out.println("---");
	}
	
	public static void fifthError() {
		System.out.println(" ------");
		System.out.println(" |    |");
		System.out.println(" |  (+_+)");
		System.out.println(" |    |");
		System.out.println(" |   /|\\");
		System.out.println(" |    |");
		System.out.println(" |   /");
		System.out.println("---");
	}
	
	public static void sixthError() {
		System.out.println(" ------");
		System.out.println(" |    |");
		System.out.println(" |  (+_+)");
		System.out.println(" |    |");
		System.out.println(" |   /|\\");
		System.out.println(" |    |");
		System.out.println(" |   / \\");
		System.out.println("---");
	}
	
	public static void printHangman() {
		System.out.println(" ------");
		System.out.println(" |    |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println("---");
	}
	
	public static void checkWin(char [] a) {
		int count = 0;
		
		
		for (int i=0; i<a.length; i++) {
			
			if (a[i] == '-') {
				
			}
			else {
				count++;	
			}
			
		}
		
		if (count == a.length) {
			System.out.println();
			System.out.println("**********************");
			System.out.println(" Congrats, you WON!!!");
			System.out.println("**********************");

			System.exit(0);
		}
	}

}
