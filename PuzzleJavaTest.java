public class PuzzleJavaTest {
    
    public static void main( String args[] ){


        //getTenRolls
        PuzzleJava array10 = new PuzzleJava();
        System.out.println(array10.getTenRolls());
        
        //getRandomLetter
        PuzzleJava randomLetter = new PuzzleJava();
        System.out.println(randomLetter.randomLetter());

        //generatePassword
        PuzzleJava password8 = new PuzzleJava();
        System.out.println(password8.createPassword());

        //getNewPasswordSet
        PuzzleJava newPasswordSet = new PuzzleJava();
        System.out.println( newPasswordSet.getNewPasswordSet(3) );
    }



}
