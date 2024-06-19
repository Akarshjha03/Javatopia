//practice code for taking input from user 

import java.util.*;
public class input1 {
    public static void main (String args[]) {

        System.out.println("Enter the value of a:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter the value of b:");
        Scanner sca = new Scanner (System.in);
        int b = sca.nextInt();

        int sum = a+b;

        System.out.println("The sum is:"+sum);
    }
}
