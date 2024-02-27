import java.util.Arrays;
import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] array1 = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter value for array[%d] ", i);
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.printf("Enter value for array1[%d] ", i);
            array1[i] = sc.nextInt();
        }
        /*for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/

        boolean equal = true;
        for(int i=0;i<array.length;i++){
            if(array[i] != array1[i]) {
                equal = false;
                break;
            }
        }
        System.out.println("Arrays are equal: " + equal);
        //System.out.println(Arrays.toString(array));
    }
}
