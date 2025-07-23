public class Subs1 {
    public static void main(String[] args) {
        substraction();
        substraction(500,20);
    }
public static void substraction(){
    System.out.println("without args");
    int a=200;
    int b=100;
    int c=a-b;
    System.out.println(c);
}    
public static void substraction(int a,int b)
{
    System.out.println("with args");
    int c=a-b;
    System.out.println(c);
}
}