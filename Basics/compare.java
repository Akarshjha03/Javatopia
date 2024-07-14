import java.util.*;

public class compare {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers:");
        Scanner sc = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sca.nextInt();

        if(a==b){
            System.out.println("Both numbers are equal");
        }
        else if(a>b){
            System.out.println("a number is greater");
        }
        else {
            System.out.println("b number is greater");
        }
    }
}
