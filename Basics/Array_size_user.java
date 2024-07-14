import java.util.*;
public class Array_size_user {
    public static void main(String args[]){
        System.out.println("Enter the size of array:");

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int arr[] = new int[n]; //when we haven't added elements into array, java auto initializes the elements as zero 


        //output:
        for(int i = 0; i<=n; i++){
            System.out.println(arr[i]);
        }


    }
}
