import java.util.Random;
import java.util.ArrayList;

/* 
 * In the RandomNumbers class, provide two static methods
 * randomElement that get a random element from an array or array list of
 * integers. (Return zero if the array or array list is empty.) Why couldn't you
 * make these methods into instance methods of int[] or
 * ArrayList<Integer>?
 */

// You cannot make the methods instance methods is because it would not be able to
// access the static instance variable: generator.

public class RandomNumbers {
    private static Random generator = new Random();
    
    public static int nextInt(int low, int high) {
        return low + generator.nextInt(high - low + 1);
    }

    public static int randomElement(int[] values) {
        if(values == null || values.length == 0) {
            return 0;
        } else {
            return values[generator.nextInt(values.length)];
        }
    }

    public static int randomElement(ArrayList<Integer> values) {
        if(values == null || values.size() == 0) {
            return 0;
        } else {
            return values.get(generator.nextInt(values.size()));
        }
    }

    public static void main(String[] args) {
        int[] arrayValues = {1, 2, 3};
        int[] arrayValues1 = null;
        ArrayList<Integer> arrayListValues = new ArrayList<>();
        arrayListValues.add(1);
        arrayListValues.add(2);
        arrayListValues.add(3);

        int val1 = RandomNumbers.randomElement(arrayValues);
        int val2 = RandomNumbers.randomElement(arrayListValues);
        int empty = RandomNumbers.randomElement(arrayValues1);

        System.out.printf("random: %d\n", val1);
        System.out.printf("random: %d\n", val2);
        System.out.printf("random: %d\n", empty);
    }
}
