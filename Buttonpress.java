import java.util.*;

public class Buttonpress {
    public static void main(String[] args) {
        System.out.println("Which Button would you like to press?");
        Scanner sc = new Scanner(System.in);
        int Button = sc.nextInt();

        switch (Button) {
            case 1:
                System.out.println("Namaste");
                break;

            case 2:
                System.out.println("Hello");
                break;

            case 3:
                System.out.println("Bonjour");
                break;
        
            default:
                System.out.println("Invalid Button");
                break;
        }
    }
}
