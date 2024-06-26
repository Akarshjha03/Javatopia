//This code calculates the factorial of a number using a function 

import java.util.*;

public class factorialfunction {
    public static void Factorial(int n){
        int f = 1;
        if(n<0){
            System.out.println("Invalid Input");
        }
        else if(n==0){
            System.out.println("Factorial of 0 is 1");
        }
        else{
            for(int i = 1; i <= n; i++){
                f = f * i;
            }
            System.out.println("Factorial of " + n + " is " + f);
            return;
        }
    
    
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
        Factorial(n);
        }
}
