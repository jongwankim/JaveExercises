import org.omg.CORBA.IntHolder;

/* 
 * Why can't you implement a Java method that swaps the contents of two int
 * variables? Instead, write a method that swaps the contents of two
 * IntHolder objects. (Look up this rather obscure class in the API
 * documentation.) Can you swap the contents of two Integer objects? 
 */

 
// 1) In java you can never write a method that updates primitive type parameters.

public class CH2_4 {
    
    // 2) Method to swap the contents of two IntHolder objects.
    public static void swapHolder(IntHolder val1, IntHolder val2) {
        int temp = val1.value;
        val1.value = val2.value;
        val2.value = temp;
    }

    // 3) Method to swap the contents of two Integer object values.
    public static void swapInteger(Integer val1, Integer val2) {
        int temp = val1.intValue();
        val1 = val2.intValue();
        val2 = temp;
    }
    // Method does not work because Integer objects are immutable 
    // so you have to create a new Integer Object

    public static void main(String args[]) {
        IntHolder val1 = new IntHolder(1);
        IntHolder val2 = new IntHolder(2);
        Integer int1 = new Integer("1");
        Integer int2 = new Integer("2");
        swapHolder(val1, val2);
        swapInteger(int1, int2);
        System.out.printf("val1: %d, val2: %d", val1.value, val2.value);
        System.out.printf("int1: %d, int2: %d", int1, int2);
    }
}
