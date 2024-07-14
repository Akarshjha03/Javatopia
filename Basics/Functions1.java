import java.util.*;
public class Functions1 {
    public static void PrintMyName(String name){
        System.out.println("Welcome Mr. "+name);
        return;
    }
    public static void main(String args[]){
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        PrintMyName(name);
    }
}
