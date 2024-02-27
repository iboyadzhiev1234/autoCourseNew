import java.util.Arrays;

public class Array2ndExample {
    public static void main(String[] args) {
        double[] array = {1.4, 2.3, 3.3, 4.2, 5.1, 6.4, 7.9, 0.2, 8.9, 10};
        System.out.println(Arrays.toString(array));
        array[4] = 1.5;
        System.out.println(Arrays.toString(array));
        System.out.println(array[4]);
    }
}
