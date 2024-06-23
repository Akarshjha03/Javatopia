//This code prints the table for a number given by the user 
import java.util.*;
public class table {
    public static void main(String args[]){
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<11 ; i++){
            System.out.println(n + "x" + i + "=" + n*i);

        }
    }
}
