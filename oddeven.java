//This prograam checks wheather the given number is even or odd 

import java.util.*;

public class oddeven {
    public static void main(String[] args) {
        System.out.println("Enter the number:");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("The number is even");
        } 
        else {
            System.out.println("The number is odd");
        }
        
    }
}
