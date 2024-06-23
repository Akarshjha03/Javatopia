//This code demonstrate the difference b/w while & do-while loop

public class loop_difference {
    public static void main (String args[]){
        int i = 12;
        while(i<11){
            System.out.println("Akarsh");
            i++;
        }    

        do{
            System.out.println("Jha");
            i++;
        }while(i<11);
        
    }
}

//if the contdition is not satisfied the while loop won't even perform any task 
//but in do-while loop the code inside do block will execute at least once even if the condition is false
