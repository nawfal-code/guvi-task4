package guvi.task4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentManagementSystem {
    public static void main(String[] args) throws AgeNotWithinRangeException, NameNotValidException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the registered roll number:");
        String rollno=sc.nextLine();
        System.out.println("Enter the Name:");
        String name=sc.nextLine();

        //if name contains numbers or special symbols occurs error and then  handle by try,catch
        try {
            Pattern pattern = Pattern.compile("[^a-zA-Z\\s]");
            Matcher matches = pattern.matcher(name);
            boolean Rulecontains = matches.find();
            if (Rulecontains == true) {
                throw new NameNotValidException("Name is not valid");

            }
        }
        catch (NameNotValidException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Enter the age:");
        int age = sc.nextInt();

        //if age is not between 15 to 21,it occurs error and then  handle by try,catch
           try{
               if (age < 15 || age > 21) {
                throw new AgeNotWithinRangeException("the age is not valid");
               }
           }
        catch (AgeNotWithinRangeException e){
               System.out.println( e.getMessage());
          }
        sc.nextLine();
        System.out.println("Enter the course you taken:");
        String course=sc.nextLine();
        Student student=new Student(rollno,name,age,course);
        }
    }
//define two exception classes
 class AgeNotWithinRangeException extends Exception{
    public AgeNotWithinRangeException(String message){
        super(message);
    }
 }

 class NameNotValidException extends Exception{
     public NameNotValidException(String message){
         super(message);
     }
 }
