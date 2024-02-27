import java.util.Scanner;

public class ArrayComparison {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        arr1[0] = 11;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 10;
        arr1[4] = 20;
        int[] arr2 = {1,2,3,10,20};
        boolean equal = true;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] != arr2[i]) {
                equal = false;
                break;
            }
        }
        System.out.println("Arrays are equal: " + equal);
    }
}
