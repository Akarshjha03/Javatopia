//This shows how to take input form user in java

import java.util.*;

public class input {
    public static void main(String args[]) {
        
        System.out.println("Please enter your name:");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); //it prints the whole string sentence
        //string name = sc.next() -> takes inputs in tokens -> 1token=1word
        //sc.nextint -> taking integer input
        //sc.nextfloat -> taking float input

        System.out.println("Welcome Mr."+name);
    }
}
