import java.util.*;
public class strings {
    public static void main(String args[]){
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Welcome to Java Mr." + name);
    }
}
