import java.util.*;
public class SumFunction {
    public static int CalculateSum(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of a & b:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = CalculateSum(a,b);
       System.out.println("The sum of a & b is:"+sum);
    }
}
