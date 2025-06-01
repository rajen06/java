import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        // arr[0] = 1;
        // arr[1] = 2;
        // arr[2] = 3;
        // arr[3] = 4;
        // arr[4] = 5;
        // For loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        // For each loop
        for (int num : arr) {
            System.out.println("Number from for each loop: " + num);
        }
        // While loop
        int i = 0;
        while (i < arr.length) {
            System.out.println("Number from while loop: " + arr[i]);
            i++;
        }

        // Do while loop
        int j = 0;
        do {
            System.out.println("Number from do while loop: " + arr[j]);
            j++;
        } while (j < arr.length);

        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }
}

