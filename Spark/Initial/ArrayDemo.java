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

        // Sum of array
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of array: " + sum);

        // Sum of alternate elements in array
        int sum2 = 0;
        for (int k = 0; k < arr.length; k += 2) {
            sum2 += arr[k];
        }
        System.out.println("Sum of alternate elements in array: " + sum2);

        // Factorial of a number
        int factorial = 1;
        for (int k = 1; k <= 5; k++) {
            factorial *= k;
        }
        System.out.println("Factorial of 5: " + factorial);

        // Fibonacci series
        int a = 0, b = 1, c;
        for (int k = 1; k <= 10; k++) {
            c = a + b;   
            System.out.println("Fibonacci series: " + c);
            a = b;
        }

        //Reverse an array
        int[] arr2 = {1, 2, 3, 4, 5};
        for (int k = 0; k < arr2.length / 2; k++) {
            int temp = arr2[k];
            arr2[k] = arr2[arr2.length - k - 1];
            arr2[arr2.length - k - 1] = temp;
        }
        System.out.println("Reverse array: " + Arrays.toString(arr2));  
        // Sum of even number in array

        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }
}

