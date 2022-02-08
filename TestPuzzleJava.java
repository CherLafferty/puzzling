import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPuzzleJava {
    public static Character[] alphabet = {
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };
    public static void main(String[] args){
        int[] nums = {3,2,1,2,7,9,8,13,25,32};

        AlphabetPuzzle();
    }

    public static ArrayList<Integer> TrimArray(int[] numbers, int bound){
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for(int num : numbers) {
            if(num < bound)
                newList.add(num);
        }
        return newList;
    }

    public static void AlphabetPuzzle(){
        shuffleArray(alphabet);
        System.out.println(String.format("%s is first", alphabet[0]));
        System.out.println(String.format("%s is last", alphabet[25]));
        // if(isVowel(alphabet[0]))
        //     System.out.println("It's a vowel");
    }

    public static void shuffleArray(Object[] arr){
        Random r = new Random();
        for(int i = 0; i < arr.length/3; i++) {
            Object temp = arr[i];
            int randomIdx = r.nextInt(arr.length -i) + 1;
            arr[i] = arr[randomIdx];
            arr[randomIdx] = temp;
        }
    }

}