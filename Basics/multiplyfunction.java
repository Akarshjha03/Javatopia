//This code creates and uses a function to multiply variables
import java.util.*;
public class multiplyfunction {
    public static int CalculateProduct(int a,int b){
        int product = a * b;
        return product;
    }
    public static void main(String[] args){
        System.out.println("Enter the value of a & b:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = CalculateProduct(a,b); //calling the function and passing the the parameters
        System.out.println("The product of a & b is:"+product);
    }
}
