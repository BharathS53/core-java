import java.util.*;
class IfCondition {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>85){
            System.out.println("distinction");
        }
        else if(marks>60){
            System.out.println("first in class");
        }
        else if(marks>35){
            System.out.println("Second in class");
        }
        else{
            System.out.println("failed");
        }
        sc.close();
    }
}