package guvi.task4;

import java.util.HashMap;
import java.util.Map;

public class StudData {
    public static void main(String[] args) {

        //Create a Hashmap
       Map<String,Integer> student=new HashMap<>();
       //methods to add a new student
       student.put("alexa",1);
       student.put("johny",2);
       student.put("martin",3);
       student.put("jesy",4);

       //remove a student
        student.remove("jesy");

       //display up a students grade(value) by name(key)
        System.out.println("Rank of Alexa:"+student.get("alexa"));
        System.out.println("Rank of Johny:"+student.get("johny"));
        System.out.println("Rank of Martin:"+student.get("martin"));

    }
}
