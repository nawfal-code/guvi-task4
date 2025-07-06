package guvi.task4;

import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        //store name of weekdays in array
        String[] weekdays={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        
        //ask day position(index) from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index of day:");
        int index=sc.nextInt();

      //try to print.
        // if the user input occurs ArrayOutOfBoundException then catch the Exception and print message to user
        try {
            System.out.println(weekdays[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index value is not valid,Enter the index from 0 to 6");
        }
    }
}
