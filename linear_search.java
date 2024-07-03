import java.util.*;
public class linear_search {
        public static void main(String args[]){
        System.out.println("Enter the size of array:");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine(); // Consume newline character after nextInt()

        int number[] = new int[size];

        // Taking elements input from user
        System.out.println("Enter elements:");
        for (int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        // Printing elements
        for (int i=0; i<number.length; i++){
            if (number[i]==5){
                System.out.println("Element found at index: "+i);
            }
        }
        
    }
}

