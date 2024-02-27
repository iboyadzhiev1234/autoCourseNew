import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {
        String[] names = {"Person1", "Person2", "Person3"};

        //Loop with Array length
        /*for (int i = 0; i < names.length; i++)
            System.out.println(names[i]);

        //Loop with predefined limit
        for (int i = 0; i < 3; i++) {

            System.out.println(names[i]);
        }*/

        int i = 0;
        while(i < names.length){
            System.out.println(names[i]);
            i++;
        }
        for(String name : names)
            System.out.println(name);
    }
}
