package guvi.task4;

import java.util.Scanner;
//create class Voter
public class Voter {
    String voterId;
    String name;
    int age;
    
    //Parametrized constructor should throw exception if age less than 18.
    public Voter(String voterId,String name,int age) throws Exception {
        this.voterId=voterId;
        this.name=name;
        this.age=age;
        if (age<18){
         throw new Exception("invalid age for voter");
        }
    }
//get input from user and exexute all in main method
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Voter Id:");
        String voterId=sc.nextLine();
        System.out.println("Enter Your name:");
        String name=sc.nextLine();
        System.out.println("Enter Your Age:");
        int Age=sc.nextInt();
        Voter vote=new Voter(voterId,name,Age);
    }

}
