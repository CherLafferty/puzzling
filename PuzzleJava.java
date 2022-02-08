import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleJava {

//getTenRolls
    public ArrayList<Integer> getTenRolls(){
    //instantiate from java.util.Random
    ArrayList<Integer> random10 = new ArrayList<Integer>();
    Random roll = new Random();

    for(int i = 1; i <= 10; i++){
        random10.add(roll.nextInt(20) + 1);
    }
    return random10;
    }

//getRandomLetter
    public String getRandomLetter(){
        Random rand = new Random();
        String alphabetString ="abcdefghijklmnopqrstuvwxyz";
        char randomChar = alphabetString.charAt(rand.nextInt(26));

        return String.valueOf(randomChar);
    }

}