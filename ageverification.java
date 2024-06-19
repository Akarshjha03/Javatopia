//This showcases the basic use of conditional statements (if-else)

import java.util.*;

public class ageverification {
    public static void main(String[] args) {
        System.out.println("Enter your age:");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You are an adult"); 
        }
        else {
            System.out.println("You are not an adult");
        }
    }
}
