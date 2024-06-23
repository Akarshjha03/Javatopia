//This code provides the sum of n natural numbers given by the user 

import java.util.*;
public class naturalnumsum {
    public static void main (String args[]){
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 1; i <= n ; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
