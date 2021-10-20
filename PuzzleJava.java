import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava{

    //getTenRolls: generate and return an array with 10 random numbers between 1 and 20 inclusive

    public ArrayList<Integer> getTenRolls() {
        
		ArrayList<Integer> array = new ArrayList<Integer>();
		Random numRandom = new Random();

		for( int i = 1; i < 11; i++ ) {
			array.add(numRandom.nextInt(21) );
		}
		return array;
	}

	//Return the random letter

	public String randomLetter(){
		Random numRand = new Random();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		char randLetter = alphabet.charAt( numRand.nextInt( alphabet.length() ) );

		return String.valueOf(randLetter);

	}

	//generatePassword

	public String createPassword(){
		String password = "";

		for( int i = 1; i < 9; i++ ) {
			password += randomLetter();
		}
		return password;
	}

	//getNewPasswordSet
	public ArrayList<String> getNewPasswordSet( int lengthNum ) {
        
		ArrayList<String> newPasswordSet = new ArrayList<String>();
		for( int i = 0; i < lengthNum; i++ ) {
			newPasswordSet.add( createPassword() );
		}
		return newPasswordSet;
	}






}